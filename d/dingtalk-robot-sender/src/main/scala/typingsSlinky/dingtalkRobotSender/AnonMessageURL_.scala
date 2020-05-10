package typingsSlinky.dingtalkRobotSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMessageURL_ extends js.Object {
  var messageURL: String = js.native
  var picURL: String = js.native
  var title: String = js.native
}

object AnonMessageURL_ {
  @scala.inline
  def apply(messageURL: String, picURL: String, title: String): AnonMessageURL_ = {
    val __obj = js.Dynamic.literal(messageURL = messageURL.asInstanceOf[js.Any], picURL = picURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageURL_]
  }
  @scala.inline
  implicit class AnonMessageURL_Ops[Self <: AnonMessageURL_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picURL")(value.asInstanceOf[js.Any])
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

