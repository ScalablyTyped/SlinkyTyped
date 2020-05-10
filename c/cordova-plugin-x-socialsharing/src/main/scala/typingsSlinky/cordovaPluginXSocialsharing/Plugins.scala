package typingsSlinky.cordovaPluginXSocialsharing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugins extends js.Object {
  var socialsharing: SocialSharing = js.native
}

object Plugins {
  @scala.inline
  def apply(socialsharing: SocialSharing): Plugins = {
    val __obj = js.Dynamic.literal(socialsharing = socialsharing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
  @scala.inline
  implicit class PluginsOps[Self <: Plugins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSocialsharing(value: SocialSharing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialsharing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

