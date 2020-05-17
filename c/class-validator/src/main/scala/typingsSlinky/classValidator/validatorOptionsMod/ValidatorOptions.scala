package typingsSlinky.classValidator.validatorOptionsMod

import typingsSlinky.classValidator.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorOptions extends js.Object {
  /**
    * If set to true, the validation will not use default messages.
    * Error message always will be undefined if its not explicitly set.
    */
  var dismissDefaultMessages: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, instead of stripping non-whitelisted properties validator will throw an error
    */
  var forbidNonWhitelisted: js.UndefOr[Boolean] = js.native
  /**
    * Settings true will cause fail validation of unknown objects.
    */
  var forbidUnknownValues: js.UndefOr[Boolean] = js.native
  /**
    * Groups to be used during validation of the object.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set to true then validator will skip validation of all properties that are null or undefined in the validating object.
    */
  var skipMissingProperties: js.UndefOr[Boolean] = js.native
  /**
    * If set to true then validator will skip validation of all properties that are null in the validating object.
    */
  var skipNullProperties: js.UndefOr[Boolean] = js.native
  /**
    * If set to true then validator will skip validation of all properties that are undefined in the validating object.
    */
  var skipUndefinedProperties: js.UndefOr[Boolean] = js.native
  /**
    * ValidationError special options.
    */
  var validationError: js.UndefOr[Target] = js.native
  /**
    * If set to true validator will strip validated object of any properties that do not have any decorators.
    *
    * Tip: if no other decorator is suitable for your property use @Allow decorator.
    */
  var whitelist: js.UndefOr[Boolean] = js.native
}

object ValidatorOptions {
  @scala.inline
  def apply(): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatorOptions]
  }
  @scala.inline
  implicit class ValidatorOptionsOps[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismissDefaultMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissDefaultMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissDefaultMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissDefaultMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withForbidNonWhitelisted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidNonWhitelisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbidNonWhitelisted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidNonWhitelisted")(js.undefined)
        ret
    }
    @scala.inline
    def withForbidUnknownValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidUnknownValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbidUnknownValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidUnknownValues")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipMissingProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMissingProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipMissingProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMissingProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipNullProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNullProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipNullProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNullProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipUndefinedProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUndefinedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipUndefinedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUndefinedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationError(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationError")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

