package typingsSlinky.httpDashProxyDashAgent.httpDashProxyDashAgentMod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpProxyAgent extends Agent {
  var proxy: Url = js.native
  var secureProxy: Boolean = js.native
}

