package typingsSlinky.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectOptions extends js.Object {
  /**
    * redirect location's hostname
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * if true, `options.query`
    * stomps over any existing query
    * parameters on current URL.
    * by default, will merge the two.
    */
  var overrideQuery: js.UndefOr[Boolean] = js.native
  /**
    * redirect location's pathname
    */
  var pathname: js.UndefOr[String] = js.native
  /**
    * if true, sets 301. defaults to 302.
    */
  var permanent: js.UndefOr[Boolean] = js.native
  /**
    * redirect location's port number
    */
  var port: js.UndefOr[String] = js.native
  /**
    * redirect location's query string parameters
    */
  var query: js.UndefOr[String | js.Object] = js.native
  /**
    * whether to redirect to http or https
    */
  var secure: js.UndefOr[Boolean] = js.native
}

object RedirectOptions {
  @scala.inline
  def apply(): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectOptions]
  }
  @scala.inline
  implicit class RedirectOptionsOps[Self <: RedirectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(js.undefined)
        ret
    }
    @scala.inline
    def withPermanent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermanent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanent")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
  }
  
}

