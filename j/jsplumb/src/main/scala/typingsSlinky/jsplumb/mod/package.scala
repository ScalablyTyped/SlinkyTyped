package typingsSlinky.jsplumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnchorArraySpec = js.Tuple7[
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    js.UndefOr[scala.Double], 
    js.UndefOr[scala.Double], 
    js.UndefOr[java.lang.String]
  ]
  type AnchorContinuousSpec = typingsSlinky.jsplumb.mod.AnchorContinuousId | (js.Tuple2[typingsSlinky.jsplumb.mod.AnchorContinuousId, typingsSlinky.jsplumb.anon.Faces])
  type AnchorDynamicId = typingsSlinky.jsplumb.jsplumbStrings.AutoDefault
  type AnchorDynamicSpec = js.Array[
    typingsSlinky.jsplumb.mod.AnchorStaticSpec | typingsSlinky.jsplumb.mod.AnchorDynamicId | typingsSlinky.jsplumb.mod.AnchorPerimeterSpec | typingsSlinky.jsplumb.mod.AnchorContinuousSpec
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jsplumb.mod.AnchorStaticId
    - typingsSlinky.jsplumb.mod.AnchorDynamicId
    - typingsSlinky.jsplumb.mod.AnchorPerimeterId
    - typingsSlinky.jsplumb.mod.AnchorContinuousId
  */
  type AnchorId = typingsSlinky.jsplumb.mod._AnchorId | typingsSlinky.jsplumb.mod.AnchorDynamicId | typingsSlinky.jsplumb.mod.AnchorPerimeterId
  type AnchorPerimeterId = typingsSlinky.jsplumb.jsplumbStrings.Perimeter
  type AnchorPerimeterSpec = typingsSlinky.jsplumb.mod.AnchorPerimeterId | (js.Tuple2[
    typingsSlinky.jsplumb.mod.AnchorPerimeterId, 
    typingsSlinky.jsplumb.anon.AnchorCount
  ])
  type AnchorSpec = typingsSlinky.jsplumb.mod.AnchorStaticSpec | typingsSlinky.jsplumb.mod.AnchorDynamicSpec | typingsSlinky.jsplumb.mod.AnchorPerimeterSpec | typingsSlinky.jsplumb.mod.AnchorContinuousSpec
  type AnchorStaticSpec = typingsSlinky.jsplumb.mod.AnchorStaticId | typingsSlinky.jsplumb.mod.AnchorArraySpec
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
  type EndpointBlank = typingsSlinky.jsplumb.jsplumbStrings.Blank
  type EndpointBlankOptions = js.Object
  type EndpointDot = typingsSlinky.jsplumb.jsplumbStrings.Dot
  type EndpointId = typingsSlinky.jsplumb.mod.EndpointRectangle | typingsSlinky.jsplumb.mod.EndpointDot | typingsSlinky.jsplumb.mod.EndpointBlank
  type EndpointRectangle = typingsSlinky.jsplumb.jsplumbStrings.Rectangle
  /* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
  type EndpointSpec = typingsSlinky.jsplumb.mod.EndpointId | (js.Tuple2[
    typingsSlinky.jsplumb.mod.EndpointBlank | typingsSlinky.jsplumb.mod.EndpointDot | typingsSlinky.jsplumb.mod.EndpointRectangle, 
    typingsSlinky.jsplumb.mod.EndpointBlankOptions | typingsSlinky.jsplumb.mod.EndpointDotOptions | typingsSlinky.jsplumb.mod.EndpointRectangleOptions
  ])
  type OverlaySpec = typingsSlinky.jsplumb.mod.OverlayId | (js.Tuple2[typingsSlinky.jsplumb.mod.OverlayId, typingsSlinky.jsplumb.mod.OverlayOptions])
  type Selector = java.lang.String
  type UUID = java.lang.String
  type UserDefinedConnectorId = java.lang.String
}
