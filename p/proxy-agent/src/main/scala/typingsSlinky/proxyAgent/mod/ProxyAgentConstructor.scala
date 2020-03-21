package typingsSlinky.proxyAgent.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.agentBase.mod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyAgentConstructor
  extends Instantiable1[
      (/* options */ AgentOptions) | (/* options */ String), 
      typingsSlinky.proxyAgent.mod.ProxyAgent.ProxyAgent
    ] {
  def apply(options: String): typingsSlinky.proxyAgent.mod.ProxyAgent.ProxyAgent = js.native
  def apply(options: AgentOptions): typingsSlinky.proxyAgent.mod.ProxyAgent.ProxyAgent = js.native
}

