package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonCpksver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryResource extends js.Object {
  /** Returns a list of offline dictionary metadata available */
  def listOfflineMetadata(request: AnonCpksver): Request_[Metadata]
}

object DictionaryResource {
  @scala.inline
  def apply(listOfflineMetadata: AnonCpksver => Request_[Metadata]): DictionaryResource = {
    val __obj = js.Dynamic.literal(listOfflineMetadata = js.Any.fromFunction1(listOfflineMetadata))
  
    __obj.asInstanceOf[DictionaryResource]
  }
}

