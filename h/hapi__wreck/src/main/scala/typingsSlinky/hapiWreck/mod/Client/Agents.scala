package typingsSlinky.hapiWreck.mod.Client

import typingsSlinky.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agents extends js.Object {
  /**
    * The agent used for HTTP requests.
    */
  val http: Agent = js.native
  /**
    * The agent used for HTTPS requests.
    */
  val https: typingsSlinky.node.httpsMod.Agent = js.native
  /**
    * The agent used for HTTPS requests which ignores unauthorized requests.
    */
  val httpsAllowUnauthorized: typingsSlinky.node.httpsMod.Agent = js.native
}

object Agents {
  @scala.inline
  def apply(
    http: Agent,
    https: typingsSlinky.node.httpsMod.Agent,
    httpsAllowUnauthorized: typingsSlinky.node.httpsMod.Agent
  ): Agents = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], httpsAllowUnauthorized = httpsAllowUnauthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agents]
  }
  @scala.inline
  implicit class AgentsOps[Self <: Agents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttp(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttps(value: typingsSlinky.node.httpsMod.Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpsAllowUnauthorized(value: typingsSlinky.node.httpsMod.Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsAllowUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

