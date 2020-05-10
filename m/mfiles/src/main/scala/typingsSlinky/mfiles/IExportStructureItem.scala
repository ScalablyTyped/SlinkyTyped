package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFMetadataStructureItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExportStructureItem extends js.Object {
  var StructureItemGUID: String = js.native
  var StructureItemID: Double = js.native
  var StructureItemType: MFMetadataStructureItem = js.native
  def Clone(): IExportStructureItem = js.native
}

object IExportStructureItem {
  @scala.inline
  def apply(
    Clone: () => IExportStructureItem,
    StructureItemGUID: String,
    StructureItemID: Double,
    StructureItemType: MFMetadataStructureItem
  ): IExportStructureItem = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), StructureItemGUID = StructureItemGUID.asInstanceOf[js.Any], StructureItemID = StructureItemID.asInstanceOf[js.Any], StructureItemType = StructureItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExportStructureItem]
  }
  @scala.inline
  implicit class IExportStructureItemOps[Self <: IExportStructureItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IExportStructureItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
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
    def withStructureItemType(value: MFMetadataStructureItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StructureItemType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

