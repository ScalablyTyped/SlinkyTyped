package typingsSlinky.gapiClientPlaycustomapp.gapi.client.playcustomapp

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPlaycustomapp.AnonAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAppsResource extends js.Object {
  /** Create and publish a new custom app. */
  def create(request: AnonAccount): Request_[CustomApp]
}

object CustomAppsResource {
  @scala.inline
  def apply(create: AnonAccount => Request_[CustomApp]): CustomAppsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[CustomAppsResource]
  }
}

