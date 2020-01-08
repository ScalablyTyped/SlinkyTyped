package typingsSlinky.awsDashSdk.awsDashSdkMod

import typingsSlinky.awsDashSdk.clientsCloudfrontMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "CloudFront")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class CloudFront ()
  extends typingsSlinky.awsDashSdk.clientsAllMod.CloudFront {
  def this(options: ClientConfiguration) = this()
}

@JSImport("aws-sdk", "CloudFront")
@js.native
object CloudFront extends js.Object {
  @js.native
  class Signer protected ()
    extends typingsSlinky.awsDashSdk.clientsAllMod.CloudFront.Signer {
    /**
      * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
      * 
      * @param {string} keyPairId - The ID of the CloudFront key pair being used.
      * @param {string} privateKey - A private key in RSA format.
      */
    def this(keyPairId: String, privateKey: String) = this()
  }
  
}

