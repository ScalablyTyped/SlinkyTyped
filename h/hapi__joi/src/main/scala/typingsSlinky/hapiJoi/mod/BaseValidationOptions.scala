package typingsSlinky.hapiJoi.mod

import typingsSlinky.hapiJoi.AnonArrays
import typingsSlinky.hapiJoi.hapiJoiStrings.date
import typingsSlinky.hapiJoi.hapiJoiStrings.iso
import typingsSlinky.hapiJoi.hapiJoiStrings.string
import typingsSlinky.hapiJoi.hapiJoiStrings.time
import typingsSlinky.hapiJoi.hapiJoiStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseValidationOptions extends js.Object {
  /**
    * when true, stops validation on the first error, otherwise returns all the errors found.
    *
    * @default true
    */
  var abortEarly: js.UndefOr[Boolean] = js.native
  /**
    * when true, allows object to contain unknown keys which are ignored.
    *
    * @default false
    */
  var allowUnknown: js.UndefOr[Boolean] = js.native
  /**
    * when true, schema caching is enabled (for schemas with explicit caching rules).
    *
    * @default false
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * provides an external data set to be used in references
    */
  var context: js.UndefOr[Context] = js.native
  /**
    * when true, attempts to cast values to the required types (e.g. a string to a number).
    *
    * @default true
    */
  var convert: js.UndefOr[Boolean] = js.native
  /**
    * sets the string format used when converting dates to strings in error messages and casting.
    *
    * @default 'iso'
    */
  var dateFormat: js.UndefOr[date | iso | string | time | utc] = js.native
  /**
    * when true, valid results and throw errors are decorated with a debug property which includes an array of the validation steps used to generate the returned result.
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * error formatting settings.
    */
  var errors: js.UndefOr[ErrorFormattingOptions] = js.native
  /**
    * if false, the external rules set with `any.external()` are ignored, which is required to ignore any external validations in synchronous mode (or an exception is thrown).
    *
    * @default true
    */
  var externals: js.UndefOr[Boolean] = js.native
  /**
    * when true, do not apply default values.
    *
    * @default false
    */
  var noDefaults: js.UndefOr[Boolean] = js.native
  /**
    * when true, inputs are shallow cloned to include non-enumerables properties.
    *
    * @default false
    */
  var nonEnumerables: js.UndefOr[Boolean] = js.native
  /**
    * sets the default presence requirements. Supported modes: 'optional', 'required', and 'forbidden'.
    *
    * @default 'optional'
    */
  var presence: js.UndefOr[PresenceMode] = js.native
  /**
    * when true, ignores unknown keys with a function value.
    *
    * @default false
    */
  var skipFunctions: js.UndefOr[Boolean] = js.native
  /**
    * remove unknown elements from objects and arrays.
    * - when true, all unknown elements will be removed
    * - when an object:
    *      - objects - set to true to remove unknown keys from objects
    *
    * @default false
    */
  var stripUnknown: js.UndefOr[Boolean | AnonArrays] = js.native
}

object BaseValidationOptions {
  @scala.inline
  def apply(): BaseValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseValidationOptions]
  }
  @scala.inline
  implicit class BaseValidationOptionsOps[Self <: BaseValidationOptions] (val x: Self) extends AnyVal {
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
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
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
    def withDateFormat(value: date | iso | string | time | utc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: ErrorFormattingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withExternals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externals")(js.undefined)
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
    def withNonEnumerables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEnumerables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonEnumerables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEnumerables")(js.undefined)
        ret
    }
    @scala.inline
    def withPresence(value: PresenceMode): Self = {
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

