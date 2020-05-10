package typingsSlinky.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreSettings extends js.Object {
  /** When set to true, ignoring the alphanumeric words from the error word consideration.
    * @Default {true}
    */
  var ignoreAlphaNumericWords: js.UndefOr[String] = js.native
  /** When set to true, ignoring the Email address from the error word consideration.
    * @Default {true}
    */
  var ignoreEmailAddress: js.UndefOr[Boolean] = js.native
  /** When set to true, ignoring the file address path from the error word consideration.
    * @Default {true}
    */
  var ignoreFileNames: js.UndefOr[Boolean] = js.native
  /** When set to true, ignoring the MixedCase words from the error word consideration.
    * @Default {true}
    */
  var ignoreMixedCaseWords: js.UndefOr[Boolean] = js.native
  /** When set to true, ignoring the UpperCase words from the error word consideration.
    * @Default {true}
    */
  var ignoreUpperCase: js.UndefOr[Boolean] = js.native
  /** When set to true, ignoring the Url from the error word consideration.
    * @Default {true}
    */
  var ignoreUrl: js.UndefOr[Boolean] = js.native
}

object IgnoreSettings {
  @scala.inline
  def apply(): IgnoreSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreSettings]
  }
  @scala.inline
  implicit class IgnoreSettingsOps[Self <: IgnoreSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreAlphaNumericWords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAlphaNumericWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAlphaNumericWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAlphaNumericWords")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEmailAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFileNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFileNames")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreMixedCaseWords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMixedCaseWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMixedCaseWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMixedCaseWords")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUpperCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUpperCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUpperCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUpperCase")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrl")(js.undefined)
        ret
    }
  }
  
}

