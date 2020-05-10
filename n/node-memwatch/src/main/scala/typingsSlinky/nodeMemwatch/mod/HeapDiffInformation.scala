package typingsSlinky.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapDiffInformation extends js.Object {
  var after: HeapDiffSnapshot = js.native
  var before: HeapDiffSnapshot = js.native
  var change: HeapDiffChange = js.native
}

object HeapDiffInformation {
  @scala.inline
  def apply(after: HeapDiffSnapshot, before: HeapDiffSnapshot, change: HeapDiffChange): HeapDiffInformation = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapDiffInformation]
  }
  @scala.inline
  implicit class HeapDiffInformationOps[Self <: HeapDiffInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: HeapDiffSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefore(value: HeapDiffSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChange(value: HeapDiffChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

