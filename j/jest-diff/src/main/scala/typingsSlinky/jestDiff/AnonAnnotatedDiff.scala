package typingsSlinky.jestDiff

import typingsSlinky.jestDiff.jestDiffBooleans.`true`
import typingsSlinky.jestDiff.printDiffsMod._StringDiffResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnnotatedDiff extends _StringDiffResult {
  var annotatedDiff: String = js.native
  var isMultiline: `true` = js.native
}

object AnonAnnotatedDiff {
  @scala.inline
  def apply(annotatedDiff: String, isMultiline: `true`): AnonAnnotatedDiff = {
    val __obj = js.Dynamic.literal(annotatedDiff = annotatedDiff.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnnotatedDiff]
  }
  @scala.inline
  implicit class AnonAnnotatedDiffOps[Self <: AnonAnnotatedDiff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotatedDiff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotatedDiff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultiline(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

