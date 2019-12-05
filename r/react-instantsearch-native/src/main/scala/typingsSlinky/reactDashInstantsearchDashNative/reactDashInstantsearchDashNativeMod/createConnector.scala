package typingsSlinky.reactDashInstantsearchDashNative.reactDashInstantsearchDashNativeMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectorDescription
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectorProvided
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "createConnector")
@js.native
object createConnector extends js.Object {
  def apply[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ ReactComponentClass[ConnectorProvided[TProvided]], 
    ReactComponentClass[TExposed]
  ]) with (js.Function1[
    /* Composed */ ReactComponentClass[Partial[ConnectorProvided[TProvided]]], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ]) = js.native
}

