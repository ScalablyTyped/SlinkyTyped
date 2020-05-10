package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbideOptions extends js.Object {
  var error_labels: js.UndefOr[Boolean] = js.native
  var focus_on_invalid: js.UndefOr[Boolean] = js.native
  var live_validate: js.UndefOr[Boolean] = js.native
  var patterns: js.UndefOr[AbidePatterns] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var validate_on_blur: js.UndefOr[Boolean] = js.native
  var validators: js.UndefOr[js.Object] = js.native
}

object AbideOptions {
  @scala.inline
  def apply(): AbideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbideOptions]
  }
  @scala.inline
  implicit class AbideOptionsOps[Self <: AbideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError_labels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_labels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_labels")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus_on_invalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus_on_invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus_on_invalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus_on_invalid")(js.undefined)
        ret
    }
    @scala.inline
    def withLive_validate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live_validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLive_validate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live_validate")(js.undefined)
        ret
    }
    @scala.inline
    def withPatterns(value: AbidePatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate_on_blur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate_on_blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate_on_blur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate_on_blur")(js.undefined)
        ret
    }
    @scala.inline
    def withValidators(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
  }
  
}

