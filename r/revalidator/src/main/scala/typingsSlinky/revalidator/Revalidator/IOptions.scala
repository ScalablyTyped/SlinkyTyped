package typingsSlinky.revalidator.Revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  /** When additionalProperties is true allow additional unvisited properties on the object. (default true) */
  var additionalProperties: js.UndefOr[Boolean] = js.native
  /** Enforce casting of some types (for integers/numbers are only supported) when it's possible, e.g. "42" => 42, but "forty2" => "forty2" for the integer type. */
  var cast: js.UndefOr[Boolean] = js.native
  /** When validateFormats is true also validate formats defined in validate.formatExtensions (default true) */
  var validateFormatExtensions: js.UndefOr[Boolean] = js.native
  /** Enforce format constraints (default true) */
  var validateFormats: js.UndefOr[Boolean] = js.native
  /** When validateFormats is true treat unrecognized formats as validation errors (default false) */
  var validateFormatsStrict: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withCast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFormatExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFormatExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateFormatExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFormatExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFormats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFormatsStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFormatsStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateFormatsStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFormatsStrict")(js.undefined)
        ret
    }
  }
  
}

