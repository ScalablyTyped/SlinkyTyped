package typingsSlinky.mongooseDelete.mod

import typingsSlinky.mongooseDelete.mongooseDeleteStrings.all
import typingsSlinky.mongooseDelete.mongooseDeleteStrings.deleteAt
import typingsSlinky.mongooseDelete.mongooseDeleteStrings.deleted
import typingsSlinky.mongooseDelete.mongooseDeleteStrings.deletedBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var deletedAt: Boolean = js.native
  var deletedBy: Boolean = js.native
  /**
    * DeleteBy Schema type, equal to
    * ```
    * Schema({
    * deletedBy: {
    *  type: options.deletedByType
    *  }
    * })
    * ```
    * @default ObjectId
    */
  var deletedByType: js.Any = js.native
  var indexFields: Boolean | all | deleted | deleteAt | deletedBy = js.native
  var overrideMethods: Boolean | all | js.Array[overridableMethods] = js.native
  var validateBeforeDelete: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(
    deletedAt: Boolean,
    deletedBy: Boolean,
    deletedByType: js.Any,
    indexFields: Boolean | all | deleted | deleteAt | deletedBy,
    overrideMethods: Boolean | all | js.Array[overridableMethods],
    validateBeforeDelete: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedByType = deletedByType.asInstanceOf[js.Any], indexFields = indexFields.asInstanceOf[js.Any], overrideMethods = overrideMethods.asInstanceOf[js.Any], validateBeforeDelete = validateBeforeDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedAt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedBy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedByType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedByType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexFields(value: Boolean | all | deleted | deleteAt | deletedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideMethods(value: Boolean | all | js.Array[overridableMethods]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateBeforeDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateBeforeDelete")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

