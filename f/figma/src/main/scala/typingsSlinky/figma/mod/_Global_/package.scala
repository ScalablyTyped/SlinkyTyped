package typingsSlinky.figma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _Global_ {
  type MessageEventHandler = js.Function2[
    /* pluginMessage */ js.Any, 
    /* props */ typingsSlinky.figma.mod._Global_.OnMessageProperties, 
    scala.Unit
  ]
  ////////////////////////////////////////////////////////////////////////////////
  // Datatypes
  type Transform = js.Tuple2[
    js.Tuple3[scala.Double, scala.Double, scala.Double], 
    js.Tuple3[scala.Double, scala.Double, scala.Double]
  ]
  type VectorPaths = js.Array[typingsSlinky.figma.mod._Global_.VectorPath]
}
