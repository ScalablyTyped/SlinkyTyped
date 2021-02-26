package typingsSlinky.reactNavigationCore

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigationCore.anon.Register
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ensureSingleNavigatorMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/EnsureSingleNavigator", JSImport.Default)
  @js.native
  def default(hasChildren: Props): ReactElement = js.native
  
  @JSImport("@react-navigation/core/lib/typescript/src/EnsureSingleNavigator", "SingleNavigatorContext")
  @js.native
  val SingleNavigatorContext: Context[js.UndefOr[Register]] = js.native
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactElement = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
