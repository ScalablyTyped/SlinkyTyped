package typingsSlinky.pacProxyAgent

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.degenerator.mod.CompileOptions
import typingsSlinky.httpProxyAgent.mod.BaseHttpProxyAgentOptions
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.pacProxyAgent.agentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pac-proxy-agent", JSImport.Namespace)
  @js.native
  def apply(opts: PacProxyAgentOptions): default = js.native
  @JSImport("pac-proxy-agent", JSImport.Namespace)
  @js.native
  def apply(uri: String): default = js.native
  @JSImport("pac-proxy-agent", JSImport.Namespace)
  @js.native
  def apply(uri: String, opts: PacProxyAgentOptions): default = js.native
  
  @JSImport("pac-proxy-agent", "PacProxyAgent")
  @js.native
  val PacProxyAgent: Instantiable2[/* uri */ String, /* opts */ js.UndefOr[PacProxyAgentOptions], default] = js.native
  type PacProxyAgent = default
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("pac-proxy-agent", "PacProxyAgent")
  @js.native
  class PacProxyAgentCls protected () extends default {
    def this(uri: String) = this()
    def this(uri: String, opts: PacProxyAgentOptions) = this()
  }
  
  /**
    * Supported "protocols". Delegates out to the `get-uri` module.
    */
  @JSImport("pac-proxy-agent", "protocols")
  @js.native
  val protocols: js.Array[String] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.socksProxyAgent.mod.BaseSocksProxyAgentOptions because var conflicts: host, port. Inlined 
  - typingsSlinky.httpsProxyAgent.mod.BaseHttpsProxyAgentOptions because var conflicts: host, path, port, secureProxy. Inlined headers
  - typingsSlinky.agentBase.mod.AgentOptions because var conflicts: timeout. Inlined 
  - typingsSlinky.socksProxyAgent.mod.SocksProxyAgentOptions because var conflicts: timeout. Inlined 
  - typingsSlinky.httpsProxyAgent.mod.HttpsProxyAgentOptions because var conflicts: timeout. Inlined 
  - typingsSlinky.httpProxyAgent.mod.HttpProxyAgentOptions because var conflicts: timeout. Inlined  */ @js.native
  trait PacProxyAgentOptions
    extends CompileOptions
       with BaseHttpProxyAgentOptions {
    
    var fallbackToDirect: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  object PacProxyAgentOptions {
    
    @scala.inline
    def apply(): PacProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PacProxyAgentOptions]
    }
    
    @scala.inline
    implicit class PacProxyAgentOptionsMutableBuilder[Self <: PacProxyAgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbackToDirect(value: Boolean): Self = StObject.set(x, "fallbackToDirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackToDirectUndefined: Self = StObject.set(x, "fallbackToDirect", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
