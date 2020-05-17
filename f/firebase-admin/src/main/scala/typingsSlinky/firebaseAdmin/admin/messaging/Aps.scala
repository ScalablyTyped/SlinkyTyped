package typingsSlinky.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the [aps dictionary](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
  * that is part of APNs messages.
  */
@js.native
trait Aps
  extends /* customData */ StringDictionary[js.Any] {
  /**
    * Alert to be included in the message. This may be a string or an object of
    * type `admin.messaging.ApsAlert`.
    */
  var alert: js.UndefOr[String | ApsAlert] = js.native
  /**
    * Badge to be displayed with the message. Set to 0 to remove the badge. When
    * not specified, the badge will remain unchanged.
    */
  var badge: js.UndefOr[Double] = js.native
  /**
    * Type of the notification.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * Specifies whether to configure a background update notification.
    */
  var contentAvailable: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether to set the `mutable-content` property on the message
    * so the clients can modify the notification via app extensions.
    */
  var mutableContent: js.UndefOr[Boolean] = js.native
  /**
    * Sound to be played with the message.
    */
  var sound: js.UndefOr[String | CriticalSound] = js.native
  /**
    * An app-specific identifier for grouping notifications.
    */
  var threadId: js.UndefOr[String] = js.native
}

object Aps {
  @scala.inline
  def apply(): Aps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aps]
  }
  @scala.inline
  implicit class ApsOps[Self <: Aps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: String | ApsAlert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
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
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withContentAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withMutableContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutableContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: String | CriticalSound): Self = {
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
    def withThreadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(js.undefined)
        ret
    }
  }
  
}

