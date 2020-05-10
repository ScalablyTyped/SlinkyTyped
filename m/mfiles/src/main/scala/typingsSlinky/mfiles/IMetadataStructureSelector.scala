package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFMetadataStructureItem
import typingsSlinky.mfiles.MFiles.MFMetadataStructureSelectorFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataStructureSelector extends js.Object {
  var Flags: MFMetadataStructureSelectorFlags = js.native
  var ID: String = js.native
  var Name: String = js.native
  var StructureItemGUID: String = js.native
  var StructureItemID: Double = js.native
  var StructureItemSemanticAlias: String = js.native
  var StructureItemType: MFMetadataStructureItem = js.native
  def Clone(): IMetadataStructureSelector = js.native
}

object IMetadataStructureSelector {
  @scala.inline
  def apply(
    Clone: () => IMetadataStructureSelector,
    Flags: MFMetadataStructureSelectorFlags,
    ID: String,
    Name: String,
    StructureItemGUID: String,
    StructureItemID: Double,
    StructureItemSemanticAlias: String,
    StructureItemType: MFMetadataStructureItem
  ): IMetadataStructureSelector = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Flags = Flags.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], StructureItemGUID = StructureItemGUID.asInstanceOf[js.Any], StructureItemID = StructureItemID.asInstanceOf[js.Any], StructureItemSemanticAlias = StructureItemSemanticAlias.asInstanceOf[js.Any], StructureItemType = StructureItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataStructureSelector]
  }
  @scala.inline
  implicit class IMetadataStructureSelectorOps[Self <: IMetadataStructureSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IMetadataStructureSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlags(value: MFMetadataStructureSelectorFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
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
    def withStructureItemGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StructureItemGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructureItemID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StructureItemID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructureItemSemanticAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StructureItemSemanticAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructureItemType(value: MFMetadataStructureItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StructureItemType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

