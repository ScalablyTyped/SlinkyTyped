package typingsSlinky.mongooseDelete

import typingsSlinky.mongooseDelete.mod.overridableMethods
import typingsSlinky.mongooseDelete.mongooseDeleteStrings.all
import typingsSlinky.mongooseDelete.mongooseDeleteStrings.deleteAt
import typingsSlinky.mongooseDelete.mongooseDeleteStrings.deleted
import typingsSlinky.mongooseDelete.mongooseDeleteStrings.deletedBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mongoose-delete.mongoose-delete.Options> */
@js.native
trait PartialOptions extends js.Object {
  var deletedAt: js.UndefOr[Boolean] = js.native
  var deletedBy: js.UndefOr[Boolean] = js.native
  var deletedByType: js.UndefOr[js.Any] = js.native
  var indexFields: js.UndefOr[Boolean | all | deleted | deleteAt | deletedBy] = js.native
  var overrideMethods: js.UndefOr[Boolean | all | js.Array[overridableMethods]] = js.native
  var validateBeforeDelete: js.UndefOr[Boolean] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def withoutDeletedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletedBy(value: Boolean): Self = {
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
    @scala.inline
    def withDeletedByType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedByType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedByType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedByType")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexFields(value: Boolean | all | deleted | deleteAt | deletedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFields")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideMethods(value: Boolean | all | js.Array[overridableMethods]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateBeforeDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateBeforeDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateBeforeDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateBeforeDelete")(js.undefined)
        ret
    }
  }
  
}

