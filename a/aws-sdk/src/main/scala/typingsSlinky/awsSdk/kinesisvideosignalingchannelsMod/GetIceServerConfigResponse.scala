package typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIceServerConfigResponse extends js.Object {
  /**
    * The list of ICE server information objects.
    */
  var IceServerList: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.IceServerList] = js.native
}

object GetIceServerConfigResponse {
  @scala.inline
  def apply(): GetIceServerConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIceServerConfigResponse]
  }
  @scala.inline
  implicit class GetIceServerConfigResponseOps[Self <: GetIceServerConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIceServerList(value: IceServerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IceServerList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceServerList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IceServerList")(js.undefined)
        ret
    }
  }
  
}

