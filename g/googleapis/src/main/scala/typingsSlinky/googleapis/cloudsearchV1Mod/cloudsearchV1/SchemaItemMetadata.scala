package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available metadata fields for the item.
  */
@js.native
trait SchemaItemMetadata extends js.Object {
  /**
    * The name of the container for this item. Deletion of the container item
    * leads to automatic deletion of this item.  Note: ACLs are not inherited
    * from a container item. To provide ACL inheritance for an item, use the
    * inheritAclFrom field. The maximum length is 1536 characters.
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * The BCP-47 language code for the item, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. The
    * maximum length is 32 characters.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * The time when the item was created in the source repository.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Hashing value provided by the API caller. This can be used with the
    * items.push method to calculate modified state. The maximum length is 2048
    * characters.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * A list of interactions for the item.  Interactions are used to improve
    * Search quality, but are not exposed to end users. The maximum number of
    * elements is 1000.
    */
  var interactions: js.UndefOr[js.Array[SchemaInteraction]] = js.native
  /**
    * Additional keywords or phrases that should match the item. Used
    * internally for user generated content. The maximum number of elements is
    * 100. The maximum length is 8192 characters.
    */
  var keywords: js.UndefOr[js.Array[String]] = js.native
  /**
    * The original mime-type of ItemContent.content in the source repository.
    * The maximum length is 256 characters.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The type of the item.  This should correspond to the name of an object
    * definition in the schema registered for the data source.  For example, if
    * the schema for the data source contains an object definition with name
    * &#39;document&#39;, then item indexing requests for objects of that type
    * should set objectType to &#39;document&#39;. The maximum length is 256
    * characters.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Additional search quality metadata of the item
    */
  var searchQualityMetadata: js.UndefOr[SchemaSearchQualityMetadata] = js.native
  /**
    * Link to the source repository serving the data.  &amp;#83;earch results
    * apply this link to the title. The maximum length is 2048 characters.
    */
  var sourceRepositoryUrl: js.UndefOr[String] = js.native
  /**
    * The title of the item.  If given, this will be the displayed title of the
    * Search result. The maximum length is 2048 characters.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The time when the item was last modified in the source repository.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaItemMetadata {
  @scala.inline
  def apply(): SchemaItemMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemMetadata]
  }
  @scala.inline
  implicit class SchemaItemMetadataOps[Self <: SchemaItemMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractions(value: js.Array[SchemaInteraction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchQualityMetadata(value: SchemaSearchQualityMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQualityMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchQualityMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQualityMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRepositoryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepositoryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRepositoryUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepositoryUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

