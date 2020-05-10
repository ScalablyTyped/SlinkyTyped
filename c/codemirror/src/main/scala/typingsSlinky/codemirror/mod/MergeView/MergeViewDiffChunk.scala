package typingsSlinky.codemirror.mod.MergeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks changes in chunks from oroginal to new.
  */
@js.native
trait MergeViewDiffChunk extends js.Object {
  var editFrom: Double = js.native
  var editTo: Double = js.native
  var origFrom: Double = js.native
  var origTo: Double = js.native
}

object MergeViewDiffChunk {
  @scala.inline
  def apply(editFrom: Double, editTo: Double, origFrom: Double, origTo: Double): MergeViewDiffChunk = {
    val __obj = js.Dynamic.literal(editFrom = editFrom.asInstanceOf[js.Any], editTo = editTo.asInstanceOf[js.Any], origFrom = origFrom.asInstanceOf[js.Any], origTo = origTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeViewDiffChunk]
  }
  @scala.inline
  implicit class MergeViewDiffChunkOps[Self <: MergeViewDiffChunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origTo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

