package typingsSlinky.json8Patch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyResultWithRevert extends ApplyResult {
  var revert: JsonPatch = js.native
}

object ApplyResultWithRevert {
  @scala.inline
  def apply(doc: js.Any, revert: JsonPatch): ApplyResultWithRevert = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyResultWithRevert]
  }
  @scala.inline
  implicit class ApplyResultWithRevertOps[Self <: ApplyResultWithRevert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRevert(value: JsonPatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

