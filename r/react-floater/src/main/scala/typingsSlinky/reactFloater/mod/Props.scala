package typingsSlinky.reactFloater.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.popperJs.mod.Data
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactFloater.anon.Offset
import typingsSlinky.reactFloater.anon.PartialStyles
import typingsSlinky.reactFloater.reactFloaterStrings.click
import typingsSlinky.reactFloater.reactFloaterStrings.floater
import typingsSlinky.reactFloater.reactFloaterStrings.hover
import typingsSlinky.reactFloater.reactFloaterStrings.wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Open the Floater automatically.
    */
  var autoOpen: js.UndefOr[Boolean] = js.native
  /**
    * It will be called when the Floater change state
    */
  var callback: js.UndefOr[
    js.Function2[/* action */ Action, /* props */ PropsWithComponent | PropsWithContent, Unit]
  ] = js.native
  /**
    * An element to trigger the Floater.
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Log some basic actions.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Animate the Floater on scroll/resize.
    */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Disable changes in the Floater position on scroll/resize.
    */
  var disableFlip: js.UndefOr[Boolean] = js.native
  /**
    * Don't convert hover event to click on mobile.
    */
  var disableHoverToClick: js.UndefOr[Boolean] = js.native
  /**
    * The event that will trigger the Floater. It can be hover | click.
    * These won't work in controlled mode.
    */
  var event: js.UndefOr[click | hover] = js.native
  /**
    * The amount of time (in seconds) that the floater should wait after a mouseLeave event before hiding. Only valid for event type hover.
    */
  var eventDelay: js.UndefOr[Double] = js.native
  /**
    * It can be anything that can be rendered.
    */
  var footer: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Get the popper.js instance
    */
  var getPopper: js.UndefOr[js.Function2[/* popper */ Data, /* origin */ floater | wrapper, Unit]] = js.native
  /**
    * Don't show the arrow. Useful for centered or modal layout.
    */
  var hideArrow: js.UndefOr[Boolean] = js.native
  /**
    * In case that you need to identify the portal.
    */
  var id: js.UndefOr[String | Double] = js.native
  /**
    * The distance between the Floater and its target in pixels.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Controlled mode.
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * Customize popper.js modifiers.
    */
  var options: js.UndefOr[Modifiers] = js.native
  /**
    * The placement of the Floater. It will update the position if there's no space available.
    */
  var placement: js.UndefOr[Placement] = js.native
  /**
    * It will show a ⨉ button to close the Floater.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Customize the default UI.
    */
  var styles: js.UndefOr[PartialStyles] = js.native
  /**
    * The target used to calculate the Floater position. If it's not set, it will use the `children` as the target.
    */
  var target: js.UndefOr[String | HTMLElement | Null] = js.native
  /**
    * It can be anything that can be rendered.
    */
  var title: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Position the wrapper relative to the target.
    */
  var wrapperOptions: js.UndefOr[Offset] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: (/* action */ Action, /* props */ PropsWithComponent | PropsWithContent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFlip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFlip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFlip")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHoverToClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHoverToClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHoverToClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHoverToClick")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: click | hover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPopper(value: (/* popper */ Data, /* origin */ floater | wrapper) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopper")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetPopper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopper")(js.undefined)
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
    def withId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Modifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
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
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: PartialStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TagMod[Any]): Self = {
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
    def withWrapperOptions(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperOptions")(js.undefined)
        ret
    }
  }
  
}

