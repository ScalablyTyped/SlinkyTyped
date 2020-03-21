package typingsSlinky.mongooseDelete.mod

import typingsSlinky.mongoose.mod.Document
import typingsSlinky.mongoose.mod.Types.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftDeleteInterface extends js.Object {
  var deleteAt: js.UndefOr[js.Date] = js.undefined
  /** Soft deleted ? */
  var deleted: Boolean
  var deletedBy: js.UndefOr[ObjectId | String | Document] = js.undefined
}

object SoftDeleteInterface {
  @scala.inline
  def apply(deleted: Boolean, deleteAt: js.Date = null, deletedBy: ObjectId | String | Document = null): SoftDeleteInterface = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any])
    if (deleteAt != null) __obj.updateDynamic("deleteAt")(deleteAt.asInstanceOf[js.Any])
    if (deletedBy != null) __obj.updateDynamic("deletedBy")(deletedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftDeleteInterface]
  }
}

