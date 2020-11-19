package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileUserLinksCollection extends js.Object {
  
  // Adds a new user to the given view (profile).
  def insert(resource: EntityUserLink, accountId: String, webPropertyId: String, profileId: String): EntityUserLink = js.native
  
  // Lists profile-user links for a given view (profile).
  def list(accountId: String, webPropertyId: String, profileId: String): EntityUserLinks = js.native
  // Lists profile-user links for a given view (profile).
  def list(accountId: String, webPropertyId: String, profileId: String, optionalArgs: js.Object): EntityUserLinks = js.native
  
  // Removes a user from the given view (profile).
  def remove(accountId: String, webPropertyId: String, profileId: String, linkId: String): Unit = js.native
  
  // Updates permissions for an existing user on the given view (profile).
  def update(
    resource: EntityUserLink,
    accountId: String,
    webPropertyId: String,
    profileId: String,
    linkId: String
  ): EntityUserLink = js.native
}
