package typingsSlinky.reactNativeNavigation

import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.reactNativeNavigation.navigationComponentPropsMod.NavigationComponentProps
import typingsSlinky.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/interfaces/NavigationFunctionComponent", JSImport.Namespace)
@js.native
object navigationFunctionComponentMod extends js.Object {
  
  @js.native
  trait NavigationFunctionComponent[Props] extends FunctionComponent[Props with NavigationComponentProps] {
    
    var options: js.UndefOr[
        (js.Function1[/* props */ Props with NavigationComponentProps, Options]) | Options
      ] = js.native
  }
}
