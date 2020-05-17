package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.AltFields
import typingsSlinky.gapiClientBooks.anon.Drivedocumentid
import typingsSlinky.gapiClientBooks.anon.VolumeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudloadingResource extends js.Object {
  def addBook(request: Drivedocumentid): Request[BooksCloudloadingResource] = js.native
  /** Remove the book and its contents */
  def deleteBook(request: VolumeId): Request[Unit] = js.native
  def updateBook(request: AltFields): Request[BooksCloudloadingResource] = js.native
}

object CloudloadingResource {
  @scala.inline
  def apply(
    addBook: Drivedocumentid => Request[BooksCloudloadingResource],
    deleteBook: VolumeId => Request[Unit],
    updateBook: AltFields => Request[BooksCloudloadingResource]
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
    def withAddBook(value: Drivedocumentid => Request[BooksCloudloadingResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBook")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteBook(value: VolumeId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBook")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateBook(value: AltFields => Request[BooksCloudloadingResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBook")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

