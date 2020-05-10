package typingsSlinky.chromecastCafSender.cast.framework

import typingsSlinky.chrome.chrome.cast.AutoJoinPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CastOptions extends js.Object {
  var autoJoinPolicy: AutoJoinPolicy = js.native
  var language: js.UndefOr[String] = js.native
  var receiverApplicationId: js.UndefOr[String] = js.native
  var resumeSavedSession: js.UndefOr[Boolean] = js.native
}

object CastOptions {
  @scala.inline
  def apply(autoJoinPolicy: AutoJoinPolicy): CastOptions = {
    val __obj = js.Dynamic.literal(autoJoinPolicy = autoJoinPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastOptions]
  }
  @scala.inline
  implicit class CastOptionsOps[Self <: CastOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoJoinPolicy(value: AutoJoinPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoJoinPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiverApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiverApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeSavedSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeSavedSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeSavedSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeSavedSession")(js.undefined)
        ret
    }
  }
  
}

