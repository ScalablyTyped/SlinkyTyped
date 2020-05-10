package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Collection.ActivityCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.ConsolidationStrategy
import typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveActivity_ extends js.Object {
  var Activity: js.UndefOr[ActivityCollection] = js.native
  // Create a new instance of ConsolidationStrategy
  def newConsolidationStrategy(): ConsolidationStrategy = js.native
  // Create a new instance of Legacy
  def newLegacy(): js.Any = js.native
  // Create a new instance of NoConsolidation
  def newNoConsolidation(): js.Any = js.native
  // Create a new instance of QueryDriveActivityRequest
  def newQueryDriveActivityRequest(): QueryDriveActivityRequest = js.native
}

object DriveActivity_ {
  @scala.inline
  def apply(
    newConsolidationStrategy: () => ConsolidationStrategy,
    newLegacy: () => js.Any,
    newNoConsolidation: () => js.Any,
    newQueryDriveActivityRequest: () => QueryDriveActivityRequest
  ): DriveActivity_ = {
    val __obj = js.Dynamic.literal(newConsolidationStrategy = js.Any.fromFunction0(newConsolidationStrategy), newLegacy = js.Any.fromFunction0(newLegacy), newNoConsolidation = js.Any.fromFunction0(newNoConsolidation), newQueryDriveActivityRequest = js.Any.fromFunction0(newQueryDriveActivityRequest))
    __obj.asInstanceOf[DriveActivity_]
  }
  @scala.inline
  implicit class DriveActivity_Ops[Self <: DriveActivity_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewConsolidationStrategy(value: () => ConsolidationStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConsolidationStrategy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLegacy(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLegacy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNoConsolidation(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNoConsolidation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewQueryDriveActivityRequest(value: () => QueryDriveActivityRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newQueryDriveActivityRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivity(value: ActivityCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activity")(js.undefined)
        ret
    }
  }
  
}

