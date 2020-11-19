package typingsSlinky.googleapis.libraryagentV1Mod.libraryagentV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for LibraryAgent.ListBooks.
  */
@js.native
trait SchemaGoogleExampleLibraryagentV1ListBooksResponse extends js.Object {
  
  /**
    * The list of books.
    */
  var books: js.UndefOr[js.Array[SchemaGoogleExampleLibraryagentV1Book]] = js.native
  
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListBooksRequest.page_token field in the subsequent call to `ListBooks`
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleExampleLibraryagentV1ListBooksResponse {
  
  @scala.inline
  def apply(): SchemaGoogleExampleLibraryagentV1ListBooksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleExampleLibraryagentV1ListBooksResponseOps[Self <: SchemaGoogleExampleLibraryagentV1ListBooksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBooksVarargs(value: SchemaGoogleExampleLibraryagentV1Book*): Self = this.set("books", js.Array(value :_*))
    
    @scala.inline
    def setBooks(value: js.Array[SchemaGoogleExampleLibraryagentV1Book]): Self = this.set("books", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooks: Self = this.set("books", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
