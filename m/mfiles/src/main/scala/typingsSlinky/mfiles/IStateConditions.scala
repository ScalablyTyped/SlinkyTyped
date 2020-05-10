package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateConditions extends js.Object {
  var PropertyConditions: Boolean = js.native
  var PropertyConditionsDefinition: ISearchConditions = js.native
  var VBScript: Boolean = js.native
  var VBScriptDefinition: String = js.native
  def Clone(): IStateConditions = js.native
}

object IStateConditions {
  @scala.inline
  def apply(
    Clone: () => IStateConditions,
    PropertyConditions: Boolean,
    PropertyConditionsDefinition: ISearchConditions,
    VBScript: Boolean,
    VBScriptDefinition: String
  ): IStateConditions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyConditions = PropertyConditions.asInstanceOf[js.Any], PropertyConditionsDefinition = PropertyConditionsDefinition.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any], VBScriptDefinition = VBScriptDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateConditions]
  }
  @scala.inline
  implicit class IStateConditionsOps[Self <: IStateConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IStateConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPropertyConditions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyConditionsDefinition(value: ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyConditionsDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVBScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VBScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVBScriptDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VBScriptDefinition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

