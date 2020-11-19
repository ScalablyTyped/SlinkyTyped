package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUserLinksCollection extends js.Object {
  
  // Adds a new user to the given account.
  def insert(resource: EntityUserLink, accountId: String): EntityUserLink = js.native
  
  // Lists account-user links for a given account.
  def list(accountId: String): EntityUserLinks = js.native
  // Lists account-user links for a given account.
  def list(accountId: String, optionalArgs: js.Object): EntityUserLinks = js.native
  
  // Removes a user from the given account.
  def remove(accountId: String, linkId: String): Unit = js.native
  
  // Updates permissions for an existing user on the given account.
  def update(resource: EntityUserLink, accountId: String, linkId: String): EntityUserLink = js.native
}
