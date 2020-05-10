package typingsSlinky.beats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bin extends js.Object {
  var decay: Double = js.native
  var hi: Double = js.native
  var lo: Double = js.native
  var threshold: Double = js.native
}

object Bin {
  @scala.inline
  def apply(decay: Double, hi: Double, lo: Double, threshold: Double): Bin = {
    val __obj = js.Dynamic.literal(decay = decay.asInstanceOf[js.Any], hi = hi.asInstanceOf[js.Any], lo = lo.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  @scala.inline
  implicit class BinOps[Self <: Bin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

