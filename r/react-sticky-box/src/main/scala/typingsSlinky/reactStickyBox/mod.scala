package typingsSlinky.reactStickyBox

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-sticky-box", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[StickyBoxProps, js.Object, js.Any] {
    def this(props: StickyBoxProps) = this()
    def this(props: StickyBoxProps, context: js.Any) = this()
  }
  @JSImport("react-sticky-box", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StickyBoxProps] = js.native
  
  @js.native
  trait StickyBoxInstance extends StObject {
    
    var latestScrollY: Double = js.native
    
    var mode: StickyBoxMode = js.native
    
    var naturalTop: Double = js.native
    
    var node: HTMLElement = js.native
    
    var nodeHeight: Double = js.native
    
    var offset: Double = js.native
    
    var parentHeight: Double = js.native
    
    var scrollPane: HTMLElement | Window = js.native
    
    var viewportHeight: Double = js.native
  }
  object StickyBoxInstance {
    
    @scala.inline
    def apply(
      latestScrollY: Double,
      mode: StickyBoxMode,
      naturalTop: Double,
      node: HTMLElement,
      nodeHeight: Double,
      offset: Double,
      parentHeight: Double,
      scrollPane: HTMLElement | Window,
      viewportHeight: Double
    ): StickyBoxInstance = {
      val __obj = js.Dynamic.literal(latestScrollY = latestScrollY.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], naturalTop = naturalTop.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeHeight = nodeHeight.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentHeight = parentHeight.asInstanceOf[js.Any], scrollPane = scrollPane.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyBoxInstance]
    }
    
    @scala.inline
    implicit class StickyBoxInstanceMutableBuilder[Self <: StickyBoxInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatestScrollY(value: Double): Self = StObject.set(x, "latestScrollY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: StickyBoxMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaturalTop(value: Double): Self = StObject.set(x, "naturalTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeHeight(value: Double): Self = StObject.set(x, "nodeHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentHeight(value: Double): Self = StObject.set(x, "parentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPane(value: HTMLElement | Window): Self = StObject.set(x, "scrollPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaneHTMLElement(value: HTMLElement): Self = StObject.set(x, "scrollPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaneWindow(value: Window): Self = StObject.set(x, "scrollPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactStickyBox.reactStickyBoxStrings.relative
    - typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyBottom
    - typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyTop
  */
  trait StickyBoxMode extends StObject
  object StickyBoxMode {
    
    @scala.inline
    def relative: typingsSlinky.reactStickyBox.reactStickyBoxStrings.relative = "relative".asInstanceOf[typingsSlinky.reactStickyBox.reactStickyBoxStrings.relative]
    
    @scala.inline
    def stickyBottom: typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyBottom = "stickyBottom".asInstanceOf[typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyBottom]
    
    @scala.inline
    def stickyTop: typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyTop = "stickyTop".asInstanceOf[typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyTop]
  }
  
  @js.native
  trait StickyBoxProps extends StObject {
    
    var bottom: js.UndefOr[Boolean] = js.native
    
    var children: ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var offsetBottom: js.UndefOr[Double] = js.native
    
    var offsetTop: js.UndefOr[Double] = js.native
    
    var onChangeMode: js.UndefOr[
        js.Function2[/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode, _]
      ] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object StickyBoxProps {
    
    @scala.inline
    def apply(): StickyBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyBoxProps]
    }
    
    @scala.inline
    implicit class StickyBoxPropsMutableBuilder[Self <: StickyBoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      @scala.inline
      def setOnChangeMode(value: (/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode) => _): Self = StObject.set(x, "onChangeMode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeModeUndefined: Self = StObject.set(x, "onChangeMode", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StickyBoxProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[StickyBoxProps] = default
}
