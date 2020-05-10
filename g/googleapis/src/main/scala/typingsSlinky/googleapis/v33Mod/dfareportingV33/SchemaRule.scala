package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule associates an asset with a targeting template for asset-level
  * targeting. Applicable to INSTREAM_VIDEO creatives.
  */
@js.native
trait SchemaRule extends js.Object {
  /**
    * A creativeAssets[].id. This should refer to one of the parent assets in
    * this creative. This is a required field.
    */
  var assetId: js.UndefOr[String] = js.native
  /**
    * A user-friendly name for this rule. This is a required field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A targeting template ID. The targeting from the targeting template will
    * be used to determine whether this asset should be served. This is a
    * required field.
    */
  var targetingTemplateId: js.UndefOr[String] = js.native
}

object SchemaRule {
  @scala.inline
  def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  @scala.inline
  implicit class SchemaRuleOps[Self <: SchemaRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(js.undefined)
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
    def withTargetingTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetingTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetingTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetingTemplateId")(js.undefined)
        ret
    }
  }
  
}

