package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrequencyCap extends js.Object {
  /** Duration of time, in seconds, for this frequency cap. The maximum duration is 90 days. Acceptable values are 1 to 7776000, inclusive. */
  var duration: js.UndefOr[String] = js.native
  /** Number of times an individual user can be served the ad within the specified duration. Acceptable values are 1 to 15, inclusive. */
  var impressions: js.UndefOr[String] = js.native
}

object FrequencyCap {
  @scala.inline
  def apply(): FrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrequencyCap]
  }
  @scala.inline
  implicit class FrequencyCapOps[Self <: FrequencyCap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressions")(js.undefined)
        ret
    }
  }
  
}

