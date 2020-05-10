package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookbackConfiguration extends js.Object {
  var clickDuration: js.UndefOr[Double] = js.native
  var postImpressionActivitiesDuration: js.UndefOr[Double] = js.native
}

object LookbackConfiguration {
  @scala.inline
  def apply(): LookbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookbackConfiguration]
  }
  @scala.inline
  implicit class LookbackConfigurationOps[Self <: LookbackConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPostImpressionActivitiesDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postImpressionActivitiesDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostImpressionActivitiesDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postImpressionActivitiesDuration")(js.undefined)
        ret
    }
  }
  
}

