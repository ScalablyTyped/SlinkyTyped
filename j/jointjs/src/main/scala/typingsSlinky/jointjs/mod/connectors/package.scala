package typingsSlinky.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectors {
  type Connector = typingsSlinky.jointjs.mod.connectors.GenericConnector[typingsSlinky.jointjs.mod.connectors.ConnectorType]
  type ConnectorJSON = typingsSlinky.jointjs.mod.connectors.GenericConnectorJSON[typingsSlinky.jointjs.mod.connectors.ConnectorType]
  type GenericConnector[K /* <: typingsSlinky.jointjs.mod.connectors.ConnectorType */] = js.Function4[
    /* sourcePoint */ typingsSlinky.jointjs.mod.dia.Point, 
    /* targetPoint */ typingsSlinky.jointjs.mod.dia.Point, 
    /* routePoints */ js.Array[typingsSlinky.jointjs.mod.dia.Point], 
    /* args */ js.UndefOr[typingsSlinky.jointjs.mod.connectors.GenericConnectorArguments[K]], 
    java.lang.String | typingsSlinky.jointjs.mod.g.Path
  ]
  type GenericConnectorArguments[K /* <: typingsSlinky.jointjs.mod.connectors.ConnectorType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectors.ConnectorArgumentsMap[K] */ js.Any
}
