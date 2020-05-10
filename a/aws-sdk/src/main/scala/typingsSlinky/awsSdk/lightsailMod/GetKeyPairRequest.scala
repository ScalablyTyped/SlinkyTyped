package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyPairRequest extends js.Object {
  /**
    * The name of the key pair for which you are requesting information.
    */
  var keyPairName: ResourceName = js.native
}

object GetKeyPairRequest {
  @scala.inline
  def apply(keyPairName: ResourceName): GetKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyPairRequest]
  }
  @scala.inline
  implicit class GetKeyPairRequestOps[Self <: GetKeyPairRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyPairName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPairName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

