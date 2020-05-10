package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQFolder extends js.Object {
  var qFolder: String = js.native
}

object AnonQFolder {
  @scala.inline
  def apply(qFolder: String): AnonQFolder = {
    val __obj = js.Dynamic.literal(qFolder = qFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQFolder]
  }
  @scala.inline
  implicit class AnonQFolderOps[Self <: AnonQFolder] (val x: Self) extends AnyVal {
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

