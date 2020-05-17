package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewFolder extends js.Object {
  var Cancel: Boolean = js.native
  val NewFolder: js.Any = js.native
}

object NewFolder {
  @scala.inline
  def apply(Cancel: Boolean, NewFolder: js.Any): NewFolder = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewFolder = NewFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewFolder]
  }
  @scala.inline
  implicit class NewFolderOps[Self <: NewFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewFolder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewFolder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

