package typingsSlinky.instagramPrivateApi.timelineFeedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineFeedsOptions extends js.Object {
  var latestStoryPk: js.UndefOr[String | Double] = js.native
  var pushDisabled: js.UndefOr[Boolean] = js.native
  var reason: js.UndefOr[TimelineFeedReason] = js.native
  var recoveredFromCrash: js.UndefOr[String] = js.native
}

object TimelineFeedsOptions {
  @scala.inline
  def apply(): TimelineFeedsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineFeedsOptions]
  }
  @scala.inline
  implicit class TimelineFeedsOptionsOps[Self <: TimelineFeedsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatestStoryPk(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestStoryPk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestStoryPk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestStoryPk")(js.undefined)
        ret
    }
    @scala.inline
    def withPushDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: TimelineFeedReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRecoveredFromCrash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoveredFromCrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoveredFromCrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoveredFromCrash")(js.undefined)
        ret
    }
  }
  
}

