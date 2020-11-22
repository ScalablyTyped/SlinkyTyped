package typingsSlinky.ethersprojectProviders.fallbackProviderMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectAbstractProvider.mod.Provider
import typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/fallback-provider", "FallbackProvider")
@js.native
class FallbackProvider protected () extends BaseProvider {
  def this(providers: js.Array[Provider | FallbackProviderConfig]) = this()
  def this(providers: js.Array[Provider | FallbackProviderConfig], quorum: Double) = this()
  
  var _highestBlockNumber: Double = js.native
  
  def perform(method: String, params: StringDictionary[js.Any]): js.Promise[_] = js.native
  
  val providerConfigs: js.Array[FallbackProviderConfig] = js.native
  
  val quorum: Double = js.native
}
