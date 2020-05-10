package typingsSlinky.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Document object, for use in "document.set({ ... })". */
@js.native
trait DocumentUpdateData extends js.Object {
  /**
    *
    * Represents a Visio application instance that contains this document.
    *
    * [Api set:  1.1]
    */
  var application: js.UndefOr[ApplicationUpdateData] = js.native
  /**
    *
    * Returns the DocumentView object.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[DocumentViewUpdateData] = js.native
}

object DocumentUpdateData {
  @scala.inline
  def apply(): DocumentUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentUpdateData]
  }
  @scala.inline
  implicit class DocumentUpdateDataOps[Self <: DocumentUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: ApplicationUpdateData): Self = {
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
    def withView(value: DocumentViewUpdateData): Self = {
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

