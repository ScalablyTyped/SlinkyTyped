package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileFilterLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileFilterLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileFilterLinksCollection extends js.Object {
  
  // Returns a single profile filter link.
  def get(accountId: String, webPropertyId: String, profileId: String, linkId: String): ProfileFilterLink = js.native
  
  // Create a new profile filter link.
  def insert(resource: ProfileFilterLink, accountId: String, webPropertyId: String, profileId: String): ProfileFilterLink = js.native
  
  // Lists all profile filter links for a profile.
  def list(accountId: String, webPropertyId: String, profileId: String): ProfileFilterLinks = js.native
  // Lists all profile filter links for a profile.
  def list(accountId: String, webPropertyId: String, profileId: String, optionalArgs: js.Object): ProfileFilterLinks = js.native
  
  // Update an existing profile filter link. This method supports patch semantics.
  def patch(
    resource: ProfileFilterLink,
    accountId: String,
    webPropertyId: String,
    profileId: String,
    linkId: String
  ): ProfileFilterLink = js.native
  
  // Delete a profile filter link.
  def remove(accountId: String, webPropertyId: String, profileId: String, linkId: String): Unit = js.native
  
  // Update an existing profile filter link.
  def update(
    resource: ProfileFilterLink,
    accountId: String,
    webPropertyId: String,
    profileId: String,
    linkId: String
  ): ProfileFilterLink = js.native
}
