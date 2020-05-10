package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortableInvocationContext
  extends /**
  * User-defined invocation data. Useful if you want to read an argument in `onEnter` and act on it in `onLeave`.
  */
/* x */ StringDictionary[js.Any]
     with InvocationContext {
  /**
    * CPU registers. You may also update register values by assigning to these keys.
    */
  var context: CpuContext = js.native
  /**
    * Call depth of relative to other invocations.
    */
  var depth: Double = js.native
  /**
    * Return address.
    */
  var returnAddress: NativePointer = js.native
  /**
    * OS thread ID.
    */
  var threadId: ThreadId = js.native
}

object PortableInvocationContext {
  @scala.inline
  def apply(context: CpuContext, depth: Double, returnAddress: NativePointer, threadId: ThreadId): PortableInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortableInvocationContext]
  }
  @scala.inline
  implicit class PortableInvocationContextOps[Self <: PortableInvocationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: CpuContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnAddress(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreadId(value: ThreadId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

