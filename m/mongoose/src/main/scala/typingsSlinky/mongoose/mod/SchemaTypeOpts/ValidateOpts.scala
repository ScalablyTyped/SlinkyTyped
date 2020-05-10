package typingsSlinky.mongoose.mod.SchemaTypeOpts

import typingsSlinky.mongoose.mongooseBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateOpts extends ValidateOptsBase {
  /** deprecated */
  var isAsync: js.UndefOr[`false`] = js.native
  var validator: js.UndefOr[js.RegExp | ValidateFn[_]] = js.native
}

object ValidateOpts {
  @scala.inline
  def apply(): ValidateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOpts]
  }
  @scala.inline
  implicit class ValidateOptsOps[Self <: ValidateOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAsync(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatorFunction1(value: _ => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidatorRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidator(value: js.RegExp | ValidateFn[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
  }
  
}

