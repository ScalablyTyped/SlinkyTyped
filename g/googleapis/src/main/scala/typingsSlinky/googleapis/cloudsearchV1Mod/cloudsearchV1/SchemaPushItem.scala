package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an item to be pushed to the indexing queue.
  */
@js.native
trait SchemaPushItem extends js.Object {
  /**
    * Content hash of the item according to the repository. If specified, this
    * is used to determine how to modify this item&#39;s status. Setting this
    * field and the type field results in argument error. The maximum length is
    * 2048 characters.
    */
  var contentHash: js.UndefOr[String] = js.native
  /**
    * Metadata hash of the item according to the repository. If specified, this
    * is used to determine how to modify this item&#39;s status. Setting this
    * field and the type field results in argument error. The maximum length is
    * 2048 characters.
    */
  var metadataHash: js.UndefOr[String] = js.native
  /**
    * Provides additional document state information for the connector, such as
    * an alternate repository ID and other metadata. The maximum length is 8192
    * bytes.
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * Queue to which this item belongs to.  The
    * &lt;code&gt;default&lt;/code&gt; queue is chosen if this field is not
    * specified. The maximum length is 512 characters.
    */
  var queue: js.UndefOr[String] = js.native
  /**
    * Populate this field to store Connector or repository error details. This
    * information is displayed in the Admin Console. This field may only be
    * populated when the Type is REPOSITORY_ERROR.
    */
  var repositoryError: js.UndefOr[SchemaRepositoryError] = js.native
  /**
    * Structured data hash of the item according to the repository. If
    * specified, this is used to determine how to modify this item&#39;s
    * status. Setting this field and the type field results in argument error.
    * The maximum length is 2048 characters.
    */
  var structuredDataHash: js.UndefOr[String] = js.native
  /**
    * The type of the push operation that defines the push behavior.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPushItem {
  @scala.inline
  def apply(): SchemaPushItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushItem]
  }
  @scala.inline
  implicit class SchemaPushItemOps[Self <: SchemaPushItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHash")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataHash")(js.undefined)
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
    def withRepositoryError(value: SchemaRepositoryError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryError")(js.undefined)
        ret
    }
    @scala.inline
    def withStructuredDataHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredDataHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructuredDataHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredDataHash")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

