package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Users.AliasesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Users.PhotosCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Channel
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.User
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserMakeAdmin
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserUndelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersCollection extends js.Object {
  
  var Aliases: js.UndefOr[AliasesCollection] = js.native
  
  var Photos: js.UndefOr[PhotosCollection] = js.native
  
  // retrieve user
  def get(userKey: String): User = js.native
  // retrieve user
  def get(userKey: String, optionalArgs: js.Object): User = js.native
  
  // create user.
  def insert(resource: User): User = js.native
  
  // Retrieve either deleted users or all users in a domain (paginated)
  def list(): typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Users = js.native
  // Retrieve either deleted users or all users in a domain (paginated)
  def list(optionalArgs: js.Object): typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Users = js.native
  
  // change admin status of a user
  def makeAdmin(resource: UserMakeAdmin, userKey: String): Unit = js.native
  
  // update user. This method supports patch semantics.
  def patch(resource: User, userKey: String): User = js.native
  
  // Delete user
  def remove(userKey: String): Unit = js.native
  
  // Undelete a deleted user
  def undelete(resource: UserUndelete, userKey: String): Unit = js.native
  
  // update user
  def update(resource: User, userKey: String): User = js.native
  
  // Watch for changes in users list
  def watch(resource: Channel): Channel = js.native
  // Watch for changes in users list
  def watch(resource: Channel, optionalArgs: js.Object): Channel = js.native
}
