package typingsSlinky.ethers.mod.providers

import typingsSlinky.ethersprojectProviders.fallbackProviderMod.FallbackProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.FallbackProvider")
@js.native
class FallbackProvider protected ()
  extends typingsSlinky.ethersprojectProviders.mod.FallbackProvider {
  def this(providers: js.Array[
        typingsSlinky.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig
      ]) = this()
  def this(
    providers: js.Array[
        typingsSlinky.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig
      ],
    quorum: Double
  ) = this()
}
