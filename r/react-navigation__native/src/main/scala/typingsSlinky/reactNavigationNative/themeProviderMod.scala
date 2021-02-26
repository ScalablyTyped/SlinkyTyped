package typingsSlinky.reactNavigationNative

import slinky.core.facade.ReactElement
import typingsSlinky.reactNavigationNative.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/theming/ThemeProvider", JSImport.Default)
  @js.native
  def default(hasValueChildren: Props): ReactElement = js.native
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactElement = js.native
    
    var value: Theme = js.native
  }
  object Props {
    
    @scala.inline
    def apply(value: Theme): Props = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setValue(value: Theme): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
