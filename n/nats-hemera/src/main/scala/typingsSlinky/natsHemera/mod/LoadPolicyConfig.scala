package typingsSlinky.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadPolicyConfig extends js.Object {
  var maxEventLoopDelay: js.UndefOr[Double] = js.native
  var maxHeapUsedBytes: js.UndefOr[Double] = js.native
  var maxRssBytes: js.UndefOr[Double] = js.native
}

object LoadPolicyConfig {
  @scala.inline
  def apply(): LoadPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPolicyConfig]
  }
  @scala.inline
  implicit class LoadPolicyConfigOps[Self <: LoadPolicyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxEventLoopDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEventLoopDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEventLoopDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEventLoopDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeapUsedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeapUsedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeapUsedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeapUsedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRssBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRssBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRssBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRssBytes")(js.undefined)
        ret
    }
  }
  
}

