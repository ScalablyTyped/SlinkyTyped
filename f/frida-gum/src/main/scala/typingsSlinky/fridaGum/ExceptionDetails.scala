package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionDetails extends js.Object {
  /**
    * Address where the exception occurred.
    */
  var address: NativePointer = js.native
  /**
    * CPU registers. You may also update register values by assigning to these keys.
    */
  var context: CpuContext = js.native
  /**
    * Memory operation details, if relevant.
    */
  var memory: js.UndefOr[ExceptionMemoryDetails] = js.native
  /**
    * Address of the OS and architecture-specific CPU context struct.
    *
    * This is only exposed as a last resort for edge-cases where `context` isn’t providing enough details.
    * We would however discourage using this and rather submit a pull-request to add the missing bits needed
    * for your use-case.
    */
  var nativeContext: NativePointer = js.native
  /**
    * The kind of exception that occurred.
    */
  var `type`: ExceptionType = js.native
}

object ExceptionDetails {
  @scala.inline
  def apply(address: NativePointer, context: CpuContext, nativeContext: NativePointer, `type`: ExceptionType): ExceptionDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], nativeContext = nativeContext.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionDetails]
  }
  @scala.inline
  implicit class ExceptionDetailsOps[Self <: ExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: CpuContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeContext(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExceptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: ExceptionMemoryDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(js.undefined)
        ret
    }
  }
  
}

