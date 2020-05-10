package typingsSlinky.reactToolbox.avatarAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarTheme extends js.Object {
  /**
    * Used for the root class of the element.
    */
  var avatar: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the component has image.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * Used for the root element if the component shows the letter.
    */
  var letter: js.UndefOr[String] = js.native
}

object AvatarTheme {
  @scala.inline
  def apply(): AvatarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarTheme]
  }
  @scala.inline
  implicit class AvatarThemeOps[Self <: AvatarTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter")(js.undefined)
        ret
    }
  }
  
}

