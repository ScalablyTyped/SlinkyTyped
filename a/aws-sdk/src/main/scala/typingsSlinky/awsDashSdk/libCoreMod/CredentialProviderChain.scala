package typingsSlinky.awsDashSdk.libCoreMod

import typingsSlinky.awsDashSdk.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "CredentialProviderChain")
@js.native
/**
  * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
  */
class CredentialProviderChain ()
  extends typingsSlinky.awsDashSdk.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.CredentialProviderChain {
  def this(providers: js.Array[provider]) = this()
}

/* static members */
@JSImport("aws-sdk/lib/core", "CredentialProviderChain")
@js.native
object CredentialProviderChain extends js.Object {
  var defaultProviders: js.Array[provider] = js.native
}

