package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateAdmin extends js.Object {
  var ActionAssignToUser: Boolean = js.native
  var ActionAssignToUserDefinition: IActionCreateAssignment = js.native
  var ActionConvertToPDF: Boolean = js.native
  var ActionConvertToPDFDefinition: IActionConvertToPDF = js.native
  var ActionCreateSeparateAssignment: Boolean = js.native
  var ActionDefinitions: IActionDefinitions = js.native
  var ActionDelete: Boolean = js.native
  var ActionMarkForArchiving: Boolean = js.native
  var ActionRunVBScript: Boolean = js.native
  var ActionRunVBScriptDefinition: String = js.native
  var ActionSendNotification: Boolean = js.native
  var ActionSendNotificationDefinition: IActionSendNotification = js.native
  var ActionSetPermissions: Boolean = js.native
  var ActionSetPermissionsDetailedDefinition: IActionSetPermissions = js.native
  var ActionSetProperties: Boolean = js.native
  var ActionSetPropertiesDefinition: IActionSetProperties = js.native
  var CheckInOutPermissions: Boolean = js.native
  var Description: String = js.native
  var ID: Double = js.native
  var InOutPermissions: IAccessControlList = js.native
  var Name: String = js.native
  var Postconditions: IStateConditions = js.native
  var Preconditions: IStateConditions = js.native
  var SemanticAliases: ISemanticAliases = js.native
  var TransitionsRequireEditAccessToObject: Boolean = js.native
  def Clone(): IStateAdmin = js.native
}

object IStateAdmin {
  @scala.inline
  def apply(
    ActionAssignToUser: Boolean,
    ActionAssignToUserDefinition: IActionCreateAssignment,
    ActionConvertToPDF: Boolean,
    ActionConvertToPDFDefinition: IActionConvertToPDF,
    ActionCreateSeparateAssignment: Boolean,
    ActionDefinitions: IActionDefinitions,
    ActionDelete: Boolean,
    ActionMarkForArchiving: Boolean,
    ActionRunVBScript: Boolean,
    ActionRunVBScriptDefinition: String,
    ActionSendNotification: Boolean,
    ActionSendNotificationDefinition: IActionSendNotification,
    ActionSetPermissions: Boolean,
    ActionSetPermissionsDetailedDefinition: IActionSetPermissions,
    ActionSetProperties: Boolean,
    ActionSetPropertiesDefinition: IActionSetProperties,
    CheckInOutPermissions: Boolean,
    Clone: () => IStateAdmin,
    Description: String,
    ID: Double,
    InOutPermissions: IAccessControlList,
    Name: String,
    Postconditions: IStateConditions,
    Preconditions: IStateConditions,
    SemanticAliases: ISemanticAliases,
    TransitionsRequireEditAccessToObject: Boolean
  ): IStateAdmin = {
    val __obj = js.Dynamic.literal(ActionAssignToUser = ActionAssignToUser.asInstanceOf[js.Any], ActionAssignToUserDefinition = ActionAssignToUserDefinition.asInstanceOf[js.Any], ActionConvertToPDF = ActionConvertToPDF.asInstanceOf[js.Any], ActionConvertToPDFDefinition = ActionConvertToPDFDefinition.asInstanceOf[js.Any], ActionCreateSeparateAssignment = ActionCreateSeparateAssignment.asInstanceOf[js.Any], ActionDefinitions = ActionDefinitions.asInstanceOf[js.Any], ActionDelete = ActionDelete.asInstanceOf[js.Any], ActionMarkForArchiving = ActionMarkForArchiving.asInstanceOf[js.Any], ActionRunVBScript = ActionRunVBScript.asInstanceOf[js.Any], ActionRunVBScriptDefinition = ActionRunVBScriptDefinition.asInstanceOf[js.Any], ActionSendNotification = ActionSendNotification.asInstanceOf[js.Any], ActionSendNotificationDefinition = ActionSendNotificationDefinition.asInstanceOf[js.Any], ActionSetPermissions = ActionSetPermissions.asInstanceOf[js.Any], ActionSetPermissionsDetailedDefinition = ActionSetPermissionsDetailedDefinition.asInstanceOf[js.Any], ActionSetProperties = ActionSetProperties.asInstanceOf[js.Any], ActionSetPropertiesDefinition = ActionSetPropertiesDefinition.asInstanceOf[js.Any], CheckInOutPermissions = CheckInOutPermissions.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InOutPermissions = InOutPermissions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Postconditions = Postconditions.asInstanceOf[js.Any], Preconditions = Preconditions.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], TransitionsRequireEditAccessToObject = TransitionsRequireEditAccessToObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateAdmin]
  }
  @scala.inline
  implicit class IStateAdminOps[Self <: IStateAdmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionAssignToUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionAssignToUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionAssignToUserDefinition(value: IActionCreateAssignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionAssignToUserDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionConvertToPDF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionConvertToPDF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionConvertToPDFDefinition(value: IActionConvertToPDF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionConvertToPDFDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionCreateSeparateAssignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionCreateSeparateAssignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionDefinitions(value: IActionDefinitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionMarkForArchiving(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionMarkForArchiving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionRunVBScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionRunVBScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionRunVBScriptDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionRunVBScriptDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionSendNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionSendNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionSendNotificationDefinition(value: IActionSendNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionSendNotificationDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionSetPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionSetPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionSetPermissionsDetailedDefinition(value: IActionSetPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionSetPermissionsDetailedDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionSetProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionSetProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionSetPropertiesDefinition(value: IActionSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionSetPropertiesDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckInOutPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckInOutPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IStateAdmin): Self = {
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
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInOutPermissions(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InOutPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostconditions(value: IStateConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Postconditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreconditions(value: IStateConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preconditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticAliases(value: ISemanticAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionsRequireEditAccessToObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionsRequireEditAccessToObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

