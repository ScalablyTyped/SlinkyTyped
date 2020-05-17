package typingsSlinky.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QFolder extends js.Object {
  var qFolder: String = js.native
}

object QFolder {
  @scala.inline
  def apply(qFolder: String): QFolder = {
    val __obj = js.Dynamic.literal(qFolder = qFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFolder]
  }
  @scala.inline
  implicit class QFolderOps[Self <: QFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFolder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

