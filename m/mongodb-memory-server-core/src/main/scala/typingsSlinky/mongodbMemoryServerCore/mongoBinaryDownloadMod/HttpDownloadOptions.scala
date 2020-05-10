package typingsSlinky.mongodbMemoryServerCore.mongoBinaryDownloadMod

import typingsSlinky.httpsProxyAgent.mod.HttpsProxyAgent
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.GET
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpDownloadOptions extends js.Object {
  var agent: js.UndefOr[HttpsProxyAgent] = js.native
  var hostname: String = js.native
  var method: GET | POST = js.native
  var path: String = js.native
  var port: String = js.native
}

object HttpDownloadOptions {
  @scala.inline
  def apply(hostname: String, method: GET | POST, path: String, port: String): HttpDownloadOptions = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDownloadOptions]
  }
  @scala.inline
  implicit class HttpDownloadOptionsOps[Self <: HttpDownloadOptions] (val x: Self) extends AnyVal {
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
    def withMethod(value: GET | POST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgent(value: HttpsProxyAgent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
  }
  
}

