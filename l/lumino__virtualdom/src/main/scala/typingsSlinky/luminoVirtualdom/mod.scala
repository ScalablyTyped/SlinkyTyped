package typingsSlinky.luminoVirtualdom

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.Text
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.luminoVirtualdom.anon.Attrs
import typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.element
import typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.text
import typingsSlinky.luminoVirtualdom.mod.VirtualElement.IRenderer
import typingsSlinky.std.MediaStreamErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object VirtualDOM {
    
    @JSImport("@lumino/virtualdom", "VirtualDOM.realize")
    @js.native
    def realize(node: VirtualElement): HTMLElement = js.native
    /**
      * Create a real DOM element from a virtual element node.
      *
      * @param node - The virtual element node to realize.
      *
      * @returns A new DOM element for the given virtual element node.
      *
      * #### Notes
      * This creates a brand new *real* DOM element with a structure which
      * matches the given virtual DOM node.
      *
      * If virtual diffing is desired, use the `render` function instead.
      */
    @JSImport("@lumino/virtualdom", "VirtualDOM.realize")
    @js.native
    def realize(node: VirtualText): Text = js.native
    
    @JSImport("@lumino/virtualdom", "VirtualDOM.render")
    @js.native
    def render(content: js.Array[VirtualNode], host: HTMLElement): Unit = js.native
    @JSImport("@lumino/virtualdom", "VirtualDOM.render")
    @js.native
    def render(content: Null, host: HTMLElement): Unit = js.native
    /**
      * Render virtual DOM content into a host element.
      *
      * @param content - The virtual DOM content to render.
      *
      * @param host - The host element for the rendered content.
      *
      * #### Notes
      * This renders the delta from the previous rendering. It assumes that
      * the content of the host element is not manipulated by external code.
      *
      * Providing `null` content will clear the rendering.
      *
      * Externally modifying the provided content or the host element will
      * result in undefined rendering behavior.
      */
    @JSImport("@lumino/virtualdom", "VirtualDOM.render")
    @js.native
    def render(content: VirtualNode, host: HTMLElement): Unit = js.native
  }
  
  @JSImport("@lumino/virtualdom", "VirtualElement")
  @js.native
  class VirtualElement protected () extends VirtualNode {
    /**
      * Construct a new virtual element node.
      *
      * @param tag - The element tag name.
      *
      * @param attrs - The element attributes.
      *
      * @param children - The element children.
      *
      * @param renderer - An optional custom renderer for the element.
      */
    def this(tag: String, attrs: ElementAttrs, children: js.Array[VirtualNode]) = this()
    def this(tag: String, attrs: ElementAttrs, children: js.Array[VirtualNode], renderer: IRenderer) = this()
    
    /**
      * The attributes for the element.
      */
    val attrs: ElementAttrs = js.native
    
    /**
      * The children for the element.
      */
    val children: js.Array[VirtualNode] = js.native
    
    /**
      * An optional custom renderer for the element's children. If set, on render
      * this element's DOM node and it's attrs will be created/updated as normal.
      * At that point the DOM node is handed off to the renderer.
      */
    val renderer: js.UndefOr[IRenderer] = js.native
    
    /**
      * The tag name for the element.
      */
    val tag: String = js.native
    
    /**
      * The type of the node.
      *
      * This value can be used as a type guard for discriminating the
      * `VirtualNode` union type.
      */
    val `type`: element = js.native
  }
  object VirtualElement {
    
    /**
      * A type describing a custom element renderer
      */
    @js.native
    trait IRenderer extends StObject {
      
      /**
        * Customize how a DOM node is rendered. If .renderer is set on a given
        * instance of VirtualElement, this function will be called every time
        * that VirtualElement is rendered.
        *
        * @param host - The actual DOM node created for a VirtualElement during
        * rendering.
        *
        * On render, host is created and its attrs are set/updated via
        * the standard routines in updateContent. host is then handed off to this
        * function.
        *
        * The render function is free to modify host. The only restriction is
        * is that render should not modify any attributes set by external
        * routines (ie updateContent), as this may cause thrashing when the
        * virtual element is next rendered.
        *
        * @param options - Will be populated with the .attrs and .children fields
        * set on the VirtualElement being rendered.
        */
      def render(host: HTMLElement): Unit = js.native
      def render(host: HTMLElement, options: Attrs): Unit = js.native
      
      /**
        * Optional cleanup function for custom renderers. If the .renderer field
        * of a VirtualELement is set, and if .renderer.unrender is defined, when
        * the element is changed or removed its corresponding DOM element will be
        * passed to this function immediately before it is removed from the DOM.
        *
        * unrender is not required for for simple renderers, such as those
        * implemented using `document.createElement()`. However, for certain
        * rendering techniques explicit cleanup is required in order to avoid
        * resource leaks.
        *
        * For example, if render calls `ReactDOM.render(..., host)`, then
        * there has to also be a corresponding implementation of unrender that
        * calls `ReactDOM.unmountComponentAtNode(host)` in order to prevent
        * a memory leak.
        *
        * @param host - the DOM element to be removed.
        *
        * @param options - Will be populated with the .attrs and .children fields
        * set on the VirtualElement being unrendered.
        */
      var unrender: js.UndefOr[js.Function2[/* host */ HTMLElement, /* options */ js.UndefOr[Attrs], Unit]] = js.native
    }
  }
  
  @JSImport("@lumino/virtualdom", "VirtualElementPass")
  @js.native
  class VirtualElementPass protected () extends VirtualElement {
    /**
      * DEPRECATED - use VirtualElement with a defined renderer param instead
      *
      * Construct a new virtual element pass thru node.
      *
      * @param tag - the tag of the parent element of this node. Once the parent
      * element is rendered, it will be passed as an argument to
      * renderer.render
      *
      * @param attrs - attributes that will assigned to the
      * parent element
      *
      * @param renderer - an object with render and unrender
      * functions, each of which should take a single argument of type
      * HTMLElement and return nothing. If null, the parent element
      * will be rendered barren without any children.
      */
    def this(tag: String, attrs: ElementAttrs) = this()
    def this(
      tag: String,
      attrs: ElementAttrs,
      renderer: typingsSlinky.luminoVirtualdom.mod.VirtualElementPass.IRenderer
    ) = this()
  }
  object VirtualElementPass {
    
    /**
      * DEPRECATED - use VirtualElement.IRenderer instead
      *
      * A type describing a custom element renderer
      */
    type IRenderer = typingsSlinky.luminoVirtualdom.mod.VirtualElement.IRenderer
  }
  
  @JSImport("@lumino/virtualdom", "VirtualText")
  @js.native
  class VirtualText protected () extends VirtualNode {
    /**
      * Construct a new virtual text node.
      *
      * @param content - The text content for the node.
      */
    def this(content: String) = this()
    
    /**
      * The text content for the node.
      */
    val content: String = js.native
    
    /**
      * The type of the node.
      *
      * This value can be used as a type guard for discriminating the
      * `VirtualNode` union type.
      */
    val `type`: text = js.native
  }
  
  object h {
    
    @JSImport("@lumino/virtualdom", "h")
    @js.native
    def apply(tag: String, attrs: ElementAttrs, children: Child*): VirtualElement = js.native
    @JSImport("@lumino/virtualdom", "h")
    @js.native
    def apply(tag: String, attrs: ElementAttrs, renderer: IRenderer, children: Child*): VirtualElement = js.native
    @JSImport("@lumino/virtualdom", "h")
    @js.native
    def apply(tag: String, children: Child*): VirtualElement = js.native
    @JSImport("@lumino/virtualdom", "h")
    @js.native
    def apply(tag: String, renderer: IRenderer, children: Child*): VirtualElement = js.native
    
    @JSImport("@lumino/virtualdom", "h.a")
    @js.native
    val a: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.abbr")
    @js.native
    val abbr: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.address")
    @js.native
    val address: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.area")
    @js.native
    val area: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.article")
    @js.native
    val article: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.aside")
    @js.native
    val aside: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.audio")
    @js.native
    val audio: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.b")
    @js.native
    val b: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.bdi")
    @js.native
    val bdi: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.bdo")
    @js.native
    val bdo: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.blockquote")
    @js.native
    val blockquote: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.br")
    @js.native
    val br: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.button")
    @js.native
    val button: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.canvas")
    @js.native
    val canvas: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.caption")
    @js.native
    val caption: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.cite")
    @js.native
    val cite: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.code")
    @js.native
    val code: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.col")
    @js.native
    val col: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.colgroup")
    @js.native
    val colgroup: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.data")
    @js.native
    val data: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.datalist")
    @js.native
    val datalist: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.dd")
    @js.native
    val dd: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.del")
    @js.native
    val del: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.dfn")
    @js.native
    val dfn: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.div")
    @js.native
    val div: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.dl")
    @js.native
    val dl: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.dt")
    @js.native
    val dt: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.em")
    @js.native
    val em: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.embed")
    @js.native
    val embed: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.fieldset")
    @js.native
    val fieldset: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.figcaption")
    @js.native
    val figcaption: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.figure")
    @js.native
    val figure: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.footer")
    @js.native
    val footer: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.form")
    @js.native
    val form: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h1")
    @js.native
    val h1: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h2")
    @js.native
    val h2: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h3")
    @js.native
    val h3: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h4")
    @js.native
    val h4: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h5")
    @js.native
    val h5: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h6")
    @js.native
    val h6: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.header")
    @js.native
    val header: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.hr")
    @js.native
    val hr: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.i")
    @js.native
    val i: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.iframe")
    @js.native
    val iframe: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.img")
    @js.native
    val img: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.input")
    @js.native
    val input: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.ins")
    @js.native
    val ins: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.kbd")
    @js.native
    val kbd: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.label")
    @js.native
    val label: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.legend")
    @js.native
    val legend: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.li")
    @js.native
    val li: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.main")
    @js.native
    val main: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.map")
    @js.native
    val map: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.mark")
    @js.native
    val mark: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.meter")
    @js.native
    val meter: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.nav")
    @js.native
    val nav: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.noscript")
    @js.native
    val noscript: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.ol")
    @js.native
    val ol: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.optgroup")
    @js.native
    val optgroup: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.option")
    @js.native
    val option: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.output")
    @js.native
    val output: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.p")
    @js.native
    val p: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.param")
    @js.native
    val param: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.pre")
    @js.native
    val pre: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.progress")
    @js.native
    val progress: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.q")
    @js.native
    val q: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.rp")
    @js.native
    val rp: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.rt")
    @js.native
    val rt: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.ruby")
    @js.native
    val ruby: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.s")
    @js.native
    val s: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.samp")
    @js.native
    val samp: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.section")
    @js.native
    val section: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.select")
    @js.native
    val select: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.small")
    @js.native
    val small: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.source")
    @js.native
    val source: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.span")
    @js.native
    val span: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.strong")
    @js.native
    val strong: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.sub")
    @js.native
    val sub: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.summary")
    @js.native
    val summary: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.sup")
    @js.native
    val sup: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.table")
    @js.native
    val table: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.tbody")
    @js.native
    val tbody: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.td")
    @js.native
    val td: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.textarea")
    @js.native
    val textarea: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.tfoot")
    @js.native
    val tfoot: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.th")
    @js.native
    val th: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.thead")
    @js.native
    val thead: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.time")
    @js.native
    val time: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.title")
    @js.native
    val title: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.tr")
    @js.native
    val tr: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.track")
    @js.native
    val track: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.u")
    @js.native
    val u: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.ul")
    @js.native
    val ul: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.video")
    @js.native
    val video: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.wbr")
    @js.native
    val wbr: IFactory = js.native
    
    /**
      * A type alias for the supported child argument types.
      */
    type Child = String | VirtualNode | Null | (js.Array[String | VirtualNode | Null])
    
    /**
      * A bound factory function for a specific `h()` tag.
      */
    @js.native
    trait IFactory extends StObject {
      
      def apply(attrs: ElementAttrs, children: Child*): VirtualElement = js.native
      def apply(attrs: ElementAttrs, renderer: IRenderer, children: Child*): VirtualElement = js.native
      def apply(children: Child*): VirtualElement = js.native
      def apply(renderer: IRenderer, children: Child*): VirtualElement = js.native
    }
    
    @JSImport("@lumino/virtualdom", "h.object")
    @js.native
    val `object`: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.var_")
    @js.native
    val `var`: IFactory = js.native
  }
  
  @JSImport("@lumino/virtualdom", "hpass")
  @js.native
  def hpass(tag: String): VirtualElementPass = js.native
  @JSImport("@lumino/virtualdom", "hpass")
  @js.native
  def hpass(tag: String, attrs: ElementAttrs): VirtualElementPass = js.native
  @JSImport("@lumino/virtualdom", "hpass")
  @js.native
  def hpass(
    tag: String,
    attrs: ElementAttrs,
    renderer: typingsSlinky.luminoVirtualdom.mod.VirtualElementPass.IRenderer
  ): VirtualElementPass = js.native
  @JSImport("@lumino/virtualdom", "hpass")
  @js.native
  def hpass(tag: String, renderer: typingsSlinky.luminoVirtualdom.mod.VirtualElementPass.IRenderer): VirtualElementPass = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignContent
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignItems
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignSelf
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignmentBaseline
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animation
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationDelay
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationDirection
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationDuration
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationFillMode
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationIterationCount
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationName
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationPlayState
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationTimingFunction
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backfaceVisibility
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.background
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundAttachment
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundClip
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundImage
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundOrigin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundPosition
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionX
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionY
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundRepeat
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundSize
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.baselineShift
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.border
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottom
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomLeftRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomRightRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderCollapse
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImage
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageOutset
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageRepeat
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageSlice
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageSource
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeft
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeftColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeftStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeftWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRight
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRightColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRightStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRightWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderSpacing
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTop
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopLeftRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopRightRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.bottom
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.boxShadow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.boxSizing
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.breakAfter
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.breakBefore
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.breakInside
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.captionSide
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clear
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clip
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clipPath
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clipRule
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.color
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.colorInterpolationFilters
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnCount
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnFill
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnGap
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRule
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRuleColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRuleStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRuleWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnSpan
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columns
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.content
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.counterIncrement
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.counterReset
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cssFloat
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cssText
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cursor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.direction
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.display
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dominantBaseline
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.emptyCells
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.enableBackground
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fill
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fillOpacity
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fillRule
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.filter
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flex
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexBasis
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexDirection
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexFlow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexGrow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexShrink
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexWrap
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.floodColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.floodOpacity
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.font
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontFamily
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontFeatureSettings
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontSize
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontSizeAdjust
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontStretch
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontVariant
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontWeight
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationHorizontal
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationVertical
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.height
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.imeMode
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.justifyContent
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.kerning
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.left
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.letterSpacing
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.lightingColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.lineHeight
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStyleImage
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStylePosition
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStyleType
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.margin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginBottom
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginLeft
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginRight
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginTop
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marker
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.markerEnd
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.markerMid
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.markerStart
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.mask
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.maxHeight
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.maxWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.minHeight
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.minWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomChaining
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimit
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMax
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnap
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapPoints
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapType
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZooming
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msFlowFrom
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msFlowInto
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msFontFeatureSettings
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumn
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnAlign
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnSpan
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumns
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRowAlign
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRowSpan
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRows
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHighContrastAdjust
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitChars
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitLines
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitZone
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphens
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msImeAlign
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msOverflowStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollChaining
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimit
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMax
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMax
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollRails
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsX
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsY
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapType
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapX
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapY
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollTranslation
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTextCombineHorizontal
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTextSizeAdjust
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTouchAction
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTouchSelect
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msUserSelect
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msWrapFlow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msWrapMargin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msWrapThrough
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.opacity
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.order
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.orphans
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outline
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outlineColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outlineStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outlineWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.overflow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.overflowX
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.overflowY
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.padding
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingBottom
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingLeft
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingRight
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingTop
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pageBreakAfter
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pageBreakBefore
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pageBreakInside
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.perspective
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.perspectiveOrigin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pointerEvents
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.position
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.quotes
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.resize
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.right
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rubyAlign
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rubyOverhang
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rubyPosition
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.stopColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.stopOpacity
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.stroke
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeDasharray
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeDashoffset
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeLinecap
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeLinejoin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeMiterlimit
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeOpacity
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.tableLayout
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textAlign
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textAlignLast
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textAnchor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textDecoration
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textIndent
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textJustify
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textKashida
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textKashidaSpace
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textOverflow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textShadow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textTransform
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textUnderlinePosition
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.top
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.touchAction
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transform
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transformOrigin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transformStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transition
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionDelay
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionDuration
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionProperty
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionTimingFunction
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.unicodeBidi
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.verticalAlign
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.visibility
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignContent
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignItems
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignSelf
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimation
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDelay
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDirection
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDuration
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationFillMode
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationIterationCount
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationName
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationPlayState
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationTimingFunction
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAppearance
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackfaceVisibility
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundClip
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundOrigin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundSize
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomLeftRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomRightRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderImage
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopLeftRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopRightRadius
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxAlign
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxDirection
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxFlex
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrdinalGroup
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrient
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxPack
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxSizing
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakAfter
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakBefore
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakInside
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnCount
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnGap
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRule
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnSpan
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnWidth
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumns
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFilter
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlex
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexBasis
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexDirection
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexFlow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexGrow
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexShrink
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexWrap
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitJustifyContent
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitOrder
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspective
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspectiveOrigin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTapHighlightColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTextFillColor
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTextSizeAdjust
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransform
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformOrigin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformStyle
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransition
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDelay
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDuration
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionProperty
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionTimingFunction
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitUserModify
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitUserSelect
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitWritingMode
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.whiteSpace
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.widows
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.width
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wordBreak
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wordSpacing
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wordWrap
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.writingMode
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.zIndex
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.zoom
  */
  trait CSSPropertyNames extends StObject
  object CSSPropertyNames {
    
    @scala.inline
    def alignContent: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignContent = "alignContent".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignContent]
    
    @scala.inline
    def alignItems: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignItems = "alignItems".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignItems]
    
    @scala.inline
    def alignSelf: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignSelf = "alignSelf".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignSelf]
    
    @scala.inline
    def alignmentBaseline: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignmentBaseline = "alignmentBaseline".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alignmentBaseline]
    
    @scala.inline
    def animation: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animation = "animation".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animation]
    
    @scala.inline
    def animationDelay: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationDelay = "animationDelay".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationDelay]
    
    @scala.inline
    def animationDirection: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationDirection = "animationDirection".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationDirection]
    
    @scala.inline
    def animationDuration: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationDuration = "animationDuration".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationDuration]
    
    @scala.inline
    def animationFillMode: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationFillMode = "animationFillMode".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationFillMode]
    
    @scala.inline
    def animationIterationCount: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationIterationCount = "animationIterationCount".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationIterationCount]
    
    @scala.inline
    def animationName: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationName = "animationName".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationName]
    
    @scala.inline
    def animationPlayState: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationPlayState = "animationPlayState".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationPlayState]
    
    @scala.inline
    def animationTimingFunction: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationTimingFunction = "animationTimingFunction".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.animationTimingFunction]
    
    @scala.inline
    def backfaceVisibility: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backfaceVisibility = "backfaceVisibility".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backfaceVisibility]
    
    @scala.inline
    def background: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.background = "background".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.background]
    
    @scala.inline
    def backgroundAttachment: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundAttachment = "backgroundAttachment".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundAttachment]
    
    @scala.inline
    def backgroundClip: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundClip = "backgroundClip".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundClip]
    
    @scala.inline
    def backgroundColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundColor = "backgroundColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundColor]
    
    @scala.inline
    def backgroundImage: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundImage = "backgroundImage".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundImage]
    
    @scala.inline
    def backgroundOrigin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundOrigin = "backgroundOrigin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundOrigin]
    
    @scala.inline
    def backgroundPosition: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundPosition = "backgroundPosition".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundPosition]
    
    @scala.inline
    def backgroundPositionX: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionX = "backgroundPositionX".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionX]
    
    @scala.inline
    def backgroundPositionY: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionY = "backgroundPositionY".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionY]
    
    @scala.inline
    def backgroundRepeat: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundRepeat = "backgroundRepeat".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundRepeat]
    
    @scala.inline
    def backgroundSize: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundSize = "backgroundSize".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.backgroundSize]
    
    @scala.inline
    def baselineShift: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.baselineShift = "baselineShift".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.baselineShift]
    
    @scala.inline
    def border: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.border = "border".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.border]
    
    @scala.inline
    def borderBottom: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottom = "borderBottom".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottom]
    
    @scala.inline
    def borderBottomColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomColor = "borderBottomColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomColor]
    
    @scala.inline
    def borderBottomLeftRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomLeftRadius = "borderBottomLeftRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomLeftRadius]
    
    @scala.inline
    def borderBottomRightRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomRightRadius = "borderBottomRightRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomRightRadius]
    
    @scala.inline
    def borderBottomStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomStyle = "borderBottomStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomStyle]
    
    @scala.inline
    def borderBottomWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomWidth = "borderBottomWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderBottomWidth]
    
    @scala.inline
    def borderCollapse: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderCollapse = "borderCollapse".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderCollapse]
    
    @scala.inline
    def borderColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderColor = "borderColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderColor]
    
    @scala.inline
    def borderImage: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImage = "borderImage".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImage]
    
    @scala.inline
    def borderImageOutset: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageOutset = "borderImageOutset".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageOutset]
    
    @scala.inline
    def borderImageRepeat: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageRepeat = "borderImageRepeat".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageRepeat]
    
    @scala.inline
    def borderImageSlice: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageSlice = "borderImageSlice".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageSlice]
    
    @scala.inline
    def borderImageSource: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageSource = "borderImageSource".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageSource]
    
    @scala.inline
    def borderImageWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageWidth = "borderImageWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderImageWidth]
    
    @scala.inline
    def borderLeft: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeft = "borderLeft".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeft]
    
    @scala.inline
    def borderLeftColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeftColor = "borderLeftColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeftColor]
    
    @scala.inline
    def borderLeftStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeftStyle = "borderLeftStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeftStyle]
    
    @scala.inline
    def borderLeftWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeftWidth = "borderLeftWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderLeftWidth]
    
    @scala.inline
    def borderRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRadius = "borderRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRadius]
    
    @scala.inline
    def borderRight: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRight = "borderRight".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRight]
    
    @scala.inline
    def borderRightColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRightColor = "borderRightColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRightColor]
    
    @scala.inline
    def borderRightStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRightStyle = "borderRightStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRightStyle]
    
    @scala.inline
    def borderRightWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRightWidth = "borderRightWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderRightWidth]
    
    @scala.inline
    def borderSpacing: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderSpacing = "borderSpacing".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderSpacing]
    
    @scala.inline
    def borderStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderStyle = "borderStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderStyle]
    
    @scala.inline
    def borderTop: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTop = "borderTop".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTop]
    
    @scala.inline
    def borderTopColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopColor = "borderTopColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopColor]
    
    @scala.inline
    def borderTopLeftRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopLeftRadius = "borderTopLeftRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopLeftRadius]
    
    @scala.inline
    def borderTopRightRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopRightRadius = "borderTopRightRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopRightRadius]
    
    @scala.inline
    def borderTopStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopStyle = "borderTopStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopStyle]
    
    @scala.inline
    def borderTopWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopWidth = "borderTopWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderTopWidth]
    
    @scala.inline
    def borderWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderWidth = "borderWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.borderWidth]
    
    @scala.inline
    def bottom: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.bottom = "bottom".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.bottom]
    
    @scala.inline
    def boxShadow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.boxShadow = "boxShadow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.boxShadow]
    
    @scala.inline
    def boxSizing: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.boxSizing = "boxSizing".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.boxSizing]
    
    @scala.inline
    def breakAfter: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.breakAfter = "breakAfter".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.breakAfter]
    
    @scala.inline
    def breakBefore: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.breakBefore = "breakBefore".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.breakBefore]
    
    @scala.inline
    def breakInside: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.breakInside = "breakInside".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.breakInside]
    
    @scala.inline
    def captionSide: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.captionSide = "captionSide".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.captionSide]
    
    @scala.inline
    def clear: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clear = "clear".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clear]
    
    @scala.inline
    def clip: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clip = "clip".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clip]
    
    @scala.inline
    def clipPath: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clipPath = "clipPath".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clipPath]
    
    @scala.inline
    def clipRule: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clipRule = "clipRule".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.clipRule]
    
    @scala.inline
    def color: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.color = "color".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.color]
    
    @scala.inline
    def colorInterpolationFilters: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.colorInterpolationFilters = "colorInterpolationFilters".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.colorInterpolationFilters]
    
    @scala.inline
    def columnCount: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnCount = "columnCount".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnCount]
    
    @scala.inline
    def columnFill: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnFill = "columnFill".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnFill]
    
    @scala.inline
    def columnGap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnGap = "columnGap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnGap]
    
    @scala.inline
    def columnRule: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRule = "columnRule".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRule]
    
    @scala.inline
    def columnRuleColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRuleColor = "columnRuleColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRuleColor]
    
    @scala.inline
    def columnRuleStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRuleStyle = "columnRuleStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRuleStyle]
    
    @scala.inline
    def columnRuleWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRuleWidth = "columnRuleWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnRuleWidth]
    
    @scala.inline
    def columnSpan: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnSpan = "columnSpan".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnSpan]
    
    @scala.inline
    def columnWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnWidth = "columnWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columnWidth]
    
    @scala.inline
    def columns: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columns = "columns".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.columns]
    
    @scala.inline
    def content: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.content = "content".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.content]
    
    @scala.inline
    def counterIncrement: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.counterIncrement = "counterIncrement".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.counterIncrement]
    
    @scala.inline
    def counterReset: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.counterReset = "counterReset".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.counterReset]
    
    @scala.inline
    def cssFloat: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cssFloat = "cssFloat".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cssFloat]
    
    @scala.inline
    def cssText: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cssText = "cssText".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cssText]
    
    @scala.inline
    def cursor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cursor = "cursor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cursor]
    
    @scala.inline
    def direction: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.direction = "direction".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.direction]
    
    @scala.inline
    def display: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.display = "display".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.display]
    
    @scala.inline
    def dominantBaseline: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dominantBaseline = "dominantBaseline".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dominantBaseline]
    
    @scala.inline
    def emptyCells: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.emptyCells = "emptyCells".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.emptyCells]
    
    @scala.inline
    def enableBackground: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.enableBackground = "enableBackground".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.enableBackground]
    
    @scala.inline
    def fill: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fill = "fill".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fill]
    
    @scala.inline
    def fillOpacity: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fillOpacity = "fillOpacity".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fillOpacity]
    
    @scala.inline
    def fillRule: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fillRule = "fillRule".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fillRule]
    
    @scala.inline
    def filter: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.filter = "filter".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.filter]
    
    @scala.inline
    def flex: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flex = "flex".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flex]
    
    @scala.inline
    def flexBasis: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexBasis = "flexBasis".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexBasis]
    
    @scala.inline
    def flexDirection: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexDirection = "flexDirection".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexDirection]
    
    @scala.inline
    def flexFlow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexFlow = "flexFlow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexFlow]
    
    @scala.inline
    def flexGrow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexGrow = "flexGrow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexGrow]
    
    @scala.inline
    def flexShrink: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexShrink = "flexShrink".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexShrink]
    
    @scala.inline
    def flexWrap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexWrap = "flexWrap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.flexWrap]
    
    @scala.inline
    def floodColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.floodColor = "floodColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.floodColor]
    
    @scala.inline
    def floodOpacity: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.floodOpacity = "floodOpacity".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.floodOpacity]
    
    @scala.inline
    def font: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.font = "font".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.font]
    
    @scala.inline
    def fontFamily: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontFamily = "fontFamily".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontFamily]
    
    @scala.inline
    def fontFeatureSettings: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontFeatureSettings = "fontFeatureSettings".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontFeatureSettings]
    
    @scala.inline
    def fontSize: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontSize = "fontSize".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontSize]
    
    @scala.inline
    def fontSizeAdjust: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontSizeAdjust = "fontSizeAdjust".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontSizeAdjust]
    
    @scala.inline
    def fontStretch: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontStretch = "fontStretch".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontStretch]
    
    @scala.inline
    def fontStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontStyle = "fontStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontStyle]
    
    @scala.inline
    def fontVariant: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontVariant = "fontVariant".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontVariant]
    
    @scala.inline
    def fontWeight: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontWeight = "fontWeight".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.fontWeight]
    
    @scala.inline
    def glyphOrientationHorizontal: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationHorizontal = "glyphOrientationHorizontal".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationHorizontal]
    
    @scala.inline
    def glyphOrientationVertical: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationVertical = "glyphOrientationVertical".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationVertical]
    
    @scala.inline
    def height: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.height = "height".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.height]
    
    @scala.inline
    def imeMode: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.imeMode = "imeMode".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.imeMode]
    
    @scala.inline
    def justifyContent: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.justifyContent = "justifyContent".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.justifyContent]
    
    @scala.inline
    def kerning: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.kerning = "kerning".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.kerning]
    
    @scala.inline
    def left: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.left = "left".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.left]
    
    @scala.inline
    def letterSpacing: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.letterSpacing = "letterSpacing".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.letterSpacing]
    
    @scala.inline
    def lightingColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.lightingColor = "lightingColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.lightingColor]
    
    @scala.inline
    def lineHeight: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.lineHeight = "lineHeight".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.lineHeight]
    
    @scala.inline
    def listStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStyle = "listStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStyle]
    
    @scala.inline
    def listStyleImage: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStyleImage = "listStyleImage".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStyleImage]
    
    @scala.inline
    def listStylePosition: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStylePosition = "listStylePosition".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStylePosition]
    
    @scala.inline
    def listStyleType: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStyleType = "listStyleType".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.listStyleType]
    
    @scala.inline
    def margin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.margin = "margin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.margin]
    
    @scala.inline
    def marginBottom: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginBottom = "marginBottom".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginBottom]
    
    @scala.inline
    def marginLeft: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginLeft = "marginLeft".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginLeft]
    
    @scala.inline
    def marginRight: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginRight = "marginRight".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginRight]
    
    @scala.inline
    def marginTop: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginTop = "marginTop".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marginTop]
    
    @scala.inline
    def marker: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marker = "marker".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.marker]
    
    @scala.inline
    def markerEnd: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.markerEnd = "markerEnd".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.markerEnd]
    
    @scala.inline
    def markerMid: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.markerMid = "markerMid".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.markerMid]
    
    @scala.inline
    def markerStart: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.markerStart = "markerStart".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.markerStart]
    
    @scala.inline
    def mask: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.mask = "mask".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.mask]
    
    @scala.inline
    def maxHeight: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.maxHeight = "maxHeight".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.maxHeight]
    
    @scala.inline
    def maxWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.maxWidth = "maxWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.maxWidth]
    
    @scala.inline
    def minHeight: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.minHeight = "minHeight".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.minHeight]
    
    @scala.inline
    def minWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.minWidth = "minWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.minWidth]
    
    @scala.inline
    def msContentZoomChaining: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomChaining = "msContentZoomChaining".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomChaining]
    
    @scala.inline
    def msContentZoomLimit: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimit = "msContentZoomLimit".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimit]
    
    @scala.inline
    def msContentZoomLimitMax: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMax = "msContentZoomLimitMax".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMax]
    
    @scala.inline
    def msContentZoomLimitMin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMin = "msContentZoomLimitMin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMin]
    
    @scala.inline
    def msContentZoomSnap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnap = "msContentZoomSnap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnap]
    
    @scala.inline
    def msContentZoomSnapPoints: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapPoints = "msContentZoomSnapPoints".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapPoints]
    
    @scala.inline
    def msContentZoomSnapType: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapType = "msContentZoomSnapType".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapType]
    
    @scala.inline
    def msContentZooming: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZooming = "msContentZooming".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msContentZooming]
    
    @scala.inline
    def msFlowFrom: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msFlowFrom = "msFlowFrom".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msFlowFrom]
    
    @scala.inline
    def msFlowInto: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msFlowInto = "msFlowInto".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msFlowInto]
    
    @scala.inline
    def msFontFeatureSettings: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msFontFeatureSettings = "msFontFeatureSettings".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msFontFeatureSettings]
    
    @scala.inline
    def msGridColumn: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumn = "msGridColumn".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumn]
    
    @scala.inline
    def msGridColumnAlign: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnAlign = "msGridColumnAlign".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnAlign]
    
    @scala.inline
    def msGridColumnSpan: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnSpan = "msGridColumnSpan".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnSpan]
    
    @scala.inline
    def msGridColumns: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumns = "msGridColumns".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridColumns]
    
    @scala.inline
    def msGridRow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRow = "msGridRow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRow]
    
    @scala.inline
    def msGridRowAlign: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRowAlign = "msGridRowAlign".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRowAlign]
    
    @scala.inline
    def msGridRowSpan: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRowSpan = "msGridRowSpan".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRowSpan]
    
    @scala.inline
    def msGridRows: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRows = "msGridRows".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msGridRows]
    
    @scala.inline
    def msHighContrastAdjust: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHighContrastAdjust = "msHighContrastAdjust".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHighContrastAdjust]
    
    @scala.inline
    def msHyphenateLimitChars: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitChars = "msHyphenateLimitChars".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitChars]
    
    @scala.inline
    def msHyphenateLimitLines: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitLines = "msHyphenateLimitLines".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitLines]
    
    @scala.inline
    def msHyphenateLimitZone: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitZone = "msHyphenateLimitZone".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitZone]
    
    @scala.inline
    def msHyphens: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphens = "msHyphens".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msHyphens]
    
    @scala.inline
    def msImeAlign: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msImeAlign = "msImeAlign".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msImeAlign]
    
    @scala.inline
    def msOverflowStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msOverflowStyle = "msOverflowStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msOverflowStyle]
    
    @scala.inline
    def msScrollChaining: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollChaining = "msScrollChaining".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollChaining]
    
    @scala.inline
    def msScrollLimit: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimit = "msScrollLimit".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimit]
    
    @scala.inline
    def msScrollLimitXMax: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMax = "msScrollLimitXMax".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMax]
    
    @scala.inline
    def msScrollLimitXMin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMin = "msScrollLimitXMin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMin]
    
    @scala.inline
    def msScrollLimitYMax: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMax = "msScrollLimitYMax".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMax]
    
    @scala.inline
    def msScrollLimitYMin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMin = "msScrollLimitYMin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMin]
    
    @scala.inline
    def msScrollRails: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollRails = "msScrollRails".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollRails]
    
    @scala.inline
    def msScrollSnapPointsX: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsX = "msScrollSnapPointsX".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsX]
    
    @scala.inline
    def msScrollSnapPointsY: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsY = "msScrollSnapPointsY".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsY]
    
    @scala.inline
    def msScrollSnapType: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapType = "msScrollSnapType".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapType]
    
    @scala.inline
    def msScrollSnapX: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapX = "msScrollSnapX".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapX]
    
    @scala.inline
    def msScrollSnapY: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapY = "msScrollSnapY".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapY]
    
    @scala.inline
    def msScrollTranslation: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollTranslation = "msScrollTranslation".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msScrollTranslation]
    
    @scala.inline
    def msTextCombineHorizontal: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTextCombineHorizontal = "msTextCombineHorizontal".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTextCombineHorizontal]
    
    @scala.inline
    def msTextSizeAdjust: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTextSizeAdjust = "msTextSizeAdjust".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTextSizeAdjust]
    
    @scala.inline
    def msTouchAction: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTouchAction = "msTouchAction".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTouchAction]
    
    @scala.inline
    def msTouchSelect: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTouchSelect = "msTouchSelect".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msTouchSelect]
    
    @scala.inline
    def msUserSelect: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msUserSelect = "msUserSelect".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msUserSelect]
    
    @scala.inline
    def msWrapFlow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msWrapFlow = "msWrapFlow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msWrapFlow]
    
    @scala.inline
    def msWrapMargin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msWrapMargin = "msWrapMargin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msWrapMargin]
    
    @scala.inline
    def msWrapThrough: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msWrapThrough = "msWrapThrough".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.msWrapThrough]
    
    @scala.inline
    def opacity: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.opacity = "opacity".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.opacity]
    
    @scala.inline
    def order: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.order = "order".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.order]
    
    @scala.inline
    def orphans: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.orphans = "orphans".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.orphans]
    
    @scala.inline
    def outline: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outline = "outline".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outline]
    
    @scala.inline
    def outlineColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outlineColor = "outlineColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outlineColor]
    
    @scala.inline
    def outlineStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outlineStyle = "outlineStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outlineStyle]
    
    @scala.inline
    def outlineWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outlineWidth = "outlineWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.outlineWidth]
    
    @scala.inline
    def overflow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.overflow = "overflow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.overflow]
    
    @scala.inline
    def overflowX: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.overflowX = "overflowX".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.overflowX]
    
    @scala.inline
    def overflowY: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.overflowY = "overflowY".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.overflowY]
    
    @scala.inline
    def padding: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.padding = "padding".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.padding]
    
    @scala.inline
    def paddingBottom: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingBottom = "paddingBottom".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingBottom]
    
    @scala.inline
    def paddingLeft: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingLeft = "paddingLeft".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingLeft]
    
    @scala.inline
    def paddingRight: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingRight = "paddingRight".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingRight]
    
    @scala.inline
    def paddingTop: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingTop = "paddingTop".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.paddingTop]
    
    @scala.inline
    def pageBreakAfter: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pageBreakAfter = "pageBreakAfter".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pageBreakAfter]
    
    @scala.inline
    def pageBreakBefore: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pageBreakBefore = "pageBreakBefore".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pageBreakBefore]
    
    @scala.inline
    def pageBreakInside: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pageBreakInside = "pageBreakInside".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pageBreakInside]
    
    @scala.inline
    def perspective: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.perspective = "perspective".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.perspective]
    
    @scala.inline
    def perspectiveOrigin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.perspectiveOrigin = "perspectiveOrigin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.perspectiveOrigin]
    
    @scala.inline
    def pointerEvents: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pointerEvents = "pointerEvents".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pointerEvents]
    
    @scala.inline
    def position: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.position = "position".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.position]
    
    @scala.inline
    def quotes: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.quotes = "quotes".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.quotes]
    
    @scala.inline
    def resize: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.resize = "resize".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.resize]
    
    @scala.inline
    def right: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.right = "right".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.right]
    
    @scala.inline
    def rubyAlign: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rubyAlign = "rubyAlign".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rubyAlign]
    
    @scala.inline
    def rubyOverhang: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rubyOverhang = "rubyOverhang".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rubyOverhang]
    
    @scala.inline
    def rubyPosition: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rubyPosition = "rubyPosition".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rubyPosition]
    
    @scala.inline
    def stopColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.stopColor = "stopColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.stopColor]
    
    @scala.inline
    def stopOpacity: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.stopOpacity = "stopOpacity".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.stopOpacity]
    
    @scala.inline
    def stroke: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.stroke = "stroke".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.stroke]
    
    @scala.inline
    def strokeDasharray: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeDasharray = "strokeDasharray".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeDasharray]
    
    @scala.inline
    def strokeDashoffset: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeDashoffset = "strokeDashoffset".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeDashoffset]
    
    @scala.inline
    def strokeLinecap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeLinecap = "strokeLinecap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeLinecap]
    
    @scala.inline
    def strokeLinejoin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeLinejoin = "strokeLinejoin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeLinejoin]
    
    @scala.inline
    def strokeMiterlimit: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeMiterlimit = "strokeMiterlimit".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeMiterlimit]
    
    @scala.inline
    def strokeOpacity: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeOpacity = "strokeOpacity".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeOpacity]
    
    @scala.inline
    def strokeWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeWidth = "strokeWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.strokeWidth]
    
    @scala.inline
    def tableLayout: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.tableLayout = "tableLayout".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.tableLayout]
    
    @scala.inline
    def textAlign: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textAlign = "textAlign".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textAlign]
    
    @scala.inline
    def textAlignLast: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textAlignLast = "textAlignLast".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textAlignLast]
    
    @scala.inline
    def textAnchor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textAnchor = "textAnchor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textAnchor]
    
    @scala.inline
    def textDecoration: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textDecoration = "textDecoration".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textDecoration]
    
    @scala.inline
    def textIndent: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textIndent = "textIndent".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textIndent]
    
    @scala.inline
    def textJustify: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textJustify = "textJustify".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textJustify]
    
    @scala.inline
    def textKashida: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textKashida = "textKashida".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textKashida]
    
    @scala.inline
    def textKashidaSpace: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textKashidaSpace = "textKashidaSpace".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textKashidaSpace]
    
    @scala.inline
    def textOverflow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textOverflow = "textOverflow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textOverflow]
    
    @scala.inline
    def textShadow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textShadow = "textShadow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textShadow]
    
    @scala.inline
    def textTransform: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textTransform = "textTransform".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textTransform]
    
    @scala.inline
    def textUnderlinePosition: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textUnderlinePosition = "textUnderlinePosition".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.textUnderlinePosition]
    
    @scala.inline
    def top: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.top = "top".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.top]
    
    @scala.inline
    def touchAction: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.touchAction = "touchAction".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.touchAction]
    
    @scala.inline
    def transform: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transform = "transform".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transform]
    
    @scala.inline
    def transformOrigin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transformOrigin = "transformOrigin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transformOrigin]
    
    @scala.inline
    def transformStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transformStyle = "transformStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transformStyle]
    
    @scala.inline
    def transition: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transition = "transition".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transition]
    
    @scala.inline
    def transitionDelay: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionDelay = "transitionDelay".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionDelay]
    
    @scala.inline
    def transitionDuration: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionDuration = "transitionDuration".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionDuration]
    
    @scala.inline
    def transitionProperty: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionProperty = "transitionProperty".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionProperty]
    
    @scala.inline
    def transitionTimingFunction: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionTimingFunction = "transitionTimingFunction".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.transitionTimingFunction]
    
    @scala.inline
    def unicodeBidi: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.unicodeBidi = "unicodeBidi".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.unicodeBidi]
    
    @scala.inline
    def verticalAlign: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.verticalAlign = "verticalAlign".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.verticalAlign]
    
    @scala.inline
    def visibility: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.visibility = "visibility".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.visibility]
    
    @scala.inline
    def webkitAlignContent: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignContent = "webkitAlignContent".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignContent]
    
    @scala.inline
    def webkitAlignItems: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignItems = "webkitAlignItems".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignItems]
    
    @scala.inline
    def webkitAlignSelf: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignSelf = "webkitAlignSelf".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignSelf]
    
    @scala.inline
    def webkitAnimation: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimation = "webkitAnimation".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimation]
    
    @scala.inline
    def webkitAnimationDelay: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDelay = "webkitAnimationDelay".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDelay]
    
    @scala.inline
    def webkitAnimationDirection: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDirection = "webkitAnimationDirection".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDirection]
    
    @scala.inline
    def webkitAnimationDuration: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDuration = "webkitAnimationDuration".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDuration]
    
    @scala.inline
    def webkitAnimationFillMode: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationFillMode = "webkitAnimationFillMode".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationFillMode]
    
    @scala.inline
    def webkitAnimationIterationCount: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationIterationCount = "webkitAnimationIterationCount".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationIterationCount]
    
    @scala.inline
    def webkitAnimationName: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationName = "webkitAnimationName".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationName]
    
    @scala.inline
    def webkitAnimationPlayState: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationPlayState = "webkitAnimationPlayState".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationPlayState]
    
    @scala.inline
    def webkitAnimationTimingFunction: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationTimingFunction = "webkitAnimationTimingFunction".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationTimingFunction]
    
    @scala.inline
    def webkitAppearance: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAppearance = "webkitAppearance".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitAppearance]
    
    @scala.inline
    def webkitBackfaceVisibility: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackfaceVisibility = "webkitBackfaceVisibility".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackfaceVisibility]
    
    @scala.inline
    def webkitBackgroundClip: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundClip = "webkitBackgroundClip".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundClip]
    
    @scala.inline
    def webkitBackgroundOrigin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundOrigin = "webkitBackgroundOrigin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundOrigin]
    
    @scala.inline
    def webkitBackgroundSize: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundSize = "webkitBackgroundSize".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundSize]
    
    @scala.inline
    def webkitBorderBottomLeftRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomLeftRadius = "webkitBorderBottomLeftRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomLeftRadius]
    
    @scala.inline
    def webkitBorderBottomRightRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomRightRadius = "webkitBorderBottomRightRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomRightRadius]
    
    @scala.inline
    def webkitBorderImage: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderImage = "webkitBorderImage".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderImage]
    
    @scala.inline
    def webkitBorderRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderRadius = "webkitBorderRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderRadius]
    
    @scala.inline
    def webkitBorderTopLeftRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopLeftRadius = "webkitBorderTopLeftRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopLeftRadius]
    
    @scala.inline
    def webkitBorderTopRightRadius: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopRightRadius = "webkitBorderTopRightRadius".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopRightRadius]
    
    @scala.inline
    def webkitBoxAlign: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxAlign = "webkitBoxAlign".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxAlign]
    
    @scala.inline
    def webkitBoxDirection: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxDirection = "webkitBoxDirection".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxDirection]
    
    @scala.inline
    def webkitBoxFlex: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxFlex = "webkitBoxFlex".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxFlex]
    
    @scala.inline
    def webkitBoxOrdinalGroup: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrdinalGroup = "webkitBoxOrdinalGroup".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrdinalGroup]
    
    @scala.inline
    def webkitBoxOrient: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrient = "webkitBoxOrient".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrient]
    
    @scala.inline
    def webkitBoxPack: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxPack = "webkitBoxPack".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxPack]
    
    @scala.inline
    def webkitBoxSizing: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxSizing = "webkitBoxSizing".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxSizing]
    
    @scala.inline
    def webkitColumnBreakAfter: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakAfter = "webkitColumnBreakAfter".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakAfter]
    
    @scala.inline
    def webkitColumnBreakBefore: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakBefore = "webkitColumnBreakBefore".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakBefore]
    
    @scala.inline
    def webkitColumnBreakInside: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakInside = "webkitColumnBreakInside".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakInside]
    
    @scala.inline
    def webkitColumnCount: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnCount = "webkitColumnCount".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnCount]
    
    @scala.inline
    def webkitColumnGap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnGap = "webkitColumnGap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnGap]
    
    @scala.inline
    def webkitColumnRule: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRule = "webkitColumnRule".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRule]
    
    @scala.inline
    def webkitColumnRuleColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleColor = "webkitColumnRuleColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleColor]
    
    @scala.inline
    def webkitColumnRuleStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleStyle = "webkitColumnRuleStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleStyle]
    
    @scala.inline
    def webkitColumnRuleWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleWidth = "webkitColumnRuleWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleWidth]
    
    @scala.inline
    def webkitColumnSpan: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnSpan = "webkitColumnSpan".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnSpan]
    
    @scala.inline
    def webkitColumnWidth: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnWidth = "webkitColumnWidth".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnWidth]
    
    @scala.inline
    def webkitColumns: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumns = "webkitColumns".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitColumns]
    
    @scala.inline
    def webkitFilter: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFilter = "webkitFilter".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFilter]
    
    @scala.inline
    def webkitFlex: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlex = "webkitFlex".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlex]
    
    @scala.inline
    def webkitFlexBasis: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexBasis = "webkitFlexBasis".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexBasis]
    
    @scala.inline
    def webkitFlexDirection: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexDirection = "webkitFlexDirection".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexDirection]
    
    @scala.inline
    def webkitFlexFlow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexFlow = "webkitFlexFlow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexFlow]
    
    @scala.inline
    def webkitFlexGrow: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexGrow = "webkitFlexGrow".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexGrow]
    
    @scala.inline
    def webkitFlexShrink: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexShrink = "webkitFlexShrink".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexShrink]
    
    @scala.inline
    def webkitFlexWrap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexWrap = "webkitFlexWrap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexWrap]
    
    @scala.inline
    def webkitJustifyContent: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitJustifyContent = "webkitJustifyContent".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitJustifyContent]
    
    @scala.inline
    def webkitOrder: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitOrder = "webkitOrder".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitOrder]
    
    @scala.inline
    def webkitPerspective: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspective = "webkitPerspective".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspective]
    
    @scala.inline
    def webkitPerspectiveOrigin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspectiveOrigin = "webkitPerspectiveOrigin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspectiveOrigin]
    
    @scala.inline
    def webkitTapHighlightColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTapHighlightColor = "webkitTapHighlightColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTapHighlightColor]
    
    @scala.inline
    def webkitTextFillColor: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTextFillColor = "webkitTextFillColor".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTextFillColor]
    
    @scala.inline
    def webkitTextSizeAdjust: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTextSizeAdjust = "webkitTextSizeAdjust".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTextSizeAdjust]
    
    @scala.inline
    def webkitTransform: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransform = "webkitTransform".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransform]
    
    @scala.inline
    def webkitTransformOrigin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformOrigin = "webkitTransformOrigin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformOrigin]
    
    @scala.inline
    def webkitTransformStyle: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformStyle = "webkitTransformStyle".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformStyle]
    
    @scala.inline
    def webkitTransition: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransition = "webkitTransition".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransition]
    
    @scala.inline
    def webkitTransitionDelay: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDelay = "webkitTransitionDelay".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDelay]
    
    @scala.inline
    def webkitTransitionDuration: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDuration = "webkitTransitionDuration".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDuration]
    
    @scala.inline
    def webkitTransitionProperty: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionProperty = "webkitTransitionProperty".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionProperty]
    
    @scala.inline
    def webkitTransitionTimingFunction: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionTimingFunction = "webkitTransitionTimingFunction".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionTimingFunction]
    
    @scala.inline
    def webkitUserModify: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitUserModify = "webkitUserModify".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitUserModify]
    
    @scala.inline
    def webkitUserSelect: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitUserSelect = "webkitUserSelect".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitUserSelect]
    
    @scala.inline
    def webkitWritingMode: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitWritingMode = "webkitWritingMode".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.webkitWritingMode]
    
    @scala.inline
    def whiteSpace: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.whiteSpace = "whiteSpace".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.whiteSpace]
    
    @scala.inline
    def widows: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.widows = "widows".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.widows]
    
    @scala.inline
    def width: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.width = "width".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.width]
    
    @scala.inline
    def wordBreak: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wordBreak = "wordBreak".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wordBreak]
    
    @scala.inline
    def wordSpacing: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wordSpacing = "wordSpacing".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wordSpacing]
    
    @scala.inline
    def wordWrap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wordWrap = "wordWrap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wordWrap]
    
    @scala.inline
    def writingMode: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.writingMode = "writingMode".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.writingMode]
    
    @scala.inline
    def zIndex: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.zIndex = "zIndex".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.zIndex]
    
    @scala.inline
    def zoom: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.zoom = "zoom".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.zoom]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.abbr
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.accept
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.`accept-charset`
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.accesskey
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.action
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.allowfullscreen
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alt
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autocomplete
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autofocus
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autoplay
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autosave
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.checked
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cite
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cols
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.colspan
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.contenteditable
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.controls
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.coords
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.crossorigin
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.data
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.datetime
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.default
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dir
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dirname
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.disabled
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.download
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.draggable
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dropzone
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.enctype
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.form
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formaction
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formenctype
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formmethod
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formnovalidate
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formtarget
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.headers
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.height
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.hidden
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.high
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.href
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.hreflang
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.id
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.inputmode
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.integrity
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.ismap
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.kind
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.label
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.lang
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.list
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.loop
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.low
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.max
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.maxlength
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.media
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.mediagroup
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.method
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.min
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.minlength
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.multiple
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.muted
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.name
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.novalidate
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.optimum
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pattern
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.placeholder
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.poster
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.preload
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.readonly
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rel
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.required
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.reversed
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rows
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rowspan
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.sandbox
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.scope
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.selected
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.shape
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.size
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.sizes
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.span
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.spellcheck
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.src
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.srcdoc
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.srclang
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.srcset
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.start
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.step
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.tabindex
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.target
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.title
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.`type`
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.typemustmatch
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.usemap
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.value
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.width
    - typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wrap
  */
  trait ElementAttrNames extends StObject
  object ElementAttrNames {
    
    @scala.inline
    def default: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.default = "default".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.default]
    
    @scala.inline
    def abbr: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.abbr = "abbr".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.abbr]
    
    @scala.inline
    def accept: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.accept = "accept".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.accept]
    
    @scala.inline
    def `accept-charset`: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.`accept-charset` = "accept-charset".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.`accept-charset`]
    
    @scala.inline
    def accesskey: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.accesskey = "accesskey".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.accesskey]
    
    @scala.inline
    def action: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.action = "action".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.action]
    
    @scala.inline
    def allowfullscreen: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.allowfullscreen = "allowfullscreen".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.allowfullscreen]
    
    @scala.inline
    def alt: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alt = "alt".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.alt]
    
    @scala.inline
    def autocomplete: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autocomplete = "autocomplete".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autocomplete]
    
    @scala.inline
    def autofocus: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autofocus = "autofocus".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autofocus]
    
    @scala.inline
    def autoplay: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autoplay = "autoplay".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autoplay]
    
    @scala.inline
    def autosave: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autosave = "autosave".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.autosave]
    
    @scala.inline
    def checked: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.checked = "checked".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.checked]
    
    @scala.inline
    def cite: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cite = "cite".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cite]
    
    @scala.inline
    def cols: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cols = "cols".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.cols]
    
    @scala.inline
    def colspan: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.colspan = "colspan".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.colspan]
    
    @scala.inline
    def contenteditable: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.contenteditable = "contenteditable".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.contenteditable]
    
    @scala.inline
    def controls: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.controls = "controls".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.controls]
    
    @scala.inline
    def coords: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.coords = "coords".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.coords]
    
    @scala.inline
    def crossorigin: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.crossorigin = "crossorigin".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.crossorigin]
    
    @scala.inline
    def data: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.data = "data".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.data]
    
    @scala.inline
    def datetime: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.datetime = "datetime".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.datetime]
    
    @scala.inline
    def dir: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dir = "dir".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dir]
    
    @scala.inline
    def dirname: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dirname = "dirname".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dirname]
    
    @scala.inline
    def disabled: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.disabled = "disabled".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.disabled]
    
    @scala.inline
    def download: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.download = "download".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.download]
    
    @scala.inline
    def draggable: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.draggable = "draggable".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.draggable]
    
    @scala.inline
    def dropzone: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dropzone = "dropzone".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.dropzone]
    
    @scala.inline
    def enctype: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.enctype = "enctype".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.enctype]
    
    @scala.inline
    def form: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.form = "form".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.form]
    
    @scala.inline
    def formaction: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formaction = "formaction".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formaction]
    
    @scala.inline
    def formenctype: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formenctype = "formenctype".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formenctype]
    
    @scala.inline
    def formmethod: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formmethod = "formmethod".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formmethod]
    
    @scala.inline
    def formnovalidate: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formnovalidate = "formnovalidate".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formnovalidate]
    
    @scala.inline
    def formtarget: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formtarget = "formtarget".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.formtarget]
    
    @scala.inline
    def headers: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.headers = "headers".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.headers]
    
    @scala.inline
    def height: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.height = "height".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.height]
    
    @scala.inline
    def hidden: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.hidden = "hidden".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.hidden]
    
    @scala.inline
    def high: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.high = "high".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.high]
    
    @scala.inline
    def href: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.href = "href".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.href]
    
    @scala.inline
    def hreflang: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.hreflang = "hreflang".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.hreflang]
    
    @scala.inline
    def id: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.id = "id".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.id]
    
    @scala.inline
    def inputmode: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.inputmode = "inputmode".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.inputmode]
    
    @scala.inline
    def integrity: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.integrity = "integrity".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.integrity]
    
    @scala.inline
    def ismap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.ismap = "ismap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.ismap]
    
    @scala.inline
    def kind: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.kind = "kind".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.kind]
    
    @scala.inline
    def label: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.label = "label".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.label]
    
    @scala.inline
    def lang: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.lang = "lang".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.lang]
    
    @scala.inline
    def list: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.list = "list".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.list]
    
    @scala.inline
    def loop: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.loop = "loop".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.loop]
    
    @scala.inline
    def low: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.low = "low".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.low]
    
    @scala.inline
    def max: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.max = "max".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.max]
    
    @scala.inline
    def maxlength: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.maxlength = "maxlength".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.maxlength]
    
    @scala.inline
    def media: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.media = "media".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.media]
    
    @scala.inline
    def mediagroup: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.mediagroup = "mediagroup".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.mediagroup]
    
    @scala.inline
    def method: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.method = "method".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.method]
    
    @scala.inline
    def min: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.min = "min".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.min]
    
    @scala.inline
    def minlength: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.minlength = "minlength".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.minlength]
    
    @scala.inline
    def multiple: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.multiple = "multiple".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.multiple]
    
    @scala.inline
    def muted: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.muted = "muted".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.muted]
    
    @scala.inline
    def name: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.name = "name".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.name]
    
    @scala.inline
    def novalidate: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.novalidate = "novalidate".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.novalidate]
    
    @scala.inline
    def optimum: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.optimum = "optimum".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.optimum]
    
    @scala.inline
    def pattern: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pattern = "pattern".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.pattern]
    
    @scala.inline
    def placeholder: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.placeholder = "placeholder".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.placeholder]
    
    @scala.inline
    def poster: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.poster = "poster".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.poster]
    
    @scala.inline
    def preload: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.preload = "preload".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.preload]
    
    @scala.inline
    def readonly: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.readonly = "readonly".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.readonly]
    
    @scala.inline
    def rel: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rel = "rel".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rel]
    
    @scala.inline
    def required: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.required = "required".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.required]
    
    @scala.inline
    def reversed: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.reversed = "reversed".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.reversed]
    
    @scala.inline
    def rows: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rows = "rows".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rows]
    
    @scala.inline
    def rowspan: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rowspan = "rowspan".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.rowspan]
    
    @scala.inline
    def sandbox: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.sandbox = "sandbox".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.sandbox]
    
    @scala.inline
    def scope: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.scope = "scope".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.scope]
    
    @scala.inline
    def selected: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.selected = "selected".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.selected]
    
    @scala.inline
    def shape: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.shape = "shape".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.shape]
    
    @scala.inline
    def size: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.size = "size".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.size]
    
    @scala.inline
    def sizes: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.sizes = "sizes".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.sizes]
    
    @scala.inline
    def span: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.span = "span".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.span]
    
    @scala.inline
    def spellcheck: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.spellcheck = "spellcheck".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.spellcheck]
    
    @scala.inline
    def src: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.src = "src".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.src]
    
    @scala.inline
    def srcdoc: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.srcdoc = "srcdoc".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.srcdoc]
    
    @scala.inline
    def srclang: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.srclang = "srclang".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.srclang]
    
    @scala.inline
    def srcset: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.srcset = "srcset".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.srcset]
    
    @scala.inline
    def start: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.start = "start".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.start]
    
    @scala.inline
    def step: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.step = "step".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.step]
    
    @scala.inline
    def tabindex: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.tabindex = "tabindex".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.tabindex]
    
    @scala.inline
    def target: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.target = "target".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.target]
    
    @scala.inline
    def title: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.title = "title".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.title]
    
    @scala.inline
    def `type`: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.`type` = "type".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.`type`]
    
    @scala.inline
    def typemustmatch: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.typemustmatch = "typemustmatch".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.typemustmatch]
    
    @scala.inline
    def usemap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.usemap = "usemap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.usemap]
    
    @scala.inline
    def value: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.value = "value".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.value]
    
    @scala.inline
    def width: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.width = "width".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.width]
    
    @scala.inline
    def wrap: typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wrap = "wrap".asInstanceOf[typingsSlinky.luminoVirtualdom.luminoVirtualdomStrings.wrap]
  }
  
  /* Inlined @lumino/virtualdom.@lumino/virtualdom.ElementBaseAttrs & @lumino/virtualdom.@lumino/virtualdom.ElementEventAttrs & @lumino/virtualdom.@lumino/virtualdom.ElementSpecialAttrs */
  @js.native
  trait ElementAttrs extends StObject {
    
    val default: js.UndefOr[String] = js.native
    
    val abbr: js.UndefOr[String] = js.native
    
    val accept: js.UndefOr[String] = js.native
    
    val `accept-charset`: js.UndefOr[String] = js.native
    
    val accesskey: js.UndefOr[String] = js.native
    
    val action: js.UndefOr[String] = js.native
    
    val allowfullscreen: js.UndefOr[String] = js.native
    
    val alt: js.UndefOr[String] = js.native
    
    val autocomplete: js.UndefOr[String] = js.native
    
    val autofocus: js.UndefOr[String] = js.native
    
    val autoplay: js.UndefOr[String] = js.native
    
    val autosave: js.UndefOr[String] = js.native
    
    val checked: js.UndefOr[String] = js.native
    
    val cite: js.UndefOr[String] = js.native
    
    /**
      * The JS-safe name for the HTML `class` attribute.
      */
    val className: js.UndefOr[String] = js.native
    
    val cols: js.UndefOr[String] = js.native
    
    val colspan: js.UndefOr[String] = js.native
    
    val contenteditable: js.UndefOr[String] = js.native
    
    val controls: js.UndefOr[String] = js.native
    
    val coords: js.UndefOr[String] = js.native
    
    val crossorigin: js.UndefOr[String] = js.native
    
    val data: js.UndefOr[String] = js.native
    
    /**
      * The dataset for the rendered DOM element.
      */
    val dataset: js.UndefOr[ElementDataset] = js.native
    
    val datetime: js.UndefOr[String] = js.native
    
    val dir: js.UndefOr[String] = js.native
    
    val dirname: js.UndefOr[String] = js.native
    
    val disabled: js.UndefOr[String] = js.native
    
    val download: js.UndefOr[String] = js.native
    
    val draggable: js.UndefOr[String] = js.native
    
    val dropzone: js.UndefOr[String] = js.native
    
    val enctype: js.UndefOr[String] = js.native
    
    val form: js.UndefOr[String] = js.native
    
    val formaction: js.UndefOr[String] = js.native
    
    val formenctype: js.UndefOr[String] = js.native
    
    val formmethod: js.UndefOr[String] = js.native
    
    val formnovalidate: js.UndefOr[String] = js.native
    
    val formtarget: js.UndefOr[String] = js.native
    
    val headers: js.UndefOr[String] = js.native
    
    val height: js.UndefOr[String] = js.native
    
    val hidden: js.UndefOr[String] = js.native
    
    val high: js.UndefOr[String] = js.native
    
    val href: js.UndefOr[String] = js.native
    
    val hreflang: js.UndefOr[String] = js.native
    
    /**
      * The JS-safe name for the HTML `for` attribute.
      */
    val htmlFor: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val inputmode: js.UndefOr[String] = js.native
    
    val integrity: js.UndefOr[String] = js.native
    
    val ismap: js.UndefOr[String] = js.native
    
    /**
      * The key id for the virtual element node.
      *
      * If a node is given a key id, the generated DOM node will not be
      * recreated during a rendering update if it only moves among its
      * siblings in the render tree.
      *
      * In general, reordering child nodes will cause the nodes to be
      * completely re-rendered. Keys allow this to be optimized away.
      *
      * If a key is provided, it must be unique among sibling nodes.
      */
    val key: js.UndefOr[String] = js.native
    
    val kind: js.UndefOr[String] = js.native
    
    val label: js.UndefOr[String] = js.native
    
    val lang: js.UndefOr[String] = js.native
    
    val list: js.UndefOr[String] = js.native
    
    val loop: js.UndefOr[String] = js.native
    
    val low: js.UndefOr[String] = js.native
    
    val max: js.UndefOr[String] = js.native
    
    val maxlength: js.UndefOr[String] = js.native
    
    val media: js.UndefOr[String] = js.native
    
    val mediagroup: js.UndefOr[String] = js.native
    
    val method: js.UndefOr[String] = js.native
    
    val min: js.UndefOr[String] = js.native
    
    val minlength: js.UndefOr[String] = js.native
    
    val multiple: js.UndefOr[String] = js.native
    
    val muted: js.UndefOr[String] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    val novalidate: js.UndefOr[String] = js.native
    
    val onabort: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
    
    val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onblur: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
    
    val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val oncopy: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
    
    val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val oncut: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
    
    val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val ondrag: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondrop: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onemptied: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onended: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]] = js.native
    
    val onerror: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]] = js.native
    
    val onfocus: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
    
    val oninput: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
    
    val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
    
    val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
    
    val onload: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onloadend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmousewheel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]] = js.native
    
    val onpaste: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
    
    val onpause: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onplaying: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onprogress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, _]] = js.native
    
    val onratechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onreset: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onscroll: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
    
    val onseeked: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onseeking: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onselect: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
    
    val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onstalled: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val optimum: js.UndefOr[String] = js.native
    
    val pattern: js.UndefOr[String] = js.native
    
    val placeholder: js.UndefOr[String] = js.native
    
    val poster: js.UndefOr[String] = js.native
    
    val preload: js.UndefOr[String] = js.native
    
    val readonly: js.UndefOr[String] = js.native
    
    val rel: js.UndefOr[String] = js.native
    
    val required: js.UndefOr[String] = js.native
    
    val reversed: js.UndefOr[String] = js.native
    
    val rows: js.UndefOr[String] = js.native
    
    val rowspan: js.UndefOr[String] = js.native
    
    val sandbox: js.UndefOr[String] = js.native
    
    val scope: js.UndefOr[String] = js.native
    
    val selected: js.UndefOr[String] = js.native
    
    val shape: js.UndefOr[String] = js.native
    
    val size: js.UndefOr[String] = js.native
    
    val sizes: js.UndefOr[String] = js.native
    
    val span: js.UndefOr[String] = js.native
    
    val spellcheck: js.UndefOr[String] = js.native
    
    val src: js.UndefOr[String] = js.native
    
    val srcdoc: js.UndefOr[String] = js.native
    
    val srclang: js.UndefOr[String] = js.native
    
    val srcset: js.UndefOr[String] = js.native
    
    val start: js.UndefOr[String] = js.native
    
    val step: js.UndefOr[String] = js.native
    
    /**
      * The inline style for the rendered DOM element.
      */
    val style: js.UndefOr[ElementInlineStyle] = js.native
    
    val tabindex: js.UndefOr[String] = js.native
    
    val target: js.UndefOr[String] = js.native
    
    val title: js.UndefOr[String] = js.native
    
    val `type`: js.UndefOr[String] = js.native
    
    val typemustmatch: js.UndefOr[String] = js.native
    
    val usemap: js.UndefOr[String] = js.native
    
    val value: js.UndefOr[String] = js.native
    
    val width: js.UndefOr[String] = js.native
    
    val wrap: js.UndefOr[String] = js.native
  }
  object ElementAttrs {
    
    @scala.inline
    def apply(): ElementAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementAttrs]
    }
    
    @scala.inline
    implicit class ElementAttrsMutableBuilder[Self <: ElementAttrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccept-charset`(value: String): Self = StObject.set(x, "accept-charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccept-charsetUndefined`: Self = StObject.set(x, "accept-charset", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAccesskey(value: String): Self = StObject.set(x, "accesskey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccesskeyUndefined: Self = StObject.set(x, "accesskey", js.undefined)
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAllowfullscreen(value: String): Self = StObject.set(x, "allowfullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowfullscreenUndefined: Self = StObject.set(x, "allowfullscreen", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setAutofocus(value: String): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      @scala.inline
      def setAutoplay(value: String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setAutosave(value: String): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
      
      @scala.inline
      def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCols(value: String): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setColspan(value: String): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
      
      @scala.inline
      def setContenteditable(value: String): Self = StObject.set(x, "contenteditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContenteditableUndefined: Self = StObject.set(x, "contenteditable", js.undefined)
      
      @scala.inline
      def setControls(value: String): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      @scala.inline
      def setCrossorigin(value: String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataset(value: ElementDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      @scala.inline
      def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setDraggable(value: String): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDropzone(value: String): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropzoneUndefined: Self = StObject.set(x, "dropzone", js.undefined)
      
      @scala.inline
      def setEnctype(value: String): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFormaction(value: String): Self = StObject.set(x, "formaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormactionUndefined: Self = StObject.set(x, "formaction", js.undefined)
      
      @scala.inline
      def setFormenctype(value: String): Self = StObject.set(x, "formenctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormenctypeUndefined: Self = StObject.set(x, "formenctype", js.undefined)
      
      @scala.inline
      def setFormmethod(value: String): Self = StObject.set(x, "formmethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormmethodUndefined: Self = StObject.set(x, "formmethod", js.undefined)
      
      @scala.inline
      def setFormnovalidate(value: String): Self = StObject.set(x, "formnovalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormnovalidateUndefined: Self = StObject.set(x, "formnovalidate", js.undefined)
      
      @scala.inline
      def setFormtarget(value: String): Self = StObject.set(x, "formtarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormtargetUndefined: Self = StObject.set(x, "formtarget", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputmode(value: String): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setIsmap(value: String): Self = StObject.set(x, "ismap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsmapUndefined: Self = StObject.set(x, "ismap", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoop(value: String): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMaxlength(value: String): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMediagroup(value: String): Self = StObject.set(x, "mediagroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediagroupUndefined: Self = StObject.set(x, "mediagroup", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMinlength(value: String): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
      
      @scala.inline
      def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setMuted(value: String): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNovalidate(value: String): Self = StObject.set(x, "novalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNovalidateUndefined: Self = StObject.set(x, "novalidate", js.undefined)
      
      @scala.inline
      def setOnabort(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      @scala.inline
      def setOnauxclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
      
      @scala.inline
      def setOnblur(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      @scala.inline
      def setOncanplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
      
      @scala.inline
      def setOncanplaythrough(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
      
      @scala.inline
      def setOnchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
      
      @scala.inline
      def setOnclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setOncontextmenu(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
      
      @scala.inline
      def setOncopy(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = StObject.set(x, "oncopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncopyUndefined: Self = StObject.set(x, "oncopy", js.undefined)
      
      @scala.inline
      def setOncuechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
      
      @scala.inline
      def setOncut(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = StObject.set(x, "oncut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncutUndefined: Self = StObject.set(x, "oncut", js.undefined)
      
      @scala.inline
      def setOndblclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
      
      @scala.inline
      def setOndrag(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
      
      @scala.inline
      def setOndragend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
      
      @scala.inline
      def setOndragenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
      
      @scala.inline
      def setOndragexit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragexit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragexitUndefined: Self = StObject.set(x, "ondragexit", js.undefined)
      
      @scala.inline
      def setOndragleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
      
      @scala.inline
      def setOndragover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
      
      @scala.inline
      def setOndragstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
      
      @scala.inline
      def setOndrop(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
      
      @scala.inline
      def setOndurationchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
      
      @scala.inline
      def setOnemptied(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
      
      @scala.inline
      def setOnended(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
      
      @scala.inline
      def setOnerror(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setOnfocus(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      @scala.inline
      def setOninput(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
      
      @scala.inline
      def setOninvalid(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
      
      @scala.inline
      def setOnkeydown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
      
      @scala.inline
      def setOnkeypress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
      
      @scala.inline
      def setOnkeyup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      @scala.inline
      def setOnload(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      @scala.inline
      def setOnloadeddata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
      
      @scala.inline
      def setOnloadedmetadata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
      
      @scala.inline
      def setOnloadend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onloadend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadendUndefined: Self = StObject.set(x, "onloadend", js.undefined)
      
      @scala.inline
      def setOnloadstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
      
      @scala.inline
      def setOnmousedown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
      
      @scala.inline
      def setOnmouseenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
      
      @scala.inline
      def setOnmouseleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
      
      @scala.inline
      def setOnmousemove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      @scala.inline
      def setOnmouseout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      @scala.inline
      def setOnmouseover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
      
      @scala.inline
      def setOnmouseup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
      
      @scala.inline
      def setOnmousewheel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]): Self = StObject.set(x, "onmousewheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousewheelUndefined: Self = StObject.set(x, "onmousewheel", js.undefined)
      
      @scala.inline
      def setOnpaste(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = StObject.set(x, "onpaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpasteUndefined: Self = StObject.set(x, "onpaste", js.undefined)
      
      @scala.inline
      def setOnpause(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      @scala.inline
      def setOnplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      @scala.inline
      def setOnplaying(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
      
      @scala.inline
      def setOnpointercancel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
      
      @scala.inline
      def setOnpointerdown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
      
      @scala.inline
      def setOnpointerenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
      
      @scala.inline
      def setOnpointerleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
      
      @scala.inline
      def setOnpointermove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
      
      @scala.inline
      def setOnpointerout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
      
      @scala.inline
      def setOnpointerover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
      
      @scala.inline
      def setOnpointerup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
      
      @scala.inline
      def setOnprogress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, _]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      @scala.inline
      def setOnratechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
      
      @scala.inline
      def setOnreset(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      @scala.inline
      def setOnscroll(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
      
      @scala.inline
      def setOnseeked(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
      
      @scala.inline
      def setOnseeking(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
      
      @scala.inline
      def setOnselect(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
      
      @scala.inline
      def setOnselectstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
      
      @scala.inline
      def setOnstalled(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
      
      @scala.inline
      def setOnsubmit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      @scala.inline
      def setOnsuspend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
      
      @scala.inline
      def setOntimeupdate(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
      
      @scala.inline
      def setOnvolumechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
      
      @scala.inline
      def setOnwaiting(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
      
      @scala.inline
      def setOptimum(value: String): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      @scala.inline
      def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setReadonly(value: String): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setReversed(value: String): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowspan(value: String): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
      
      @scala.inline
      def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSpan(value: String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpellcheck(value: String): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcdocUndefined: Self = StObject.set(x, "srcdoc", js.undefined)
      
      @scala.inline
      def setSrclang(value: String): Self = StObject.set(x, "srclang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrclangUndefined: Self = StObject.set(x, "srclang", js.undefined)
      
      @scala.inline
      def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: ElementInlineStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabindex(value: String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypemustmatch(value: String): Self = StObject.set(x, "typemustmatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypemustmatchUndefined: Self = StObject.set(x, "typemustmatch", js.undefined)
      
      @scala.inline
      def setUsemap(value: String): Self = StObject.set(x, "usemap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsemapUndefined: Self = StObject.set(x, "usemap", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  /* Inlined {readonly [ T in @lumino/virtualdom.@lumino/virtualdom.ElementAttrNames ]:? string} */
  @js.native
  trait ElementBaseAttrs extends StObject {
    
    val default: js.UndefOr[String] = js.native
    
    val abbr: js.UndefOr[String] = js.native
    
    val accept: js.UndefOr[String] = js.native
    
    val `accept-charset`: js.UndefOr[String] = js.native
    
    val accesskey: js.UndefOr[String] = js.native
    
    val action: js.UndefOr[String] = js.native
    
    val allowfullscreen: js.UndefOr[String] = js.native
    
    val alt: js.UndefOr[String] = js.native
    
    val autocomplete: js.UndefOr[String] = js.native
    
    val autofocus: js.UndefOr[String] = js.native
    
    val autoplay: js.UndefOr[String] = js.native
    
    val autosave: js.UndefOr[String] = js.native
    
    val checked: js.UndefOr[String] = js.native
    
    val cite: js.UndefOr[String] = js.native
    
    val cols: js.UndefOr[String] = js.native
    
    val colspan: js.UndefOr[String] = js.native
    
    val contenteditable: js.UndefOr[String] = js.native
    
    val controls: js.UndefOr[String] = js.native
    
    val coords: js.UndefOr[String] = js.native
    
    val crossorigin: js.UndefOr[String] = js.native
    
    val data: js.UndefOr[String] = js.native
    
    val datetime: js.UndefOr[String] = js.native
    
    val dir: js.UndefOr[String] = js.native
    
    val dirname: js.UndefOr[String] = js.native
    
    val disabled: js.UndefOr[String] = js.native
    
    val download: js.UndefOr[String] = js.native
    
    val draggable: js.UndefOr[String] = js.native
    
    val dropzone: js.UndefOr[String] = js.native
    
    val enctype: js.UndefOr[String] = js.native
    
    val form: js.UndefOr[String] = js.native
    
    val formaction: js.UndefOr[String] = js.native
    
    val formenctype: js.UndefOr[String] = js.native
    
    val formmethod: js.UndefOr[String] = js.native
    
    val formnovalidate: js.UndefOr[String] = js.native
    
    val formtarget: js.UndefOr[String] = js.native
    
    val headers: js.UndefOr[String] = js.native
    
    val height: js.UndefOr[String] = js.native
    
    val hidden: js.UndefOr[String] = js.native
    
    val high: js.UndefOr[String] = js.native
    
    val href: js.UndefOr[String] = js.native
    
    val hreflang: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val inputmode: js.UndefOr[String] = js.native
    
    val integrity: js.UndefOr[String] = js.native
    
    val ismap: js.UndefOr[String] = js.native
    
    val kind: js.UndefOr[String] = js.native
    
    val label: js.UndefOr[String] = js.native
    
    val lang: js.UndefOr[String] = js.native
    
    val list: js.UndefOr[String] = js.native
    
    val loop: js.UndefOr[String] = js.native
    
    val low: js.UndefOr[String] = js.native
    
    val max: js.UndefOr[String] = js.native
    
    val maxlength: js.UndefOr[String] = js.native
    
    val media: js.UndefOr[String] = js.native
    
    val mediagroup: js.UndefOr[String] = js.native
    
    val method: js.UndefOr[String] = js.native
    
    val min: js.UndefOr[String] = js.native
    
    val minlength: js.UndefOr[String] = js.native
    
    val multiple: js.UndefOr[String] = js.native
    
    val muted: js.UndefOr[String] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    val novalidate: js.UndefOr[String] = js.native
    
    val optimum: js.UndefOr[String] = js.native
    
    val pattern: js.UndefOr[String] = js.native
    
    val placeholder: js.UndefOr[String] = js.native
    
    val poster: js.UndefOr[String] = js.native
    
    val preload: js.UndefOr[String] = js.native
    
    val readonly: js.UndefOr[String] = js.native
    
    val rel: js.UndefOr[String] = js.native
    
    val required: js.UndefOr[String] = js.native
    
    val reversed: js.UndefOr[String] = js.native
    
    val rows: js.UndefOr[String] = js.native
    
    val rowspan: js.UndefOr[String] = js.native
    
    val sandbox: js.UndefOr[String] = js.native
    
    val scope: js.UndefOr[String] = js.native
    
    val selected: js.UndefOr[String] = js.native
    
    val shape: js.UndefOr[String] = js.native
    
    val size: js.UndefOr[String] = js.native
    
    val sizes: js.UndefOr[String] = js.native
    
    val span: js.UndefOr[String] = js.native
    
    val spellcheck: js.UndefOr[String] = js.native
    
    val src: js.UndefOr[String] = js.native
    
    val srcdoc: js.UndefOr[String] = js.native
    
    val srclang: js.UndefOr[String] = js.native
    
    val srcset: js.UndefOr[String] = js.native
    
    val start: js.UndefOr[String] = js.native
    
    val step: js.UndefOr[String] = js.native
    
    val tabindex: js.UndefOr[String] = js.native
    
    val target: js.UndefOr[String] = js.native
    
    val title: js.UndefOr[String] = js.native
    
    val `type`: js.UndefOr[String] = js.native
    
    val typemustmatch: js.UndefOr[String] = js.native
    
    val usemap: js.UndefOr[String] = js.native
    
    val value: js.UndefOr[String] = js.native
    
    val width: js.UndefOr[String] = js.native
    
    val wrap: js.UndefOr[String] = js.native
  }
  object ElementBaseAttrs {
    
    @scala.inline
    def apply(): ElementBaseAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementBaseAttrs]
    }
    
    @scala.inline
    implicit class ElementBaseAttrsMutableBuilder[Self <: ElementBaseAttrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccept-charset`(value: String): Self = StObject.set(x, "accept-charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAccept-charsetUndefined`: Self = StObject.set(x, "accept-charset", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAccesskey(value: String): Self = StObject.set(x, "accesskey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccesskeyUndefined: Self = StObject.set(x, "accesskey", js.undefined)
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAllowfullscreen(value: String): Self = StObject.set(x, "allowfullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowfullscreenUndefined: Self = StObject.set(x, "allowfullscreen", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setAutofocus(value: String): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      @scala.inline
      def setAutoplay(value: String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setAutosave(value: String): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
      
      @scala.inline
      def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      @scala.inline
      def setCols(value: String): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setColspan(value: String): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
      
      @scala.inline
      def setContenteditable(value: String): Self = StObject.set(x, "contenteditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContenteditableUndefined: Self = StObject.set(x, "contenteditable", js.undefined)
      
      @scala.inline
      def setControls(value: String): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      @scala.inline
      def setCrossorigin(value: String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setDraggable(value: String): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDropzone(value: String): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropzoneUndefined: Self = StObject.set(x, "dropzone", js.undefined)
      
      @scala.inline
      def setEnctype(value: String): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFormaction(value: String): Self = StObject.set(x, "formaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormactionUndefined: Self = StObject.set(x, "formaction", js.undefined)
      
      @scala.inline
      def setFormenctype(value: String): Self = StObject.set(x, "formenctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormenctypeUndefined: Self = StObject.set(x, "formenctype", js.undefined)
      
      @scala.inline
      def setFormmethod(value: String): Self = StObject.set(x, "formmethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormmethodUndefined: Self = StObject.set(x, "formmethod", js.undefined)
      
      @scala.inline
      def setFormnovalidate(value: String): Self = StObject.set(x, "formnovalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormnovalidateUndefined: Self = StObject.set(x, "formnovalidate", js.undefined)
      
      @scala.inline
      def setFormtarget(value: String): Self = StObject.set(x, "formtarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormtargetUndefined: Self = StObject.set(x, "formtarget", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputmode(value: String): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setIsmap(value: String): Self = StObject.set(x, "ismap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsmapUndefined: Self = StObject.set(x, "ismap", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoop(value: String): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMaxlength(value: String): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMediagroup(value: String): Self = StObject.set(x, "mediagroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediagroupUndefined: Self = StObject.set(x, "mediagroup", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMinlength(value: String): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
      
      @scala.inline
      def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setMuted(value: String): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNovalidate(value: String): Self = StObject.set(x, "novalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNovalidateUndefined: Self = StObject.set(x, "novalidate", js.undefined)
      
      @scala.inline
      def setOptimum(value: String): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      @scala.inline
      def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setReadonly(value: String): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setReversed(value: String): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowspan(value: String): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
      
      @scala.inline
      def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSpan(value: String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpellcheck(value: String): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcdocUndefined: Self = StObject.set(x, "srcdoc", js.undefined)
      
      @scala.inline
      def setSrclang(value: String): Self = StObject.set(x, "srclang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrclangUndefined: Self = StObject.set(x, "srclang", js.undefined)
      
      @scala.inline
      def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTabindex(value: String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypemustmatch(value: String): Self = StObject.set(x, "typemustmatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypemustmatchUndefined: Self = StObject.set(x, "typemustmatch", js.undefined)
      
      @scala.inline
      def setUsemap(value: String): Self = StObject.set(x, "usemap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsemapUndefined: Self = StObject.set(x, "usemap", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type ElementDataset = StringDictionary[String]
  
  /* Inlined {readonly [ T in keyof @lumino/virtualdom.@lumino/virtualdom.ElementEventMap ]:? (this : std.HTMLElement, event : @lumino/virtualdom.@lumino/virtualdom.ElementEventMap[T]): any} */
  @js.native
  trait ElementEventAttrs extends StObject {
    
    val onabort: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
    
    val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onblur: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
    
    val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val oncopy: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
    
    val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val oncut: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
    
    val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val ondrag: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondrop: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
    
    val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onemptied: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onended: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]] = js.native
    
    val onerror: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]] = js.native
    
    val onfocus: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
    
    val oninput: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
    
    val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
    
    val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
    
    val onload: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onloadend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
    
    val onmousewheel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]] = js.native
    
    val onpaste: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
    
    val onpause: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onplaying: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
    
    val onprogress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, _]] = js.native
    
    val onratechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onreset: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onscroll: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
    
    val onseeked: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onseeking: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onselect: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
    
    val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onstalled: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
    
    val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  }
  object ElementEventAttrs {
    
    @scala.inline
    def apply(): ElementEventAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementEventAttrs]
    }
    
    @scala.inline
    implicit class ElementEventAttrsMutableBuilder[Self <: ElementEventAttrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnabort(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      @scala.inline
      def setOnauxclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
      
      @scala.inline
      def setOnblur(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      @scala.inline
      def setOncanplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
      
      @scala.inline
      def setOncanplaythrough(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
      
      @scala.inline
      def setOnchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
      
      @scala.inline
      def setOnclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setOncontextmenu(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
      
      @scala.inline
      def setOncopy(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = StObject.set(x, "oncopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncopyUndefined: Self = StObject.set(x, "oncopy", js.undefined)
      
      @scala.inline
      def setOncuechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
      
      @scala.inline
      def setOncut(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = StObject.set(x, "oncut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncutUndefined: Self = StObject.set(x, "oncut", js.undefined)
      
      @scala.inline
      def setOndblclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
      
      @scala.inline
      def setOndrag(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
      
      @scala.inline
      def setOndragend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
      
      @scala.inline
      def setOndragenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
      
      @scala.inline
      def setOndragexit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragexit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragexitUndefined: Self = StObject.set(x, "ondragexit", js.undefined)
      
      @scala.inline
      def setOndragleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
      
      @scala.inline
      def setOndragover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
      
      @scala.inline
      def setOndragstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
      
      @scala.inline
      def setOndrop(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
      
      @scala.inline
      def setOndurationchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
      
      @scala.inline
      def setOnemptied(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
      
      @scala.inline
      def setOnended(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
      
      @scala.inline
      def setOnerror(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setOnfocus(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      @scala.inline
      def setOninput(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
      
      @scala.inline
      def setOninvalid(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
      
      @scala.inline
      def setOnkeydown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
      
      @scala.inline
      def setOnkeypress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
      
      @scala.inline
      def setOnkeyup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      @scala.inline
      def setOnload(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      @scala.inline
      def setOnloadeddata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
      
      @scala.inline
      def setOnloadedmetadata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
      
      @scala.inline
      def setOnloadend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onloadend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadendUndefined: Self = StObject.set(x, "onloadend", js.undefined)
      
      @scala.inline
      def setOnloadstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
      
      @scala.inline
      def setOnmousedown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
      
      @scala.inline
      def setOnmouseenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
      
      @scala.inline
      def setOnmouseleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
      
      @scala.inline
      def setOnmousemove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      @scala.inline
      def setOnmouseout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      @scala.inline
      def setOnmouseover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
      
      @scala.inline
      def setOnmouseup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
      
      @scala.inline
      def setOnmousewheel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]): Self = StObject.set(x, "onmousewheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousewheelUndefined: Self = StObject.set(x, "onmousewheel", js.undefined)
      
      @scala.inline
      def setOnpaste(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = StObject.set(x, "onpaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpasteUndefined: Self = StObject.set(x, "onpaste", js.undefined)
      
      @scala.inline
      def setOnpause(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      @scala.inline
      def setOnplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      @scala.inline
      def setOnplaying(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
      
      @scala.inline
      def setOnpointercancel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
      
      @scala.inline
      def setOnpointerdown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
      
      @scala.inline
      def setOnpointerenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
      
      @scala.inline
      def setOnpointerleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
      
      @scala.inline
      def setOnpointermove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
      
      @scala.inline
      def setOnpointerout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
      
      @scala.inline
      def setOnpointerover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
      
      @scala.inline
      def setOnpointerup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
      
      @scala.inline
      def setOnprogress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, _]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      @scala.inline
      def setOnratechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
      
      @scala.inline
      def setOnreset(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      @scala.inline
      def setOnscroll(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
      
      @scala.inline
      def setOnseeked(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
      
      @scala.inline
      def setOnseeking(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
      
      @scala.inline
      def setOnselect(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
      
      @scala.inline
      def setOnselectstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
      
      @scala.inline
      def setOnstalled(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
      
      @scala.inline
      def setOnsubmit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      @scala.inline
      def setOnsuspend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
      
      @scala.inline
      def setOntimeupdate(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
      
      @scala.inline
      def setOnvolumechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
      
      @scala.inline
      def setOnwaiting(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
    }
  }
  
  @js.native
  trait ElementEventMap extends StObject {
    
    var onabort: UIEvent = js.native
    
    var onauxclick: MouseEvent = js.native
    
    var onblur: FocusEvent = js.native
    
    var oncanplay: Event = js.native
    
    var oncanplaythrough: Event = js.native
    
    var onchange: Event = js.native
    
    var onclick: MouseEvent = js.native
    
    var oncontextmenu: PointerEvent = js.native
    
    var oncopy: ClipboardEvent = js.native
    
    var oncuechange: Event = js.native
    
    var oncut: ClipboardEvent = js.native
    
    var ondblclick: MouseEvent = js.native
    
    var ondrag: DragEvent = js.native
    
    var ondragend: DragEvent = js.native
    
    var ondragenter: DragEvent = js.native
    
    var ondragexit: DragEvent = js.native
    
    var ondragleave: DragEvent = js.native
    
    var ondragover: DragEvent = js.native
    
    var ondragstart: DragEvent = js.native
    
    var ondrop: DragEvent = js.native
    
    var ondurationchange: Event = js.native
    
    var onemptied: Event = js.native
    
    var onended: MediaStreamErrorEvent = js.native
    
    var onerror: ErrorEvent = js.native
    
    var onfocus: FocusEvent = js.native
    
    var oninput: Event = js.native
    
    var oninvalid: Event = js.native
    
    var onkeydown: KeyboardEvent = js.native
    
    var onkeypress: KeyboardEvent = js.native
    
    var onkeyup: KeyboardEvent = js.native
    
    var onload: Event = js.native
    
    var onloadeddata: Event = js.native
    
    var onloadedmetadata: Event = js.native
    
    var onloadend: Event = js.native
    
    var onloadstart: Event = js.native
    
    var onmousedown: MouseEvent = js.native
    
    var onmouseenter: MouseEvent = js.native
    
    var onmouseleave: MouseEvent = js.native
    
    var onmousemove: MouseEvent = js.native
    
    var onmouseout: MouseEvent = js.native
    
    var onmouseover: MouseEvent = js.native
    
    var onmouseup: MouseEvent = js.native
    
    var onmousewheel: WheelEvent = js.native
    
    var onpaste: ClipboardEvent = js.native
    
    var onpause: Event = js.native
    
    var onplay: Event = js.native
    
    var onplaying: Event = js.native
    
    var onpointercancel: PointerEvent = js.native
    
    var onpointerdown: PointerEvent = js.native
    
    var onpointerenter: PointerEvent = js.native
    
    var onpointerleave: PointerEvent = js.native
    
    var onpointermove: PointerEvent = js.native
    
    var onpointerout: PointerEvent = js.native
    
    var onpointerover: PointerEvent = js.native
    
    var onpointerup: PointerEvent = js.native
    
    var onprogress: ProgressEvent = js.native
    
    var onratechange: Event = js.native
    
    var onreset: Event = js.native
    
    var onscroll: UIEvent = js.native
    
    var onseeked: Event = js.native
    
    var onseeking: Event = js.native
    
    var onselect: UIEvent = js.native
    
    var onselectstart: Event = js.native
    
    var onstalled: Event = js.native
    
    var onsubmit: Event = js.native
    
    var onsuspend: Event = js.native
    
    var ontimeupdate: Event = js.native
    
    var onvolumechange: Event = js.native
    
    var onwaiting: Event = js.native
  }
  object ElementEventMap {
    
    @scala.inline
    def apply(
      onabort: UIEvent,
      onauxclick: MouseEvent,
      onblur: FocusEvent,
      oncanplay: Event,
      oncanplaythrough: Event,
      onchange: Event,
      onclick: MouseEvent,
      oncontextmenu: PointerEvent,
      oncopy: ClipboardEvent,
      oncuechange: Event,
      oncut: ClipboardEvent,
      ondblclick: MouseEvent,
      ondrag: DragEvent,
      ondragend: DragEvent,
      ondragenter: DragEvent,
      ondragexit: DragEvent,
      ondragleave: DragEvent,
      ondragover: DragEvent,
      ondragstart: DragEvent,
      ondrop: DragEvent,
      ondurationchange: Event,
      onemptied: Event,
      onended: MediaStreamErrorEvent,
      onerror: ErrorEvent,
      onfocus: FocusEvent,
      oninput: Event,
      oninvalid: Event,
      onkeydown: KeyboardEvent,
      onkeypress: KeyboardEvent,
      onkeyup: KeyboardEvent,
      onload: Event,
      onloadeddata: Event,
      onloadedmetadata: Event,
      onloadend: Event,
      onloadstart: Event,
      onmousedown: MouseEvent,
      onmouseenter: MouseEvent,
      onmouseleave: MouseEvent,
      onmousemove: MouseEvent,
      onmouseout: MouseEvent,
      onmouseover: MouseEvent,
      onmouseup: MouseEvent,
      onmousewheel: WheelEvent,
      onpaste: ClipboardEvent,
      onpause: Event,
      onplay: Event,
      onplaying: Event,
      onpointercancel: PointerEvent,
      onpointerdown: PointerEvent,
      onpointerenter: PointerEvent,
      onpointerleave: PointerEvent,
      onpointermove: PointerEvent,
      onpointerout: PointerEvent,
      onpointerover: PointerEvent,
      onpointerup: PointerEvent,
      onprogress: ProgressEvent,
      onratechange: Event,
      onreset: Event,
      onscroll: UIEvent,
      onseeked: Event,
      onseeking: Event,
      onselect: UIEvent,
      onselectstart: Event,
      onstalled: Event,
      onsubmit: Event,
      onsuspend: Event,
      ontimeupdate: Event,
      onvolumechange: Event,
      onwaiting: Event
    ): ElementEventMap = {
      val __obj = js.Dynamic.literal(onabort = onabort.asInstanceOf[js.Any], onauxclick = onauxclick.asInstanceOf[js.Any], onblur = onblur.asInstanceOf[js.Any], oncanplay = oncanplay.asInstanceOf[js.Any], oncanplaythrough = oncanplaythrough.asInstanceOf[js.Any], onchange = onchange.asInstanceOf[js.Any], onclick = onclick.asInstanceOf[js.Any], oncontextmenu = oncontextmenu.asInstanceOf[js.Any], oncopy = oncopy.asInstanceOf[js.Any], oncuechange = oncuechange.asInstanceOf[js.Any], oncut = oncut.asInstanceOf[js.Any], ondblclick = ondblclick.asInstanceOf[js.Any], ondrag = ondrag.asInstanceOf[js.Any], ondragend = ondragend.asInstanceOf[js.Any], ondragenter = ondragenter.asInstanceOf[js.Any], ondragexit = ondragexit.asInstanceOf[js.Any], ondragleave = ondragleave.asInstanceOf[js.Any], ondragover = ondragover.asInstanceOf[js.Any], ondragstart = ondragstart.asInstanceOf[js.Any], ondrop = ondrop.asInstanceOf[js.Any], ondurationchange = ondurationchange.asInstanceOf[js.Any], onemptied = onemptied.asInstanceOf[js.Any], onended = onended.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onfocus = onfocus.asInstanceOf[js.Any], oninput = oninput.asInstanceOf[js.Any], oninvalid = oninvalid.asInstanceOf[js.Any], onkeydown = onkeydown.asInstanceOf[js.Any], onkeypress = onkeypress.asInstanceOf[js.Any], onkeyup = onkeyup.asInstanceOf[js.Any], onload = onload.asInstanceOf[js.Any], onloadeddata = onloadeddata.asInstanceOf[js.Any], onloadedmetadata = onloadedmetadata.asInstanceOf[js.Any], onloadend = onloadend.asInstanceOf[js.Any], onloadstart = onloadstart.asInstanceOf[js.Any], onmousedown = onmousedown.asInstanceOf[js.Any], onmouseenter = onmouseenter.asInstanceOf[js.Any], onmouseleave = onmouseleave.asInstanceOf[js.Any], onmousemove = onmousemove.asInstanceOf[js.Any], onmouseout = onmouseout.asInstanceOf[js.Any], onmouseover = onmouseover.asInstanceOf[js.Any], onmouseup = onmouseup.asInstanceOf[js.Any], onmousewheel = onmousewheel.asInstanceOf[js.Any], onpaste = onpaste.asInstanceOf[js.Any], onpause = onpause.asInstanceOf[js.Any], onplay = onplay.asInstanceOf[js.Any], onplaying = onplaying.asInstanceOf[js.Any], onpointercancel = onpointercancel.asInstanceOf[js.Any], onpointerdown = onpointerdown.asInstanceOf[js.Any], onpointerenter = onpointerenter.asInstanceOf[js.Any], onpointerleave = onpointerleave.asInstanceOf[js.Any], onpointermove = onpointermove.asInstanceOf[js.Any], onpointerout = onpointerout.asInstanceOf[js.Any], onpointerover = onpointerover.asInstanceOf[js.Any], onpointerup = onpointerup.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onratechange = onratechange.asInstanceOf[js.Any], onreset = onreset.asInstanceOf[js.Any], onscroll = onscroll.asInstanceOf[js.Any], onseeked = onseeked.asInstanceOf[js.Any], onseeking = onseeking.asInstanceOf[js.Any], onselect = onselect.asInstanceOf[js.Any], onselectstart = onselectstart.asInstanceOf[js.Any], onstalled = onstalled.asInstanceOf[js.Any], onsubmit = onsubmit.asInstanceOf[js.Any], onsuspend = onsuspend.asInstanceOf[js.Any], ontimeupdate = ontimeupdate.asInstanceOf[js.Any], onvolumechange = onvolumechange.asInstanceOf[js.Any], onwaiting = onwaiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementEventMap]
    }
    
    @scala.inline
    implicit class ElementEventMapMutableBuilder[Self <: ElementEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnabort(value: UIEvent): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnauxclick(value: MouseEvent): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnblur(value: FocusEvent): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncanplay(value: Event): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncanplaythrough(value: Event): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnchange(value: Event): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnclick(value: MouseEvent): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncontextmenu(value: PointerEvent): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncopy(value: ClipboardEvent): Self = StObject.set(x, "oncopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncuechange(value: Event): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncut(value: ClipboardEvent): Self = StObject.set(x, "oncut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndblclick(value: MouseEvent): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndrag(value: DragEvent): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragend(value: DragEvent): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragenter(value: DragEvent): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragexit(value: DragEvent): Self = StObject.set(x, "ondragexit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragleave(value: DragEvent): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragover(value: DragEvent): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndragstart(value: DragEvent): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndrop(value: DragEvent): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOndurationchange(value: Event): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnemptied(value: Event): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnended(value: MediaStreamErrorEvent): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnerror(value: ErrorEvent): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnfocus(value: FocusEvent): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOninput(value: Event): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOninvalid(value: Event): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeydown(value: KeyboardEvent): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeypress(value: KeyboardEvent): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeyup(value: KeyboardEvent): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnload(value: Event): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadeddata(value: Event): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadedmetadata(value: Event): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadend(value: Event): Self = StObject.set(x, "onloadend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadstart(value: Event): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousedown(value: MouseEvent): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseenter(value: MouseEvent): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseleave(value: MouseEvent): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousemove(value: MouseEvent): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseout(value: MouseEvent): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseover(value: MouseEvent): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmouseup(value: MouseEvent): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmousewheel(value: WheelEvent): Self = StObject.set(x, "onmousewheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpaste(value: ClipboardEvent): Self = StObject.set(x, "onpaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpause(value: Event): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnplay(value: Event): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnplaying(value: Event): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointercancel(value: PointerEvent): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerdown(value: PointerEvent): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerenter(value: PointerEvent): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerleave(value: PointerEvent): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointermove(value: PointerEvent): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerout(value: PointerEvent): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerover(value: PointerEvent): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnpointerup(value: PointerEvent): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnprogress(value: ProgressEvent): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnratechange(value: Event): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnreset(value: Event): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnscroll(value: UIEvent): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnseeked(value: Event): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnseeking(value: Event): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnselect(value: UIEvent): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnselectstart(value: Event): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnstalled(value: Event): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsubmit(value: Event): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsuspend(value: Event): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOntimeupdate(value: Event): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnvolumechange(value: Event): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnwaiting(value: Event): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {readonly [ T in @lumino/virtualdom.@lumino/virtualdom.CSSPropertyNames ]:? string} */
  @js.native
  trait ElementInlineStyle extends StObject {
    
    val alignContent: js.UndefOr[String] = js.native
    
    val alignItems: js.UndefOr[String] = js.native
    
    val alignSelf: js.UndefOr[String] = js.native
    
    val alignmentBaseline: js.UndefOr[String] = js.native
    
    val animation: js.UndefOr[String] = js.native
    
    val animationDelay: js.UndefOr[String] = js.native
    
    val animationDirection: js.UndefOr[String] = js.native
    
    val animationDuration: js.UndefOr[String] = js.native
    
    val animationFillMode: js.UndefOr[String] = js.native
    
    val animationIterationCount: js.UndefOr[String] = js.native
    
    val animationName: js.UndefOr[String] = js.native
    
    val animationPlayState: js.UndefOr[String] = js.native
    
    val animationTimingFunction: js.UndefOr[String] = js.native
    
    val backfaceVisibility: js.UndefOr[String] = js.native
    
    val background: js.UndefOr[String] = js.native
    
    val backgroundAttachment: js.UndefOr[String] = js.native
    
    val backgroundClip: js.UndefOr[String] = js.native
    
    val backgroundColor: js.UndefOr[String] = js.native
    
    val backgroundImage: js.UndefOr[String] = js.native
    
    val backgroundOrigin: js.UndefOr[String] = js.native
    
    val backgroundPosition: js.UndefOr[String] = js.native
    
    val backgroundPositionX: js.UndefOr[String] = js.native
    
    val backgroundPositionY: js.UndefOr[String] = js.native
    
    val backgroundRepeat: js.UndefOr[String] = js.native
    
    val backgroundSize: js.UndefOr[String] = js.native
    
    val baselineShift: js.UndefOr[String] = js.native
    
    val border: js.UndefOr[String] = js.native
    
    val borderBottom: js.UndefOr[String] = js.native
    
    val borderBottomColor: js.UndefOr[String] = js.native
    
    val borderBottomLeftRadius: js.UndefOr[String] = js.native
    
    val borderBottomRightRadius: js.UndefOr[String] = js.native
    
    val borderBottomStyle: js.UndefOr[String] = js.native
    
    val borderBottomWidth: js.UndefOr[String] = js.native
    
    val borderCollapse: js.UndefOr[String] = js.native
    
    val borderColor: js.UndefOr[String] = js.native
    
    val borderImage: js.UndefOr[String] = js.native
    
    val borderImageOutset: js.UndefOr[String] = js.native
    
    val borderImageRepeat: js.UndefOr[String] = js.native
    
    val borderImageSlice: js.UndefOr[String] = js.native
    
    val borderImageSource: js.UndefOr[String] = js.native
    
    val borderImageWidth: js.UndefOr[String] = js.native
    
    val borderLeft: js.UndefOr[String] = js.native
    
    val borderLeftColor: js.UndefOr[String] = js.native
    
    val borderLeftStyle: js.UndefOr[String] = js.native
    
    val borderLeftWidth: js.UndefOr[String] = js.native
    
    val borderRadius: js.UndefOr[String] = js.native
    
    val borderRight: js.UndefOr[String] = js.native
    
    val borderRightColor: js.UndefOr[String] = js.native
    
    val borderRightStyle: js.UndefOr[String] = js.native
    
    val borderRightWidth: js.UndefOr[String] = js.native
    
    val borderSpacing: js.UndefOr[String] = js.native
    
    val borderStyle: js.UndefOr[String] = js.native
    
    val borderTop: js.UndefOr[String] = js.native
    
    val borderTopColor: js.UndefOr[String] = js.native
    
    val borderTopLeftRadius: js.UndefOr[String] = js.native
    
    val borderTopRightRadius: js.UndefOr[String] = js.native
    
    val borderTopStyle: js.UndefOr[String] = js.native
    
    val borderTopWidth: js.UndefOr[String] = js.native
    
    val borderWidth: js.UndefOr[String] = js.native
    
    val bottom: js.UndefOr[String] = js.native
    
    val boxShadow: js.UndefOr[String] = js.native
    
    val boxSizing: js.UndefOr[String] = js.native
    
    val breakAfter: js.UndefOr[String] = js.native
    
    val breakBefore: js.UndefOr[String] = js.native
    
    val breakInside: js.UndefOr[String] = js.native
    
    val captionSide: js.UndefOr[String] = js.native
    
    val clear: js.UndefOr[String] = js.native
    
    val clip: js.UndefOr[String] = js.native
    
    val clipPath: js.UndefOr[String] = js.native
    
    val clipRule: js.UndefOr[String] = js.native
    
    val color: js.UndefOr[String] = js.native
    
    val colorInterpolationFilters: js.UndefOr[String] = js.native
    
    val columnCount: js.UndefOr[String] = js.native
    
    val columnFill: js.UndefOr[String] = js.native
    
    val columnGap: js.UndefOr[String] = js.native
    
    val columnRule: js.UndefOr[String] = js.native
    
    val columnRuleColor: js.UndefOr[String] = js.native
    
    val columnRuleStyle: js.UndefOr[String] = js.native
    
    val columnRuleWidth: js.UndefOr[String] = js.native
    
    val columnSpan: js.UndefOr[String] = js.native
    
    val columnWidth: js.UndefOr[String] = js.native
    
    val columns: js.UndefOr[String] = js.native
    
    val content: js.UndefOr[String] = js.native
    
    val counterIncrement: js.UndefOr[String] = js.native
    
    val counterReset: js.UndefOr[String] = js.native
    
    val cssFloat: js.UndefOr[String] = js.native
    
    val cssText: js.UndefOr[String] = js.native
    
    val cursor: js.UndefOr[String] = js.native
    
    val direction: js.UndefOr[String] = js.native
    
    val display: js.UndefOr[String] = js.native
    
    val dominantBaseline: js.UndefOr[String] = js.native
    
    val emptyCells: js.UndefOr[String] = js.native
    
    val enableBackground: js.UndefOr[String] = js.native
    
    val fill: js.UndefOr[String] = js.native
    
    val fillOpacity: js.UndefOr[String] = js.native
    
    val fillRule: js.UndefOr[String] = js.native
    
    val filter: js.UndefOr[String] = js.native
    
    val flex: js.UndefOr[String] = js.native
    
    val flexBasis: js.UndefOr[String] = js.native
    
    val flexDirection: js.UndefOr[String] = js.native
    
    val flexFlow: js.UndefOr[String] = js.native
    
    val flexGrow: js.UndefOr[String] = js.native
    
    val flexShrink: js.UndefOr[String] = js.native
    
    val flexWrap: js.UndefOr[String] = js.native
    
    val floodColor: js.UndefOr[String] = js.native
    
    val floodOpacity: js.UndefOr[String] = js.native
    
    val font: js.UndefOr[String] = js.native
    
    val fontFamily: js.UndefOr[String] = js.native
    
    val fontFeatureSettings: js.UndefOr[String] = js.native
    
    val fontSize: js.UndefOr[String] = js.native
    
    val fontSizeAdjust: js.UndefOr[String] = js.native
    
    val fontStretch: js.UndefOr[String] = js.native
    
    val fontStyle: js.UndefOr[String] = js.native
    
    val fontVariant: js.UndefOr[String] = js.native
    
    val fontWeight: js.UndefOr[String] = js.native
    
    val glyphOrientationHorizontal: js.UndefOr[String] = js.native
    
    val glyphOrientationVertical: js.UndefOr[String] = js.native
    
    val height: js.UndefOr[String] = js.native
    
    val imeMode: js.UndefOr[String] = js.native
    
    val justifyContent: js.UndefOr[String] = js.native
    
    val kerning: js.UndefOr[String] = js.native
    
    val left: js.UndefOr[String] = js.native
    
    val letterSpacing: js.UndefOr[String] = js.native
    
    val lightingColor: js.UndefOr[String] = js.native
    
    val lineHeight: js.UndefOr[String] = js.native
    
    val listStyle: js.UndefOr[String] = js.native
    
    val listStyleImage: js.UndefOr[String] = js.native
    
    val listStylePosition: js.UndefOr[String] = js.native
    
    val listStyleType: js.UndefOr[String] = js.native
    
    val margin: js.UndefOr[String] = js.native
    
    val marginBottom: js.UndefOr[String] = js.native
    
    val marginLeft: js.UndefOr[String] = js.native
    
    val marginRight: js.UndefOr[String] = js.native
    
    val marginTop: js.UndefOr[String] = js.native
    
    val marker: js.UndefOr[String] = js.native
    
    val markerEnd: js.UndefOr[String] = js.native
    
    val markerMid: js.UndefOr[String] = js.native
    
    val markerStart: js.UndefOr[String] = js.native
    
    val mask: js.UndefOr[String] = js.native
    
    val maxHeight: js.UndefOr[String] = js.native
    
    val maxWidth: js.UndefOr[String] = js.native
    
    val minHeight: js.UndefOr[String] = js.native
    
    val minWidth: js.UndefOr[String] = js.native
    
    val msContentZoomChaining: js.UndefOr[String] = js.native
    
    val msContentZoomLimit: js.UndefOr[String] = js.native
    
    val msContentZoomLimitMax: js.UndefOr[String] = js.native
    
    val msContentZoomLimitMin: js.UndefOr[String] = js.native
    
    val msContentZoomSnap: js.UndefOr[String] = js.native
    
    val msContentZoomSnapPoints: js.UndefOr[String] = js.native
    
    val msContentZoomSnapType: js.UndefOr[String] = js.native
    
    val msContentZooming: js.UndefOr[String] = js.native
    
    val msFlowFrom: js.UndefOr[String] = js.native
    
    val msFlowInto: js.UndefOr[String] = js.native
    
    val msFontFeatureSettings: js.UndefOr[String] = js.native
    
    val msGridColumn: js.UndefOr[String] = js.native
    
    val msGridColumnAlign: js.UndefOr[String] = js.native
    
    val msGridColumnSpan: js.UndefOr[String] = js.native
    
    val msGridColumns: js.UndefOr[String] = js.native
    
    val msGridRow: js.UndefOr[String] = js.native
    
    val msGridRowAlign: js.UndefOr[String] = js.native
    
    val msGridRowSpan: js.UndefOr[String] = js.native
    
    val msGridRows: js.UndefOr[String] = js.native
    
    val msHighContrastAdjust: js.UndefOr[String] = js.native
    
    val msHyphenateLimitChars: js.UndefOr[String] = js.native
    
    val msHyphenateLimitLines: js.UndefOr[String] = js.native
    
    val msHyphenateLimitZone: js.UndefOr[String] = js.native
    
    val msHyphens: js.UndefOr[String] = js.native
    
    val msImeAlign: js.UndefOr[String] = js.native
    
    val msOverflowStyle: js.UndefOr[String] = js.native
    
    val msScrollChaining: js.UndefOr[String] = js.native
    
    val msScrollLimit: js.UndefOr[String] = js.native
    
    val msScrollLimitXMax: js.UndefOr[String] = js.native
    
    val msScrollLimitXMin: js.UndefOr[String] = js.native
    
    val msScrollLimitYMax: js.UndefOr[String] = js.native
    
    val msScrollLimitYMin: js.UndefOr[String] = js.native
    
    val msScrollRails: js.UndefOr[String] = js.native
    
    val msScrollSnapPointsX: js.UndefOr[String] = js.native
    
    val msScrollSnapPointsY: js.UndefOr[String] = js.native
    
    val msScrollSnapType: js.UndefOr[String] = js.native
    
    val msScrollSnapX: js.UndefOr[String] = js.native
    
    val msScrollSnapY: js.UndefOr[String] = js.native
    
    val msScrollTranslation: js.UndefOr[String] = js.native
    
    val msTextCombineHorizontal: js.UndefOr[String] = js.native
    
    val msTextSizeAdjust: js.UndefOr[String] = js.native
    
    val msTouchAction: js.UndefOr[String] = js.native
    
    val msTouchSelect: js.UndefOr[String] = js.native
    
    val msUserSelect: js.UndefOr[String] = js.native
    
    val msWrapFlow: js.UndefOr[String] = js.native
    
    val msWrapMargin: js.UndefOr[String] = js.native
    
    val msWrapThrough: js.UndefOr[String] = js.native
    
    val opacity: js.UndefOr[String] = js.native
    
    val order: js.UndefOr[String] = js.native
    
    val orphans: js.UndefOr[String] = js.native
    
    val outline: js.UndefOr[String] = js.native
    
    val outlineColor: js.UndefOr[String] = js.native
    
    val outlineStyle: js.UndefOr[String] = js.native
    
    val outlineWidth: js.UndefOr[String] = js.native
    
    val overflow: js.UndefOr[String] = js.native
    
    val overflowX: js.UndefOr[String] = js.native
    
    val overflowY: js.UndefOr[String] = js.native
    
    val padding: js.UndefOr[String] = js.native
    
    val paddingBottom: js.UndefOr[String] = js.native
    
    val paddingLeft: js.UndefOr[String] = js.native
    
    val paddingRight: js.UndefOr[String] = js.native
    
    val paddingTop: js.UndefOr[String] = js.native
    
    val pageBreakAfter: js.UndefOr[String] = js.native
    
    val pageBreakBefore: js.UndefOr[String] = js.native
    
    val pageBreakInside: js.UndefOr[String] = js.native
    
    val perspective: js.UndefOr[String] = js.native
    
    val perspectiveOrigin: js.UndefOr[String] = js.native
    
    val pointerEvents: js.UndefOr[String] = js.native
    
    val position: js.UndefOr[String] = js.native
    
    val quotes: js.UndefOr[String] = js.native
    
    val resize: js.UndefOr[String] = js.native
    
    val right: js.UndefOr[String] = js.native
    
    val rubyAlign: js.UndefOr[String] = js.native
    
    val rubyOverhang: js.UndefOr[String] = js.native
    
    val rubyPosition: js.UndefOr[String] = js.native
    
    val stopColor: js.UndefOr[String] = js.native
    
    val stopOpacity: js.UndefOr[String] = js.native
    
    val stroke: js.UndefOr[String] = js.native
    
    val strokeDasharray: js.UndefOr[String] = js.native
    
    val strokeDashoffset: js.UndefOr[String] = js.native
    
    val strokeLinecap: js.UndefOr[String] = js.native
    
    val strokeLinejoin: js.UndefOr[String] = js.native
    
    val strokeMiterlimit: js.UndefOr[String] = js.native
    
    val strokeOpacity: js.UndefOr[String] = js.native
    
    val strokeWidth: js.UndefOr[String] = js.native
    
    val tableLayout: js.UndefOr[String] = js.native
    
    val textAlign: js.UndefOr[String] = js.native
    
    val textAlignLast: js.UndefOr[String] = js.native
    
    val textAnchor: js.UndefOr[String] = js.native
    
    val textDecoration: js.UndefOr[String] = js.native
    
    val textIndent: js.UndefOr[String] = js.native
    
    val textJustify: js.UndefOr[String] = js.native
    
    val textKashida: js.UndefOr[String] = js.native
    
    val textKashidaSpace: js.UndefOr[String] = js.native
    
    val textOverflow: js.UndefOr[String] = js.native
    
    val textShadow: js.UndefOr[String] = js.native
    
    val textTransform: js.UndefOr[String] = js.native
    
    val textUnderlinePosition: js.UndefOr[String] = js.native
    
    val top: js.UndefOr[String] = js.native
    
    val touchAction: js.UndefOr[String] = js.native
    
    val transform: js.UndefOr[String] = js.native
    
    val transformOrigin: js.UndefOr[String] = js.native
    
    val transformStyle: js.UndefOr[String] = js.native
    
    val transition: js.UndefOr[String] = js.native
    
    val transitionDelay: js.UndefOr[String] = js.native
    
    val transitionDuration: js.UndefOr[String] = js.native
    
    val transitionProperty: js.UndefOr[String] = js.native
    
    val transitionTimingFunction: js.UndefOr[String] = js.native
    
    val unicodeBidi: js.UndefOr[String] = js.native
    
    val verticalAlign: js.UndefOr[String] = js.native
    
    val visibility: js.UndefOr[String] = js.native
    
    val webkitAlignContent: js.UndefOr[String] = js.native
    
    val webkitAlignItems: js.UndefOr[String] = js.native
    
    val webkitAlignSelf: js.UndefOr[String] = js.native
    
    val webkitAnimation: js.UndefOr[String] = js.native
    
    val webkitAnimationDelay: js.UndefOr[String] = js.native
    
    val webkitAnimationDirection: js.UndefOr[String] = js.native
    
    val webkitAnimationDuration: js.UndefOr[String] = js.native
    
    val webkitAnimationFillMode: js.UndefOr[String] = js.native
    
    val webkitAnimationIterationCount: js.UndefOr[String] = js.native
    
    val webkitAnimationName: js.UndefOr[String] = js.native
    
    val webkitAnimationPlayState: js.UndefOr[String] = js.native
    
    val webkitAnimationTimingFunction: js.UndefOr[String] = js.native
    
    val webkitAppearance: js.UndefOr[String] = js.native
    
    val webkitBackfaceVisibility: js.UndefOr[String] = js.native
    
    val webkitBackgroundClip: js.UndefOr[String] = js.native
    
    val webkitBackgroundOrigin: js.UndefOr[String] = js.native
    
    val webkitBackgroundSize: js.UndefOr[String] = js.native
    
    val webkitBorderBottomLeftRadius: js.UndefOr[String] = js.native
    
    val webkitBorderBottomRightRadius: js.UndefOr[String] = js.native
    
    val webkitBorderImage: js.UndefOr[String] = js.native
    
    val webkitBorderRadius: js.UndefOr[String] = js.native
    
    val webkitBorderTopLeftRadius: js.UndefOr[String] = js.native
    
    val webkitBorderTopRightRadius: js.UndefOr[String] = js.native
    
    val webkitBoxAlign: js.UndefOr[String] = js.native
    
    val webkitBoxDirection: js.UndefOr[String] = js.native
    
    val webkitBoxFlex: js.UndefOr[String] = js.native
    
    val webkitBoxOrdinalGroup: js.UndefOr[String] = js.native
    
    val webkitBoxOrient: js.UndefOr[String] = js.native
    
    val webkitBoxPack: js.UndefOr[String] = js.native
    
    val webkitBoxSizing: js.UndefOr[String] = js.native
    
    val webkitColumnBreakAfter: js.UndefOr[String] = js.native
    
    val webkitColumnBreakBefore: js.UndefOr[String] = js.native
    
    val webkitColumnBreakInside: js.UndefOr[String] = js.native
    
    val webkitColumnCount: js.UndefOr[String] = js.native
    
    val webkitColumnGap: js.UndefOr[String] = js.native
    
    val webkitColumnRule: js.UndefOr[String] = js.native
    
    val webkitColumnRuleColor: js.UndefOr[String] = js.native
    
    val webkitColumnRuleStyle: js.UndefOr[String] = js.native
    
    val webkitColumnRuleWidth: js.UndefOr[String] = js.native
    
    val webkitColumnSpan: js.UndefOr[String] = js.native
    
    val webkitColumnWidth: js.UndefOr[String] = js.native
    
    val webkitColumns: js.UndefOr[String] = js.native
    
    val webkitFilter: js.UndefOr[String] = js.native
    
    val webkitFlex: js.UndefOr[String] = js.native
    
    val webkitFlexBasis: js.UndefOr[String] = js.native
    
    val webkitFlexDirection: js.UndefOr[String] = js.native
    
    val webkitFlexFlow: js.UndefOr[String] = js.native
    
    val webkitFlexGrow: js.UndefOr[String] = js.native
    
    val webkitFlexShrink: js.UndefOr[String] = js.native
    
    val webkitFlexWrap: js.UndefOr[String] = js.native
    
    val webkitJustifyContent: js.UndefOr[String] = js.native
    
    val webkitOrder: js.UndefOr[String] = js.native
    
    val webkitPerspective: js.UndefOr[String] = js.native
    
    val webkitPerspectiveOrigin: js.UndefOr[String] = js.native
    
    val webkitTapHighlightColor: js.UndefOr[String] = js.native
    
    val webkitTextFillColor: js.UndefOr[String] = js.native
    
    val webkitTextSizeAdjust: js.UndefOr[String] = js.native
    
    val webkitTransform: js.UndefOr[String] = js.native
    
    val webkitTransformOrigin: js.UndefOr[String] = js.native
    
    val webkitTransformStyle: js.UndefOr[String] = js.native
    
    val webkitTransition: js.UndefOr[String] = js.native
    
    val webkitTransitionDelay: js.UndefOr[String] = js.native
    
    val webkitTransitionDuration: js.UndefOr[String] = js.native
    
    val webkitTransitionProperty: js.UndefOr[String] = js.native
    
    val webkitTransitionTimingFunction: js.UndefOr[String] = js.native
    
    val webkitUserModify: js.UndefOr[String] = js.native
    
    val webkitUserSelect: js.UndefOr[String] = js.native
    
    val webkitWritingMode: js.UndefOr[String] = js.native
    
    val whiteSpace: js.UndefOr[String] = js.native
    
    val widows: js.UndefOr[String] = js.native
    
    val width: js.UndefOr[String] = js.native
    
    val wordBreak: js.UndefOr[String] = js.native
    
    val wordSpacing: js.UndefOr[String] = js.native
    
    val wordWrap: js.UndefOr[String] = js.native
    
    val writingMode: js.UndefOr[String] = js.native
    
    val zIndex: js.UndefOr[String] = js.native
    
    val zoom: js.UndefOr[String] = js.native
  }
  object ElementInlineStyle {
    
    @scala.inline
    def apply(): ElementInlineStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementInlineStyle]
    }
    
    @scala.inline
    implicit class ElementInlineStyleMutableBuilder[Self <: ElementInlineStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignContent(value: String): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: String): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDelay(value: String): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
      
      @scala.inline
      def setAnimationDirection(value: String): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationFillMode(value: String): Self = StObject.set(x, "animationFillMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationFillModeUndefined: Self = StObject.set(x, "animationFillMode", js.undefined)
      
      @scala.inline
      def setAnimationIterationCount(value: String): Self = StObject.set(x, "animationIterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationIterationCountUndefined: Self = StObject.set(x, "animationIterationCount", js.undefined)
      
      @scala.inline
      def setAnimationName(value: String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
      
      @scala.inline
      def setAnimationPlayState(value: String): Self = StObject.set(x, "animationPlayState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationPlayStateUndefined: Self = StObject.set(x, "animationPlayState", js.undefined)
      
      @scala.inline
      def setAnimationTimingFunction(value: String): Self = StObject.set(x, "animationTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBackfaceVisibility(value: String): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundAttachment(value: String): Self = StObject.set(x, "backgroundAttachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundAttachmentUndefined: Self = StObject.set(x, "backgroundAttachment", js.undefined)
      
      @scala.inline
      def setBackgroundClip(value: String): Self = StObject.set(x, "backgroundClip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundClipUndefined: Self = StObject.set(x, "backgroundClip", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      @scala.inline
      def setBackgroundOrigin(value: String): Self = StObject.set(x, "backgroundOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundOriginUndefined: Self = StObject.set(x, "backgroundOrigin", js.undefined)
      
      @scala.inline
      def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      @scala.inline
      def setBackgroundPositionX(value: String): Self = StObject.set(x, "backgroundPositionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPositionXUndefined: Self = StObject.set(x, "backgroundPositionX", js.undefined)
      
      @scala.inline
      def setBackgroundPositionY(value: String): Self = StObject.set(x, "backgroundPositionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPositionYUndefined: Self = StObject.set(x, "backgroundPositionY", js.undefined)
      
      @scala.inline
      def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      @scala.inline
      def setBackgroundSize(value: String): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBaselineShift(value: String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      @scala.inline
      def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      @scala.inline
      def setBorderBottomLeftRadius(value: String): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      @scala.inline
      def setBorderBottomRightRadius(value: String): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      @scala.inline
      def setBorderBottomStyle(value: String): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
      
      @scala.inline
      def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      @scala.inline
      def setBorderBottomWidth(value: String): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      @scala.inline
      def setBorderCollapse(value: String): Self = StObject.set(x, "borderCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderCollapseUndefined: Self = StObject.set(x, "borderCollapse", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderImage(value: String): Self = StObject.set(x, "borderImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageOutset(value: String): Self = StObject.set(x, "borderImageOutset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageOutsetUndefined: Self = StObject.set(x, "borderImageOutset", js.undefined)
      
      @scala.inline
      def setBorderImageRepeat(value: String): Self = StObject.set(x, "borderImageRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageRepeatUndefined: Self = StObject.set(x, "borderImageRepeat", js.undefined)
      
      @scala.inline
      def setBorderImageSlice(value: String): Self = StObject.set(x, "borderImageSlice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageSliceUndefined: Self = StObject.set(x, "borderImageSlice", js.undefined)
      
      @scala.inline
      def setBorderImageSource(value: String): Self = StObject.set(x, "borderImageSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageSourceUndefined: Self = StObject.set(x, "borderImageSource", js.undefined)
      
      @scala.inline
      def setBorderImageUndefined: Self = StObject.set(x, "borderImage", js.undefined)
      
      @scala.inline
      def setBorderImageWidth(value: String): Self = StObject.set(x, "borderImageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageWidthUndefined: Self = StObject.set(x, "borderImageWidth", js.undefined)
      
      @scala.inline
      def setBorderLeft(value: String): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftColor(value: String): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      @scala.inline
      def setBorderLeftStyle(value: String): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
      
      @scala.inline
      def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      @scala.inline
      def setBorderLeftWidth(value: String): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setBorderRight(value: String): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightColor(value: String): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      @scala.inline
      def setBorderRightStyle(value: String): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
      
      @scala.inline
      def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      @scala.inline
      def setBorderRightWidth(value: String): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
      
      @scala.inline
      def setBorderSpacing(value: String): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
      
      @scala.inline
      def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setBorderTop(value: String): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopColor(value: String): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      @scala.inline
      def setBorderTopLeftRadius(value: String): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      @scala.inline
      def setBorderTopRightRadius(value: String): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      @scala.inline
      def setBorderTopStyle(value: String): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
      
      @scala.inline
      def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      @scala.inline
      def setBorderTopWidth(value: String): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      @scala.inline
      def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
      
      @scala.inline
      def setBreakAfter(value: String): Self = StObject.set(x, "breakAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakAfterUndefined: Self = StObject.set(x, "breakAfter", js.undefined)
      
      @scala.inline
      def setBreakBefore(value: String): Self = StObject.set(x, "breakBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakBeforeUndefined: Self = StObject.set(x, "breakBefore", js.undefined)
      
      @scala.inline
      def setBreakInside(value: String): Self = StObject.set(x, "breakInside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakInsideUndefined: Self = StObject.set(x, "breakInside", js.undefined)
      
      @scala.inline
      def setCaptionSide(value: String): Self = StObject.set(x, "captionSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionSideUndefined: Self = StObject.set(x, "captionSide", js.undefined)
      
      @scala.inline
      def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setClip(value: String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      @scala.inline
      def setClipRule(value: String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFilters(value: String): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumnCount(value: String): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      @scala.inline
      def setColumnFill(value: String): Self = StObject.set(x, "columnFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnFillUndefined: Self = StObject.set(x, "columnFill", js.undefined)
      
      @scala.inline
      def setColumnGap(value: String): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setColumnRule(value: String): Self = StObject.set(x, "columnRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnRuleColor(value: String): Self = StObject.set(x, "columnRuleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnRuleColorUndefined: Self = StObject.set(x, "columnRuleColor", js.undefined)
      
      @scala.inline
      def setColumnRuleStyle(value: String): Self = StObject.set(x, "columnRuleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnRuleStyleUndefined: Self = StObject.set(x, "columnRuleStyle", js.undefined)
      
      @scala.inline
      def setColumnRuleUndefined: Self = StObject.set(x, "columnRule", js.undefined)
      
      @scala.inline
      def setColumnRuleWidth(value: String): Self = StObject.set(x, "columnRuleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnRuleWidthUndefined: Self = StObject.set(x, "columnRuleWidth", js.undefined)
      
      @scala.inline
      def setColumnSpan(value: String): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCounterIncrement(value: String): Self = StObject.set(x, "counterIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterIncrementUndefined: Self = StObject.set(x, "counterIncrement", js.undefined)
      
      @scala.inline
      def setCounterReset(value: String): Self = StObject.set(x, "counterReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterResetUndefined: Self = StObject.set(x, "counterReset", js.undefined)
      
      @scala.inline
      def setCssFloat(value: String): Self = StObject.set(x, "cssFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssFloatUndefined: Self = StObject.set(x, "cssFloat", js.undefined)
      
      @scala.inline
      def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssTextUndefined: Self = StObject.set(x, "cssText", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setDominantBaseline(value: String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      @scala.inline
      def setEmptyCells(value: String): Self = StObject.set(x, "emptyCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyCellsUndefined: Self = StObject.set(x, "emptyCells", js.undefined)
      
      @scala.inline
      def setEnableBackground(value: String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexBasis(value: String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      @scala.inline
      def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      @scala.inline
      def setFlexFlow(value: String): Self = StObject.set(x, "flexFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexFlowUndefined: Self = StObject.set(x, "flexFlow", js.undefined)
      
      @scala.inline
      def setFlexGrow(value: String): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      @scala.inline
      def setFlexShrink(value: String): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setFlexWrap(value: String): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      @scala.inline
      def setFloodColor(value: String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      @scala.inline
      def setFloodOpacity(value: String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjust(value: String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setGlyphOrientationHorizontal(value: String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
      
      @scala.inline
      def setGlyphOrientationVertical(value: String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImeMode(value: String): Self = StObject.set(x, "imeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImeModeUndefined: Self = StObject.set(x, "imeMode", js.undefined)
      
      @scala.inline
      def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      @scala.inline
      def setKerning(value: String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLightingColor(value: String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      @scala.inline
      def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setListStyle(value: String): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleImage(value: String): Self = StObject.set(x, "listStyleImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleImageUndefined: Self = StObject.set(x, "listStyleImage", js.undefined)
      
      @scala.inline
      def setListStylePosition(value: String): Self = StObject.set(x, "listStylePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStylePositionUndefined: Self = StObject.set(x, "listStylePosition", js.undefined)
      
      @scala.inline
      def setListStyleType(value: String): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleTypeUndefined: Self = StObject.set(x, "listStyleType", js.undefined)
      
      @scala.inline
      def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      @scala.inline
      def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMsContentZoomChaining(value: String): Self = StObject.set(x, "msContentZoomChaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomChainingUndefined: Self = StObject.set(x, "msContentZoomChaining", js.undefined)
      
      @scala.inline
      def setMsContentZoomLimit(value: String): Self = StObject.set(x, "msContentZoomLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomLimitMax(value: String): Self = StObject.set(x, "msContentZoomLimitMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomLimitMaxUndefined: Self = StObject.set(x, "msContentZoomLimitMax", js.undefined)
      
      @scala.inline
      def setMsContentZoomLimitMin(value: String): Self = StObject.set(x, "msContentZoomLimitMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomLimitMinUndefined: Self = StObject.set(x, "msContentZoomLimitMin", js.undefined)
      
      @scala.inline
      def setMsContentZoomLimitUndefined: Self = StObject.set(x, "msContentZoomLimit", js.undefined)
      
      @scala.inline
      def setMsContentZoomSnap(value: String): Self = StObject.set(x, "msContentZoomSnap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomSnapPoints(value: String): Self = StObject.set(x, "msContentZoomSnapPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomSnapPointsUndefined: Self = StObject.set(x, "msContentZoomSnapPoints", js.undefined)
      
      @scala.inline
      def setMsContentZoomSnapType(value: String): Self = StObject.set(x, "msContentZoomSnapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomSnapTypeUndefined: Self = StObject.set(x, "msContentZoomSnapType", js.undefined)
      
      @scala.inline
      def setMsContentZoomSnapUndefined: Self = StObject.set(x, "msContentZoomSnap", js.undefined)
      
      @scala.inline
      def setMsContentZooming(value: String): Self = StObject.set(x, "msContentZooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomingUndefined: Self = StObject.set(x, "msContentZooming", js.undefined)
      
      @scala.inline
      def setMsFlowFrom(value: String): Self = StObject.set(x, "msFlowFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsFlowFromUndefined: Self = StObject.set(x, "msFlowFrom", js.undefined)
      
      @scala.inline
      def setMsFlowInto(value: String): Self = StObject.set(x, "msFlowInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsFlowIntoUndefined: Self = StObject.set(x, "msFlowInto", js.undefined)
      
      @scala.inline
      def setMsFontFeatureSettings(value: String): Self = StObject.set(x, "msFontFeatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsFontFeatureSettingsUndefined: Self = StObject.set(x, "msFontFeatureSettings", js.undefined)
      
      @scala.inline
      def setMsGridColumn(value: String): Self = StObject.set(x, "msGridColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridColumnAlign(value: String): Self = StObject.set(x, "msGridColumnAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridColumnAlignUndefined: Self = StObject.set(x, "msGridColumnAlign", js.undefined)
      
      @scala.inline
      def setMsGridColumnSpan(value: String): Self = StObject.set(x, "msGridColumnSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridColumnSpanUndefined: Self = StObject.set(x, "msGridColumnSpan", js.undefined)
      
      @scala.inline
      def setMsGridColumnUndefined: Self = StObject.set(x, "msGridColumn", js.undefined)
      
      @scala.inline
      def setMsGridColumns(value: String): Self = StObject.set(x, "msGridColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridColumnsUndefined: Self = StObject.set(x, "msGridColumns", js.undefined)
      
      @scala.inline
      def setMsGridRow(value: String): Self = StObject.set(x, "msGridRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridRowAlign(value: String): Self = StObject.set(x, "msGridRowAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridRowAlignUndefined: Self = StObject.set(x, "msGridRowAlign", js.undefined)
      
      @scala.inline
      def setMsGridRowSpan(value: String): Self = StObject.set(x, "msGridRowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridRowSpanUndefined: Self = StObject.set(x, "msGridRowSpan", js.undefined)
      
      @scala.inline
      def setMsGridRowUndefined: Self = StObject.set(x, "msGridRow", js.undefined)
      
      @scala.inline
      def setMsGridRows(value: String): Self = StObject.set(x, "msGridRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridRowsUndefined: Self = StObject.set(x, "msGridRows", js.undefined)
      
      @scala.inline
      def setMsHighContrastAdjust(value: String): Self = StObject.set(x, "msHighContrastAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHighContrastAdjustUndefined: Self = StObject.set(x, "msHighContrastAdjust", js.undefined)
      
      @scala.inline
      def setMsHyphenateLimitChars(value: String): Self = StObject.set(x, "msHyphenateLimitChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHyphenateLimitCharsUndefined: Self = StObject.set(x, "msHyphenateLimitChars", js.undefined)
      
      @scala.inline
      def setMsHyphenateLimitLines(value: String): Self = StObject.set(x, "msHyphenateLimitLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHyphenateLimitLinesUndefined: Self = StObject.set(x, "msHyphenateLimitLines", js.undefined)
      
      @scala.inline
      def setMsHyphenateLimitZone(value: String): Self = StObject.set(x, "msHyphenateLimitZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHyphenateLimitZoneUndefined: Self = StObject.set(x, "msHyphenateLimitZone", js.undefined)
      
      @scala.inline
      def setMsHyphens(value: String): Self = StObject.set(x, "msHyphens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHyphensUndefined: Self = StObject.set(x, "msHyphens", js.undefined)
      
      @scala.inline
      def setMsImeAlign(value: String): Self = StObject.set(x, "msImeAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsImeAlignUndefined: Self = StObject.set(x, "msImeAlign", js.undefined)
      
      @scala.inline
      def setMsOverflowStyle(value: String): Self = StObject.set(x, "msOverflowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsOverflowStyleUndefined: Self = StObject.set(x, "msOverflowStyle", js.undefined)
      
      @scala.inline
      def setMsScrollChaining(value: String): Self = StObject.set(x, "msScrollChaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollChainingUndefined: Self = StObject.set(x, "msScrollChaining", js.undefined)
      
      @scala.inline
      def setMsScrollLimit(value: String): Self = StObject.set(x, "msScrollLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitUndefined: Self = StObject.set(x, "msScrollLimit", js.undefined)
      
      @scala.inline
      def setMsScrollLimitXMax(value: String): Self = StObject.set(x, "msScrollLimitXMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitXMaxUndefined: Self = StObject.set(x, "msScrollLimitXMax", js.undefined)
      
      @scala.inline
      def setMsScrollLimitXMin(value: String): Self = StObject.set(x, "msScrollLimitXMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitXMinUndefined: Self = StObject.set(x, "msScrollLimitXMin", js.undefined)
      
      @scala.inline
      def setMsScrollLimitYMax(value: String): Self = StObject.set(x, "msScrollLimitYMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitYMaxUndefined: Self = StObject.set(x, "msScrollLimitYMax", js.undefined)
      
      @scala.inline
      def setMsScrollLimitYMin(value: String): Self = StObject.set(x, "msScrollLimitYMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitYMinUndefined: Self = StObject.set(x, "msScrollLimitYMin", js.undefined)
      
      @scala.inline
      def setMsScrollRails(value: String): Self = StObject.set(x, "msScrollRails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollRailsUndefined: Self = StObject.set(x, "msScrollRails", js.undefined)
      
      @scala.inline
      def setMsScrollSnapPointsX(value: String): Self = StObject.set(x, "msScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapPointsXUndefined: Self = StObject.set(x, "msScrollSnapPointsX", js.undefined)
      
      @scala.inline
      def setMsScrollSnapPointsY(value: String): Self = StObject.set(x, "msScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapPointsYUndefined: Self = StObject.set(x, "msScrollSnapPointsY", js.undefined)
      
      @scala.inline
      def setMsScrollSnapType(value: String): Self = StObject.set(x, "msScrollSnapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapTypeUndefined: Self = StObject.set(x, "msScrollSnapType", js.undefined)
      
      @scala.inline
      def setMsScrollSnapX(value: String): Self = StObject.set(x, "msScrollSnapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapXUndefined: Self = StObject.set(x, "msScrollSnapX", js.undefined)
      
      @scala.inline
      def setMsScrollSnapY(value: String): Self = StObject.set(x, "msScrollSnapY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapYUndefined: Self = StObject.set(x, "msScrollSnapY", js.undefined)
      
      @scala.inline
      def setMsScrollTranslation(value: String): Self = StObject.set(x, "msScrollTranslation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollTranslationUndefined: Self = StObject.set(x, "msScrollTranslation", js.undefined)
      
      @scala.inline
      def setMsTextCombineHorizontal(value: String): Self = StObject.set(x, "msTextCombineHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTextCombineHorizontalUndefined: Self = StObject.set(x, "msTextCombineHorizontal", js.undefined)
      
      @scala.inline
      def setMsTextSizeAdjust(value: String): Self = StObject.set(x, "msTextSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTextSizeAdjustUndefined: Self = StObject.set(x, "msTextSizeAdjust", js.undefined)
      
      @scala.inline
      def setMsTouchAction(value: String): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTouchActionUndefined: Self = StObject.set(x, "msTouchAction", js.undefined)
      
      @scala.inline
      def setMsTouchSelect(value: String): Self = StObject.set(x, "msTouchSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTouchSelectUndefined: Self = StObject.set(x, "msTouchSelect", js.undefined)
      
      @scala.inline
      def setMsUserSelect(value: String): Self = StObject.set(x, "msUserSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsUserSelectUndefined: Self = StObject.set(x, "msUserSelect", js.undefined)
      
      @scala.inline
      def setMsWrapFlow(value: String): Self = StObject.set(x, "msWrapFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsWrapFlowUndefined: Self = StObject.set(x, "msWrapFlow", js.undefined)
      
      @scala.inline
      def setMsWrapMargin(value: String): Self = StObject.set(x, "msWrapMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsWrapMarginUndefined: Self = StObject.set(x, "msWrapMargin", js.undefined)
      
      @scala.inline
      def setMsWrapThrough(value: String): Self = StObject.set(x, "msWrapThrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsWrapThroughUndefined: Self = StObject.set(x, "msWrapThrough", js.undefined)
      
      @scala.inline
      def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrphans(value: String): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
      
      @scala.inline
      def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      @scala.inline
      def setOutlineStyle(value: String): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
      
      @scala.inline
      def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      @scala.inline
      def setOutlineWidth(value: String): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      @scala.inline
      def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverflowX(value: String): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      @scala.inline
      def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottom(value: String): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingLeft(value: String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingRight(value: String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingTop(value: String): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPageBreakAfter(value: String): Self = StObject.set(x, "pageBreakAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakAfterUndefined: Self = StObject.set(x, "pageBreakAfter", js.undefined)
      
      @scala.inline
      def setPageBreakBefore(value: String): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
      
      @scala.inline
      def setPageBreakInside(value: String): Self = StObject.set(x, "pageBreakInside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakInsideUndefined: Self = StObject.set(x, "pageBreakInside", js.undefined)
      
      @scala.inline
      def setPerspective(value: String): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerspectiveOrigin(value: String): Self = StObject.set(x, "perspectiveOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerspectiveOriginUndefined: Self = StObject.set(x, "perspectiveOrigin", js.undefined)
      
      @scala.inline
      def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      @scala.inline
      def setResize(value: String): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setRubyAlign(value: String): Self = StObject.set(x, "rubyAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRubyAlignUndefined: Self = StObject.set(x, "rubyAlign", js.undefined)
      
      @scala.inline
      def setRubyOverhang(value: String): Self = StObject.set(x, "rubyOverhang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRubyOverhangUndefined: Self = StObject.set(x, "rubyOverhang", js.undefined)
      
      @scala.inline
      def setRubyPosition(value: String): Self = StObject.set(x, "rubyPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRubyPositionUndefined: Self = StObject.set(x, "rubyPosition", js.undefined)
      
      @scala.inline
      def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      @scala.inline
      def setStopOpacity(value: String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: String): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDashoffset(value: String): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: String): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinejoin(value: String): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimit(value: String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setTableLayout(value: String): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignLast(value: String): Self = StObject.set(x, "textAlignLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignLastUndefined: Self = StObject.set(x, "textAlignLast", js.undefined)
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextIndent(value: String): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextIndentUndefined: Self = StObject.set(x, "textIndent", js.undefined)
      
      @scala.inline
      def setTextJustify(value: String): Self = StObject.set(x, "textJustify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextJustifyUndefined: Self = StObject.set(x, "textJustify", js.undefined)
      
      @scala.inline
      def setTextKashida(value: String): Self = StObject.set(x, "textKashida", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextKashidaSpace(value: String): Self = StObject.set(x, "textKashidaSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextKashidaSpaceUndefined: Self = StObject.set(x, "textKashidaSpace", js.undefined)
      
      @scala.inline
      def setTextKashidaUndefined: Self = StObject.set(x, "textKashida", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      @scala.inline
      def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      @scala.inline
      def setTextUnderlinePosition(value: String): Self = StObject.set(x, "textUnderlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUnderlinePositionUndefined: Self = StObject.set(x, "textUnderlinePosition", js.undefined)
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      @scala.inline
      def setTransformStyle(value: String): Self = StObject.set(x, "transformStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformStyleUndefined: Self = StObject.set(x, "transformStyle", js.undefined)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDelay(value: String): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setTransitionProperty(value: String): Self = StObject.set(x, "transitionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionPropertyUndefined: Self = StObject.set(x, "transitionProperty", js.undefined)
      
      @scala.inline
      def setTransitionTimingFunction(value: String): Self = StObject.set(x, "transitionTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionTimingFunctionUndefined: Self = StObject.set(x, "transitionTimingFunction", js.undefined)
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setUnicodeBidi(value: String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWebkitAlignContent(value: String): Self = StObject.set(x, "webkitAlignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAlignContentUndefined: Self = StObject.set(x, "webkitAlignContent", js.undefined)
      
      @scala.inline
      def setWebkitAlignItems(value: String): Self = StObject.set(x, "webkitAlignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAlignItemsUndefined: Self = StObject.set(x, "webkitAlignItems", js.undefined)
      
      @scala.inline
      def setWebkitAlignSelf(value: String): Self = StObject.set(x, "webkitAlignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAlignSelfUndefined: Self = StObject.set(x, "webkitAlignSelf", js.undefined)
      
      @scala.inline
      def setWebkitAnimation(value: String): Self = StObject.set(x, "webkitAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationDelay(value: String): Self = StObject.set(x, "webkitAnimationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationDelayUndefined: Self = StObject.set(x, "webkitAnimationDelay", js.undefined)
      
      @scala.inline
      def setWebkitAnimationDirection(value: String): Self = StObject.set(x, "webkitAnimationDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationDirectionUndefined: Self = StObject.set(x, "webkitAnimationDirection", js.undefined)
      
      @scala.inline
      def setWebkitAnimationDuration(value: String): Self = StObject.set(x, "webkitAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationDurationUndefined: Self = StObject.set(x, "webkitAnimationDuration", js.undefined)
      
      @scala.inline
      def setWebkitAnimationFillMode(value: String): Self = StObject.set(x, "webkitAnimationFillMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationFillModeUndefined: Self = StObject.set(x, "webkitAnimationFillMode", js.undefined)
      
      @scala.inline
      def setWebkitAnimationIterationCount(value: String): Self = StObject.set(x, "webkitAnimationIterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationIterationCountUndefined: Self = StObject.set(x, "webkitAnimationIterationCount", js.undefined)
      
      @scala.inline
      def setWebkitAnimationName(value: String): Self = StObject.set(x, "webkitAnimationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationNameUndefined: Self = StObject.set(x, "webkitAnimationName", js.undefined)
      
      @scala.inline
      def setWebkitAnimationPlayState(value: String): Self = StObject.set(x, "webkitAnimationPlayState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationPlayStateUndefined: Self = StObject.set(x, "webkitAnimationPlayState", js.undefined)
      
      @scala.inline
      def setWebkitAnimationTimingFunction(value: String): Self = StObject.set(x, "webkitAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationTimingFunctionUndefined: Self = StObject.set(x, "webkitAnimationTimingFunction", js.undefined)
      
      @scala.inline
      def setWebkitAnimationUndefined: Self = StObject.set(x, "webkitAnimation", js.undefined)
      
      @scala.inline
      def setWebkitAppearance(value: String): Self = StObject.set(x, "webkitAppearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAppearanceUndefined: Self = StObject.set(x, "webkitAppearance", js.undefined)
      
      @scala.inline
      def setWebkitBackfaceVisibility(value: String): Self = StObject.set(x, "webkitBackfaceVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBackfaceVisibilityUndefined: Self = StObject.set(x, "webkitBackfaceVisibility", js.undefined)
      
      @scala.inline
      def setWebkitBackgroundClip(value: String): Self = StObject.set(x, "webkitBackgroundClip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBackgroundClipUndefined: Self = StObject.set(x, "webkitBackgroundClip", js.undefined)
      
      @scala.inline
      def setWebkitBackgroundOrigin(value: String): Self = StObject.set(x, "webkitBackgroundOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBackgroundOriginUndefined: Self = StObject.set(x, "webkitBackgroundOrigin", js.undefined)
      
      @scala.inline
      def setWebkitBackgroundSize(value: String): Self = StObject.set(x, "webkitBackgroundSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBackgroundSizeUndefined: Self = StObject.set(x, "webkitBackgroundSize", js.undefined)
      
      @scala.inline
      def setWebkitBorderBottomLeftRadius(value: String): Self = StObject.set(x, "webkitBorderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "webkitBorderBottomLeftRadius", js.undefined)
      
      @scala.inline
      def setWebkitBorderBottomRightRadius(value: String): Self = StObject.set(x, "webkitBorderBottomRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderBottomRightRadiusUndefined: Self = StObject.set(x, "webkitBorderBottomRightRadius", js.undefined)
      
      @scala.inline
      def setWebkitBorderImage(value: String): Self = StObject.set(x, "webkitBorderImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderImageUndefined: Self = StObject.set(x, "webkitBorderImage", js.undefined)
      
      @scala.inline
      def setWebkitBorderRadius(value: String): Self = StObject.set(x, "webkitBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "webkitBorderRadius", js.undefined)
      
      @scala.inline
      def setWebkitBorderTopLeftRadius(value: String): Self = StObject.set(x, "webkitBorderTopLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderTopLeftRadiusUndefined: Self = StObject.set(x, "webkitBorderTopLeftRadius", js.undefined)
      
      @scala.inline
      def setWebkitBorderTopRightRadius(value: String): Self = StObject.set(x, "webkitBorderTopRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderTopRightRadiusUndefined: Self = StObject.set(x, "webkitBorderTopRightRadius", js.undefined)
      
      @scala.inline
      def setWebkitBoxAlign(value: String): Self = StObject.set(x, "webkitBoxAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxAlignUndefined: Self = StObject.set(x, "webkitBoxAlign", js.undefined)
      
      @scala.inline
      def setWebkitBoxDirection(value: String): Self = StObject.set(x, "webkitBoxDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxDirectionUndefined: Self = StObject.set(x, "webkitBoxDirection", js.undefined)
      
      @scala.inline
      def setWebkitBoxFlex(value: String): Self = StObject.set(x, "webkitBoxFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxFlexUndefined: Self = StObject.set(x, "webkitBoxFlex", js.undefined)
      
      @scala.inline
      def setWebkitBoxOrdinalGroup(value: String): Self = StObject.set(x, "webkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxOrdinalGroupUndefined: Self = StObject.set(x, "webkitBoxOrdinalGroup", js.undefined)
      
      @scala.inline
      def setWebkitBoxOrient(value: String): Self = StObject.set(x, "webkitBoxOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxOrientUndefined: Self = StObject.set(x, "webkitBoxOrient", js.undefined)
      
      @scala.inline
      def setWebkitBoxPack(value: String): Self = StObject.set(x, "webkitBoxPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxPackUndefined: Self = StObject.set(x, "webkitBoxPack", js.undefined)
      
      @scala.inline
      def setWebkitBoxSizing(value: String): Self = StObject.set(x, "webkitBoxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxSizingUndefined: Self = StObject.set(x, "webkitBoxSizing", js.undefined)
      
      @scala.inline
      def setWebkitColumnBreakAfter(value: String): Self = StObject.set(x, "webkitColumnBreakAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnBreakAfterUndefined: Self = StObject.set(x, "webkitColumnBreakAfter", js.undefined)
      
      @scala.inline
      def setWebkitColumnBreakBefore(value: String): Self = StObject.set(x, "webkitColumnBreakBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnBreakBeforeUndefined: Self = StObject.set(x, "webkitColumnBreakBefore", js.undefined)
      
      @scala.inline
      def setWebkitColumnBreakInside(value: String): Self = StObject.set(x, "webkitColumnBreakInside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnBreakInsideUndefined: Self = StObject.set(x, "webkitColumnBreakInside", js.undefined)
      
      @scala.inline
      def setWebkitColumnCount(value: String): Self = StObject.set(x, "webkitColumnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnCountUndefined: Self = StObject.set(x, "webkitColumnCount", js.undefined)
      
      @scala.inline
      def setWebkitColumnGap(value: String): Self = StObject.set(x, "webkitColumnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnGapUndefined: Self = StObject.set(x, "webkitColumnGap", js.undefined)
      
      @scala.inline
      def setWebkitColumnRule(value: String): Self = StObject.set(x, "webkitColumnRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnRuleColor(value: String): Self = StObject.set(x, "webkitColumnRuleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnRuleColorUndefined: Self = StObject.set(x, "webkitColumnRuleColor", js.undefined)
      
      @scala.inline
      def setWebkitColumnRuleStyle(value: String): Self = StObject.set(x, "webkitColumnRuleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnRuleStyleUndefined: Self = StObject.set(x, "webkitColumnRuleStyle", js.undefined)
      
      @scala.inline
      def setWebkitColumnRuleUndefined: Self = StObject.set(x, "webkitColumnRule", js.undefined)
      
      @scala.inline
      def setWebkitColumnRuleWidth(value: String): Self = StObject.set(x, "webkitColumnRuleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnRuleWidthUndefined: Self = StObject.set(x, "webkitColumnRuleWidth", js.undefined)
      
      @scala.inline
      def setWebkitColumnSpan(value: String): Self = StObject.set(x, "webkitColumnSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnSpanUndefined: Self = StObject.set(x, "webkitColumnSpan", js.undefined)
      
      @scala.inline
      def setWebkitColumnWidth(value: String): Self = StObject.set(x, "webkitColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnWidthUndefined: Self = StObject.set(x, "webkitColumnWidth", js.undefined)
      
      @scala.inline
      def setWebkitColumns(value: String): Self = StObject.set(x, "webkitColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnsUndefined: Self = StObject.set(x, "webkitColumns", js.undefined)
      
      @scala.inline
      def setWebkitFilter(value: String): Self = StObject.set(x, "webkitFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFilterUndefined: Self = StObject.set(x, "webkitFilter", js.undefined)
      
      @scala.inline
      def setWebkitFlex(value: String): Self = StObject.set(x, "webkitFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexBasis(value: String): Self = StObject.set(x, "webkitFlexBasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexBasisUndefined: Self = StObject.set(x, "webkitFlexBasis", js.undefined)
      
      @scala.inline
      def setWebkitFlexDirection(value: String): Self = StObject.set(x, "webkitFlexDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexDirectionUndefined: Self = StObject.set(x, "webkitFlexDirection", js.undefined)
      
      @scala.inline
      def setWebkitFlexFlow(value: String): Self = StObject.set(x, "webkitFlexFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexFlowUndefined: Self = StObject.set(x, "webkitFlexFlow", js.undefined)
      
      @scala.inline
      def setWebkitFlexGrow(value: String): Self = StObject.set(x, "webkitFlexGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexGrowUndefined: Self = StObject.set(x, "webkitFlexGrow", js.undefined)
      
      @scala.inline
      def setWebkitFlexShrink(value: String): Self = StObject.set(x, "webkitFlexShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexShrinkUndefined: Self = StObject.set(x, "webkitFlexShrink", js.undefined)
      
      @scala.inline
      def setWebkitFlexUndefined: Self = StObject.set(x, "webkitFlex", js.undefined)
      
      @scala.inline
      def setWebkitFlexWrap(value: String): Self = StObject.set(x, "webkitFlexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexWrapUndefined: Self = StObject.set(x, "webkitFlexWrap", js.undefined)
      
      @scala.inline
      def setWebkitJustifyContent(value: String): Self = StObject.set(x, "webkitJustifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitJustifyContentUndefined: Self = StObject.set(x, "webkitJustifyContent", js.undefined)
      
      @scala.inline
      def setWebkitOrder(value: String): Self = StObject.set(x, "webkitOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitOrderUndefined: Self = StObject.set(x, "webkitOrder", js.undefined)
      
      @scala.inline
      def setWebkitPerspective(value: String): Self = StObject.set(x, "webkitPerspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitPerspectiveOrigin(value: String): Self = StObject.set(x, "webkitPerspectiveOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitPerspectiveOriginUndefined: Self = StObject.set(x, "webkitPerspectiveOrigin", js.undefined)
      
      @scala.inline
      def setWebkitPerspectiveUndefined: Self = StObject.set(x, "webkitPerspective", js.undefined)
      
      @scala.inline
      def setWebkitTapHighlightColor(value: String): Self = StObject.set(x, "webkitTapHighlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTapHighlightColorUndefined: Self = StObject.set(x, "webkitTapHighlightColor", js.undefined)
      
      @scala.inline
      def setWebkitTextFillColor(value: String): Self = StObject.set(x, "webkitTextFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextFillColorUndefined: Self = StObject.set(x, "webkitTextFillColor", js.undefined)
      
      @scala.inline
      def setWebkitTextSizeAdjust(value: String): Self = StObject.set(x, "webkitTextSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextSizeAdjustUndefined: Self = StObject.set(x, "webkitTextSizeAdjust", js.undefined)
      
      @scala.inline
      def setWebkitTransform(value: String): Self = StObject.set(x, "webkitTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransformOrigin(value: String): Self = StObject.set(x, "webkitTransformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransformOriginUndefined: Self = StObject.set(x, "webkitTransformOrigin", js.undefined)
      
      @scala.inline
      def setWebkitTransformStyle(value: String): Self = StObject.set(x, "webkitTransformStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransformStyleUndefined: Self = StObject.set(x, "webkitTransformStyle", js.undefined)
      
      @scala.inline
      def setWebkitTransformUndefined: Self = StObject.set(x, "webkitTransform", js.undefined)
      
      @scala.inline
      def setWebkitTransition(value: String): Self = StObject.set(x, "webkitTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionDelay(value: String): Self = StObject.set(x, "webkitTransitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionDelayUndefined: Self = StObject.set(x, "webkitTransitionDelay", js.undefined)
      
      @scala.inline
      def setWebkitTransitionDuration(value: String): Self = StObject.set(x, "webkitTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionDurationUndefined: Self = StObject.set(x, "webkitTransitionDuration", js.undefined)
      
      @scala.inline
      def setWebkitTransitionProperty(value: String): Self = StObject.set(x, "webkitTransitionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionPropertyUndefined: Self = StObject.set(x, "webkitTransitionProperty", js.undefined)
      
      @scala.inline
      def setWebkitTransitionTimingFunction(value: String): Self = StObject.set(x, "webkitTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionTimingFunctionUndefined: Self = StObject.set(x, "webkitTransitionTimingFunction", js.undefined)
      
      @scala.inline
      def setWebkitTransitionUndefined: Self = StObject.set(x, "webkitTransition", js.undefined)
      
      @scala.inline
      def setWebkitUserModify(value: String): Self = StObject.set(x, "webkitUserModify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitUserModifyUndefined: Self = StObject.set(x, "webkitUserModify", js.undefined)
      
      @scala.inline
      def setWebkitUserSelect(value: String): Self = StObject.set(x, "webkitUserSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitUserSelectUndefined: Self = StObject.set(x, "webkitUserSelect", js.undefined)
      
      @scala.inline
      def setWebkitWritingMode(value: String): Self = StObject.set(x, "webkitWritingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitWritingModeUndefined: Self = StObject.set(x, "webkitWritingMode", js.undefined)
      
      @scala.inline
      def setWhiteSpace(value: String): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
      
      @scala.inline
      def setWidows(value: String): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWordBreak(value: String): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
      
      @scala.inline
      def setWordSpacing(value: String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      @scala.inline
      def setWordWrap(value: String): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      @scala.inline
      def setWritingMode(value: String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      @scala.inline
      def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait ElementSpecialAttrs extends StObject {
    
    /**
      * The JS-safe name for the HTML `class` attribute.
      */
    val className: js.UndefOr[String] = js.native
    
    /**
      * The dataset for the rendered DOM element.
      */
    val dataset: js.UndefOr[ElementDataset] = js.native
    
    /**
      * The JS-safe name for the HTML `for` attribute.
      */
    val htmlFor: js.UndefOr[String] = js.native
    
    /**
      * The key id for the virtual element node.
      *
      * If a node is given a key id, the generated DOM node will not be
      * recreated during a rendering update if it only moves among its
      * siblings in the render tree.
      *
      * In general, reordering child nodes will cause the nodes to be
      * completely re-rendered. Keys allow this to be optimized away.
      *
      * If a key is provided, it must be unique among sibling nodes.
      */
    val key: js.UndefOr[String] = js.native
    
    /**
      * The inline style for the rendered DOM element.
      */
    val style: js.UndefOr[ElementInlineStyle] = js.native
  }
  object ElementSpecialAttrs {
    
    @scala.inline
    def apply(): ElementSpecialAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementSpecialAttrs]
    }
    
    @scala.inline
    implicit class ElementSpecialAttrsMutableBuilder[Self <: ElementSpecialAttrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataset(value: ElementDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setStyle(value: ElementInlineStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoVirtualdom.mod.VirtualElement
    - typingsSlinky.luminoVirtualdom.mod.VirtualText
  */
  trait VirtualNode extends StObject
}
