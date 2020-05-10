package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tag Settings
  */
@js.native
trait SchemaTagSetting extends js.Object {
  /**
    * Additional key-values to be included in tags. Each key-value pair must be
    * of the form key=value, and pairs must be separated by a semicolon (;).
    * Keys and values must not contain commas. For example, id=2;color=red is a
    * valid value for this field.
    */
  var additionalKeyValues: js.UndefOr[String] = js.native
  /**
    * Whether static landing page URLs should be included in the tags. This
    * setting applies only to placements.
    */
  var includeClickThroughUrls: js.UndefOr[Boolean] = js.native
  /**
    * Whether click-tracking string should be included in the tags.
    */
  var includeClickTracking: js.UndefOr[Boolean] = js.native
  /**
    * Option specifying how keywords are embedded in ad tags. This setting can
    * be used to specify whether keyword placeholders are inserted in placement
    * tags for this site. Publishers can then add keywords to those
    * placeholders.
    */
  var keywordOption: js.UndefOr[String] = js.native
}

object SchemaTagSetting {
  @scala.inline
  def apply(): SchemaTagSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagSetting]
  }
  @scala.inline
  implicit class SchemaTagSettingOps[Self <: SchemaTagSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalKeyValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalKeyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalKeyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalKeyValues")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeClickThroughUrls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeClickThroughUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeClickThroughUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeClickThroughUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeClickTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeClickTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeClickTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeClickTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywordOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywordOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywordOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywordOption")(js.undefined)
        ret
    }
  }
  
}

