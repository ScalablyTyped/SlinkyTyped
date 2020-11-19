package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNativeNavigation.commandNameMod.CommandName
import typingsSlinky.reactNativeNavigation.layoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/interfaces/Processors", JSImport.Namespace)
@js.native
object processorsMod extends js.Object {
  
  type LayoutProcessor = js.Function2[/* layout */ Layout[js.Object], /* commandName */ CommandName, Layout[js.Object]]
  
  type OptionsProcessor[T] = js.Function2[/* value */ T, /* commandName */ CommandName, T]
}
