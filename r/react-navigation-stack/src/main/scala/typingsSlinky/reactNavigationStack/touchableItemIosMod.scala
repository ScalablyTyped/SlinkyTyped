package typingsSlinky.reactNavigationStack

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNativeGestureHandler.mod.BaseButton
import typingsSlinky.reactNavigationStack.anon.ActiveOpacity
import typingsSlinky.reactNavigationStack.anon.Enabled
import typingsSlinky.reactNavigationStack.anon.ReadonlyBaseButtonPropert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchableItemIosMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", JSImport.Default)
  @js.native
  class default () extends TouchableItem
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem.ios", "default.defaultProps")
    @js.native
    def defaultProps: Enabled = js.native
    @scala.inline
    def defaultProps_=(x: Enabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type Props = (ComponentProps[Instantiable1[/* props */ ReadonlyBaseButtonPropert, BaseButton]]) with ActiveOpacity
  
  @js.native
  trait TouchableItem
    extends Component[Props, js.Object, js.Any] {
    
    var handleActiveStateChange: js.Any = js.native
    
    var opacity: js.Any = js.native
  }
}
