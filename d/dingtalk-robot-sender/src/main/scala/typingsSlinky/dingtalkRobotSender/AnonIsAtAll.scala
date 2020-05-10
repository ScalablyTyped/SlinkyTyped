package typingsSlinky.dingtalkRobotSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsAtAll extends js.Object {
  var atMobiles: js.Array[String] = js.native
  var isAtAll: Boolean = js.native
  var text: String = js.native
  var title: String = js.native
}

object AnonIsAtAll {
  @scala.inline
  def apply(atMobiles: js.Array[String], isAtAll: Boolean, text: String, title: String): AnonIsAtAll = {
    val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsAtAll]
  }
  @scala.inline
  implicit class AnonIsAtAllOps[Self <: AnonIsAtAll] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

