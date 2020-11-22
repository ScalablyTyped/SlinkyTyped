package typingsSlinky.ethersprojectProviders

import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.formatterMod.CommunityResourcable
import typingsSlinky.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/url-json-rpc-provider", JSImport.Namespace)
@js.native
object urlJsonRpcProviderMod extends js.Object {
  
  @js.native
  class StaticJsonRpcProvider () extends JsonRpcProvider
  
  @js.native
  abstract class UrlJsonRpcProvider ()
    extends StaticJsonRpcProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
    
    val apiKey: js.Any = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[String] = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[String] = js.native
  }
  /* static members */
  @js.native
  object UrlJsonRpcProvider extends js.Object {
    
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    def getUrl(network: Network, apiKey: js.Any): String | ConnectionInfo = js.native
  }
}
