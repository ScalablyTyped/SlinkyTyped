package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBooks.anon.Drivedocumentid
import typingsSlinky.maximMazurokGapiClientBooks.anon.Resource
import typingsSlinky.maximMazurokGapiClientBooks.anon.UploadType
import typingsSlinky.maximMazurokGapiClientBooks.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudloadingResource extends js.Object {
  
  /** Add a user-upload volume and triggers processing. */
  def addBook(): Request[BooksCloudloadingResource] = js.native
  def addBook(request: Drivedocumentid): Request[BooksCloudloadingResource] = js.native
  
  /** Remove the book and its contents */
  def deleteBook(): Request[js.Object] = js.native
  def deleteBook(request: UploadType): Request[js.Object] = js.native
  
  /** Updates a user-upload volume. */
  def updateBook(request: Resource): Request[BooksCloudloadingResource] = js.native
  def updateBook(request: Uploadprotocol, body: BooksCloudloadingResource): Request[BooksCloudloadingResource] = js.native
}
