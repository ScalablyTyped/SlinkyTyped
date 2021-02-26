package typingsSlinky.antdMobile

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.tabBarPropsTypeMod.TabIcon
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("antd-mobile/lib/tab-bar/Tab", JSImport.Default)
  @js.native
  class default () extends Tab
  
  @js.native
  trait Tab
    extends PureComponent[TabProps, js.Any, js.Any] {
    
    def onClick(): Unit = js.native
    
    def renderIcon(): ReactElement = js.native
  }
  
  @js.native
  trait TabProps extends StObject {
    
    var badge: js.UndefOr[String | Double] = js.native
    
    var dataAttrs: js.UndefOr[StringDictionary[String]] = js.native
    
    var dot: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[TabIcon] = js.native
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var selectedIcon: js.UndefOr[TabIcon] = js.native
    
    var tintColor: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var unselectedTintColor: js.UndefOr[String] = js.native
  }
  object TabProps {
    
    @scala.inline
    def apply(prefixCls: String): TabProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setDataAttrs(value: StringDictionary[String]): Self = StObject.set(x, "dataAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataAttrsUndefined: Self = StObject.set(x, "dataAttrs", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setIcon(value: TabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIcon(value: TabIcon): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIconReactElement(value: ReactElement): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUnselectedTintColor(value: String): Self = StObject.set(x, "unselectedTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedTintColorUndefined: Self = StObject.set(x, "unselectedTintColor", js.undefined)
    }
  }
}
