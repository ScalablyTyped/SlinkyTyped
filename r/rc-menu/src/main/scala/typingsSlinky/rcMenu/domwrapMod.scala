package typingsSlinky.rcMenu

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domwrapMod {
  
  @JSImport("rc-menu/es/DOMWrap", JSImport.Default)
  @js.native
  class default () extends DOMWrap
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-menu/es/DOMWrap", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-menu/es/DOMWrap", "default.defaultProps.className")
      @js.native
      def className: String = js.native
      @scala.inline
      def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu/es/DOMWrap", "default.defaultProps.tag")
      @js.native
      def tag: String = js.native
      @scala.inline
      def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DOMWrap
    extends Component[DOMWrapProps, DOMWrapState, js.Any] {
    
    var cancelFrameId: Double = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDOMWrap(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDOMWrap(): Unit = js.native
    
    def getMenuItemNodes(): js.Array[HTMLElement] = js.native
    
    def getOverflowedSubMenuItem(keyPrefix: String, overflowedItems: js.Array[ReactElement]): ReactElement = js.native
    def getOverflowedSubMenuItem(keyPrefix: String, overflowedItems: js.Array[ReactElement], renderPlaceholder: Boolean): ReactElement = js.native
    
    def handleResize(): Unit = js.native
    
    var menuItemSizes: js.Array[Double] = js.native
    
    var mutationObserver: js.Any = js.native
    
    var originalTotalWidth: Double = js.native
    
    var overflowedIndicatorWidth: Double = js.native
    
    var overflowedItems: js.Array[ReactElement] = js.native
    
    def renderChildren(children: js.Array[ReactElement]): js.Array[ReactElement] = js.native
    
    var resizeObserver: js.Any = js.native
    
    def setChildrenWidthAndResize(): Unit = js.native
  }
  
  @js.native
  trait DOMWrapProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var level: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[MenuMode] = js.native
    
    var overflowedIndicator: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var theme: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object DOMWrapProps {
    
    @scala.inline
    def apply(): DOMWrapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMWrapProps]
    }
    
    @scala.inline
    implicit class DOMWrapPropsMutableBuilder[Self <: DOMWrapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOverflowedIndicator(value: ReactElement): Self = StObject.set(x, "overflowedIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowedIndicatorReactElement(value: ReactElement): Self = StObject.set(x, "overflowedIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowedIndicatorUndefined: Self = StObject.set(x, "overflowedIndicator", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait DOMWrapState extends StObject {
    
    var lastVisibleIndex: Double = js.native
  }
  object DOMWrapState {
    
    @scala.inline
    def apply(lastVisibleIndex: Double): DOMWrapState = {
      val __obj = js.Dynamic.literal(lastVisibleIndex = lastVisibleIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMWrapState]
    }
    
    @scala.inline
    implicit class DOMWrapStateMutableBuilder[Self <: DOMWrapState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastVisibleIndex(value: Double): Self = StObject.set(x, "lastVisibleIndex", value.asInstanceOf[js.Any])
    }
  }
}
