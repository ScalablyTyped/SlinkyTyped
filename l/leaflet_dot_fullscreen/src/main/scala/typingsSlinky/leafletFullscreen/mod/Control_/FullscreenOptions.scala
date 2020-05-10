package typingsSlinky.leafletFullscreen.mod.Control_

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.leaflet.mod.ControlPosition
import typingsSlinky.leafletFullscreen.leafletFullscreenBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenOptions extends js.Object {
  var content: js.UndefOr[String] = js.native
  var forcePseudoFullscreen: js.UndefOr[Boolean] = js.native
  var forceSeparateButton: js.UndefOr[Boolean] = js.native
  var fullscreenElement: js.UndefOr[`false` | HTMLElement] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
  var pseudoFullscreen: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var titleCancel: js.UndefOr[String] = js.native
}

object FullscreenOptions {
  @scala.inline
  def apply(): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenOptions]
  }
  @scala.inline
  implicit class FullscreenOptionsOps[Self <: FullscreenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withForcePseudoFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePseudoFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcePseudoFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePseudoFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSeparateButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSeparateButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSeparateButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSeparateButton")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenElement(value: `false` | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenElement")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPseudoFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPseudoFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCancel")(js.undefined)
        ret
    }
  }
  
}

