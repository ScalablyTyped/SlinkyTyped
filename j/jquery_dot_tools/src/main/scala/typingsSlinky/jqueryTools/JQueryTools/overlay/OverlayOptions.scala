package typingsSlinky.jqueryTools.JQueryTools.overlay

import org.scalajs.dom.raw.Element
import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryTools.JQuery
import typingsSlinky.jqueryTools.jqueryToolsStrings.center
import typingsSlinky.jqueryTools.jqueryToolsStrings.fast
import typingsSlinky.jqueryTools.jqueryToolsStrings.normal
import typingsSlinky.jqueryTools.jqueryToolsStrings.slow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayOptions extends js.Object {
  /**
    * A jQuery selector for the closing elements inside the overlay. These
    * can be any elements such as links, buttons or images. If this is not
    * supplied, a close element is auto-generated. Read more about this in
    * defining close actions.
    */
  var close: js.UndefOr[JQuery] = js.native
  /**
    * By default, overlays are closed when the mouse is clicked outside the
    * overlay area. Setting this property to false suppresses this behaviour
    * which is suitable for modal dialogs.
    * @default true
    */
  var closeOnClick: js.UndefOr[Boolean] = js.native
  /**
    * By default, overlays are closed when the ESC keyboard key is pressed.
    * Setting this property to false suppresses this behaviour.
    * @default true
    */
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  /** The speed to close the overlay, in milliseconds */
  var closeSpeed: js.UndefOr[Double] = js.native
  /**
    * The effect to be used when an overlay is opened and closed. This can
    * dramatically change the behaviour of the overlay. By default this tool
    * uses an effect called "default" which is a simple show/hide effect.
    * @default 'default'
    */
  var effect: js.UndefOr[String] = js.native
  /**
    * since 1.2.0. whether overlay stays in the same position while the screen
    * is scrolled. This is the default behaviour for all browsers except IE6
    * and below. IE6 does not support fixed positioning. If this property is
    * set to false then the overlay is positioned in relationship to the document
    * so that when the screen is scrolled then the overlay moves along with the document.
    * @default true
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how far from the left-hand edge of the screen the overlay should be
    * placed. By default the overlay is horizontally centered with the value "center"
    * but you can also supply a numerical value specifying a distance in pixels.
    * @default 'center'
    */
  var left: js.UndefOr[center | Double] = js.native
  /**
    * If enabled then the overlay loads immediately after it has been initialized.
    * @default false
    */
  var load: js.UndefOr[Boolean] = js.native
  /**
    * Previously known as expose. Overlay is very often used together with the
    * Mask Tool. Because of this, the support for this feature has been built
    * inside the tool. This option accepts the mask configuration. This is either
    * a simple string specifying the background color of the mask or a more complex
    * object literal specifying more configuration variables. See an example of an
    * overlay together with mask. By default masking is disabled.
    */
  var mask: js.UndefOr[String | MaskOptions] = js.native
  /** before the overlay is closed */
  var onBeforeClose: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.native
  /**
    * before the overlay is displayed. The overlay has already been positioned at the
    * location from where it will start animating.
    */
  var onBeforeLoad: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.native
  /** when the overlay is closed  */
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.native
  /** when the overlay has completely been displayed  */
  var onLoad: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.native
  /**
    * By default, there can be only one overlay on the page at once. Setting this
    * property to false allows you to have multiple overlay instances.
    * @default true
    */
  var oneInstance: js.UndefOr[Boolean] = js.native
  /**
    * The speed of the fade-in animation on the "default" effect. Valid values are
    * 'slow', 'normal' and 'fast', or you can supply a numerical value (in milliseconds).
    * By setting this property to 0, the overlay will appear immediately without any animation.
    * @default 'normal'
    */
  var speed: js.UndefOr[slow | normal | fast | Double] = js.native
  /**
    * The element to be overlayed (if not specified in the rel attribute of the triggering element).
    */
  var target: js.UndefOr[Element] = js.native
  /**
    * Specifies how far from the top edge of the screen the overlay should be placed.
    * Acceptable values are an integer number specifying a distance in pixels, a string
    * (such as '15%') specifying a percentage value or "center" in which case the overlay
    * is vertically centered. Percentage values work consistently at different screen resolutions.
    * @default '10%'
    */
  var top: js.UndefOr[String | Double] = js.native
}

object OverlayOptions {
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  @scala.inline
  implicit class OverlayOptionsOps[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: center | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: String | MaskOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeClose(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeLoad(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOneInstance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: slow | normal | fast | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
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
    def withTop(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

