package typingsSlinky.awsSdk.chainableTemporaryCredentialsMod

import typingsSlinky.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import typingsSlinky.awsSdk.credentialsMod.Credentials
import typingsSlinky.awsSdk.stsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/credentials/chainable_temporary_credentials", "ChainableTemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  */
class ChainableTemporaryCredentials_ () extends Credentials {
  def this(options: ChainableTemporaryCredentialsOptions) = this()
  
  /**
    * The STS service instance used to get and refresh temporary credentials from AWS STS.
    */
  val service: ^ = js.native
}
