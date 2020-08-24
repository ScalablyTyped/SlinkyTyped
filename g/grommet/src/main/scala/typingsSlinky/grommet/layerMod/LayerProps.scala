package typingsSlinky.grommet.layerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.grommet.grommetStrings.`bottom-left`
import typingsSlinky.grommet.grommetStrings.`bottom-right`
import typingsSlinky.grommet.grommetStrings.`top-left`
import typingsSlinky.grommet.grommetStrings.`top-right`
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.center
import typingsSlinky.grommet.grommetStrings.fadeIn
import typingsSlinky.grommet.grommetStrings.hidden
import typingsSlinky.grommet.grommetStrings.horizontal
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.none
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.slide
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.grommetStrings.vertical
import typingsSlinky.grommet.utilsMod.AnimateType
import typingsSlinky.grommet.utilsMod.KeyboardType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerProps extends js.Object {
  var animate: js.UndefOr[AnimateType] = js.native
  var animation: js.UndefOr[none | slide | fadeIn | Boolean] = js.native
  var full: js.UndefOr[Boolean | vertical | horizontal] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onEsc: js.UndefOr[KeyboardType] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[
    bottom | `bottom-left` | `bottom-right` | center | hidden | left | right | top | `top-left` | `top-right`
  ] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[js.Object] = js.native
}

object LayerProps {
  @scala.inline
  def apply(): LayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerProps]
  }
  @scala.inline
  implicit class LayerPropsOps[Self <: LayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimate(value: AnimateType): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAnimation(value: none | slide | fadeIn | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setFull(value: Boolean | vertical | horizontal): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setOnClickOutside(value: /* repeated */ js.Any => _): Self = this.set("onClickOutside", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClickOutside: Self = this.set("onClickOutside", js.undefined)
    @scala.inline
    def setOnEsc(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = this.set("onEsc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEsc: Self = this.set("onEsc", js.undefined)
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    @scala.inline
    def setPosition(
      value: bottom | `bottom-left` | `bottom-right` | center | hidden | left | right | top | `top-left` | `top-right`
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setTarget(value: js.Object): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

