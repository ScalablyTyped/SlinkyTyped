package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFAutoStateTransitionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateTransition extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var Description: String = js.native
  var EvaluationOrderNumber: Double = js.native
  var FromState: Double = js.native
  var ID: Double = js.native
  var Name: String = js.native
  var SemanticAliases: ISemanticAliases = js.native
  var SignatureSettings: ISignatureSettings = js.native
  var ToState: Double = js.native
  var TriggerAllowedByVBScript: String = js.native
  var TriggerCriteria: ISearchConditions = js.native
  var TriggerInDays: Double = js.native
  var TriggerMode: MFAutoStateTransitionMode = js.native
  def Clone(): IStateTransition = js.native
}

object IStateTransition {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => IStateTransition,
    Description: String,
    EvaluationOrderNumber: Double,
    FromState: Double,
    ID: Double,
    Name: String,
    SemanticAliases: ISemanticAliases,
    SignatureSettings: ISignatureSettings,
    ToState: Double,
    TriggerAllowedByVBScript: String,
    TriggerCriteria: ISearchConditions,
    TriggerInDays: Double,
    TriggerMode: MFAutoStateTransitionMode
  ): IStateTransition = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], EvaluationOrderNumber = EvaluationOrderNumber.asInstanceOf[js.Any], FromState = FromState.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], SignatureSettings = SignatureSettings.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any], TriggerAllowedByVBScript = TriggerAllowedByVBScript.asInstanceOf[js.Any], TriggerCriteria = TriggerCriteria.asInstanceOf[js.Any], TriggerInDays = TriggerInDays.asInstanceOf[js.Any], TriggerMode = TriggerMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateTransition]
  }
  @scala.inline
  implicit class IStateTransitionOps[Self <: IStateTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlList(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IStateTransition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluationOrderNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationOrderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticAliases(value: ISemanticAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureSettings(value: ISignatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerAllowedByVBScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerAllowedByVBScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerCriteria(value: ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerMode(value: MFAutoStateTransitionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

