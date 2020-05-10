package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkStrokeConfig extends js.Object {
  var cap: js.UndefOr[SkStrokeCap] = js.native
  var join: js.UndefOr[SkStrokeJoin] = js.native
  var miter_limit: js.UndefOr[Double] = js.native
  var precision: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SkStrokeConfig {
  @scala.inline
  def apply(): SkStrokeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkStrokeConfig]
  }
  @scala.inline
  implicit class SkStrokeConfigOps[Self <: SkStrokeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCap(value: SkStrokeCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(js.undefined)
        ret
    }
    @scala.inline
    def withJoin(value: SkStrokeJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.undefined)
        ret
    }
    @scala.inline
    def withMiter_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miter_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiter_limit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miter_limit")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

