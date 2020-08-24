package typingsSlinky.jestDiff.printDiffsMod

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import typingsSlinky.jestDiff.typesMod.DiffOptionsNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "printDiffLines")
@js.native
object printDiffLines extends js.Object {
  def apply(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = js.native
}

