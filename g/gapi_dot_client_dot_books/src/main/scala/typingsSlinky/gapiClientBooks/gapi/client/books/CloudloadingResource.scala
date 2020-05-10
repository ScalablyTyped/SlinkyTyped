package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonAltFields
import typingsSlinky.gapiClientBooks.AnonDrivedocumentid
import typingsSlinky.gapiClientBooks.AnonVolumeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudloadingResource extends js.Object {
  def addBook(request: AnonDrivedocumentid): Request_[BooksCloudloadingResource] = js.native
  /** Remove the book and its contents */
  def deleteBook(request: AnonVolumeId): Request_[Unit] = js.native
  def updateBook(request: AnonAltFields): Request_[BooksCloudloadingResource] = js.native
}

object CloudloadingResource {
  @scala.inline
  def apply(
    addBook: AnonDrivedocumentid => Request_[BooksCloudloadingResource],
    deleteBook: AnonVolumeId => Request_[Unit],
    updateBook: AnonAltFields => Request_[BooksCloudloadingResource]
  ): CloudloadingResource = {
    val __obj = js.Dynamic.literal(addBook = js.Any.fromFunction1(addBook), deleteBook = js.Any.fromFunction1(deleteBook), updateBook = js.Any.fromFunction1(updateBook))
    __obj.asInstanceOf[CloudloadingResource]
  }
  @scala.inline
  implicit class CloudloadingResourceOps[Self <: CloudloadingResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBook(value: AnonDrivedocumentid => Request_[BooksCloudloadingResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBook")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteBook(value: AnonVolumeId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBook")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateBook(value: AnonAltFields => Request_[BooksCloudloadingResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBook")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

