package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayContentBackground extends js.Object {
  var color: js.UndefOr[String] = js.native
  var overlayContentBackground: js.UndefOr[String] = js.native
  var subtitleColor: js.UndefOr[String] = js.native
  var titleColor: js.UndefOr[String] = js.native
}

object OverlayContentBackground {
  @scala.inline
  def apply(): OverlayContentBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayContentBackground]
  }
  @scala.inline
  implicit class OverlayContentBackgroundOps[Self <: OverlayContentBackground] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayContentBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayContentBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayContentBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayContentBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(js.undefined)
        ret
    }
  }
  
}

