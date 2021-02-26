package typingsSlinky.antdMobile

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antdMobile.antdMobileStrings.dark
import typingsSlinky.antdMobile.antdMobileStrings.light
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navBarPropsTypeMod {
  
  @js.native
  trait NavBarProps extends HTMLProps[HTMLDivElement] {
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var leftContent: js.UndefOr[ReactElement] = js.native
    
    var mode: js.UndefOr[dark | light] = js.native
    
    var onLeftClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rightContent: js.UndefOr[ReactElement] = js.native
  }
  object NavBarProps {
    
    @scala.inline
    def apply(): NavBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavBarProps]
    }
    
    @scala.inline
    implicit class NavBarPropsMutableBuilder[Self <: NavBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLeftContent(value: ReactElement): Self = StObject.set(x, "leftContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftContentReactElement(value: ReactElement): Self = StObject.set(x, "leftContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftContentUndefined: Self = StObject.set(x, "leftContent", js.undefined)
      
      @scala.inline
      def setMode(value: dark | light): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnLeftClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onLeftClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeftClickUndefined: Self = StObject.set(x, "onLeftClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRightContent(value: ReactElement): Self = StObject.set(x, "rightContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightContentReactElement(value: ReactElement): Self = StObject.set(x, "rightContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightContentUndefined: Self = StObject.set(x, "rightContent", js.undefined)
    }
  }
}
