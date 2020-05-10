package typingsSlinky.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "document.toJSON()". */
@js.native
trait DocumentData extends js.Object {
  /**
    *
    * Represents a Visio application instance that contains this document. Read-only.
    *
    * [Api set:  1.1]
    */
  var application: js.UndefOr[ApplicationData] = js.native
  /**
    *
    * Represents a collection of pages associated with the document. Read-only.
    *
    * [Api set:  1.1]
    */
  var pages: js.UndefOr[js.Array[PageData]] = js.native
  /**
    *
    * Returns the DocumentView object. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[DocumentViewData] = js.native
}

object DocumentData {
  @scala.inline
  def apply(): DocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentData]
  }
  @scala.inline
  implicit class DocumentDataOps[Self <: DocumentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: ApplicationData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: js.Array[PageData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: DocumentViewData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

