package typingsSlinky.dagre

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EdgeFn = js.Function1[/* outNodeName */ java.lang.String, js.Array[typingsSlinky.dagre.mod.GraphEdge]]
  type Label = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Node[T] = T with typingsSlinky.dagre.anon.Class
  type WeightFn = js.Function1[/* edge */ typingsSlinky.dagre.mod.Edge, scala.Double]
}
