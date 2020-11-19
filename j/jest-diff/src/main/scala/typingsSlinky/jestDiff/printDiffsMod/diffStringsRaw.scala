package typingsSlinky.jestDiff.printDiffsMod

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-diff/build/printDiffs", "diffStringsRaw")
@js.native
object diffStringsRaw extends js.Object {
  
  def apply(a: String, b: String, cleanup: Boolean): js.Array[Diff] = js.native
}
