package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientStorage.anon.BucketFields
import typingsSlinky.maximMazurokGapiClientStorage.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationsResource extends js.Object {
  
  /** Permanently deletes a notification subscription. */
  def delete(): Request[Unit] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientStorage.anon.Notification): Request[Unit] = js.native
  
  /** View a notification configuration. */
  def get(): Request[Notification] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientStorage.anon.Notification): Request[Notification] = js.native
  
  /** Creates a notification subscription for a given bucket. */
  def insert(request: BucketFields): Request[Notification] = js.native
  def insert(request: Fields, body: Notification): Request[Notification] = js.native
  
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(): Request[Notifications] = js.native
  def list(request: Fields): Request[Notifications] = js.native
}
