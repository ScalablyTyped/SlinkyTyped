package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeConditions extends js.Object {
  /** Defines the conditions to exclude users from the audience. */
  var excludeConditions: js.UndefOr[ExclusionDuration] = js.native
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[typingsSlinky.gapiClientAnalytics.gapi.client.analytics.IncludeConditions] = js.native
}

object ExcludeConditions {
  @scala.inline
  def apply(): ExcludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeConditions]
  }
  @scala.inline
  implicit class ExcludeConditionsOps[Self <: ExcludeConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeConditions(value: ExclusionDuration): Self = {
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
    def withIncludeConditions(value: typingsSlinky.gapiClientAnalytics.gapi.client.analytics.IncludeConditions): Self = {
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

