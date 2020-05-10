package typingsSlinky.bootstrap.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.bootstrap.bootstrapBooleans.`false`
import typingsSlinky.popperJs.mod.Behavior
import typingsSlinky.popperJs.mod.Boundary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipOption extends js.Object {
  /**
    * Apply a CSS fade transition to the tooltip or popover.
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Overflow constraint boundary of the tooltip or popover.
    * Accepts the values of 'viewport', 'window', 'scrollParent',
    * or an HTMLElement reference (JavaScript only).
    * For more information refer to Popper.js's preventOverflow docs.
    *
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[Boundary | HTMLElement] = js.native
  /**
    * Appends the tooltip or popover to a specific element. Example: `container: 'body'`.
    * This option is particularly useful in that it allows you to position the tooltip or popover
    * in the flow of the document near the triggering element - which will prevent
    * it from floating away from the triggering element during a window resize.
    *
    * @default false
    */
  var container: js.UndefOr[String | Element | `false`] = js.native
  /**
    * Delay showing and hiding the tooltip or popover (ms) - does not apply to manual trigger type.
    * If a number is supplied, delay is applied to both hide/show.
    * Object structure is: `delay: { "show": 500, "hide": 100 }`.
    *
    * @default 0
    */
  var delay: js.UndefOr[Double | Delay] = js.native
  /**
    * Allow to specify which position Popper will use on fallback.
    * For more information refer to Popper.js's behavior docs.
    *
    * @default "flip"
    */
  var fallbackPlacement: js.UndefOr[Behavior | js.Array[Behavior]] = js.native
  /**
    * Allow HTML in the tooltip or popover.
    * If true, HTML tags will be rendered in the tooltip or popover.
    * If false, jQuery's text method will be used to insert content into the DOM.
    * Use text if you're worried about XSS attacks.
    *
    * @default false
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * Offset of the tooltip or popover relative to its target.
    * For more information refer to Popper.js's offset docs.
    *
    * @default 0
    */
  var offset: js.UndefOr[Double | String] = js.native
  /**
    * How to position the tooltip or popover - auto | top | bottom | left | right.
    * When "auto" is specified, it will dynamically reorient the tooltip or popover.
    *
    * When a function is used to determine the placement, it is called with
    * the tooltip or popover DOM node as its first argument and the triggering element DOM node as its second.
    * The `this` context is set to the tooltip or popover instance.
    *
    * @default tooltip: "top", popover: "right"
    */
  var placement: js.UndefOr[
    Placement | (js.ThisFunction2[
      /* this */ TooltipInstance[this.type], 
      /* node */ HTMLElement, 
      /* trigger */ Element, 
      Placement
    ])
  ] = js.native
  /**
    * To change Bootstrap's default Popper.js config,
    * see {@link https://popper.js.org/docs/v1/ Popper.js's configuration}
    */
  var popperConfig: js.UndefOr[Null | js.Object] = js.native
  /**
    * Enable or disable the sanitization. If activated 'template', 'content' and 'title' options will be sanitized.
    *
    * @default true
    */
  var sanitize: js.UndefOr[Boolean] = js.native
  /**
    * Here you can supply your own sanitize function. This can be useful if you prefer to use a dedicated library to perform sanitization.
    *
    * @default null
    */
  var sanitizeFn: js.UndefOr[Null | (js.Function1[/* input */ String, String])] = js.native
  /**
    * If a selector is provided, tooltip or popover objects will be delegated to the specified targets.
    * In practice, this is used to enable dynamic HTML content to have popovers added.
    *
    * @default false
    */
  var selector: js.UndefOr[String | `false`] = js.native
  /**
    * Base HTML to use when creating the tooltip or popover.
    * The tooltip's (resp., popover's) title will be injected into the `.tooltip-inner` (resp., `.popover-header`).
    * The `.arrow` will become the tooltip's (resp., popover's) arrow.
    * The outermost wrapper element should have the `.tooltip` (resp., .popover) class and `role="tooltip"`.
    *
    * @default '<div class="tooltip" role="tooltip"><div class="arrow"></div><div class="tooltip-inner"></div></div>'
    * @default '<div class="popover" role="tooltip"><div class="arrow"></div><h3 class="popover-header"></h3><div class="popover-body"></div></div>'
    */
  var template: js.UndefOr[String] = js.native
  /**
    * Default title value if title attribute isn't present.
    * If a function is given, it will be called with its `this` reference set to the element
    * that the tooltip or popover is attached to.
    *
    * @default ""
    */
  var title: js.UndefOr[String | Element | (js.ThisFunction0[/* this */ Element, String | Element])] = js.native
  /**
    * How tooltip or popover is triggered - click | hover | focus | manual. You may pass multiple triggers; separate them with a space.
    * 'manual' indicates that the tooltip will be triggered programmatically; this value cannot be combined with any other trigger.
    * 'hover' should only be used if alternative methods for conveying the same information for keyboard users is present.
    *
    * @default tooltip: "hover focus", popover: "click"
    */
  var trigger: js.UndefOr[Trigger] = js.native
  /**
    * Object which contains allowed attributes and tags.
    */
  var whiteList: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object TooltipOption {
  @scala.inline
  def apply(): TooltipOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOption]
  }
  @scala.inline
  implicit class TooltipOptionOps[Self <: TooltipOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundary(value: Boundary | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | Element | `false`): Self = {
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
    def withDelay(value: Double | Delay): Self = {
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
    def withFallbackPlacement(value: Behavior | js.Array[Behavior]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | String): Self = {
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
    def withPlacement(
      value: Placement | (js.ThisFunction2[
          /* this */ TooltipInstance[TooltipOption], 
          /* node */ HTMLElement, 
          /* trigger */ Element, 
          Placement
        ])
    ): Self = {
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
    def withPopperConfig(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopperConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(null)
        ret
    }
    @scala.inline
    def withSanitize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSanitize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitizeFn(value: /* input */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizeFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSanitizeFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizeFn")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitizeFnNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizeFn")(null)
        ret
    }
    @scala.inline
    def withSelector(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | Element | (js.ThisFunction0[/* this */ Element, String | Element])): Self = {
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
    def withTrigger(value: Trigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteList(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteList")(js.undefined)
        ret
    }
  }
  
}

