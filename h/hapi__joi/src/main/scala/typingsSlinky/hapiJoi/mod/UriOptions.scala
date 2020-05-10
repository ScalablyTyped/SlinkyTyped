package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UriOptions extends js.Object {
  /**
    * Allows unencoded square brackets inside the query string.
    * This is NOT RFC 3986 compliant but query strings like abc[]=123&abc[]=456 are very common these days.
    *
    * @default false
    */
  var allowQuerySquareBrackets: js.UndefOr[Boolean] = js.native
  /**
    * Allow relative URIs.
    *
    * @default false
    */
  var allowRelative: js.UndefOr[Boolean] = js.native
  /**
    * Validate the domain component using the options specified in `string.domain()`.
    */
  var domain: js.UndefOr[DomainOptions] = js.native
  /**
    * Restrict only relative URIs.
    *
    * @default false
    */
  var relativeOnly: js.UndefOr[Boolean] = js.native
  /**
    * Specifies one or more acceptable Schemes, should only include the scheme name.
    * Can be an Array or String (strings are automatically escaped for use in a Regular Expression).
    */
  var scheme: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
}

object UriOptions {
  @scala.inline
  def apply(): UriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriOptions]
  }
  @scala.inline
  implicit class UriOptionsOps[Self <: UriOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowQuerySquareBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowQuerySquareBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowQuerySquareBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowQuerySquareBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: DomainOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
  }
  
}

