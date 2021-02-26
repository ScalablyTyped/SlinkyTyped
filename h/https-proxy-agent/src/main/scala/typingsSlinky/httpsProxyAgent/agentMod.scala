package typingsSlinky.httpsProxyAgent

import typingsSlinky.agentBase.mod.Agent
import typingsSlinky.httpsProxyAgent.mod.HttpsProxyAgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agentMod {
  
  @JSImport("https-proxy-agent/dist/agent", JSImport.Default)
  @js.native
  class default protected () extends HttpsProxyAgent {
    def this(_opts: String) = this()
    def this(_opts: HttpsProxyAgentOptions) = this()
  }
  
  @js.native
  trait HttpsProxyAgent extends Agent {
    
    var proxy: js.Any = js.native
    
    var secureProxy: js.Any = js.native
  }
}
