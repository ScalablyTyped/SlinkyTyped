package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Collection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsCollection extends js.Object {
  // Gets one resource by id.
  def get(groupUniqueId: String): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
  // Updates an existing resource. This method supports patch semantics.
  def patch(
    resource: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
    groupUniqueId: String
  ): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
  // Updates an existing resource.
  def update(
    resource: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
    groupUniqueId: String
  ): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
}

object GroupsCollection {
  @scala.inline
  def apply(
    get: String => typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
    patch: (typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, String) => typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
    update: (typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, String) => typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
  ): GroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[GroupsCollection]
  }
}

