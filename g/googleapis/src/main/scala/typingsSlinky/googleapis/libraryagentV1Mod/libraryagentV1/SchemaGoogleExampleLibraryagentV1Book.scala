package typingsSlinky.googleapis.libraryagentV1Mod.libraryagentV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single book in the library.
  */
@js.native
trait SchemaGoogleExampleLibraryagentV1Book extends js.Object {
  /**
    * The name of the book author.
    */
  var author: js.UndefOr[String] = js.native
  /**
    * The resource name of the book. Book names have the form
    * `shelves/{shelf_id}/books/{book_id}`. The name is ignored when creating a
    * book.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value indicating whether the book has been read.
    */
  var read: js.UndefOr[Boolean] = js.native
  /**
    * The title of the book.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleExampleLibraryagentV1Book {
  @scala.inline
  def apply(): SchemaGoogleExampleLibraryagentV1Book = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1Book]
  }
  @scala.inline
  implicit class SchemaGoogleExampleLibraryagentV1BookOps[Self <: SchemaGoogleExampleLibraryagentV1Book] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

