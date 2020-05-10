package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectType extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var AllowAdding: Boolean = js.native
  var AllowedAsGroupingLevel: Boolean = js.native
  var CanHaveFiles: Boolean = js.native
  var DefaultAccessControlList: IAccessControlList = js.native
  var DefaultPropertyDef: Double = js.native
  var External: Boolean = js.native
  val GUID: String = js.native
  var HasOwnerType: Boolean = js.native
  var Hierarchical: Boolean = js.native
  var ID: Double = js.native
  var Icon: js.Array[Double] = js.native
  var NamePlural: String = js.native
  var NameSingular: String = js.native
  var ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing = js.native
  var OwnerPropertyDef: Double = js.native
  var OwnerType: Double = js.native
  val ReadOnlyPropertiesDuringInsert: IIDs = js.native
  val ReadOnlyPropertiesDuringUpdate: IIDs = js.native
  var RealObjectType: Boolean = js.native
  var ShowCreationCommandInTaskPane: Boolean = js.native
  var Translatable: Boolean = js.native
  def CanHaveItemIcons(): Boolean = js.native
  def Clone(): IObjectType = js.native
  def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double] = js.native
  def IsAddingAllowedForUser(SessionInfo: ISessionInfo): Boolean = js.native
}

object IObjectType {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AllowAdding: Boolean,
    AllowedAsGroupingLevel: Boolean,
    CanHaveFiles: Boolean,
    CanHaveItemIcons: () => Boolean,
    Clone: () => IObjectType,
    DefaultAccessControlList: IAccessControlList,
    DefaultPropertyDef: Double,
    External: Boolean,
    GUID: String,
    GetIconAsPNG: (Double, Double) => js.Array[Double],
    HasOwnerType: Boolean,
    Hierarchical: Boolean,
    ID: Double,
    Icon: js.Array[Double],
    IsAddingAllowedForUser: ISessionInfo => Boolean,
    NamePlural: String,
    NameSingular: String,
    ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing,
    OwnerPropertyDef: Double,
    OwnerType: Double,
    ReadOnlyPropertiesDuringInsert: IIDs,
    ReadOnlyPropertiesDuringUpdate: IIDs,
    RealObjectType: Boolean,
    ShowCreationCommandInTaskPane: Boolean,
    Translatable: Boolean
  ): IObjectType = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AllowAdding = AllowAdding.asInstanceOf[js.Any], AllowedAsGroupingLevel = AllowedAsGroupingLevel.asInstanceOf[js.Any], CanHaveFiles = CanHaveFiles.asInstanceOf[js.Any], CanHaveItemIcons = js.Any.fromFunction0(CanHaveItemIcons), Clone = js.Any.fromFunction0(Clone), DefaultAccessControlList = DefaultAccessControlList.asInstanceOf[js.Any], DefaultPropertyDef = DefaultPropertyDef.asInstanceOf[js.Any], External = External.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwnerType = HasOwnerType.asInstanceOf[js.Any], Hierarchical = Hierarchical.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], IsAddingAllowedForUser = js.Any.fromFunction1(IsAddingAllowedForUser), NamePlural = NamePlural.asInstanceOf[js.Any], NameSingular = NameSingular.asInstanceOf[js.Any], ObjectTypeTargetsForBrowsing = ObjectTypeTargetsForBrowsing.asInstanceOf[js.Any], OwnerPropertyDef = OwnerPropertyDef.asInstanceOf[js.Any], OwnerType = OwnerType.asInstanceOf[js.Any], ReadOnlyPropertiesDuringInsert = ReadOnlyPropertiesDuringInsert.asInstanceOf[js.Any], ReadOnlyPropertiesDuringUpdate = ReadOnlyPropertiesDuringUpdate.asInstanceOf[js.Any], RealObjectType = RealObjectType.asInstanceOf[js.Any], ShowCreationCommandInTaskPane = ShowCreationCommandInTaskPane.asInstanceOf[js.Any], Translatable = Translatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectType]
  }
  @scala.inline
  implicit class IObjectTypeOps[Self <: IObjectType] (val x: Self) extends AnyVal {
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
    def withAllowAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedAsGroupingLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedAsGroupingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanHaveFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanHaveFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanHaveItemIcons(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanHaveItemIcons")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultAccessControlList(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPropertyDef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultPropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("External")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetIconAsPNG(value: (Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIconAsPNG")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasOwnerType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasOwnerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hierarchical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAddingAllowedForUser(value: ISessionInfo => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAddingAllowedForUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNamePlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamePlural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameSingular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameSingular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeTargetsForBrowsing(value: IObjectTypeTargetsForBrowsing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeTargetsForBrowsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerPropertyDef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerPropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnlyPropertiesDuringInsert(value: IIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnlyPropertiesDuringInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnlyPropertiesDuringUpdate(value: IIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnlyPropertiesDuringUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealObjectType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RealObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCreationCommandInTaskPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowCreationCommandInTaskPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Translatable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

