package typingsSlinky.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typingsSlinky.awsDashSdk.clientsRdsMod.ClientConfiguration
import typingsSlinky.awsDashSdk.libRdsSignerMod.Signer.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "RDS")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class RDS ()
  extends typingsSlinky.awsDashSdk.awsDashSdkMod.RDS {
  def this(options: ClientConfiguration) = this()
}

@JSImport("mock-aws-s3", "RDS")
@js.native
object RDS extends js.Object {
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  class Signer ()
    extends typingsSlinky.awsDashSdk.awsDashSdkMod.RDS.Signer {
    def this(options: SignerOptions) = this()
  }
  
}

