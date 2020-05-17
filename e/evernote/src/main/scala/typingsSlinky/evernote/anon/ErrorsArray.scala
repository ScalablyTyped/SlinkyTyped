package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.ManageNotebookSharesError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorsArray extends js.Object {
  var errors: js.UndefOr[js.Array[ManageNotebookSharesError]] = js.native
}

object ErrorsArray {
  @scala.inline
  def apply(): ErrorsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorsArray]
  }
  @scala.inline
  implicit class ErrorsArrayOps[Self <: ErrorsArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[ManageNotebookSharesError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

