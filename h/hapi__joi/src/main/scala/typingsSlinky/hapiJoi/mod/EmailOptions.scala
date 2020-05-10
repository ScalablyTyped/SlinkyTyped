package typingsSlinky.hapiJoi.mod

import typingsSlinky.hapiJoi.hapiJoiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailOptions extends js.Object {
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.native
  /**
    * if `true`, ignore invalid email length errors.
    *
    * @default false
    */
  var ignoreLength: js.UndefOr[Boolean] = js.native
  /**
    * Number of segments required for the domain. Be careful since some domains, such as `io`, directly allow email.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.native
  /**
    * if true, allows multiple email addresses in a single string, separated by , or the separator characters.
    *
    * @default false
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * when multiple is true, overrides the default , separator. String can be a single character or multiple separator characters.
    *
    * @default ','
    */
  var separator: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.native
}

object EmailOptions {
  @scala.inline
  def apply(): EmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOptions]
  }
  @scala.inline
  implicit class EmailOptionsOps[Self <: EmailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnicode")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDomainSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDomainSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDomainSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDomainSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withTlds(value: TopLevelDomainOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlds")(js.undefined)
        ret
    }
  }
  
}

