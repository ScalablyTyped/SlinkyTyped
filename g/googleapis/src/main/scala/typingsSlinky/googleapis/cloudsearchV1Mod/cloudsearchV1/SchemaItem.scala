package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single object that is an item in the search index, such as a
  * file, folder, or a database record.
  */
@js.native
trait SchemaItem extends js.Object {
  /**
    * Access control list for this item.
    */
  var acl: js.UndefOr[SchemaItemAcl] = js.native
  /**
    * Item content to be indexed and made text searchable.
    */
  var content: js.UndefOr[SchemaItemContent] = js.native
  /**
    * Type for this item.
    */
  var itemType: js.UndefOr[String] = js.native
  /**
    * Metadata information.
    */
  var metadata: js.UndefOr[SchemaItemMetadata] = js.native
  /**
    * Name of the Item. Format: datasources/{source_id}/items/{item_id} &lt;br
    * /&gt;This is a required field. The maximum length is 1536 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Additional state connector can store for this item. The maximum length is
    * 10000 bytes.
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * Queue this item belongs to. The maximum length is 100 characters.
    */
  var queue: js.UndefOr[String] = js.native
  /**
    * Status of the item. Output only field.
    */
  var status: js.UndefOr[SchemaItemStatus] = js.native
  /**
    * The structured data for the item that should conform to a registered
    * object definition in the schema for the data source.
    */
  var structuredData: js.UndefOr[SchemaItemStructuredData] = js.native
  /**
    * Required. The indexing system stores the version from the datasource as a
    * byte string and compares the Item version in the index to the version of
    * the queued Item using lexical ordering. &lt;br /&gt;&lt;br /&gt; Cloud
    * Search Indexing won&#39;t index or delete any queued item with a version
    * value that is less than or equal to the version of the currently indexed
    * item. The maximum length for this field is 1024 bytes.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaItem {
  @scala.inline
  def apply(): SchemaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItem]
  }
  @scala.inline
  implicit class SchemaItemOps[Self <: SchemaItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(value: SchemaItemAcl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: SchemaItemContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withItemType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaItemMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaItemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStructuredData(value: SchemaItemStructuredData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructuredData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredData")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

