package typingsSlinky.bootstrap

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.bootstrap.bootstrapBooleans.`false`
import typingsSlinky.bootstrap.bootstrapStrings.auto
import typingsSlinky.bootstrap.bootstrapStrings.bottom
import typingsSlinky.bootstrap.bootstrapStrings.click
import typingsSlinky.bootstrap.bootstrapStrings.dynamic
import typingsSlinky.bootstrap.bootstrapStrings.focus
import typingsSlinky.bootstrap.bootstrapStrings.hover
import typingsSlinky.bootstrap.bootstrapStrings.left
import typingsSlinky.bootstrap.bootstrapStrings.manual
import typingsSlinky.bootstrap.bootstrapStrings.offset
import typingsSlinky.bootstrap.bootstrapStrings.parent
import typingsSlinky.bootstrap.bootstrapStrings.position
import typingsSlinky.bootstrap.bootstrapStrings.right
import typingsSlinky.bootstrap.bootstrapStrings.scrollParent
import typingsSlinky.bootstrap.bootstrapStrings.static
import typingsSlinky.bootstrap.bootstrapStrings.toggle
import typingsSlinky.bootstrap.bootstrapStrings.top
import typingsSlinky.bootstrap.bootstrapStrings.viewport
import typingsSlinky.bootstrap.bootstrapStrings.window
import typingsSlinky.jquery.JQuery
import typingsSlinky.popperJs.mod.Behavior
import typingsSlinky.popperJs.mod.Boundary
import typingsSlinky.popperJs.mod.PopperOptions
import typingsSlinky.popperJs.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hide extends StObject {
    
    var hide: Double = js.native
    
    var show: Double = js.native
  }
  object Hide {
    
    @scala.inline
    def apply(hide: Double, show: Double): Hide = {
      val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hide]
    }
    
    @scala.inline
    implicit class HideMutableBuilder[Self <: Hide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/carousel.Carousel.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var interval: js.UndefOr[Double] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var pause: js.UndefOr[String | Boolean] = js.native
    
    var slide: js.UndefOr[String | Boolean] = js.native
    
    var touch: js.UndefOr[Boolean] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setPause(value: String | Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setSlide(value: String | Boolean): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/popover.Popover.Options> */
  @js.native
  trait PartialOptionsAnimation extends StObject {
    
    var animation: js.UndefOr[Boolean] = js.native
    
    var boundary: js.UndefOr[viewport | window | scrollParent | Element] = js.native
    
    var container: js.UndefOr[String | Element | `false`] = js.native
    
    var content: js.UndefOr[String | Element | js.Function0[Unit]] = js.native
    
    var delay: js.UndefOr[Double | Hide] = js.native
    
    var fallbackPlacement: js.UndefOr[Behavior | js.Array[Position]] = js.native
    
    var html: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Double | String] = js.native
    
    var placement: js.UndefOr[auto | top | bottom | left | right | js.Function0[Unit]] = js.native
    
    var popperConfig: js.UndefOr[PopperOptions | Null] = js.native
    
    var sanitize: js.UndefOr[Boolean] = js.native
    
    var sanitizeFn: js.UndefOr[js.Function0[Unit | Null]] = js.native
    
    var selector: js.UndefOr[String | `false`] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String | Element | js.Function0[Unit]] = js.native
    
    var trigger: js.UndefOr[click | hover | focus | manual] = js.native
    
    var whiteList: js.UndefOr[RecordkeyofHTMLElementTag] = js.native
  }
  object PartialOptionsAnimation {
    
    @scala.inline
    def apply(): PartialOptionsAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsAnimation]
    }
    
    @scala.inline
    implicit class PartialOptionsAnimationMutableBuilder[Self <: PartialOptionsAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBoundary(value: viewport | window | scrollParent | Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryElement(value: Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setContainer(value: String | Element | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElement(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setContent(value: String | Element | js.Function0[Unit]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentElement(value: Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction0(value: () => Unit): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setFallbackPlacement(value: Behavior | js.Array[Position]): Self = StObject.set(x, "fallbackPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackPlacementUndefined: Self = StObject.set(x, "fallbackPlacement", js.undefined)
      
      @scala.inline
      def setFallbackPlacementVarargs(value: Position*): Self = StObject.set(x, "fallbackPlacement", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPlacement(value: auto | top | bottom | left | right | js.Function0[Unit]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementFunction0(value: () => Unit): Self = StObject.set(x, "placement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopperConfig(value: PopperOptions): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
      
      @scala.inline
      def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      @scala.inline
      def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSanitizeFn(value: () => Unit | Null): Self = StObject.set(x, "sanitizeFn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSanitizeFnUndefined: Self = StObject.set(x, "sanitizeFn", js.undefined)
      
      @scala.inline
      def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      @scala.inline
      def setSelector(value: String | `false`): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTitle(value: String | Element | js.Function0[Unit]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleElement(value: Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => Unit): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTrigger(value: click | hover | focus | manual): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setWhiteList(value: RecordkeyofHTMLElementTag): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteListUndefined: Self = StObject.set(x, "whiteList", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/modal.Modal.Options> */
  @js.native
  trait PartialOptionsBackdrop extends StObject {
    
    var backdrop: js.UndefOr[static | Boolean] = js.native
    
    var focus: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
  }
  object PartialOptionsBackdrop {
    
    @scala.inline
    def apply(): PartialOptionsBackdrop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsBackdrop]
    }
    
    @scala.inline
    implicit class PartialOptionsBackdropMutableBuilder[Self <: PartialOptionsBackdrop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdrop(value: static | Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/dropdown.Dropdown.Options> */
  @js.native
  trait PartialOptionsBoundary extends StObject {
    
    var boundary: js.UndefOr[Boundary | Element] = js.native
    
    var display: js.UndefOr[dynamic | static] = js.native
    
    var flip: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var popperConfig: js.UndefOr[PopperOptions | Null] = js.native
    
    var reference: js.UndefOr[toggle | parent | Element] = js.native
  }
  object PartialOptionsBoundary {
    
    @scala.inline
    def apply(): PartialOptionsBoundary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsBoundary]
    }
    
    @scala.inline
    implicit class PartialOptionsBoundaryMutableBuilder[Self <: PartialOptionsBoundary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundary(value: Boundary | Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryElement(value: Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setDisplay(value: dynamic | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPopperConfig(value: PopperOptions): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
      
      @scala.inline
      def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      @scala.inline
      def setReference(value: toggle | parent | Element): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceElement(value: Element): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/scrollspy.ScrollSpy.Options> */
  @js.native
  trait PartialOptionsMethod extends StObject {
    
    var method: js.UndefOr[auto | offset | position] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[String | Element | JQuery[HTMLElement]] = js.native
  }
  object PartialOptionsMethod {
    
    @scala.inline
    def apply(): PartialOptionsMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsMethod]
    }
    
    @scala.inline
    implicit class PartialOptionsMethodMutableBuilder[Self <: PartialOptionsMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: auto | offset | position): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setTarget(value: String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElement(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/collapse.Collapse.Options> */
  @js.native
  trait PartialOptionsParent extends StObject {
    
    var parent: js.UndefOr[String | Element | JQuery[HTMLElement]] = js.native
    
    var toggle: js.UndefOr[Boolean] = js.native
  }
  object PartialOptionsParent {
    
    @scala.inline
    def apply(): PartialOptionsParent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsParent]
    }
    
    @scala.inline
    implicit class PartialOptionsParentMutableBuilder[Self <: PartialOptionsParent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParent(value: String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  /* Inlined std.Record<keyof std.HTMLElementTagNameMap, std.Array<string>> */
  @js.native
  trait RecordkeyofHTMLElementTag extends StObject {
    
    var a: js.Array[String] = js.native
    
    var abbr: js.Array[String] = js.native
    
    var address: js.Array[String] = js.native
    
    var applet: js.Array[String] = js.native
    
    var area: js.Array[String] = js.native
    
    var article: js.Array[String] = js.native
    
    var aside: js.Array[String] = js.native
    
    var audio: js.Array[String] = js.native
    
    var b: js.Array[String] = js.native
    
    var base: js.Array[String] = js.native
    
    var basefont: js.Array[String] = js.native
    
    var bdi: js.Array[String] = js.native
    
    var bdo: js.Array[String] = js.native
    
    var blockquote: js.Array[String] = js.native
    
    var body: js.Array[String] = js.native
    
    var br: js.Array[String] = js.native
    
    var button: js.Array[String] = js.native
    
    var canvas: js.Array[String] = js.native
    
    var caption: js.Array[String] = js.native
    
    var cite: js.Array[String] = js.native
    
    var code: js.Array[String] = js.native
    
    var col: js.Array[String] = js.native
    
    var colgroup: js.Array[String] = js.native
    
    var data: js.Array[String] = js.native
    
    var datalist: js.Array[String] = js.native
    
    var dd: js.Array[String] = js.native
    
    var del: js.Array[String] = js.native
    
    var details: js.Array[String] = js.native
    
    var dfn: js.Array[String] = js.native
    
    var dialog: js.Array[String] = js.native
    
    var dir: js.Array[String] = js.native
    
    var div: js.Array[String] = js.native
    
    var dl: js.Array[String] = js.native
    
    var dt: js.Array[String] = js.native
    
    var em: js.Array[String] = js.native
    
    var embed: js.Array[String] = js.native
    
    var fieldset: js.Array[String] = js.native
    
    var figcaption: js.Array[String] = js.native
    
    var figure: js.Array[String] = js.native
    
    var font: js.Array[String] = js.native
    
    var footer: js.Array[String] = js.native
    
    var form: js.Array[String] = js.native
    
    var frame: js.Array[String] = js.native
    
    var frameset: js.Array[String] = js.native
    
    var h1: js.Array[String] = js.native
    
    var h2: js.Array[String] = js.native
    
    var h3: js.Array[String] = js.native
    
    var h4: js.Array[String] = js.native
    
    var h5: js.Array[String] = js.native
    
    var h6: js.Array[String] = js.native
    
    var head: js.Array[String] = js.native
    
    var header: js.Array[String] = js.native
    
    var hgroup: js.Array[String] = js.native
    
    var hr: js.Array[String] = js.native
    
    var html: js.Array[String] = js.native
    
    var i: js.Array[String] = js.native
    
    var iframe: js.Array[String] = js.native
    
    var img: js.Array[String] = js.native
    
    var input: js.Array[String] = js.native
    
    var ins: js.Array[String] = js.native
    
    var kbd: js.Array[String] = js.native
    
    var label: js.Array[String] = js.native
    
    var legend: js.Array[String] = js.native
    
    var li: js.Array[String] = js.native
    
    var link: js.Array[String] = js.native
    
    var main: js.Array[String] = js.native
    
    var map: js.Array[String] = js.native
    
    var mark: js.Array[String] = js.native
    
    var marquee: js.Array[String] = js.native
    
    var menu: js.Array[String] = js.native
    
    var meta: js.Array[String] = js.native
    
    var meter: js.Array[String] = js.native
    
    var nav: js.Array[String] = js.native
    
    var noscript: js.Array[String] = js.native
    
    var `object`: js.Array[String] = js.native
    
    var ol: js.Array[String] = js.native
    
    var optgroup: js.Array[String] = js.native
    
    var option: js.Array[String] = js.native
    
    var output: js.Array[String] = js.native
    
    var p: js.Array[String] = js.native
    
    var param: js.Array[String] = js.native
    
    var picture: js.Array[String] = js.native
    
    var pre: js.Array[String] = js.native
    
    var progress: js.Array[String] = js.native
    
    var q: js.Array[String] = js.native
    
    var rp: js.Array[String] = js.native
    
    var rt: js.Array[String] = js.native
    
    var ruby: js.Array[String] = js.native
    
    var s: js.Array[String] = js.native
    
    var samp: js.Array[String] = js.native
    
    var script: js.Array[String] = js.native
    
    var section: js.Array[String] = js.native
    
    var select: js.Array[String] = js.native
    
    var slot: js.Array[String] = js.native
    
    var small: js.Array[String] = js.native
    
    var source: js.Array[String] = js.native
    
    var span: js.Array[String] = js.native
    
    var strong: js.Array[String] = js.native
    
    var style: js.Array[String] = js.native
    
    var sub: js.Array[String] = js.native
    
    var summary: js.Array[String] = js.native
    
    var sup: js.Array[String] = js.native
    
    var table: js.Array[String] = js.native
    
    var tbody: js.Array[String] = js.native
    
    var td: js.Array[String] = js.native
    
    var template: js.Array[String] = js.native
    
    var textarea: js.Array[String] = js.native
    
    var tfoot: js.Array[String] = js.native
    
    var th: js.Array[String] = js.native
    
    var thead: js.Array[String] = js.native
    
    var time: js.Array[String] = js.native
    
    var title: js.Array[String] = js.native
    
    var tr: js.Array[String] = js.native
    
    var track: js.Array[String] = js.native
    
    var u: js.Array[String] = js.native
    
    var ul: js.Array[String] = js.native
    
    var `var`: js.Array[String] = js.native
    
    var video: js.Array[String] = js.native
    
    var wbr: js.Array[String] = js.native
  }
  object RecordkeyofHTMLElementTag {
    
    @scala.inline
    def apply(
      a: js.Array[String],
      abbr: js.Array[String],
      address: js.Array[String],
      applet: js.Array[String],
      area: js.Array[String],
      article: js.Array[String],
      aside: js.Array[String],
      audio: js.Array[String],
      b: js.Array[String],
      base: js.Array[String],
      basefont: js.Array[String],
      bdi: js.Array[String],
      bdo: js.Array[String],
      blockquote: js.Array[String],
      body: js.Array[String],
      br: js.Array[String],
      button: js.Array[String],
      canvas: js.Array[String],
      caption: js.Array[String],
      cite: js.Array[String],
      code: js.Array[String],
      col: js.Array[String],
      colgroup: js.Array[String],
      data: js.Array[String],
      datalist: js.Array[String],
      dd: js.Array[String],
      del: js.Array[String],
      details: js.Array[String],
      dfn: js.Array[String],
      dialog: js.Array[String],
      dir: js.Array[String],
      div: js.Array[String],
      dl: js.Array[String],
      dt: js.Array[String],
      em: js.Array[String],
      embed: js.Array[String],
      fieldset: js.Array[String],
      figcaption: js.Array[String],
      figure: js.Array[String],
      font: js.Array[String],
      footer: js.Array[String],
      form: js.Array[String],
      frame: js.Array[String],
      frameset: js.Array[String],
      h1: js.Array[String],
      h2: js.Array[String],
      h3: js.Array[String],
      h4: js.Array[String],
      h5: js.Array[String],
      h6: js.Array[String],
      head: js.Array[String],
      header: js.Array[String],
      hgroup: js.Array[String],
      hr: js.Array[String],
      html: js.Array[String],
      i: js.Array[String],
      iframe: js.Array[String],
      img: js.Array[String],
      input: js.Array[String],
      ins: js.Array[String],
      kbd: js.Array[String],
      label: js.Array[String],
      legend: js.Array[String],
      li: js.Array[String],
      link: js.Array[String],
      main: js.Array[String],
      map: js.Array[String],
      mark: js.Array[String],
      marquee: js.Array[String],
      menu: js.Array[String],
      meta: js.Array[String],
      meter: js.Array[String],
      nav: js.Array[String],
      noscript: js.Array[String],
      `object`: js.Array[String],
      ol: js.Array[String],
      optgroup: js.Array[String],
      option: js.Array[String],
      output: js.Array[String],
      p: js.Array[String],
      param: js.Array[String],
      picture: js.Array[String],
      pre: js.Array[String],
      progress: js.Array[String],
      q: js.Array[String],
      rp: js.Array[String],
      rt: js.Array[String],
      ruby: js.Array[String],
      s: js.Array[String],
      samp: js.Array[String],
      script: js.Array[String],
      section: js.Array[String],
      select: js.Array[String],
      slot: js.Array[String],
      small: js.Array[String],
      source: js.Array[String],
      span: js.Array[String],
      strong: js.Array[String],
      style: js.Array[String],
      sub: js.Array[String],
      summary: js.Array[String],
      sup: js.Array[String],
      table: js.Array[String],
      tbody: js.Array[String],
      td: js.Array[String],
      template: js.Array[String],
      textarea: js.Array[String],
      tfoot: js.Array[String],
      th: js.Array[String],
      thead: js.Array[String],
      time: js.Array[String],
      title: js.Array[String],
      tr: js.Array[String],
      track: js.Array[String],
      u: js.Array[String],
      ul: js.Array[String],
      `var`: js.Array[String],
      video: js.Array[String],
      wbr: js.Array[String]
    ): RecordkeyofHTMLElementTag = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], applet = applet.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], basefont = basefont.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], frameset = frameset.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marquee = marquee.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordkeyofHTMLElementTag]
    }
    
    @scala.inline
    implicit class RecordkeyofHTMLElementTagMutableBuilder[Self <: RecordkeyofHTMLElementTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: js.Array[String]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAVarargs(value: String*): Self = StObject.set(x, "a", js.Array(value :_*))
      
      @scala.inline
      def setAbbr(value: js.Array[String]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbrVarargs(value: String*): Self = StObject.set(x, "abbr", js.Array(value :_*))
      
      @scala.inline
      def setAddress(value: js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value :_*))
      
      @scala.inline
      def setApplet(value: js.Array[String]): Self = StObject.set(x, "applet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppletVarargs(value: String*): Self = StObject.set(x, "applet", js.Array(value :_*))
      
      @scala.inline
      def setArea(value: js.Array[String]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaVarargs(value: String*): Self = StObject.set(x, "area", js.Array(value :_*))
      
      @scala.inline
      def setArticle(value: js.Array[String]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArticleVarargs(value: String*): Self = StObject.set(x, "article", js.Array(value :_*))
      
      @scala.inline
      def setAside(value: js.Array[String]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsideVarargs(value: String*): Self = StObject.set(x, "aside", js.Array(value :_*))
      
      @scala.inline
      def setAudio(value: js.Array[String]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioVarargs(value: String*): Self = StObject.set(x, "audio", js.Array(value :_*))
      
      @scala.inline
      def setB(value: js.Array[String]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBVarargs(value: String*): Self = StObject.set(x, "b", js.Array(value :_*))
      
      @scala.inline
      def setBase(value: js.Array[String]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseVarargs(value: String*): Self = StObject.set(x, "base", js.Array(value :_*))
      
      @scala.inline
      def setBasefont(value: js.Array[String]): Self = StObject.set(x, "basefont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasefontVarargs(value: String*): Self = StObject.set(x, "basefont", js.Array(value :_*))
      
      @scala.inline
      def setBdi(value: js.Array[String]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBdiVarargs(value: String*): Self = StObject.set(x, "bdi", js.Array(value :_*))
      
      @scala.inline
      def setBdo(value: js.Array[String]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBdoVarargs(value: String*): Self = StObject.set(x, "bdo", js.Array(value :_*))
      
      @scala.inline
      def setBlockquote(value: js.Array[String]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockquoteVarargs(value: String*): Self = StObject.set(x, "blockquote", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: js.Array[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyVarargs(value: String*): Self = StObject.set(x, "body", js.Array(value :_*))
      
      @scala.inline
      def setBr(value: js.Array[String]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrVarargs(value: String*): Self = StObject.set(x, "br", js.Array(value :_*))
      
      @scala.inline
      def setButton(value: js.Array[String]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonVarargs(value: String*): Self = StObject.set(x, "button", js.Array(value :_*))
      
      @scala.inline
      def setCanvas(value: js.Array[String]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasVarargs(value: String*): Self = StObject.set(x, "canvas", js.Array(value :_*))
      
      @scala.inline
      def setCaption(value: js.Array[String]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionVarargs(value: String*): Self = StObject.set(x, "caption", js.Array(value :_*))
      
      @scala.inline
      def setCite(value: js.Array[String]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiteVarargs(value: String*): Self = StObject.set(x, "cite", js.Array(value :_*))
      
      @scala.inline
      def setCode(value: js.Array[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeVarargs(value: String*): Self = StObject.set(x, "code", js.Array(value :_*))
      
      @scala.inline
      def setCol(value: js.Array[String]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColVarargs(value: String*): Self = StObject.set(x, "col", js.Array(value :_*))
      
      @scala.inline
      def setColgroup(value: js.Array[String]): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColgroupVarargs(value: String*): Self = StObject.set(x, "colgroup", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDatalist(value: js.Array[String]): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatalistVarargs(value: String*): Self = StObject.set(x, "datalist", js.Array(value :_*))
      
      @scala.inline
      def setDd(value: js.Array[String]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdVarargs(value: String*): Self = StObject.set(x, "dd", js.Array(value :_*))
      
      @scala.inline
      def setDel(value: js.Array[String]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelVarargs(value: String*): Self = StObject.set(x, "del", js.Array(value :_*))
      
      @scala.inline
      def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
      
      @scala.inline
      def setDfn(value: js.Array[String]): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDfnVarargs(value: String*): Self = StObject.set(x, "dfn", js.Array(value :_*))
      
      @scala.inline
      def setDialog(value: js.Array[String]): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogVarargs(value: String*): Self = StObject.set(x, "dialog", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: js.Array[String]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirVarargs(value: String*): Self = StObject.set(x, "dir", js.Array(value :_*))
      
      @scala.inline
      def setDiv(value: js.Array[String]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivVarargs(value: String*): Self = StObject.set(x, "div", js.Array(value :_*))
      
      @scala.inline
      def setDl(value: js.Array[String]): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlVarargs(value: String*): Self = StObject.set(x, "dl", js.Array(value :_*))
      
      @scala.inline
      def setDt(value: js.Array[String]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtVarargs(value: String*): Self = StObject.set(x, "dt", js.Array(value :_*))
      
      @scala.inline
      def setEm(value: js.Array[String]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmVarargs(value: String*): Self = StObject.set(x, "em", js.Array(value :_*))
      
      @scala.inline
      def setEmbed(value: js.Array[String]): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbedVarargs(value: String*): Self = StObject.set(x, "embed", js.Array(value :_*))
      
      @scala.inline
      def setFieldset(value: js.Array[String]): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsetVarargs(value: String*): Self = StObject.set(x, "fieldset", js.Array(value :_*))
      
      @scala.inline
      def setFigcaption(value: js.Array[String]): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFigcaptionVarargs(value: String*): Self = StObject.set(x, "figcaption", js.Array(value :_*))
      
      @scala.inline
      def setFigure(value: js.Array[String]): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFigureVarargs(value: String*): Self = StObject.set(x, "figure", js.Array(value :_*))
      
      @scala.inline
      def setFont(value: js.Array[String]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVarargs(value: String*): Self = StObject.set(x, "font", js.Array(value :_*))
      
      @scala.inline
      def setFooter(value: js.Array[String]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterVarargs(value: String*): Self = StObject.set(x, "footer", js.Array(value :_*))
      
      @scala.inline
      def setForm(value: js.Array[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormVarargs(value: String*): Self = StObject.set(x, "form", js.Array(value :_*))
      
      @scala.inline
      def setFrame(value: js.Array[String]): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameVarargs(value: String*): Self = StObject.set(x, "frame", js.Array(value :_*))
      
      @scala.inline
      def setFrameset(value: js.Array[String]): Self = StObject.set(x, "frameset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesetVarargs(value: String*): Self = StObject.set(x, "frameset", js.Array(value :_*))
      
      @scala.inline
      def setH1(value: js.Array[String]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1Varargs(value: String*): Self = StObject.set(x, "h1", js.Array(value :_*))
      
      @scala.inline
      def setH2(value: js.Array[String]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2Varargs(value: String*): Self = StObject.set(x, "h2", js.Array(value :_*))
      
      @scala.inline
      def setH3(value: js.Array[String]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3Varargs(value: String*): Self = StObject.set(x, "h3", js.Array(value :_*))
      
      @scala.inline
      def setH4(value: js.Array[String]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4Varargs(value: String*): Self = StObject.set(x, "h4", js.Array(value :_*))
      
      @scala.inline
      def setH5(value: js.Array[String]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5Varargs(value: String*): Self = StObject.set(x, "h5", js.Array(value :_*))
      
      @scala.inline
      def setH6(value: js.Array[String]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6Varargs(value: String*): Self = StObject.set(x, "h6", js.Array(value :_*))
      
      @scala.inline
      def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      @scala.inline
      def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      @scala.inline
      def setHgroup(value: js.Array[String]): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHgroupVarargs(value: String*): Self = StObject.set(x, "hgroup", js.Array(value :_*))
      
      @scala.inline
      def setHr(value: js.Array[String]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrVarargs(value: String*): Self = StObject.set(x, "hr", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: js.Array[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlVarargs(value: String*): Self = StObject.set(x, "html", js.Array(value :_*))
      
      @scala.inline
      def setI(value: js.Array[String]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIVarargs(value: String*): Self = StObject.set(x, "i", js.Array(value :_*))
      
      @scala.inline
      def setIframe(value: js.Array[String]): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeVarargs(value: String*): Self = StObject.set(x, "iframe", js.Array(value :_*))
      
      @scala.inline
      def setImg(value: js.Array[String]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgVarargs(value: String*): Self = StObject.set(x, "img", js.Array(value :_*))
      
      @scala.inline
      def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value :_*))
      
      @scala.inline
      def setIns(value: js.Array[String]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsVarargs(value: String*): Self = StObject.set(x, "ins", js.Array(value :_*))
      
      @scala.inline
      def setKbd(value: js.Array[String]): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKbdVarargs(value: String*): Self = StObject.set(x, "kbd", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value :_*))
      
      @scala.inline
      def setLegend(value: js.Array[String]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendVarargs(value: String*): Self = StObject.set(x, "legend", js.Array(value :_*))
      
      @scala.inline
      def setLi(value: js.Array[String]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiVarargs(value: String*): Self = StObject.set(x, "li", js.Array(value :_*))
      
      @scala.inline
      def setLink(value: js.Array[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkVarargs(value: String*): Self = StObject.set(x, "link", js.Array(value :_*))
      
      @scala.inline
      def setMain(value: js.Array[String]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainVarargs(value: String*): Self = StObject.set(x, "main", js.Array(value :_*))
      
      @scala.inline
      def setMap(value: js.Array[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapVarargs(value: String*): Self = StObject.set(x, "map", js.Array(value :_*))
      
      @scala.inline
      def setMark(value: js.Array[String]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkVarargs(value: String*): Self = StObject.set(x, "mark", js.Array(value :_*))
      
      @scala.inline
      def setMarquee(value: js.Array[String]): Self = StObject.set(x, "marquee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarqueeVarargs(value: String*): Self = StObject.set(x, "marquee", js.Array(value :_*))
      
      @scala.inline
      def setMenu(value: js.Array[String]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuVarargs(value: String*): Self = StObject.set(x, "menu", js.Array(value :_*))
      
      @scala.inline
      def setMeta(value: js.Array[String]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaVarargs(value: String*): Self = StObject.set(x, "meta", js.Array(value :_*))
      
      @scala.inline
      def setMeter(value: js.Array[String]): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeterVarargs(value: String*): Self = StObject.set(x, "meter", js.Array(value :_*))
      
      @scala.inline
      def setNav(value: js.Array[String]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavVarargs(value: String*): Self = StObject.set(x, "nav", js.Array(value :_*))
      
      @scala.inline
      def setNoscript(value: js.Array[String]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoscriptVarargs(value: String*): Self = StObject.set(x, "noscript", js.Array(value :_*))
      
      @scala.inline
      def setObject(value: js.Array[String]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectVarargs(value: String*): Self = StObject.set(x, "object", js.Array(value :_*))
      
      @scala.inline
      def setOl(value: js.Array[String]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOlVarargs(value: String*): Self = StObject.set(x, "ol", js.Array(value :_*))
      
      @scala.inline
      def setOptgroup(value: js.Array[String]): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptgroupVarargs(value: String*): Self = StObject.set(x, "optgroup", js.Array(value :_*))
      
      @scala.inline
      def setOption(value: js.Array[String]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionVarargs(value: String*): Self = StObject.set(x, "option", js.Array(value :_*))
      
      @scala.inline
      def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value :_*))
      
      @scala.inline
      def setP(value: js.Array[String]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPVarargs(value: String*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      @scala.inline
      def setParam(value: js.Array[String]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamVarargs(value: String*): Self = StObject.set(x, "param", js.Array(value :_*))
      
      @scala.inline
      def setPicture(value: js.Array[String]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureVarargs(value: String*): Self = StObject.set(x, "picture", js.Array(value :_*))
      
      @scala.inline
      def setPre(value: js.Array[String]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreVarargs(value: String*): Self = StObject.set(x, "pre", js.Array(value :_*))
      
      @scala.inline
      def setProgress(value: js.Array[String]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressVarargs(value: String*): Self = StObject.set(x, "progress", js.Array(value :_*))
      
      @scala.inline
      def setQ(value: js.Array[String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQVarargs(value: String*): Self = StObject.set(x, "q", js.Array(value :_*))
      
      @scala.inline
      def setRp(value: js.Array[String]): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpVarargs(value: String*): Self = StObject.set(x, "rp", js.Array(value :_*))
      
      @scala.inline
      def setRt(value: js.Array[String]): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtVarargs(value: String*): Self = StObject.set(x, "rt", js.Array(value :_*))
      
      @scala.inline
      def setRuby(value: js.Array[String]): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRubyVarargs(value: String*): Self = StObject.set(x, "ruby", js.Array(value :_*))
      
      @scala.inline
      def setS(value: js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
      
      @scala.inline
      def setSamp(value: js.Array[String]): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampVarargs(value: String*): Self = StObject.set(x, "samp", js.Array(value :_*))
      
      @scala.inline
      def setScript(value: js.Array[String]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptVarargs(value: String*): Self = StObject.set(x, "script", js.Array(value :_*))
      
      @scala.inline
      def setSection(value: js.Array[String]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionVarargs(value: String*): Self = StObject.set(x, "section", js.Array(value :_*))
      
      @scala.inline
      def setSelect(value: js.Array[String]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectVarargs(value: String*): Self = StObject.set(x, "select", js.Array(value :_*))
      
      @scala.inline
      def setSlot(value: js.Array[String]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotVarargs(value: String*): Self = StObject.set(x, "slot", js.Array(value :_*))
      
      @scala.inline
      def setSmall(value: js.Array[String]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallVarargs(value: String*): Self = StObject.set(x, "small", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      @scala.inline
      def setSpan(value: js.Array[String]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanVarargs(value: String*): Self = StObject.set(x, "span", js.Array(value :_*))
      
      @scala.inline
      def setStrong(value: js.Array[String]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongVarargs(value: String*): Self = StObject.set(x, "strong", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setSub(value: js.Array[String]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubVarargs(value: String*): Self = StObject.set(x, "sub", js.Array(value :_*))
      
      @scala.inline
      def setSummary(value: js.Array[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryVarargs(value: String*): Self = StObject.set(x, "summary", js.Array(value :_*))
      
      @scala.inline
      def setSup(value: js.Array[String]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupVarargs(value: String*): Self = StObject.set(x, "sup", js.Array(value :_*))
      
      @scala.inline
      def setTable(value: js.Array[String]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableVarargs(value: String*): Self = StObject.set(x, "table", js.Array(value :_*))
      
      @scala.inline
      def setTbody(value: js.Array[String]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTbodyVarargs(value: String*): Self = StObject.set(x, "tbody", js.Array(value :_*))
      
      @scala.inline
      def setTd(value: js.Array[String]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTdVarargs(value: String*): Self = StObject.set(x, "td", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: js.Array[String]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateVarargs(value: String*): Self = StObject.set(x, "template", js.Array(value :_*))
      
      @scala.inline
      def setTextarea(value: js.Array[String]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextareaVarargs(value: String*): Self = StObject.set(x, "textarea", js.Array(value :_*))
      
      @scala.inline
      def setTfoot(value: js.Array[String]): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTfootVarargs(value: String*): Self = StObject.set(x, "tfoot", js.Array(value :_*))
      
      @scala.inline
      def setTh(value: js.Array[String]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThVarargs(value: String*): Self = StObject.set(x, "th", js.Array(value :_*))
      
      @scala.inline
      def setThead(value: js.Array[String]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheadVarargs(value: String*): Self = StObject.set(x, "thead", js.Array(value :_*))
      
      @scala.inline
      def setTime(value: js.Array[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeVarargs(value: String*): Self = StObject.set(x, "time", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: js.Array[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
      
      @scala.inline
      def setTr(value: js.Array[String]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrVarargs(value: String*): Self = StObject.set(x, "tr", js.Array(value :_*))
      
      @scala.inline
      def setTrack(value: js.Array[String]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackVarargs(value: String*): Self = StObject.set(x, "track", js.Array(value :_*))
      
      @scala.inline
      def setU(value: js.Array[String]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUVarargs(value: String*): Self = StObject.set(x, "u", js.Array(value :_*))
      
      @scala.inline
      def setUl(value: js.Array[String]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUlVarargs(value: String*): Self = StObject.set(x, "ul", js.Array(value :_*))
      
      @scala.inline
      def setVar(value: js.Array[String]): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarVarargs(value: String*): Self = StObject.set(x, "var", js.Array(value :_*))
      
      @scala.inline
      def setVideo(value: js.Array[String]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoVarargs(value: String*): Self = StObject.set(x, "video", js.Array(value :_*))
      
      @scala.inline
      def setWbr(value: js.Array[String]): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWbrVarargs(value: String*): Self = StObject.set(x, "wbr", js.Array(value :_*))
    }
  }
}
