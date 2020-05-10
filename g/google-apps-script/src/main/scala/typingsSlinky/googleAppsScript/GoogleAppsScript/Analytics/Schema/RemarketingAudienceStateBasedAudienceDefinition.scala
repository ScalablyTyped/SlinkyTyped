package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudienceStateBasedAudienceDefinition extends js.Object {
  var excludeConditions: js.UndefOr[RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions] = js.native
  var includeConditions: js.UndefOr[IncludeConditions] = js.native
}

object RemarketingAudienceStateBasedAudienceDefinition {
  @scala.inline
  def apply(): RemarketingAudienceStateBasedAudienceDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingAudienceStateBasedAudienceDefinition]
  }
  @scala.inline
  implicit class RemarketingAudienceStateBasedAudienceDefinitionOps[Self <: RemarketingAudienceStateBasedAudienceDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeConditions(value: RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeConditions(value: IncludeConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeConditions")(js.undefined)
        ret
    }
  }
  
}

