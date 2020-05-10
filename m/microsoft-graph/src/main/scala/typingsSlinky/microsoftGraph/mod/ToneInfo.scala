package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToneInfo extends js.Object {
  var sequenceId: js.UndefOr[Double] = js.native
  var tone: js.UndefOr[Tone] = js.native
}

object ToneInfo {
  @scala.inline
  def apply(): ToneInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToneInfo]
  }
  @scala.inline
  implicit class ToneInfoOps[Self <: ToneInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSequenceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTone(value: Tone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tone")(js.undefined)
        ret
    }
  }
  
}

