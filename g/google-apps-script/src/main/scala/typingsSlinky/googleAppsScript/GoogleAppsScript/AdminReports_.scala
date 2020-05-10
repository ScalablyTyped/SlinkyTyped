package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReports.Collection.ActivitiesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReports.Collection.ChannelsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReports.Collection.CustomerUsageReportsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReports.Collection.EntityUsageReportsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReports.Collection.UserUsageReportCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReports.Schema.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminReports_ extends js.Object {
  var Activities: js.UndefOr[ActivitiesCollection] = js.native
  var Channels: js.UndefOr[ChannelsCollection] = js.native
  var CustomerUsageReports: js.UndefOr[CustomerUsageReportsCollection] = js.native
  var EntityUsageReports: js.UndefOr[EntityUsageReportsCollection] = js.native
  var UserUsageReport: js.UndefOr[UserUsageReportCollection] = js.native
  // Create a new instance of Channel
  def newChannel(): Channel = js.native
}

object AdminReports_ {
  @scala.inline
  def apply(newChannel: () => Channel): AdminReports_ = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel))
    __obj.asInstanceOf[AdminReports_]
  }
  @scala.inline
  implicit class AdminReports_Ops[Self <: AdminReports_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewChannel(value: () => Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivities(value: ActivitiesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activities")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: ChannelsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerUsageReports(value: CustomerUsageReportsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerUsageReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerUsageReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerUsageReports")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityUsageReports(value: EntityUsageReportsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityUsageReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityUsageReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityUsageReports")(js.undefined)
        ret
    }
    @scala.inline
    def withUserUsageReport(value: UserUsageReportCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserUsageReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserUsageReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserUsageReport")(js.undefined)
        ret
    }
  }
  
}

