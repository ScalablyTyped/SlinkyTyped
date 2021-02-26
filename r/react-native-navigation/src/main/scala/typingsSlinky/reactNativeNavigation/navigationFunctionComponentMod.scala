package typingsSlinky.reactNativeNavigation

import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.reactNativeNavigation.navigationComponentPropsMod.NavigationComponentProps
import typingsSlinky.reactNativeNavigation.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationFunctionComponentMod {
  
  @js.native
  trait NavigationFunctionComponent[Props] extends FunctionComponent[Props with NavigationComponentProps] {
    
    var options: js.UndefOr[
        (js.Function1[/* props */ Props with NavigationComponentProps, Options]) | Options
      ] = js.native
  }
}
