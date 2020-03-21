package typingsSlinky.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rTreeSplitStrategiesMod {
  type NodePair[T] = js.Tuple2[
    typingsSlinky.plottable.rTreeMod.RTreeNode[T], 
    typingsSlinky.plottable.rTreeMod.RTreeNode[T]
  ]
}
