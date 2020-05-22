package typingsSlinky.jestDiff.anon

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diffs extends js.Object {
  var diffs: js.Array[Diff]
  var isMultiline: Boolean
}

object Diffs {
  @scala.inline
  def apply(diffs: js.Array[Diff], isMultiline: Boolean): Diffs = {
    val __obj = js.Dynamic.literal(diffs = diffs.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diffs]
  }
}

