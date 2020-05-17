package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Css {
  type Colour = java.lang.String
  type Dictionary = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * In addition to specifying the value of a property outright, the developer may also use a mapper to dynamically specify the property value.
    * - data()
    * - mapData()
    * - function( ele ){ ... }
    * https://js.cytoscape.org/#style/mappers
    */
  type MapperFunction[Element, Type] = js.Function1[/* ele */ Element, Type]
  type PropertyValueCore[Type] = typingsSlinky.cytoscape.mod.Css.PropertyValue[typingsSlinky.cytoscape.mod.Css.Core, Type]
  type PropertyValueEdge[Type] = typingsSlinky.cytoscape.mod.Css.PropertyValue[typingsSlinky.cytoscape.mod.EdgeSingular, Type]
  type PropertyValueNode[Type] = typingsSlinky.cytoscape.mod.Css.PropertyValue[typingsSlinky.cytoscape.mod.NodeSingular, Type]
  /**
    * A space-separated list of numbers ranging on [-1, 1],
    * representing alternating x and y values (i.e. x1 y1 x2 y2, x3 y3 ...).
    * This represents the points in the polygon for the node’s shape.
    * The bounding box of the node is given by (-1, -1), (1, -1), (1, 1), (-1, 1).
    */
  type ShapePolygonPoints = java.lang.String
}
