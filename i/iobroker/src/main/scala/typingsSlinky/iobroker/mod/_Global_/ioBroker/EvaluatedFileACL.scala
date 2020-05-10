package typingsSlinky.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines access rights for a single file, applied to a user or group */
@js.native
trait EvaluatedFileACL extends FileACL {
  /** Whether the user may read the file */
  var read: Boolean = js.native
  /** Whether the user may write the file */
  var write: Boolean = js.native
}

object EvaluatedFileACL {
  @scala.inline
  def apply(owner: String, ownerGroup: String, permissions: Double, read: Boolean, write: Boolean): EvaluatedFileACL = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerGroup = ownerGroup.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluatedFileACL]
  }
  @scala.inline
  implicit class EvaluatedFileACLOps[Self <: EvaluatedFileACL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

