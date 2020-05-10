package typingsSlinky.gapiClientBooks

import typingsSlinky.gapiClientBooks.gapi.client.books.BooksAnnotationsRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCfiRange extends js.Object {
  /** Range in CFI format for this annotation for version above. */
  var cfiRange: js.UndefOr[BooksAnnotationsRange] = js.native
  /** Content version applicable to ranges below. */
  var contentVersion: js.UndefOr[String] = js.native
  /** Range in GB image format for this annotation for version above. */
  var gbImageRange: js.UndefOr[BooksAnnotationsRange] = js.native
  /** Range in GB text format for this annotation for version above. */
  var gbTextRange: js.UndefOr[BooksAnnotationsRange] = js.native
  /** Range in image CFI format for this annotation for version above. */
  var imageCfiRange: js.UndefOr[BooksAnnotationsRange] = js.native
}

object AnonCfiRange {
  @scala.inline
  def apply(): AnonCfiRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCfiRange]
  }
  @scala.inline
  implicit class AnonCfiRangeOps[Self <: AnonCfiRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCfiRange(value: BooksAnnotationsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cfiRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCfiRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cfiRange")(js.undefined)
        ret
    }
    @scala.inline
    def withContentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGbImageRange(value: BooksAnnotationsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbImageRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGbImageRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbImageRange")(js.undefined)
        ret
    }
    @scala.inline
    def withGbTextRange(value: BooksAnnotationsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbTextRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGbTextRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbTextRange")(js.undefined)
        ret
    }
    @scala.inline
    def withImageCfiRange(value: BooksAnnotationsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCfiRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageCfiRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCfiRange")(js.undefined)
        ret
    }
  }
  
}

