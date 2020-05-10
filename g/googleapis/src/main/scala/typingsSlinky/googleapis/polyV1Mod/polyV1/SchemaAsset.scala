package typingsSlinky.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents and describes an asset in the Poly library. An asset is a 3D
  * model or scene created using [Tilt Brush](//www.tiltbrush.com),
  * [Blocks](//vr.google.com/blocks/), or any 3D program that produces a file
  * that can be upload to Poly.
  */
@js.native
trait SchemaAsset extends js.Object {
  /**
    * The author&#39;s publicly visible name. Use this name when giving credit
    * to the author. For more information, see
    * [Licensing](/poly/discover/licensing).
    */
  var authorName: js.UndefOr[String] = js.native
  /**
    * For published assets, the time when the asset was published. For
    * unpublished assets, the time when the asset was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The human-readable description, set by the asset&#39;s author.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The human-readable name, set by the asset&#39;s author.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * A list of Formats where each format describes one representation of the
    * asset.
    */
  var formats: js.UndefOr[js.Array[SchemaFormat]] = js.native
  /**
    * Whether this asset has been curated by the Poly team.
    */
  var isCurated: js.UndefOr[Boolean] = js.native
  /**
    * The license under which the author has made the asset available for use,
    * if any.
    */
  var license: js.UndefOr[String] = js.native
  /**
    * Application-defined opaque metadata for this asset. This field is only
    * returned when querying for the signed-in user&#39;s own assets, not for
    * public assets. This string is limited to 1K chars. It is up to the
    * creator of the asset to define the format for this string (for example,
    * JSON).
    */
  var metadata: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the asset in the form: `assets/{ASSET_ID}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Hints for displaying the asset. Note that these parameters are not
    * immutable; the author of an asset may change them post-publication.
    */
  var presentationParams: js.UndefOr[SchemaPresentationParams] = js.native
  /**
    * The remix info for the asset.
    */
  var remixInfo: js.UndefOr[SchemaRemixInfo] = js.native
  /**
    * The thumbnail image for the asset.
    */
  var thumbnail: js.UndefOr[SchemaFile] = js.native
  /**
    * The time when the asset was last modified. For published assets, whose
    * contents are immutable, the update time changes only when metadata
    * properties, such as visibility, are updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * The visibility of the asset and who can access it.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaAsset {
  @scala.inline
  def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  @scala.inline
  implicit class SchemaAssetOps[Self <: SchemaAsset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorName")(js.undefined)
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: js.Array[SchemaFormat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCurated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCurated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurated")(js.undefined)
        ret
    }
    @scala.inline
    def withLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: String): Self = {
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
    def withPresentationParams(value: SchemaPresentationParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationParams")(js.undefined)
        ret
    }
    @scala.inline
    def withRemixInfo(value: SchemaRemixInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remixInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemixInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remixInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: SchemaFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
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
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

