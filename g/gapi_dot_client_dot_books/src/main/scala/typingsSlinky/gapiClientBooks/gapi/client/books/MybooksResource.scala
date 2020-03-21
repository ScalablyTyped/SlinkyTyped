package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonAcquireMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MybooksResource extends js.Object {
  /** Return a list of books in My Library. */
  def list(request: AnonAcquireMethod): Request_[Volumes]
}

object MybooksResource {
  @scala.inline
  def apply(list: AnonAcquireMethod => Request_[Volumes]): MybooksResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MybooksResource]
  }
}

