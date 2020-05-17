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
  type AnchorDynamicId = typingsSlinky.jsplumb.jsplumbStrings.AutoDefault
  type AnchorDynamicSpec = js.Array[
    typingsSlinky.jsplumb.mod.AnchorStaticSpec | typingsSlinky.jsplumb.mod.AnchorDynamicId | typingsSlinky.jsplumb.mod.AnchorPerimeterSpec | typingsSlinky.jsplumb.mod.AnchorContinuousSpec
  ]
  type AnchorPerimeterId = typingsSlinky.jsplumb.jsplumbStrings.Perimeter
  type ConnectionId = java.lang.String
  type ElementId = java.lang.String
  type EndpointBlank = typingsSlinky.jsplumb.jsplumbStrings.Blank
  type EndpointBlankOptions = js.Object
  type EndpointDot = typingsSlinky.jsplumb.jsplumbStrings.Dot
  type EndpointRectangle = typingsSlinky.jsplumb.jsplumbStrings.Rectangle
  type Selector = java.lang.String
  type UUID = java.lang.String
  type UserDefinedConnectorId = java.lang.String
}
