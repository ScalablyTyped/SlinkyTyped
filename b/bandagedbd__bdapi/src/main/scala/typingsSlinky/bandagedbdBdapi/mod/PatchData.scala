package typingsSlinky.bandagedbdBdapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchData extends js.Object {
  var CancelPatch: typingsSlinky.bandagedbdBdapi.mod.CancelPatch = js.native
  var methodArguments: js.Array[_] = js.native
  var returnValue: js.Any = js.native
  var thisObject: js.Object = js.native
  def callOriginalMethod(): Unit = js.native
  def originalMethod(): Unit = js.native
}

object PatchData {
  @scala.inline
  def apply(
    CancelPatch: () => Unit,
    callOriginalMethod: () => Unit,
    methodArguments: js.Array[_],
    originalMethod: () => Unit,
    returnValue: js.Any,
    thisObject: js.Object
  ): PatchData = {
    val __obj = js.Dynamic.literal(CancelPatch = js.Any.fromFunction0(CancelPatch), callOriginalMethod = js.Any.fromFunction0(callOriginalMethod), methodArguments = methodArguments.asInstanceOf[js.Any], originalMethod = js.Any.fromFunction0(originalMethod), returnValue = returnValue.asInstanceOf[js.Any], thisObject = thisObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchData]
  }
  @scala.inline
  implicit class PatchDataOps[Self <: PatchData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelPatch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelPatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCallOriginalMethod(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOriginalMethod")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMethodArguments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalMethod(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMethod")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReturnValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisObject(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

