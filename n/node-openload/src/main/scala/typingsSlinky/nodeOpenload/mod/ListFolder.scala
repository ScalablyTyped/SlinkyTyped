package typingsSlinky.nodeOpenload.mod

import typingsSlinky.nodeOpenload.AnonCstatus
import typingsSlinky.nodeOpenload.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFolder extends js.Object {
  var files: js.Array[AnonCstatus] = js.native
  var folders: js.Array[AnonId] = js.native
}

object ListFolder {
  @scala.inline
  def apply(files: js.Array[AnonCstatus], folders: js.Array[AnonId]): ListFolder = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFolder]
  }
  @scala.inline
  implicit class ListFolderOps[Self <: ListFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[AnonCstatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolders(value: js.Array[AnonId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

