package typingsSlinky.newrelic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCollectPendingData extends js.Object {
  var collectPendingData: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var waitForIdle: js.UndefOr[Boolean] = js.native
}

object AnonCollectPendingData {
  @scala.inline
  def apply(): AnonCollectPendingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCollectPendingData]
  }
  @scala.inline
  implicit class AnonCollectPendingDataOps[Self <: AnonCollectPendingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectPendingData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectPendingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectPendingData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectPendingData")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForIdle")(js.undefined)
        ret
    }
  }
  
}

