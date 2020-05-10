package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an int64, n, that is immune to precision loss when
  * encoded in JSON.
  */
@js.native
trait SchemaSplitInt64 extends js.Object {
  /**
    * The high order bits, including the sign: n &gt;&gt; 32.
    */
  var highBits: js.UndefOr[Double] = js.native
  /**
    * The low order bits: n &amp; 0xffffffff.
    */
  var lowBits: js.UndefOr[Double] = js.native
}

object SchemaSplitInt64 {
  @scala.inline
  def apply(): SchemaSplitInt64 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSplitInt64]
  }
  @scala.inline
  implicit class SchemaSplitInt64Ops[Self <: SchemaSplitInt64] (val x: Self) extends AnyVal {
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

