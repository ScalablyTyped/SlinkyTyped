package typingsSlinky.awsSdk.browserDefaultMod

import typingsSlinky.awsSdk.rdsMod.ClientConfiguration
import typingsSlinky.awsSdk.rdsMod.^
import typingsSlinky.awsSdk.rdsSignerMod.Signer.SignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/browser_default", "RDS")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class RDS () extends ^ {
  def this(options: ClientConfiguration) = this()
}
object RDS {
  
  @JSImport("aws-sdk/clients/browser_default", "RDS.Signer")
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  class Signer ()
    extends typingsSlinky.awsSdk.rdsMod.Signer {
    def this(options: SignerOptions) = this()
  }
}
