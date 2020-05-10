package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChannelIdMohClass extends js.Object {
  var channelId: String = js.native
  var mohClass: js.UndefOr[String] = js.native
}

object AnonChannelIdMohClass {
  @scala.inline
  def apply(channelId: String): AnonChannelIdMohClass = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannelIdMohClass]
  }
  @scala.inline
  implicit class AnonChannelIdMohClassOps[Self <: AnonChannelIdMohClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMohClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mohClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMohClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mohClass")(js.undefined)
        ret
    }
  }
  
}

