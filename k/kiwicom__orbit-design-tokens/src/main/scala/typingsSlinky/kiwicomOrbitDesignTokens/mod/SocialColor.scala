package typingsSlinky.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialColor extends js.Object {
  var facebook: String = js.native
  var facebookActive: String = js.native
  var facebookHover: String = js.native
}

object SocialColor {
  @scala.inline
  def apply(facebook: String, facebookActive: String, facebookHover: String): SocialColor = {
    val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], facebookActive = facebookActive.asInstanceOf[js.Any], facebookHover = facebookHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialColor]
  }
  @scala.inline
  implicit class SocialColorOps[Self <: SocialColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacebook(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacebookActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacebookHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookHover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

