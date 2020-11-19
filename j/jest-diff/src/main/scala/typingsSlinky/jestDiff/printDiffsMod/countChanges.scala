package typingsSlinky.jestDiff.printDiffsMod

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-diff/build/printDiffs", "countChanges")
@js.native
object countChanges extends js.Object {
  
  def apply(diffs: js.Array[Diff]): ChangeCounts = js.native
}
