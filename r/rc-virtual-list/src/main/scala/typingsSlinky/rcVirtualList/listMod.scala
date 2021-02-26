package typingsSlinky.rcVirtualList

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticUIEvent
import typingsSlinky.rcVirtualList.anon.Children
import typingsSlinky.rcVirtualList.anon.Style
import typingsSlinky.rcVirtualList.interfaceMod.RenderFunc
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.UIEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("rc-virtual-list/es/List", JSImport.Default)
  @js.native
  def default[Item](props: Children with ListProps[Item]): ReactElement = js.native
  
  @JSImport("rc-virtual-list/es/List", "RawList")
  @js.native
  def RawList[T](props: ListProps[T], ref: Ref[ListRef]): ReactElement = js.native
  
  @js.native
  trait ListProps[T]
    extends HTMLAttributes[js.Any] {
    
    @JSName("children")
    var children_ListProps: RenderFunc[T] = js.native
    
    var component: js.UndefOr[String | ReactComponentClass[_]] = js.native
    
    var data: js.Array[T] = js.native
    
    /** If not match virtual scroll condition, Set List still use height of container. */
    var fullHeight: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var itemHeight: js.UndefOr[Double] = js.native
    
    var itemKey: Key | (js.Function1[/* item */ T, Key]) = js.native
    
    @JSName("onScroll")
    var onScroll_ListProps: js.UndefOr[UIEventHandler[HTMLElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    /** Set `false` will always use real scroll instead of virtual one */
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply[T](
      children: (T, /* index */ Double, /* props */ Style) => ReactElement,
      data: js.Array[T],
      itemKey: Key | (js.Function1[/* item */ T, Key])
    ): ListProps[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), data = data.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProps[T]]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps[_], T] (val x: Self with ListProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (T, /* index */ Double, /* props */ Style) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setComponent(value: String | ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFullHeight(value: Boolean): Self = StObject.set(x, "fullHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullHeightUndefined: Self = StObject.set(x, "fullHeight", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setItemKey(value: Key | (js.Function1[/* item */ T, Key])): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemKeyFunction1(value: /* item */ T => Key): Self = StObject.set(x, "itemKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  @js.native
  trait ListRef extends StObject {
    
    var scrollTo: ScrollTo = js.native
  }
  object ListRef {
    
    @scala.inline
    def apply(scrollTo: /* arg */ Double | ScrollConfig => Unit): ListRef = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[ListRef]
    }
    
    @scala.inline
    implicit class ListRefMutableBuilder[Self <: ListRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollTo(value: /* arg */ Double | ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcVirtualList.rcVirtualListStrings.top
    - typingsSlinky.rcVirtualList.rcVirtualListStrings.bottom
    - typingsSlinky.rcVirtualList.rcVirtualListStrings.auto
  */
  trait ScrollAlign extends StObject
  object ScrollAlign {
    
    @scala.inline
    def auto: typingsSlinky.rcVirtualList.rcVirtualListStrings.auto = "auto".asInstanceOf[typingsSlinky.rcVirtualList.rcVirtualListStrings.auto]
    
    @scala.inline
    def bottom: typingsSlinky.rcVirtualList.rcVirtualListStrings.bottom = "bottom".asInstanceOf[typingsSlinky.rcVirtualList.rcVirtualListStrings.bottom]
    
    @scala.inline
    def top: typingsSlinky.rcVirtualList.rcVirtualListStrings.top = "top".asInstanceOf[typingsSlinky.rcVirtualList.rcVirtualListStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcVirtualList.anon.Align
    - typingsSlinky.rcVirtualList.anon.Key
  */
  trait ScrollConfig extends StObject
  object ScrollConfig {
    
    @scala.inline
    def Align(index: Double): typingsSlinky.rcVirtualList.anon.Align = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.rcVirtualList.anon.Align]
    }
    
    @scala.inline
    def Key(key: typingsSlinky.react.mod.Key): typingsSlinky.rcVirtualList.anon.Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.rcVirtualList.anon.Key]
    }
  }
  
  type ScrollTo = js.Function1[/* arg */ Double | ScrollConfig, Unit]
}
