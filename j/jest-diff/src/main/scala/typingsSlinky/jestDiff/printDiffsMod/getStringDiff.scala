package typingsSlinky.jestDiff.printDiffsMod

import typingsSlinky.jestDiff.typesMod.DiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "getStringDiff")
@js.native
object getStringDiff extends js.Object {
  def apply(expected: String, received: String): StringDiffResult = js.native
  def apply(expected: String, received: String, options: DiffOptions): StringDiffResult = js.native
}

