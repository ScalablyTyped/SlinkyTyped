package typingsSlinky.getUrls.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.normalizeUrl.mod.Options {
  /**
  		Exclude URLs that match URLs in the given array.
  		@default []
  		*/
  val exclude: js.UndefOr[js.Array[String]] = js.native
  /**
  		Extract URLs that appear as query parameters in the found URLs.
  		@default false
  		*/
  val extractFromQueryString: js.UndefOr[Boolean] = js.native
  /**
  		Require URLs to have a scheme or leading `www.` to be considered an URL. When `false`, matches against a list of valid TLDs, so it will match URLs like `unicorn.education`.
  		Does not affect URLs in query parameters if using the `extractFromQueryString` option.
  		@default true
  		*/
  val requireSchemeOrWww: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractFromQueryString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractFromQueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractFromQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractFromQueryString")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireSchemeOrWww(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSchemeOrWww")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireSchemeOrWww: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSchemeOrWww")(js.undefined)
        ret
    }
  }
  
}

