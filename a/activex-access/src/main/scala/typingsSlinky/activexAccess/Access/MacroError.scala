package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacroError extends js.Object {
  @JSName("Access.MacroError_typekey")
  var AccessDotMacroError_typekey: MacroError = js.native
  val ActionName: String = js.native
  val Arguments: String = js.native
  val Condition: String = js.native
  val Description: String = js.native
  val MacroName: String = js.native
  val Number: Double = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object MacroError {
  @scala.inline
  def apply(
    AccessDotMacroError_typekey: MacroError,
    ActionName: String,
    Arguments: String,
    Condition: String,
    Description: String,
    IsMemberSafe: Double => Boolean,
    MacroName: String,
    Number: Double
  ): MacroError = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any], Arguments = Arguments.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), MacroName = MacroName.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.MacroError_typekey")(AccessDotMacroError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroError]
  }
  @scala.inline
  implicit class MacroErrorOps[Self <: MacroError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotMacroError_typekey(value: MacroError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.MacroError_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArguments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMacroName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacroName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

