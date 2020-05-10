package typingsSlinky.reactNativeJoi.mod

import typingsSlinky.reactNativeJoi.AnonArrays
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  /**
    * when true, stops validation on the first error, otherwise returns all the errors found. Defaults to true.
    */
  var abortEarly: js.UndefOr[Boolean] = js.native
  /**
    * when true, allows object to contain unknown keys which are ignored. Defaults to false.
    */
  var allowUnknown: js.UndefOr[Boolean] = js.native
  /**
    * provides an external data set to be used in references
    */
  var context: js.UndefOr[Context] = js.native
  /**
    * when true, attempts to cast values to the required types (e.g. a string to a number). Defaults to true.
    */
  var convert: js.UndefOr[Boolean] = js.native
  /**
    * overrides individual error messages. Defaults to no override ({}).
    */
  var language: js.UndefOr[LanguageRootOptions] = js.native
  /**
    * when true, do not apply default values. Defaults to false.
    */
  var noDefaults: js.UndefOr[Boolean] = js.native
  /**
    * sets the default presence requirements. Supported modes: 'optional', 'required', and 'forbidden'. Defaults to 'optional'.
    */
  var presence: js.UndefOr[
    typingsSlinky.reactNativeJoi.reactNativeJoiStrings.optional | typingsSlinky.reactNativeJoi.reactNativeJoiStrings.required | typingsSlinky.reactNativeJoi.reactNativeJoiStrings.forbidden
  ] = js.native
  /**
    * when true, ignores unknown keys with a function value. Defaults to false.
    */
  var skipFunctions: js.UndefOr[Boolean] = js.native
  /**
    * remove unknown elements from objects and arrays. Defaults to false
    * - when true, all unknown elements will be removed
    * - when an object:
    *      - objects - set to true to remove unknown keys from objects
    */
  var stripUnknown: js.UndefOr[Boolean | AnonArrays] = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortEarly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortEarly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortEarly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortEarly")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUnknown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnknown")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withConvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: LanguageRootOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withPresence(
      value: typingsSlinky.reactNativeJoi.reactNativeJoiStrings.optional | typingsSlinky.reactNativeJoi.reactNativeJoiStrings.required | typingsSlinky.reactNativeJoi.reactNativeJoiStrings.forbidden
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withStripUnknown(value: Boolean | AnonArrays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripUnknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripUnknown")(js.undefined)
        ret
    }
  }
  
}

