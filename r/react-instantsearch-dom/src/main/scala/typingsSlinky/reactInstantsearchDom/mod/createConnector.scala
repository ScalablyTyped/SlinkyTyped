package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactInstantsearchCore.mod.ConnectorDescription
import typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-dom", "createConnector")
@js.native
object createConnector extends js.Object {
  
  def apply[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ ReactComponentClass[ConnectorProvided[TProvided]], 
    ReactComponentClass[TExposed]
  ]) with (js.Function1[
    /* Composed */ ReactComponentClass[Partial[ConnectorProvided[TProvided]]], 
    ReactComponentClass[
      (Omit[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided]]) with TExposed
    ]
  ]) = js.native
}
