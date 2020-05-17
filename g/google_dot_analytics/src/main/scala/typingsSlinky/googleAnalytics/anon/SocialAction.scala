package typingsSlinky.googleAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialAction extends js.Object {
  var socialAction: String = js.native
  var socialNetwork: String = js.native
  var socialTarget: String = js.native
}

object SocialAction {
  @scala.inline
  def apply(socialAction: String, socialNetwork: String, socialTarget: String): SocialAction = {
    val __obj = js.Dynamic.literal(socialAction = socialAction.asInstanceOf[js.Any], socialNetwork = socialNetwork.asInstanceOf[js.Any], socialTarget = socialTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialAction]
  }
  @scala.inline
  implicit class SocialActionOps[Self <: SocialAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSocialAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocialNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocialTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

