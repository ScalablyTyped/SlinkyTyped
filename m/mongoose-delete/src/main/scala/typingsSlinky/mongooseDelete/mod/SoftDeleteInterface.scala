package typingsSlinky.mongooseDelete.mod

import typingsSlinky.mongoose.mod.Document
import typingsSlinky.mongoose.mod.Types.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftDeleteInterface extends js.Object {
  var deleteAt: js.UndefOr[js.Date] = js.native
  /** Soft deleted ? */
  var deleted: Boolean = js.native
  var deletedBy: js.UndefOr[ObjectId | String | Document] = js.native
}

object SoftDeleteInterface {
  @scala.inline
  def apply(deleted: Boolean): SoftDeleteInterface = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftDeleteInterface]
  }
  @scala.inline
  implicit class SoftDeleteInterfaceOps[Self <: SoftDeleteInterface] (val x: Self) extends AnyVal {
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
    def withDeleteAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletedBy(value: ObjectId | String | Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedBy")(js.undefined)
        ret
    }
  }
  
}

