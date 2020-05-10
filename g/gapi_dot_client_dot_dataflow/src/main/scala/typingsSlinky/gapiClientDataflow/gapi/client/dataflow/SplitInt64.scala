package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitInt64 extends js.Object {
  /** The high order bits, including the sign: n >> 32. */
  var highBits: js.UndefOr[Double] = js.native
  /** The low order bits: n & 0xffffffff. */
  var lowBits: js.UndefOr[Double] = js.native
}

object SplitInt64 {
  @scala.inline
  def apply(): SplitInt64 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitInt64]
  }
  @scala.inline
  implicit class SplitInt64Ops[Self <: SplitInt64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highBits")(js.undefined)
        ret
    }
    @scala.inline
    def withLowBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowBits")(js.undefined)
        ret
    }
  }
  
}

