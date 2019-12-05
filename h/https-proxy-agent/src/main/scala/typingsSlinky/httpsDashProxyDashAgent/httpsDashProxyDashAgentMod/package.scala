package typingsSlinky.httpsDashProxyDashAgent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpsDashProxyDashAgentMod {
  import typingsSlinky.node.httpsMod.Agent

  // HttpsProxyAgent doesnt *actually* extend https.Agent, but for my purposes I want it to pretend that it does
  type HttpsProxyAgent = Agent
}
