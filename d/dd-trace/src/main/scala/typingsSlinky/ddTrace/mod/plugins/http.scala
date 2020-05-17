package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [http](https://nodejs.org/api/http.html) module.
  *
  * By default any option set at the root will apply to both clients and
  * servers. To configure only one or the other, use the `client` and `server`
  * options.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.ddTrace.mod.Analyzable because Already inherited
- typingsSlinky.ddTrace.mod.plugins.Integration because Already inherited
- typingsSlinky.ddTrace.mod.plugins.Http_ because Already inherited
- typingsSlinky.ddTrace.mod.plugins.HttpServer because var conflicts: analytics, blacklist, enabled, headers, hooks, service, validateStatus, whitelist. Inlined  */ @js.native
trait http extends HttpClient {
  /**
    * Configuration for HTTP clients.
    */
  var client: js.UndefOr[HttpClient] = js.native
  /**
    * Hooks to run before spans are finished.
    */
  @JSName("hooks")
  var hooks_http: js.UndefOr[`1`] = js.native
  /**
    * Configuration for HTTP servers.
    */
  var server: js.UndefOr[HttpServer] = js.native
}

object http {
  @scala.inline
  def apply(): http = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[http]
  }
  @scala.inline
  implicit class httpOps[Self <: http] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: HttpClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: HttpServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
  }
  
}

