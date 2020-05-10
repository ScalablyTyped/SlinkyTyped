package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInValueList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValueListItem extends js.Object {
  var AutomaticPermissionsForObjects: IAutomaticPermissions = js.native
  val Deleted: Boolean = js.native
  val DisplayID: String = js.native
  val DisplayIDAvailable: Boolean = js.native
  var HasOwner: Boolean = js.native
  var HasParent: Boolean = js.native
  var ID: Double = js.native
  var Icon: js.Array[Double] = js.native
  val ItemGUID: String = js.native
  var Name: String = js.native
  var OwnerID: Double = js.native
  var ParentID: Double = js.native
  var ValueListID: MFBuiltInValueList | Double = js.native
  def Clone(): IValueListItem = js.native
  def CloneFrom(ValueListItem: IValueListItem): Unit = js.native
  def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double] = js.native
}

object IValueListItem {
  @scala.inline
  def apply(
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: () => IValueListItem,
    CloneFrom: IValueListItem => Unit,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    GetIconAsPNG: (Double, Double) => js.Array[Double],
    HasOwner: Boolean,
    HasParent: Boolean,
    ID: Double,
    Icon: js.Array[Double],
    ItemGUID: String,
    Name: String,
    OwnerID: Double,
    ParentID: Double,
    ValueListID: MFBuiltInValueList | Double
  ): IValueListItem = {
    val __obj = js.Dynamic.literal(AutomaticPermissionsForObjects = AutomaticPermissionsForObjects.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwner = HasOwner.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ItemGUID = ItemGUID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OwnerID = OwnerID.asInstanceOf[js.Any], ParentID = ParentID.asInstanceOf[js.Any], ValueListID = ValueListID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueListItem]
  }
  @scala.inline
  implicit class IValueListItemOps[Self <: IValueListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticPermissionsForObjects(value: IAutomaticPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticPermissionsForObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IValueListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: IValueListItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayIDAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayIDAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetIconAsPNG(value: (Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIconAsPNG")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasParent")(value.asInstanceOf[js.Any])
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
    def withItemGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueListID(value: MFBuiltInValueList | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueListID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

