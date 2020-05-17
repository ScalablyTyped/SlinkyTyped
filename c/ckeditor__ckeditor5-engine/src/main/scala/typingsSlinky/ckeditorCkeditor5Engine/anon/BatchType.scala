package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchType extends js.Object {
  var batchType: js.UndefOr[String] = js.native
  var lastRangeBackward: js.UndefOr[Boolean] = js.native
  var rootName: js.UndefOr[String] = js.native
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.native
}

object BatchType {
  @scala.inline
  def apply(): BatchType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchType]
  }
  @scala.inline
  implicit class BatchTypeOps[Self <: BatchType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchType")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRangeBackward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRangeBackward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRangeBackward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRangeBackward")(js.undefined)
        ret
    }
    @scala.inline
    def withRootName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootName")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionAttributes(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAttributes")(js.undefined)
        ret
    }
  }
  
}

