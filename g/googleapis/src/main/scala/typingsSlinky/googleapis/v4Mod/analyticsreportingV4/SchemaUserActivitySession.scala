package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a user session performed on a specific device at a certain
  * time over a period of time.
  */
@js.native
trait SchemaUserActivitySession extends js.Object {
  /**
    * Represents a detailed view into each of the activity in this session.
    */
  var activities: js.UndefOr[js.Array[SchemaActivity]] = js.native
  /**
    * The data source of a hit. By default, hits sent from analytics.js are
    * reported as &quot;web&quot; and hits sent from the mobile SDKs are
    * reported as &quot;app&quot;. These values can be overridden in the
    * Measurement Protocol.
    */
  var dataSource: js.UndefOr[String] = js.native
  /**
    * The type of device used: &quot;mobile&quot;, &quot;tablet&quot; etc.
    */
  var deviceCategory: js.UndefOr[String] = js.native
  /**
    * Platform on which the activity happened: &quot;android&quot;,
    * &quot;ios&quot; etc.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Date of this session in ISO-8601 format.
    */
  var sessionDate: js.UndefOr[String] = js.native
  /**
    * Unique ID of the session.
    */
  var sessionId: js.UndefOr[String] = js.native
}

object SchemaUserActivitySession {
  @scala.inline
  def apply(): SchemaUserActivitySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserActivitySession]
  }
  @scala.inline
  implicit class SchemaUserActivitySessionOps[Self <: SchemaUserActivitySession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivities(value: js.Array[SchemaActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
        ret
    }
  }
  
}

