package typingsSlinky.awsDashSdk.clientsAllMod

import typingsSlinky.awsDashSdk.clientsPollyMod.ClientConfiguration
import typingsSlinky.awsDashSdk.clientsPollyMod.^
import typingsSlinky.awsDashSdk.libPollyPresignerMod.Presigner.PresignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/all", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Polly () extends ^ {
  def this(options: ClientConfiguration) = this()
}

@JSImport("aws-sdk/clients/all", "Polly")
@js.native
object Polly extends js.Object {
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typingsSlinky.awsDashSdk.clientsPollyMod.Presigner {
    def this(options: PresignerOptions) = this()
  }
  
}

