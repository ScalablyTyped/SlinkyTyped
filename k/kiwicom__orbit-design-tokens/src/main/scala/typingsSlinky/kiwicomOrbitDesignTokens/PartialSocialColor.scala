package typingsSlinky.kiwicomOrbitDesignTokens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.SocialColor> */
@js.native
trait PartialSocialColor extends js.Object {
  var facebook: js.UndefOr[String] = js.native
  var facebookActive: js.UndefOr[String] = js.native
  var facebookHover: js.UndefOr[String] = js.native
}

object PartialSocialColor {
  @scala.inline
  def apply(): PartialSocialColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSocialColor]
  }
  @scala.inline
  implicit class PartialSocialColorOps[Self <: PartialSocialColor] (val x: Self) extends AnyVal {
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
    def withoutFacebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(js.undefined)
        ret
    }
    @scala.inline
    def withFacebookActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacebookActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookActive")(js.undefined)
        ret
    }
    @scala.inline
    def withFacebookHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacebookHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookHover")(js.undefined)
        ret
    }
  }
  
}

