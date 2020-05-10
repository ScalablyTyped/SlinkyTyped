package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.GroupItemsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.GroupsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.ReportsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.ErrorProto
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.Errors
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.Group
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupItemResource
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YouTubeAnalytics_ extends js.Object {
  var GroupItems: js.UndefOr[GroupItemsCollection] = js.native
  var Groups: js.UndefOr[GroupsCollection] = js.native
  var Reports: js.UndefOr[ReportsCollection] = js.native
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto = js.native
  // Create a new instance of Errors
  def newErrors(): Errors = js.native
  // Create a new instance of Group
  def newGroup(): Group = js.native
  // Create a new instance of GroupContentDetails
  def newGroupContentDetails(): GroupContentDetails = js.native
  // Create a new instance of GroupItem
  def newGroupItem(): GroupItem = js.native
  // Create a new instance of GroupItemResource
  def newGroupItemResource(): GroupItemResource = js.native
  // Create a new instance of GroupSnippet
  def newGroupSnippet(): GroupSnippet = js.native
}

object YouTubeAnalytics_ {
  @scala.inline
  def apply(
    newErrorProto: () => ErrorProto,
    newErrors: () => Errors,
    newGroup: () => Group,
    newGroupContentDetails: () => GroupContentDetails,
    newGroupItem: () => GroupItem,
    newGroupItemResource: () => GroupItemResource,
    newGroupSnippet: () => GroupSnippet
  ): YouTubeAnalytics_ = {
    val __obj = js.Dynamic.literal(newErrorProto = js.Any.fromFunction0(newErrorProto), newErrors = js.Any.fromFunction0(newErrors), newGroup = js.Any.fromFunction0(newGroup), newGroupContentDetails = js.Any.fromFunction0(newGroupContentDetails), newGroupItem = js.Any.fromFunction0(newGroupItem), newGroupItemResource = js.Any.fromFunction0(newGroupItemResource), newGroupSnippet = js.Any.fromFunction0(newGroupSnippet))
    __obj.asInstanceOf[YouTubeAnalytics_]
  }
  @scala.inline
  implicit class YouTubeAnalytics_Ops[Self <: YouTubeAnalytics_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewErrorProto(value: () => ErrorProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newErrorProto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewErrors(value: () => Errors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGroup(value: () => Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGroupContentDetails(value: () => GroupContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroupContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGroupItem(value: () => GroupItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroupItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGroupItemResource(value: () => GroupItemResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroupItemResource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGroupSnippet(value: () => GroupSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroupSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroupItems(value: GroupItemsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: GroupsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
    @scala.inline
    def withReports(value: ReportsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reports")(js.undefined)
        ret
    }
  }
  
}

