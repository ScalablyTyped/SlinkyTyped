package typingsSlinky.googleapis.libraryagentV1Mod.libraryagentV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Shelf contains a collection of books with a theme.
  */
@js.native
trait SchemaGoogleExampleLibraryagentV1Shelf extends js.Object {
  /**
    * Output only. The resource name of the shelf. Shelf names have the form
    * `shelves/{shelf_id}`. The name is ignored when creating a shelf.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The theme of the shelf
    */
  var theme: js.UndefOr[String] = js.native
}

object SchemaGoogleExampleLibraryagentV1Shelf {
  @scala.inline
  def apply(): SchemaGoogleExampleLibraryagentV1Shelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1Shelf]
  }
  @scala.inline
  implicit class SchemaGoogleExampleLibraryagentV1ShelfOps[Self <: SchemaGoogleExampleLibraryagentV1Shelf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

