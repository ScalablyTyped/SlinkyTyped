package typingsSlinky.jestDiff

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import typingsSlinky.jestDiff.typesMod.DiffOptionsNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-diff/build/joinAlignedDiffs", JSImport.Namespace)
@js.native
object joinAlignedDiffsMod extends js.Object {
  
  def joinAlignedDiffsExpand(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = js.native
  
  def joinAlignedDiffsNoExpand(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = js.native
}
