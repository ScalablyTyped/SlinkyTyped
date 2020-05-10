package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCutoffTime extends js.Object {
  /**
    * Hour of the cutoff time until which an order has to be placed to be
    * processed in the same day. Required.
    */
  var hour: js.UndefOr[Double] = js.native
  /**
    * Minute of the cutoff time until which an order has to be placed to be
    * processed in the same day. Required.
    */
  var minute: js.UndefOr[Double] = js.native
  /**
    * Timezone identifier for the cutoff time. A list of identifiers can be
    * found in  the AdWords API documentation. E.g. &quot;Europe/Zurich&quot;.
    * Required.
    */
  var timezone: js.UndefOr[String] = js.native
}

object SchemaCutoffTime {
  @scala.inline
  def apply(): SchemaCutoffTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCutoffTime]
  }
  @scala.inline
  implicit class SchemaCutoffTimeOps[Self <: SchemaCutoffTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
  }
  
}

