package typingsSlinky.reactInstantsearch

import slinky.core.ReactComponentClass
import typingsSlinky.reactInstantsearchCore.mod.ConnectorDescription
import typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ ReactComponentClass[ConnectorProvided[TProvided]], 
    ReactComponentClass[TExposed]
  ]) with (js.Function1[
    /* Composed */ ReactComponentClass[Partial[ConnectorProvided[TProvided]]], 
    ReactComponentClass[
      (Omit[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided]]) with TExposed
    ]
  ]) = js.native
}

