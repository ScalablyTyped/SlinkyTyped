package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInObjectType
import typingsSlinky.mfiles.MFiles.MFSpecialObjectFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILookup extends js.Object {
  var Deleted: Boolean = js.native
  val DisplayID: String = js.native
  val DisplayIDAvailable: Boolean = js.native
  var DisplayValue: String = js.native
  val Hidden: Boolean = js.native
  var Item: Double = js.native
  var ItemGUID: String = js.native
  val ObjectFlags: MFSpecialObjectFlag = js.native
  var ObjectType: MFBuiltInObjectType | Double = js.native
  var Version: Double = js.native
  def Clone(): ILookup = js.native
  def CloneFrom(Lookup: ILookup): Unit = js.native
  def GetFormattedDisplayValue(Localized: Boolean, EmptyLookupDispValuesAsHidden: Boolean, AddDeletedSuffixIfDeleted: Boolean): String = js.native
}

object ILookup {
  @scala.inline
  def apply(
    Clone: () => ILookup,
    CloneFrom: ILookup => Unit,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    DisplayValue: String,
    GetFormattedDisplayValue: (Boolean, Boolean, Boolean) => String,
    Hidden: Boolean,
    Item: Double,
    ItemGUID: String,
    ObjectFlags: MFSpecialObjectFlag,
    ObjectType: MFBuiltInObjectType | Double,
    Version: Double
  ): ILookup = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], GetFormattedDisplayValue = js.Any.fromFunction3(GetFormattedDisplayValue), Hidden = Hidden.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], ItemGUID = ItemGUID.asInstanceOf[js.Any], ObjectFlags = ObjectFlags.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookup]
  }
  @scala.inline
  implicit class ILookupOps[Self <: ILookup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ILookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: ILookup => Unit): Self = {
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
    def withDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFormattedDisplayValue(value: (Boolean, Boolean, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFormattedDisplayValue")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectFlags(value: MFSpecialObjectFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: MFBuiltInObjectType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

