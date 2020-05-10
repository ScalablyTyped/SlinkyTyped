package typingsSlinky.ddTrace.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [http2](https://nodejs.org/api/http2.html) module.
  *
  * By default any option set at the root will apply to both clients and
  * servers. To configure only one or the other, use the `client` and `server`
  * options.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.ddTrace.mod.Analyzable because Already inherited
- typingsSlinky.ddTrace.mod.plugins.Integration because Already inherited
- typingsSlinky.ddTrace.mod.plugins.Http_ because Already inherited
- typingsSlinky.ddTrace.mod.plugins.Http2Server because var conflicts: analytics, blacklist, enabled, headers, service, validateStatus, whitelist. Inlined  */ @js.native
trait http2 extends Http2Client {
  /**
    * Configuration for HTTP clients.
    */
  var client: js.UndefOr[Http2Client] = js.native
  /**
    * Configuration for HTTP servers.
    */
  var server: js.UndefOr[Http2Server] = js.native
}

object http2 {
  @scala.inline
  def apply(): http2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[http2]
  }
  @scala.inline
  implicit class http2Ops[Self <: http2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: Http2Client): Self = {
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
    def withServer(value: Http2Server): Self = {
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

