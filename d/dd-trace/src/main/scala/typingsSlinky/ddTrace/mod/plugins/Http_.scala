package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait Http_
  extends Integration
     with Analyzable {
  /**
    * List of URLs that should not be instrumented. Takes precedence over
    * whitelist if a URL matches an entry in both.
    *
    * @default []
    */
  var blacklist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.native
  /**
    * An array of headers to include in the span metadata.
    *
    * @default []
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  /**
    * Callback function to determine if there was an error. It should take a
    * status code as its only parameter and return `true` for success or `false`
    * for errors.
    *
    * @default code => code < 500
    */
  var validateStatus: js.UndefOr[js.Function1[/* code */ Double, Boolean]] = js.native
  /**
    * List of URLs that should be instrumented.
    *
    * @default /^.*$/
    */
  var whitelist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.native
}

object Http_ {
  @scala.inline
  def apply(): Http_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http_]
  }
  @scala.inline
  implicit class Http_Ops[Self <: Http_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklistFunction1(value: /* url */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlacklistRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlacklist(
      value: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateStatus(value: /* code */ Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelistFunction1(value: /* url */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhitelistRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhitelist(
      value: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = {
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

