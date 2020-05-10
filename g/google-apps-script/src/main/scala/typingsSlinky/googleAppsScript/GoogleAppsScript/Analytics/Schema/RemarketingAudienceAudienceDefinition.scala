package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudienceAudienceDefinition extends js.Object {
  var includeConditions: js.UndefOr[IncludeConditions] = js.native
}

object RemarketingAudienceAudienceDefinition {
  @scala.inline
  def apply(): RemarketingAudienceAudienceDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingAudienceAudienceDefinition]
  }
  @scala.inline
  implicit class RemarketingAudienceAudienceDefinitionOps[Self <: RemarketingAudienceAudienceDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

