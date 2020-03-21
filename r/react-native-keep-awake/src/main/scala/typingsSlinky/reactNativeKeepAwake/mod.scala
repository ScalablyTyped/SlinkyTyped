package typingsSlinky.reactNativeKeepAwake

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-keep-awake", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends Component[AnonChildren, js.Object, js.Any]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def activate(): Unit = js.native
    def deactivate(): Unit = js.native
  }
  
  type KeepAwake = ReactComponentClass[AnonChildren]
}

