package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageRemoveInfo extends js.Object {
  var Deleted: String = js.native
  var Untagged: String = js.native
}

object ImageRemoveInfo {
  @scala.inline
  def apply(Deleted: String, Untagged: String): ImageRemoveInfo = {
    val __obj = js.Dynamic.literal(Deleted = Deleted.asInstanceOf[js.Any], Untagged = Untagged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRemoveInfo]
  }
  @scala.inline
  implicit class ImageRemoveInfoOps[Self <: ImageRemoveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntagged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Untagged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

