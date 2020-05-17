package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgValidatorValueRule extends js.Object {
  def getMessageType(): Unit = js.native
  def isValid(options: js.Object, value: js.Object): Unit = js.native
}

object IgValidatorValueRule {
  @scala.inline
  def apply(getMessageType: () => Unit, isValid: (js.Object, js.Object) => Unit): IgValidatorValueRule = {
    val __obj = js.Dynamic.literal(getMessageType = js.Any.fromFunction0(getMessageType), isValid = js.Any.fromFunction2(isValid))
    __obj.asInstanceOf[IgValidatorValueRule]
  }
  @scala.inline
  implicit class IgValidatorValueRuleOps[Self <: IgValidatorValueRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMessageType(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValid(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

