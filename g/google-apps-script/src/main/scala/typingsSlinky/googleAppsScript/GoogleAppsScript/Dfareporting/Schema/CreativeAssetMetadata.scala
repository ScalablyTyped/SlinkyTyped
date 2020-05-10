package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeAssetMetadata extends js.Object {
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.native
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.native
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  var id: js.UndefOr[String] = js.native
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  var kind: js.UndefOr[String] = js.native
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

