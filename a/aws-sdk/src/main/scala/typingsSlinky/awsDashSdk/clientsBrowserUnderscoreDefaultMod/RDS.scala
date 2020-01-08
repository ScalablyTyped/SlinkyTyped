package typingsSlinky.awsDashSdk.clientsBrowserUnderscoreDefaultMod

import typingsSlinky.awsDashSdk.clientsRdsMod.ClientConfiguration
import typingsSlinky.awsDashSdk.clientsRdsMod.^
import typingsSlinky.awsDashSdk.libRdsSignerMod.Signer.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/browser_default", "RDS")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class RDS () extends ^ {
  def this(options: ClientConfiguration) = this()
}

@JSImport("aws-sdk/clients/browser_default", "RDS")
@js.native
object RDS extends js.Object {
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  class Signer ()
    extends typingsSlinky.awsDashSdk.clientsRdsMod.Signer {
    def this(options: SignerOptions) = this()
  }
  
}

