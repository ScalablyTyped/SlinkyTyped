package typingsSlinky.mongooseDelete.mod

import typingsSlinky.mongoose.mod.Document
import typingsSlinky.mongoose.mod.Types.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftDeleteInterface extends js.Object {
  var deleteAt: js.UndefOr[js.Date] = js.undefined
  /** Soft deleted ? */
  var deleted: js.UndefOr[Boolean] = js.undefined
  var deletedBy: js.UndefOr[ObjectId | String | Document] = js.undefined
}

object SoftDeleteInterface {
  @scala.inline
  def apply(
    deleteAt: js.Date = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    deletedBy: ObjectId | String | Document = null
  ): SoftDeleteInterface = {
    val __obj = js.Dynamic.literal()
    if (deleteAt != null) __obj.updateDynamic("deleteAt")(deleteAt.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (deletedBy != null) __obj.updateDynamic("deletedBy")(deletedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftDeleteInterface]
  }
}

