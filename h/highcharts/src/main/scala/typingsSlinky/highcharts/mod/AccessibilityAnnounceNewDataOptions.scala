package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityAnnounceNewDataOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Optional formatter callback for
    * the announcement. Receives up to three arguments. The first argument is
    * always an array of all series that received updates. If an announcement
    * is already queued, the series that received updates for that announcement
    * are also included in this array. The second argument is provided if
    * `chart.addSeries` was called, and there is a new series. In that case,
    * this argument is a reference to the new series. The third argument,
    * similarly, is provided if `series.addPoint` was called, and there is a
    * new point. In that case, this argument is a reference to the new point.
    *
    * The function should return a string with the text to announce to the
    * user. Return empty string to not announce anything. Return `false` to use
    * the default announcement format.
    */
  var announcementFormatter: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable announcing new data to
    * screen reader users
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Choose whether or not the
    * announcements should interrupt the screen reader. If not enabled, the
    * user will be notified once idle. It is recommended not to enable this
    * setting unless there is a specific reason to do so.
    */
  var interruptUser: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Minimum interval between
    * announcements in milliseconds. If new data arrives before this amount of
    * time has passed, it is queued for announcement. If another new data event
    * happens while an announcement is queued, the queued announcement is
    * dropped, and the latest announcement is queued instead. Set to 0 to allow
    * all announcements, but be warned that frequent announcements are
    * disturbing to users.
    */
  var minAnnounceInterval: js.UndefOr[Double] = js.native
}

object AccessibilityAnnounceNewDataOptions {
  @scala.inline
  def apply(): AccessibilityAnnounceNewDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityAnnounceNewDataOptions]
  }
  @scala.inline
  implicit class AccessibilityAnnounceNewDataOptionsOps[Self <: AccessibilityAnnounceNewDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnouncementFormatter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announcementFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnouncementFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announcementFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInterruptUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterruptUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptUser")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAnnounceInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAnnounceInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAnnounceInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAnnounceInterval")(js.undefined)
        ret
    }
  }
  
}

