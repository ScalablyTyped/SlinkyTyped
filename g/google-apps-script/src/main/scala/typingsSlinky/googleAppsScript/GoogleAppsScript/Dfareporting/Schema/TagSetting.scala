package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagSetting extends js.Object {
  var additionalKeyValues: js.UndefOr[String] = js.native
  var includeClickThroughUrls: js.UndefOr[Boolean] = js.native
  var includeClickTracking: js.UndefOr[Boolean] = js.native
  var keywordOption: js.UndefOr[String] = js.native
}

object TagSetting {
  @scala.inline
  def apply(): TagSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSetting]
  }
  @scala.inline
  implicit class TagSettingOps[Self <: TagSetting] (val x: Self) extends AnyVal {
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

