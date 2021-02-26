package typingsSlinky.ethersprojectProviders

import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudflareProviderMod {
  
  @JSImport("@ethersproject/providers/lib/cloudflare-provider", "CloudflareProvider")
  @js.native
  class CloudflareProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object CloudflareProvider {
    
    @JSImport("@ethersproject/providers/lib/cloudflare-provider", "CloudflareProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers/lib/cloudflare-provider", "CloudflareProvider.getUrl")
    @js.native
    def getUrl(network: Network): String = js.native
    @JSImport("@ethersproject/providers/lib/cloudflare-provider", "CloudflareProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): String = js.native
  }
}
