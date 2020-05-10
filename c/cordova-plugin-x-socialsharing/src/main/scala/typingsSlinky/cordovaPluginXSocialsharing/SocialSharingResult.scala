package typingsSlinky.cordovaPluginXSocialsharing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialSharingResult extends js.Object {
  var app: js.UndefOr[String] = js.native
  var completed: Boolean = js.native
}

object SocialSharingResult {
  @scala.inline
  def apply(completed: Boolean): SocialSharingResult = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialSharingResult]
  }
  @scala.inline
  implicit class SocialSharingResultOps[Self <: SocialSharingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
  }
  
}

