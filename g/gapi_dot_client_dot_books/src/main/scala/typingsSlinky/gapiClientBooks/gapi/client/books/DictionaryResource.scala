package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonCpksver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictionaryResource extends js.Object {
  /** Returns a list of offline dictionary metadata available */
  def listOfflineMetadata(request: AnonCpksver): Request_[Metadata] = js.native
}

object DictionaryResource {
  @scala.inline
  def apply(listOfflineMetadata: AnonCpksver => Request_[Metadata]): DictionaryResource = {
    val __obj = js.Dynamic.literal(listOfflineMetadata = js.Any.fromFunction1(listOfflineMetadata))
    __obj.asInstanceOf[DictionaryResource]
  }
  @scala.inline
  implicit class DictionaryResourceOps[Self <: DictionaryResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListOfflineMetadata(value: AnonCpksver => Request_[Metadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listOfflineMetadata")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

