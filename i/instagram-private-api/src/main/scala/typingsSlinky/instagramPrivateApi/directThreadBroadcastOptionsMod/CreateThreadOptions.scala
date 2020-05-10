package typingsSlinky.instagramPrivateApi.directThreadBroadcastOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThreadOptions extends js.Object {
  var userIds: (js.Array[String | Double]) | String | Double = js.native
}

object CreateThreadOptions {
  @scala.inline
  def apply(userIds: (js.Array[String | Double]) | String | Double): CreateThreadOptions = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThreadOptions]
  }
  @scala.inline
  implicit class CreateThreadOptionsOps[Self <: CreateThreadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserIds(value: (js.Array[String | Double]) | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

