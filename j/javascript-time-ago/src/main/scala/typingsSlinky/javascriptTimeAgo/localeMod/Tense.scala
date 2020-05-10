package typingsSlinky.javascriptTimeAgo.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tense extends js.Object {
  var current: js.UndefOr[QuantifyType | String] = js.native
  var future: js.UndefOr[QuantifyType | String] = js.native
  var next: js.UndefOr[QuantifyType | String] = js.native
  var past: js.UndefOr[QuantifyType | String] = js.native
  var previous: js.UndefOr[QuantifyType | String] = js.native
}

object Tense {
  @scala.inline
  def apply(): Tense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tense]
  }
  @scala.inline
  implicit class TenseOps[Self <: Tense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: QuantifyType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withFuture(value: QuantifyType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: QuantifyType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withPast(value: QuantifyType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevious(value: QuantifyType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.undefined)
        ret
    }
  }
  
}

