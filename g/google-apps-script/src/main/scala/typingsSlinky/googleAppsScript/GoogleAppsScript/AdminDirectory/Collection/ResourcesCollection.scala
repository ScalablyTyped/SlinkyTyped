package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Resources.BuildingsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Resources.CalendarsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Resources.FeaturesCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesCollection extends js.Object {
  var Buildings: js.UndefOr[BuildingsCollection] = js.native
  var Calendars: js.UndefOr[CalendarsCollection] = js.native
  var Features: js.UndefOr[FeaturesCollection] = js.native
}

object ResourcesCollection {
  @scala.inline
  def apply(): ResourcesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesCollection]
  }
  @scala.inline
  implicit class ResourcesCollectionOps[Self <: ResourcesCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildings(value: BuildingsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buildings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buildings")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendars(value: CalendarsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calendars")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: FeaturesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Features")(js.undefined)
        ret
    }
  }
  
}

