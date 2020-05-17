package typingsSlinky.jestDiff.printDiffsMod

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "getHighlightedString")
@js.native
object getHighlightedString extends js.Object {
  def apply(op: Double, diffs: js.Array[Diff]): String = js.native
}

