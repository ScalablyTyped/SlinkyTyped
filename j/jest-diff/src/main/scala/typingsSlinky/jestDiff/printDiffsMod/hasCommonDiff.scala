package typingsSlinky.jestDiff.printDiffsMod

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "hasCommonDiff")
@js.native
object hasCommonDiff extends js.Object {
  def apply(diffs: js.Array[Diff], isMultiline: Boolean): Boolean = js.native
}

