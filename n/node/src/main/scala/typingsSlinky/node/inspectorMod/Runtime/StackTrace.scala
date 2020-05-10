package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Call frames for assertions or error messages.
  */
@js.native
trait StackTrace extends js.Object {
  /**
    * JavaScript function name.
    */
  var callFrames: js.Array[CallFrame] = js.native
  /**
    * String label of this stack trace. For async traces this may be a name of the function that initiated the async call.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Asynchronous JavaScript stack trace that preceded this stack, if available.
    */
  var parent: js.UndefOr[StackTrace] = js.native
  /**
    * Asynchronous JavaScript stack trace that preceded this stack, if available.
    * @experimental
    */
  var parentId: js.UndefOr[StackTraceId] = js.native
}

object StackTrace {
  @scala.inline
  def apply(callFrames: js.Array[CallFrame]): StackTrace = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTrace]
  }
  @scala.inline
  implicit class StackTraceOps[Self <: StackTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallFrames(value: js.Array[CallFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: StackTrace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: StackTraceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
  }
  
}

