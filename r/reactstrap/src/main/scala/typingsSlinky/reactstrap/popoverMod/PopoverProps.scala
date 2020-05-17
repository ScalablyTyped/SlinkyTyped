package typingsSlinky.reactstrap.popoverMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.popperJs.mod.Boundary
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.popperJs.mod.Placement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactstrap.anon.Hide
import typingsSlinky.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var boundariesElement: js.UndefOr[Boundary | Element] = js.native
  var container: js.UndefOr[String | HTMLElement | ReactRef[HTMLElement]] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var delay: js.UndefOr[Double | Hide] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fade: js.UndefOr[Boolean] = js.native
  var flip: js.UndefOr[Boolean] = js.native
  var hideArrow: js.UndefOr[Boolean] = js.native
  var innerClassName: js.UndefOr[String] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[Modifiers] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var placementPrefix: js.UndefOr[String] = js.native
  var popperClassName: js.UndefOr[String] = js.native
  var target: String | HTMLElement | ReactRef[HTMLElement] = js.native
  var toggle: js.UndefOr[MouseEventHandler[_] | js.Function0[Unit]] = js.native
}

object PopoverProps {
  @scala.inline
  def apply(target: String | HTMLElement | ReactRef[HTMLElement]): PopoverProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetRefObject(value: ReactRef[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | HTMLElement | ReactRef[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundariesElementElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundariesElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundariesElement(value: Boundary | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundariesElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundariesElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundariesElement")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerRefObject(value: ReactRef[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | HTMLElement | ReactRef[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCssModule(value: CSSModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssModule")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double | Hide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withHideArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: Modifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopperClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleFunction1(value: SyntheticMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: MouseEventHandler[_] | js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
  }
  
}

