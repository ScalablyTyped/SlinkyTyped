package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomErrorMessage...
  */
@js.native
trait ICustomErrorMessage extends js.Object {
  var calcCond: String = js.native
}

object ICustomErrorMessage {
  @scala.inline
  def apply(calcCond: String): ICustomErrorMessage = {
    val __obj = js.Dynamic.literal(calcCond = calcCond.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomErrorMessage]
  }
  @scala.inline
  implicit class ICustomErrorMessageOps[Self <: ICustomErrorMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalcCond(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calcCond")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

