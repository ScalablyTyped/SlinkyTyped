package typingsSlinky.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "application.toJSON()". */
@js.native
trait ApplicationData extends js.Object {
  /**
    *
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote on the web, only one notebook at a time is open in the application instance. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebooks: js.UndefOr[js.Array[NotebookData]] = js.native
}

object ApplicationData {
  @scala.inline
  def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  @scala.inline
  implicit class ApplicationDataOps[Self <: ApplicationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebooks(value: js.Array[NotebookData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebooks")(js.undefined)
        ret
    }
  }
  
}

