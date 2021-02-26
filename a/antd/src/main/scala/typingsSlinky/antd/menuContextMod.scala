package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuContextMod extends Shortcut {
  
  @JSImport("antd/lib/menu/MenuContext", JSImport.Default)
  @js.native
  val default: Context[MenuContextProps] = js.native
  
  @js.native
  trait MenuContextProps extends StObject {
    
    var antdMenuTheme: js.UndefOr[MenuTheme] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var inlineCollapsed: Boolean = js.native
  }
  object MenuContextProps {
    
    @scala.inline
    def apply(inlineCollapsed: Boolean): MenuContextProps = {
      val __obj = js.Dynamic.literal(inlineCollapsed = inlineCollapsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuContextProps]
    }
    
    @scala.inline
    implicit class MenuContextPropsMutableBuilder[Self <: MenuContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAntdMenuTheme(value: MenuTheme): Self = StObject.set(x, "antdMenuTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAntdMenuThemeUndefined: Self = StObject.set(x, "antdMenuTheme", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setInlineCollapsed(value: Boolean): Self = StObject.set(x, "inlineCollapsed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.light
    - typingsSlinky.antd.antdStrings.dark
  */
  trait MenuTheme extends StObject
  object MenuTheme {
    
    @scala.inline
    def dark: typingsSlinky.antd.antdStrings.dark = "dark".asInstanceOf[typingsSlinky.antd.antdStrings.dark]
    
    @scala.inline
    def light: typingsSlinky.antd.antdStrings.light = "light".asInstanceOf[typingsSlinky.antd.antdStrings.light]
  }
  
  type _To = Context[MenuContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuContextMod.foo` */
  override def _to: Context[MenuContextProps] = default
}
