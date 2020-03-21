package typingsSlinky.awsSdkEc2ErrorUnmarshaller

import typingsSlinky.awsSdkTypes.protocolMod.Member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/ec2-error-unmarshaller/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  @js.native
  trait ParsedLegacyErrorResponse extends js.Object {
    @JSName("$metadata")
    var $metadata: AnonRequestId = js.native
    var Errors: js.UndefOr[AnonError] = js.native
  }
  
  val ERR_RESP_SHAPE_LEGACY: Member = js.native
}

