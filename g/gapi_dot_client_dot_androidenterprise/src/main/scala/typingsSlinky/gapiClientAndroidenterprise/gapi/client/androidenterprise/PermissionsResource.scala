package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidenterprise.AnonLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Retrieves details of an Android app permission for display to an enterprise admin. */
  def get(request: AnonLanguage): Request_[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(get: AnonLanguage => Request_[Permission]): PermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[PermissionsResource]
  }
}

