package typingsSlinky.barbellweights.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait options extends js.Object {
  var bar: js.UndefOr[Double] = js.native
  var plates: js.UndefOr[js.Array[Double]] = js.native
  var program: js.UndefOr[String] = js.native
  var warmup_round_to: js.UndefOr[Double] = js.native
}

object options {
  @scala.inline
  def apply(): options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[options]
  }
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withPlates(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plates")(js.undefined)
        ret
    }
    @scala.inline
    def withProgram(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(js.undefined)
        ret
    }
    @scala.inline
    def withWarmup_round_to(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmup_round_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarmup_round_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmup_round_to")(js.undefined)
        ret
    }
  }
  
}

