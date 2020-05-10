package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeAssetMetadata extends js.Object {
  /** ID of the creative asset. This is a required field. */
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.native
  /** List of detected click tags for assets. This is a read-only auto-generated field. */
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.native
  /**
    * List of feature dependencies for the creative asset that are detected by DCM. Feature dependencies are features that a browser must be able to support
    * in order to render your HTML5 creative correctly. This is a read-only, auto-generated field.
    */
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  /** Numeric ID of the asset. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  /** Dimension value for the numeric ID of the asset. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeAssetMetadata". */
  var kind: js.UndefOr[String] = js.native
  /**
    * Rules validated during code generation that generated a warning. This is a read-only, auto-generated field.
    *
    * Possible values are:
    * - "ADMOB_REFERENCED"
    * - "ASSET_FORMAT_UNSUPPORTED_DCM"
    * - "ASSET_INVALID"
    * - "CLICK_TAG_HARD_CODED"
    * - "CLICK_TAG_INVALID"
    * - "CLICK_TAG_IN_GWD"
    * - "CLICK_TAG_MISSING"
    * - "CLICK_TAG_MORE_THAN_ONE"
    * - "CLICK_TAG_NON_TOP_LEVEL"
    * - "COMPONENT_UNSUPPORTED_DCM"
    * - "ENABLER_UNSUPPORTED_METHOD_DCM"
    * - "EXTERNAL_FILE_REFERENCED"
    * - "FILE_DETAIL_EMPTY"
    * - "FILE_TYPE_INVALID"
    * - "GWD_PROPERTIES_INVALID"
    * - "HTML5_FEATURE_UNSUPPORTED"
    * - "LINKED_FILE_NOT_FOUND"
    * - "MAX_FLASH_VERSION_11"
    * - "MRAID_REFERENCED"
    * - "NOT_SSL_COMPLIANT"
    * - "ORPHANED_ASSET"
    * - "PRIMARY_HTML_MISSING"
    * - "SVG_INVALID"
    * - "ZIP_INVALID"
    */
  var warnedValidationRules: js.UndefOr[js.Array[String]] = js.native
}

object CreativeAssetMetadata {
  @scala.inline
  def apply(): CreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssetMetadata]
  }
  @scala.inline
  implicit class CreativeAssetMetadataOps[Self <: CreativeAssetMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetIdentifier(value: CreativeAssetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withClickTags(value: js.Array[ClickTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTags")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdDimensionValue(value: DimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnedValidationRules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnedValidationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnedValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnedValidationRules")(js.undefined)
        ret
    }
  }
  
}

