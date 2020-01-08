package typingsSlinky.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typingsSlinky.awsDashSdk.clientsPollyMod.ClientConfiguration
import typingsSlinky.awsDashSdk.libPollyPresignerMod.Presigner.PresignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Polly ()
  extends typingsSlinky.awsDashSdk.awsDashSdkMod.Polly {
  def this(options: ClientConfiguration) = this()
}

@JSImport("mock-aws-s3", "Polly")
@js.native
object Polly extends js.Object {
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typingsSlinky.awsDashSdk.awsDashSdkMod.Polly.Presigner {
    def this(options: PresignerOptions) = this()
  }
  
}

