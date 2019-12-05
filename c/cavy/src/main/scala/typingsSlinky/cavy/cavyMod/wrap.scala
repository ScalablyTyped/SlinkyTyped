package typingsSlinky.cavy.cavyMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cavy", "wrap")
@js.native
object wrap extends js.Object {
  def apply[P /* <: js.Object */](WrappedComponent: js.Object): ReactComponentClass[P] = js.native
  def apply[P /* <: js.Object */](WrappedComponent: FunctionComponent[P]): ReactComponentClass[P] = js.native
}

