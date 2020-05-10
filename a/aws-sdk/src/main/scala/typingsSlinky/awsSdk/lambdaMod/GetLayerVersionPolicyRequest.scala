package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionPolicyRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typingsSlinky.awsSdk.lambdaMod.LayerName = js.native
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber = js.native
}

object GetLayerVersionPolicyRequest {
  @scala.inline
  def apply(LayerName: LayerName, VersionNumber: LayerVersionNumber): GetLayerVersionPolicyRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionPolicyRequest]
  }
  @scala.inline
  implicit class GetLayerVersionPolicyRequestOps[Self <: GetLayerVersionPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerName(value: LayerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionNumber(value: LayerVersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

