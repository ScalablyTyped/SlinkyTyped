package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeoutIntervalOptions extends js.Object {
  var locationMode: js.UndefOr[String] = js.native
  var maximumExecutionTimeInMs: js.UndefOr[Double] = js.native
  var timeoutIntervalInMs: js.UndefOr[Double] = js.native
}

object TimeoutIntervalOptions {
  @scala.inline
  def apply(): TimeoutIntervalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutIntervalOptions]
  }
  @scala.inline
  implicit class TimeoutIntervalOptionsOps[Self <: TimeoutIntervalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumExecutionTimeInMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumExecutionTimeInMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumExecutionTimeInMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumExecutionTimeInMs")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutIntervalInMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutIntervalInMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutIntervalInMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutIntervalInMs")(js.undefined)
        ret
    }
  }
  
}

