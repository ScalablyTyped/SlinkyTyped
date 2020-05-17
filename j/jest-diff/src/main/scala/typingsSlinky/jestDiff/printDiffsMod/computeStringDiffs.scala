package typingsSlinky.jestDiff.printDiffsMod

import typingsSlinky.jestDiff.anon.Diffs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "computeStringDiffs")
@js.native
object computeStringDiffs extends js.Object {
  def apply(expected: String, received: String): Diffs = js.native
}

