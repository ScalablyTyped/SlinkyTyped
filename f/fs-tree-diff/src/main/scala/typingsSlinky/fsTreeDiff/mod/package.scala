package typingsSlinky.fsTreeDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Entry = typingsSlinky.fsTreeDiff.entryMod.DefaultEntry
  type Operation = (js.Tuple3[
    typingsSlinky.fsTreeDiff.mod.Operand, 
    java.lang.String, 
    typingsSlinky.fsTreeDiff.entryMod.DefaultEntry
  ]) | (js.Tuple2[typingsSlinky.fsTreeDiff.mod.Operand, java.lang.String])
  type Patch = js.Array[typingsSlinky.fsTreeDiff.mod.Operation]
}
