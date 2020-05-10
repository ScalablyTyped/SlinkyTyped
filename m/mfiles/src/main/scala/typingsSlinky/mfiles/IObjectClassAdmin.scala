package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectClassAdmin extends js.Object {
  val AdditionalClassInfo: IAdditionalClassInfo = js.native
  var AssociatedPropertyDefs: IAssociatedPropertyDefs = js.native
  var AutomaticPermissionsForObjects: IAutomaticPermissions = js.native
  var ForceWorkflow: Boolean = js.native
  var ID: Double = js.native
  var Name: String = js.native
  var NamePropertyDef: Double = js.native
  var ObjectType: MFBuiltInObjectType | Double = js.native
  var Predefined: Boolean = js.native
  var SemanticAliases: ISemanticAliases = js.native
  var Workflow: Double = js.native
  def Clone(): IObjectClassAdmin = js.native
}

object IObjectClassAdmin {
  @scala.inline
  def apply(
    AdditionalClassInfo: IAdditionalClassInfo,
    AssociatedPropertyDefs: IAssociatedPropertyDefs,
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: () => IObjectClassAdmin,
    ForceWorkflow: Boolean,
    ID: Double,
    Name: String,
    NamePropertyDef: Double,
    ObjectType: MFBuiltInObjectType | Double,
    Predefined: Boolean,
    SemanticAliases: ISemanticAliases,
    Workflow: Double
  ): IObjectClassAdmin = {
    val __obj = js.Dynamic.literal(AdditionalClassInfo = AdditionalClassInfo.asInstanceOf[js.Any], AssociatedPropertyDefs = AssociatedPropertyDefs.asInstanceOf[js.Any], AutomaticPermissionsForObjects = AutomaticPermissionsForObjects.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ForceWorkflow = ForceWorkflow.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamePropertyDef = NamePropertyDef.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Workflow = Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectClassAdmin]
  }
  @scala.inline
  implicit class IObjectClassAdminOps[Self <: IObjectClassAdmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalClassInfo(value: IAdditionalClassInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalClassInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatedPropertyDefs(value: IAssociatedPropertyDefs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedPropertyDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomaticPermissionsForObjects(value: IAutomaticPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticPermissionsForObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IObjectClassAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForceWorkflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceWorkflow")(value.asInstanceOf[js.Any])
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
    def withNamePropertyDef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamePropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: MFBuiltInObjectType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticAliases(value: ISemanticAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workflow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

