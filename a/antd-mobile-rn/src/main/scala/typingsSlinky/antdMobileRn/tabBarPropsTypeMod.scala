package typingsSlinky.antdMobileRn

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobileRn.anon.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarPropsTypeMod {
  
  @js.native
  trait TabBarItemProps extends StObject {
    
    var badge: js.UndefOr[String | Double] = js.native
    
    var icon: js.UndefOr[TabIcon] = js.native
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var selectedIcon: js.UndefOr[TabIcon] = js.native
    
    var title: String = js.native
  }
  object TabBarItemProps {
    
    @scala.inline
    def apply(title: String): TabBarItemProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabBarItemProps]
    }
    
    @scala.inline
    implicit class TabBarItemPropsMutableBuilder[Self <: TabBarItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setIcon(value: TabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
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
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabBarProps extends StObject {
    
    /** default: false */
    var animated: js.UndefOr[Boolean] = js.native
    
    var barTintColor: js.UndefOr[String] = js.native
    
    /** rn android only**/
    var styles: js.UndefOr[js.Any] = js.native
    
    /** default: false */
    var swipeable: js.UndefOr[Boolean] = js.native
    
    var tintColor: js.UndefOr[String] = js.native
    
    var unselectedTintColor: js.UndefOr[String] = js.native
  }
  object TabBarProps {
    
    @scala.inline
    def apply(): TabBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarProps]
    }
    
    @scala.inline
    implicit class TabBarPropsMutableBuilder[Self <: TabBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setBarTintColor(value: String): Self = StObject.set(x, "barTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarTintColorUndefined: Self = StObject.set(x, "barTintColor", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      @scala.inline
      def setUnselectedTintColor(value: String): Self = StObject.set(x, "unselectedTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedTintColorUndefined: Self = StObject.set(x, "unselectedTintColor", js.undefined)
    }
  }
  
  type TabIcon = ReactElement | Uri
}
