package typingsSlinky.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<redux-form.redux-form/lib/actions.InitializeOptions> */
@js.native
trait PartialInitializeOptions extends js.Object {
  var keepDirty: js.UndefOr[Boolean] = js.native
  var keepSubmitSucceeded: js.UndefOr[Boolean] = js.native
  var keepValues: js.UndefOr[Boolean] = js.native
  var updateUnregisteredFields: js.UndefOr[Boolean] = js.native
}

object PartialInitializeOptions {
  @scala.inline
  def apply(): PartialInitializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInitializeOptions]
  }
  @scala.inline
  implicit class PartialInitializeOptionsOps[Self <: PartialInitializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepSubmitSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSubmitSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepSubmitSucceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSubmitSucceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepValues")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUnregisteredFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUnregisteredFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateUnregisteredFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUnregisteredFields")(js.undefined)
        ret
    }
  }
  
}

