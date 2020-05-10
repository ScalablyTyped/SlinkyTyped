package typingsSlinky.instagramPrivateApi.liveStartBroadcastResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStartBroadcastResponseRootObject extends js.Object {
  var media_id: String = js.native
  var status: String = js.native
}

object LiveStartBroadcastResponseRootObject {
  @scala.inline
  def apply(media_id: String, status: String): LiveStartBroadcastResponseRootObject = {
    val __obj = js.Dynamic.literal(media_id = media_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStartBroadcastResponseRootObject]
  }
  @scala.inline
  implicit class LiveStartBroadcastResponseRootObjectOps[Self <: LiveStartBroadcastResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

