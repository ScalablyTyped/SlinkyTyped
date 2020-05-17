package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.Apns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsPayload extends js.Object {
  var apns: APNSNotificationPayload = js.native
  var badge: js.UndefOr[Double] = js.native
  var body: js.UndefOr[String] = js.native
  var debugging: Boolean = js.native
  var fcm: FCMNotificationPayload = js.native
  var mpns: MPNSNotificationPayload = js.native
  var payload: Apns = js.native
  var sound: js.UndefOr[String] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  def buildPayload(platforms: js.Array[String]): js.Object = js.native
}

object NotificationsPayload {
  @scala.inline
  def apply(
    apns: APNSNotificationPayload,
    buildPayload: js.Array[String] => js.Object,
    debugging: Boolean,
    fcm: FCMNotificationPayload,
    mpns: MPNSNotificationPayload,
    payload: Apns
  ): NotificationsPayload = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], buildPayload = js.Any.fromFunction1(buildPayload), debugging = debugging.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsPayload]
  }
  @scala.inline
  implicit class NotificationsPayloadOps[Self <: NotificationsPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApns(value: APNSNotificationPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildPayload(value: js.Array[String] => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPayload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDebugging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFcm(value: FCMNotificationPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMpns(value: MPNSNotificationPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Apns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

