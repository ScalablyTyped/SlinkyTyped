package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.CheckIndexOptions> */
@js.native
trait PartialCheckIndexOptions extends js.Object {
  var randomSampling: js.UndefOr[Boolean] = js.native
  var randomSamplingFactor: js.UndefOr[Double] = js.native
  var repair: js.UndefOr[Boolean] = js.native
}

object PartialCheckIndexOptions {
  @scala.inline
  def apply(): PartialCheckIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckIndexOptions]
  }
  @scala.inline
  implicit class PartialCheckIndexOptionsOps[Self <: PartialCheckIndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRandomSampling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomSampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomSampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomSampling")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomSamplingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomSamplingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomSamplingFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomSamplingFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withRepair(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repair")(js.undefined)
        ret
    }
  }
  
}

