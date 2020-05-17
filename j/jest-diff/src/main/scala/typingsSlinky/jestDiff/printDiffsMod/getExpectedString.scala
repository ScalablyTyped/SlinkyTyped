package typingsSlinky.jestDiff.printDiffsMod

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "getExpectedString")
@js.native
object getExpectedString extends js.Object {
  def apply(diffs: js.Array[Diff]): String = js.native
}

