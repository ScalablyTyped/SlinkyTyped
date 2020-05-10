package typingsSlinky.dingtalkRobotSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAtMobiles extends js.Object {
  var atMobiles: js.Array[String] = js.native
  var isAtAll: Boolean = js.native
}

object AnonAtMobiles {
  @scala.inline
  def apply(atMobiles: js.Array[String], isAtAll: Boolean): AnonAtMobiles = {
    val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAtMobiles]
  }
  @scala.inline
  implicit class AnonAtMobilesOps[Self <: AnonAtMobiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtMobiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atMobiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAtAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAtAll")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

