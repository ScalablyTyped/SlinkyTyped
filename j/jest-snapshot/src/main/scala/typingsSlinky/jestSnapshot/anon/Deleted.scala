package typingsSlinky.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deleted extends js.Object {
  var deleted: Boolean = js.native
  var saved: Boolean = js.native
}

object Deleted {
  @scala.inline
  def apply(deleted: Boolean, saved: Boolean): Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], saved = saved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
  @scala.inline
  implicit class DeletedOps[Self <: Deleted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

