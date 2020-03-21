package typingsSlinky.jsplumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnchorSpec = typingsSlinky.jsplumb.mod.AnchorId | (js.Tuple2[typingsSlinky.jsplumb.mod.AnchorId, typingsSlinky.jsplumb.mod.AnchorOptions])
  type ConnectionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jsplumb.jsplumbStrings.Bezier
    - typingsSlinky.jsplumb.jsplumbStrings.StateMachine
    - typingsSlinky.jsplumb.jsplumbStrings.Flowchart
    - typingsSlinky.jsplumb.jsplumbStrings.Straight
    - typingsSlinky.jsplumb.mod.UserDefinedConnectorId
  */
  type ConnectorId = typingsSlinky.jsplumb.mod._ConnectorId | typingsSlinky.jsplumb.mod.UserDefinedConnectorId
  type ConnectorSpec = typingsSlinky.jsplumb.mod.ConnectorId | (js.Tuple2[typingsSlinky.jsplumb.mod.ConnectorId, typingsSlinky.jsplumb.mod.ConnectorOptions])
  type ElementGroupRef = typingsSlinky.jsplumb.mod.ElementId | org.scalajs.dom.raw.Element | (js.Array[org.scalajs.dom.raw.Element | typingsSlinky.jsplumb.mod.ElementId])
  type ElementId = java.lang.String
  type ElementRef = typingsSlinky.jsplumb.mod.ElementId | org.scalajs.dom.raw.Element
  /* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jsplumb.jsplumbStrings.Rectangle
    - typingsSlinky.jsplumb.jsplumbStrings.Dot
    - typingsSlinky.jsplumb.jsplumbStrings.Blank
    - typingsSlinky.jsplumb.mod.UserDefinedEndpointId
  */
  type EndpointId = typingsSlinky.jsplumb.mod._EndpointId | typingsSlinky.jsplumb.mod.UserDefinedEndpointId
  type EndpointSpec = typingsSlinky.jsplumb.mod.EndpointId | (js.Tuple2[typingsSlinky.jsplumb.mod.EndpointId, typingsSlinky.jsplumb.mod.EndpointOptions])
  type OverlaySpec = typingsSlinky.jsplumb.mod.OverlayId | (js.Tuple2[typingsSlinky.jsplumb.mod.OverlayId, typingsSlinky.jsplumb.mod.OverlayOptions])
  type Selector = java.lang.String
  type UUID = java.lang.String
  type UserDefinedConnectorId = java.lang.String
  type UserDefinedEndpointId = java.lang.String
}
