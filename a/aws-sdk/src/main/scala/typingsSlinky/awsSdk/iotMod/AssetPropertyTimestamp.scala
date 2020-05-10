package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyTimestamp extends js.Object {
  /**
    * Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
    */
  var offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos] = js.native
  /**
    * A string that contains the time in seconds since epoch. Accepts substitution templates.
    */
  var timeInSeconds: AssetPropertyTimeInSeconds = js.native
}

object AssetPropertyTimestamp {
  @scala.inline
  def apply(timeInSeconds: AssetPropertyTimeInSeconds): AssetPropertyTimestamp = {
    val __obj = js.Dynamic.literal(timeInSeconds = timeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyTimestamp]
  }
  @scala.inline
  implicit class AssetPropertyTimestampOps[Self <: AssetPropertyTimestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeInSeconds(value: AssetPropertyTimeInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetInNanos(value: AssetPropertyOffsetInNanos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetInNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetInNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetInNanos")(js.undefined)
        ret
    }
  }
  
}

