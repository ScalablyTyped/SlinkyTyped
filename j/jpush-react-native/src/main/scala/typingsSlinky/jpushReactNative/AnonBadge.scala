package typingsSlinky.jpushReactNative

import typingsSlinky.jpushReactNative.jpushReactNativeStrings.notificationArrived
import typingsSlinky.jpushReactNative.jpushReactNativeStrings.notificationOpened
import typingsSlinky.jpushReactNative.mod.Extra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBadge extends js.Object {
  /**
    *  badge:对应 Portal 推送通知界面上的可选设置里面的“badge”字段 (ios only)
    */
  var badge: String = js.native
  /**
    *  content:对应 Portal 推送通知界面上的“通知内容”字段
    */
  var content: String = js.native
  /**
    *  extras:对应 Portal 推送消息界面上的“可选设置”里的附加字段
    */
  var extras: Extra = js.native
  /**
    *  messageID:唯一标识通知消息的 ID
    */
  var messageID: String = js.native
  /**
    *  notificationEventType：分为notificationArrived和notificationOpened两种
    */
  var notificationEventType: notificationArrived | notificationOpened = js.native
  /**
    *  ring:对应 Portal 推送通知界面上的可选设置里面的“sound”字段 (ios only)
    */
  var ring: String = js.native
  /**
    *  title:对应 Portal 推送通知界面上的“通知标题”字段
    */
  var title: String = js.native
}

object AnonBadge {
  @scala.inline
  def apply(
    badge: String,
    content: String,
    extras: Extra,
    messageID: String,
    notificationEventType: notificationArrived | notificationOpened,
    ring: String,
    title: String
  ): AnonBadge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], notificationEventType = notificationEventType.asInstanceOf[js.Any], ring = ring.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBadge]
  }
  @scala.inline
  implicit class AnonBadgeOps[Self <: AnonBadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withRing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ring")(value.asInstanceOf[js.Any])
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

