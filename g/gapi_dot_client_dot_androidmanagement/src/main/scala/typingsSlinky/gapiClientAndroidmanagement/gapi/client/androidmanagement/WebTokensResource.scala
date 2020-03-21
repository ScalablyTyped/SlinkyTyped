package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidmanagement.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTokensResource extends js.Object {
  /** Creates a web token to access an embeddable managed Google Play web UI for a given enterprise. */
  def create(request: AnonKey): Request_[WebToken]
}

object WebTokensResource {
  @scala.inline
  def apply(create: AnonKey => Request_[WebToken]): WebTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[WebTokensResource]
  }
}

