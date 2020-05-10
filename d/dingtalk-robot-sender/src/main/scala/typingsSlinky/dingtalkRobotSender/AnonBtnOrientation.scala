package typingsSlinky.dingtalkRobotSender

import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.`0`
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBtnOrientation extends js.Object {
  var btnOrientation: `0` | `1` = js.native
  var btns: js.UndefOr[js.Array[AnonActionURL]] = js.native
  var hideAvatar: `0` | `1` = js.native
  var singleTitle: js.UndefOr[String] = js.native
  var singleURL: js.UndefOr[String] = js.native
  var text: String = js.native
  var title: String = js.native
}

object AnonBtnOrientation {
  @scala.inline
  def apply(btnOrientation: `0` | `1`, hideAvatar: `0` | `1`, text: String, title: String): AnonBtnOrientation = {
    val __obj = js.Dynamic.literal(btnOrientation = btnOrientation.asInstanceOf[js.Any], hideAvatar = hideAvatar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBtnOrientation]
  }
  @scala.inline
  implicit class AnonBtnOrientationOps[Self <: AnonBtnOrientation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtnOrientation(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideAvatar(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAvatar")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withBtns(value: js.Array[AnonActionURL]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btns")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleURL")(js.undefined)
        ret
    }
  }
  
}

