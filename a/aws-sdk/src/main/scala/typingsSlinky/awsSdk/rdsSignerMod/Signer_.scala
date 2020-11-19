package typingsSlinky.awsSdk.rdsSignerMod

import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.rdsSignerMod.Signer.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/rds/signer", "Signer")
@js.native
/**
  * A signer object can be used to generate an auth token to a database.
  */
class Signer_ () extends js.Object {
  def this(options: SignerOptions) = this()
  
  /**
    * Generate an auth token to a database.
    */
  def getAuthToken(options: SignerOptions): String = js.native
  /**
    * Generate an auth token to a database.
    */
  def getAuthToken(options: SignerOptions, callback: js.Function2[/* err */ AWSError, /* token */ String, Unit]): Unit = js.native
}
