package typingsSlinky.antdMobile

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.tabBarPropsTypeMod.TabBarItemProps
import typingsSlinky.antdMobile.tabBarPropsTypeMod.TabBarProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarMod {
  
  @JSImport("antd-mobile/lib/tab-bar", JSImport.Default)
  @js.native
  class default () extends AntTabBar
  object default {
    
    @JSImport("antd-mobile/lib/tab-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd-mobile/lib/tab-bar", "default.Item")
    @js.native
    class Item ()
      extends typingsSlinky.antdMobile.tabBarMod.Item
    /* static member */
    /* was `typeof Item` */
    object Item {
      
      @JSImport("antd-mobile/lib/tab-bar", "default.Item")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile/lib/tab-bar", "default.Item.defaultProps")
      @js.native
      def defaultProps: TabBarItemProps = js.native
      @scala.inline
      def defaultProps_=(x: TabBarItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("antd-mobile/lib/tab-bar", "default.defaultProps")
    @js.native
    def defaultProps: AntTabbarProps = js.native
    @scala.inline
    def defaultProps_=(x: AntTabbarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd-mobile/lib/tab-bar", "Item")
  @js.native
  class Item protected ()
    extends Component[TabBarItemProps, js.Any, js.Any] {
    def this(props: TabBarItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabBarItemProps, context: js.Any) = this()
  }
  /* static members */
  object Item {
    
    @JSImport("antd-mobile/lib/tab-bar", "Item")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/tab-bar", "Item.defaultProps")
    @js.native
    def defaultProps: TabBarItemProps = js.native
    @scala.inline
    def defaultProps_=(x: TabBarItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AntTabBar
    extends Component[AntTabbarProps, js.Any, js.Any] {
    
    def getTabs(): js.Array[TabBarItemProps] = js.native
    
    def renderTabBar(): ReactElement = js.native
  }
  
  @js.native
  trait AntTabbarProps extends TabBarProps {
    
    var className: js.UndefOr[String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var noRenderContent: js.UndefOr[Boolean] = js.native
    
    var placeholder: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
  }
  object AntTabbarProps {
    
    @scala.inline
    def apply(): AntTabbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntTabbarProps]
    }
    
    @scala.inline
    implicit class AntTabbarPropsMutableBuilder[Self <: AntTabbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setNoRenderContent(value: Boolean): Self = StObject.set(x, "noRenderContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRenderContentUndefined: Self = StObject.set(x, "noRenderContent", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderReactElement(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrerenderingSiblingsNumber(value: Double): Self = StObject.set(x, "prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerenderingSiblingsNumberUndefined: Self = StObject.set(x, "prerenderingSiblingsNumber", js.undefined)
    }
  }
}
