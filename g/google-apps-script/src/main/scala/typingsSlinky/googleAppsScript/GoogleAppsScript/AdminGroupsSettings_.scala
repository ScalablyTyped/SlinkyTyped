package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Collection.GroupsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminGroupsSettings_ extends js.Object {
  var Groups: js.UndefOr[GroupsCollection] = js.native
  // Create a new instance of Groups
  def newGroups(): typingsSlinky.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups = js.native
}

object AdminGroupsSettings_ {
  @scala.inline
  def apply(newGroups: () => typingsSlinky.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups): AdminGroupsSettings_ = {
    val __obj = js.Dynamic.literal(newGroups = js.Any.fromFunction0(newGroups))
    __obj.asInstanceOf[AdminGroupsSettings_]
  }
  @scala.inline
  implicit class AdminGroupsSettings_Ops[Self <: AdminGroupsSettings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewGroups(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroups")(js.Any.fromFunction0(value))
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
  }
  
}

