package typingsSlinky.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonOptions extends LinesOptions {
  /**
    * Replacer used to stringify the properties of the passed objects.
    */
  var stringifyReplacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  /**
    * The value to use when `undefined` values in the passed objects are encountered during stringification.
    * Will only be used if `stringifyReplacer` option wasn't specified.
    * @default undefined
    */
  var undefinedReplacement: js.UndefOr[js.Any] = js.native
}

object JsonOptions {
  @scala.inline
  def apply(): JsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonOptions]
  }
  @scala.inline
  implicit class JsonOptionsOps[Self <: JsonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStringifyReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifyReplacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStringifyReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifyReplacer")(js.undefined)
        ret
    }
    @scala.inline
    def withUndefinedReplacement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedReplacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndefinedReplacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedReplacement")(js.undefined)
        ret
    }
  }
  
}

