package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLunaClientRequest extends js.Object {
  /**
    * The new certificate for the client.
    */
  var Certificate: typingsSlinky.awsSdk.cloudhsmMod.Certificate = js.native
  /**
    * The ARN of the client.
    */
  var ClientArn: typingsSlinky.awsSdk.cloudhsmMod.ClientArn = js.native
}

object ModifyLunaClientRequest {
  @scala.inline
  def apply(Certificate: Certificate, ClientArn: ClientArn): ModifyLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], ClientArn = ClientArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLunaClientRequest]
  }
}

