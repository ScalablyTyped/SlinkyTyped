package typingsSlinky.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigRequest extends js.Object {
  /**
    * The ARN of the client.
    */
  var ClientArn: typingsSlinky.awsDashSdk.clientsCloudhsmMod.ClientArn = js.native
  /**
    * The client version.
    */
  var ClientVersion: typingsSlinky.awsDashSdk.clientsCloudhsmMod.ClientVersion = js.native
  /**
    * A list of ARNs that identify the high-availability partition groups that are associated with the client.
    */
  var HapgList: typingsSlinky.awsDashSdk.clientsCloudhsmMod.HapgList = js.native
}

object GetConfigRequest {
  @scala.inline
  def apply(ClientArn: ClientArn, ClientVersion: ClientVersion, HapgList: HapgList): GetConfigRequest = {
    val __obj = js.Dynamic.literal(ClientArn = ClientArn.asInstanceOf[js.Any], ClientVersion = ClientVersion.asInstanceOf[js.Any], HapgList = HapgList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConfigRequest]
  }
}

