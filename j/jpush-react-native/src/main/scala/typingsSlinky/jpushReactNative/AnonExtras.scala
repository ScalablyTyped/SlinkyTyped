package typingsSlinky.jpushReactNative

import typingsSlinky.jpushReactNative.jpushReactNativeStrings.notificationArrived
import typingsSlinky.jpushReactNative.jpushReactNativeStrings.notificationOpened
import typingsSlinky.jpushReactNative.mod.Extra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtras extends js.Object {
  /**
    * 对应“通知内容”字段
    */
  var content: String = js.native
  /**
    * 对应“附加内容”字段
    */
  var extras: Extra = js.native
  /**
    * 唯一标识通知消息的ID,可用于移除消息
    */
  var messageID: String = js.native
  var notificationEventType: notificationArrived | notificationOpened = js.native
  /**
    * 对应“通知标题”字段
    */
  var title: String = js.native
}

object AnonExtras {
  @scala.inline
  def apply(
    content: String,
    extras: Extra,
    messageID: String,
    notificationEventType: notificationArrived | notificationOpened,
    title: String
  ): AnonExtras = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], notificationEventType = notificationEventType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtras]
  }
  @scala.inline
  implicit class AnonExtrasOps[Self <: AnonExtras] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtras(value: Extra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationEventType(value: notificationArrived | notificationOpened): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationEventType")(value.asInstanceOf[js.Any])
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

