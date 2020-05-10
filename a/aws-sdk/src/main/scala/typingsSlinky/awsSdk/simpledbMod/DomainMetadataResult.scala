package typingsSlinky.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMetadataResult extends js.Object {
  /**
    * The number of unique attribute names in the domain.
    */
  var AttributeNameCount: js.UndefOr[Integer] = js.native
  /**
    * The total size of all unique attribute names in the domain, in bytes.
    */
  var AttributeNamesSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The number of all attribute name/value pairs in the domain.
    */
  var AttributeValueCount: js.UndefOr[Integer] = js.native
  /**
    * The total size of all attribute values in the domain, in bytes.
    */
  var AttributeValuesSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The number of all items in the domain.
    */
  var ItemCount: js.UndefOr[Integer] = js.native
  /**
    * The total size of all item names in the domain, in bytes.
    */
  var ItemNamesSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The data and time when metadata was calculated, in Epoch (UNIX) seconds.
    */
  var Timestamp: js.UndefOr[Integer] = js.native
}

object DomainMetadataResult {
  @scala.inline
  def apply(): DomainMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMetadataResult]
  }
  @scala.inline
  implicit class DomainMetadataResultOps[Self <: DomainMetadataResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeNameCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNameCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeNameCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNameCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeNamesSizeBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNamesSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeNamesSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNamesSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeValueCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValueCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValueCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValueCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeValuesSizeBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValuesSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValuesSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValuesSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withItemNamesSizeBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemNamesSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemNamesSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemNamesSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

