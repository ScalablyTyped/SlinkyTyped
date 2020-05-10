package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryResultItem extends js.Object {
  /**
    * The time inventory item data was captured.
    */
  var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.native
  /**
    * Contains all the inventory data of the item type. Results include attribute names and values. 
    */
  var Content: InventoryItemEntryList = js.native
  /**
    * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not changed since last update. 
    */
  var ContentHash: js.UndefOr[InventoryItemContentHash] = js.native
  /**
    * The schema version for the inventory result item/
    */
  var SchemaVersion: InventoryItemSchemaVersion = js.native
  /**
    * The name of the inventory result item type.
    */
  var TypeName: InventoryItemTypeName = js.native
}

object InventoryResultItem {
  @scala.inline
  def apply(
    Content: InventoryItemEntryList,
    SchemaVersion: InventoryItemSchemaVersion,
    TypeName: InventoryItemTypeName
  ): InventoryResultItem = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryResultItem]
  }
  @scala.inline
  implicit class InventoryResultItemOps[Self <: InventoryResultItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: InventoryItemEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaVersion(value: InventoryItemSchemaVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeName(value: InventoryItemTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptureTime(value: InventoryItemCaptureTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHash(value: InventoryItemContentHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentHash")(js.undefined)
        ret
    }
  }
  
}

