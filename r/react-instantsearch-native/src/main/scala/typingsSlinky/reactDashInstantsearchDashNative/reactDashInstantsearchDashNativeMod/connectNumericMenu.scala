package typingsSlinky.reactDashInstantsearchDashNative.reactDashInstantsearchDashNativeMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.NumericMenuExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.NumericMenuProvided
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectNumericMenu")
@js.native
object connectNumericMenu extends js.Object {
  def apply(stateless: StatelessComponent[NumericMenuProvided]): ReactComponentClass[NumericMenuExposed] = js.native
  def apply[TProps /* <: Partial[NumericMenuProvided] */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = js.native
}

