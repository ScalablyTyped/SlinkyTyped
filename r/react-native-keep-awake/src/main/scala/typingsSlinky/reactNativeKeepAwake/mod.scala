package typingsSlinky.reactNativeKeepAwake

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeKeepAwake.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-keep-awake", JSImport.Default)
  @js.native
  class default ()
    extends Component[Children, js.Object, js.Any]
  object default {
    
    /* static member */
    @JSImport("react-native-keep-awake", "default.activate")
    @js.native
    def activate(): Unit = js.native
    
    /* static member */
    @JSImport("react-native-keep-awake", "default.deactivate")
    @js.native
    def deactivate(): Unit = js.native
  }
  
  type KeepAwake = ReactComponentClass[Children]
}
