package typingsSlinky.ethersprojectProviders.mod

import typingsSlinky.ethersprojectProviders.fallbackProviderMod.FallbackProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers", "FallbackProvider")
@js.native
class FallbackProvider protected ()
  extends typingsSlinky.ethersprojectProviders.fallbackProviderMod.FallbackProvider {
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
