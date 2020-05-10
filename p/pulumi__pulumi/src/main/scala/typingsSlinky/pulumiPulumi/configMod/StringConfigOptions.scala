package typingsSlinky.pulumiPulumi.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringConfigOptions[K /* <: String */] extends js.Object {
  /**
    * The legal enum values. If it does not match, a ConfigEnumError is thrown.
    */
  var allowedValues: js.UndefOr[js.Array[K]] = js.native
  /**
    * The maximum string length. If the string is longer than this, a ConfigRangeError is thrown.
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * The minimum string length. If the string is not this long, a ConfigRangeError is thrown.
    */
  var minLength: js.UndefOr[Double] = js.native
  /**
    * A regular expression the string must match. If it does not match, a ConfigPatternError is thrown.
    */
  var pattern: js.UndefOr[String | js.RegExp] = js.native
}

object StringConfigOptions {
  @scala.inline
  def apply[K](): StringConfigOptions[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringConfigOptions[K]]
  }
  @scala.inline
  implicit class StringConfigOptionsOps[Self[k] <: StringConfigOptions[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withAllowedValues(value: js.Array[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedValues: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternRegExp(value: js.RegExp): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String | js.RegExp): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
  }
  
}

