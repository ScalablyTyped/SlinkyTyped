package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.anon.AddTab
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loginTabMod {
  
  @JSImport("ant-design-pro/lib/Login/LoginTab", JSImport.Default)
  @js.native
  class default ()
    extends Component[LoginTabProps, js.Any, js.Any]
  
  type LoginTab = ReactComponentClass[LoginTabProps]
  
  @js.native
  trait LoginTabProps extends StObject {
    
    var key: js.UndefOr[String] = js.native
    
    var tab: js.UndefOr[ReactElement] = js.native
    
    var tabUtil: AddTab = js.native
  }
  object LoginTabProps {
    
    @scala.inline
    def apply(tabUtil: AddTab): LoginTabProps = {
      val __obj = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginTabProps]
    }
    
    @scala.inline
    implicit class LoginTabPropsMutableBuilder[Self <: LoginTabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setTab(value: ReactElement): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabReactElement(value: ReactElement): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      @scala.inline
      def setTabUtil(value: AddTab): Self = StObject.set(x, "tabUtil", value.asInstanceOf[js.Any])
    }
  }
}
