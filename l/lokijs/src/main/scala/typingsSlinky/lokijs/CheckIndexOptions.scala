package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIndexOptions extends js.Object {
  var randomSampling: Boolean = js.native
  var randomSamplingFactor: Double = js.native
  var repair: Boolean = js.native
}

object CheckIndexOptions {
  @scala.inline
  def apply(randomSampling: Boolean, randomSamplingFactor: Double, repair: Boolean): CheckIndexOptions = {
    val __obj = js.Dynamic.literal(randomSampling = randomSampling.asInstanceOf[js.Any], randomSamplingFactor = randomSamplingFactor.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIndexOptions]
  }
  @scala.inline
  implicit class CheckIndexOptionsOps[Self <: CheckIndexOptions] (val x: Self) extends AnyVal {
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
    def withRandomSamplingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomSamplingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepair(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repair")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

