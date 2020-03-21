package typingsSlinky.gapiClientMirror.gapi.client.mirror

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientMirror.AnonAccountName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Inserts a new account for a user */
  def insert(request: AnonAccountName): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(insert: AnonAccountName => Request_[Account]): AccountsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

