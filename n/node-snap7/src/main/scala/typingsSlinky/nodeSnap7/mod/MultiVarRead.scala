package typingsSlinky.nodeSnap7.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiVarRead extends js.Object {
  var Amount: Double = js.native
  var Area: typingsSlinky.nodeSnap7.mod.Area = js.native
  var DBNumber: js.UndefOr[Double] = js.native
  var Start: Double = js.native
  var WordLen: typingsSlinky.nodeSnap7.mod.WordLen = js.native
}

object MultiVarRead {
  @scala.inline
  def apply(Amount: Double, Area: Area, Start: Double, WordLen: WordLen): MultiVarRead = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Area = Area.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], WordLen = WordLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarRead]
  }
  @scala.inline
  implicit class MultiVarReadOps[Self <: MultiVarRead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArea(value: Area): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordLen(value: WordLen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDBNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBNumber")(js.undefined)
        ret
    }
  }
  
}

