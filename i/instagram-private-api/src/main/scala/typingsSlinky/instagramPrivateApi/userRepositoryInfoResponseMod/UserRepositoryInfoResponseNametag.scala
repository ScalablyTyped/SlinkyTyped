package typingsSlinky.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRepositoryInfoResponseNametag extends js.Object {
  var emoji: String = js.native
  var gradient: String = js.native
  var mode: Double = js.native
  var selfie_sticker: String = js.native
}

object UserRepositoryInfoResponseNametag {
  @scala.inline
  def apply(emoji: String, gradient: String, mode: Double, selfie_sticker: String): UserRepositoryInfoResponseNametag = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], selfie_sticker = selfie_sticker.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositoryInfoResponseNametag]
  }
  @scala.inline
  implicit class UserRepositoryInfoResponseNametagOps[Self <: UserRepositoryInfoResponseNametag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmoji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfie_sticker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfie_sticker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

