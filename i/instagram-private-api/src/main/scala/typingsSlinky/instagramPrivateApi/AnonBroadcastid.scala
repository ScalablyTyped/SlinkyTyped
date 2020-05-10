package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBroadcastid extends js.Object {
  var broadcast_id: String = js.native
  var upload_url: String = js.native
}

object AnonBroadcastid {
  @scala.inline
  def apply(broadcast_id: String, upload_url: String): AnonBroadcastid = {
    val __obj = js.Dynamic.literal(broadcast_id = broadcast_id.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBroadcastid]
  }
  @scala.inline
  implicit class AnonBroadcastidOps[Self <: AnonBroadcastid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcast_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

