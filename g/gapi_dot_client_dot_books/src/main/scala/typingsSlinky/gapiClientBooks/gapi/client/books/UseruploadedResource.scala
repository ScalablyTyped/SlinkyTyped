package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonStartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseruploadedResource extends js.Object {
  /** Return a list of books uploaded by the current user. */
  def list(request: AnonStartIndex): Request_[Volumes]
}

object UseruploadedResource {
  @scala.inline
  def apply(list: AnonStartIndex => Request_[Volumes]): UseruploadedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UseruploadedResource]
  }
}

