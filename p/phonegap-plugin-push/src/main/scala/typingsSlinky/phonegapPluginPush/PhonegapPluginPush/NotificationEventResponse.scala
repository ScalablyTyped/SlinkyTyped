package typingsSlinky.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEventResponse extends _EventResponse {
  /**
  		 * An optional collection of data sent by the 3rd party push service that does not fit in the above properties.
  		 */
  var additionalData: NotificationEventAdditionalData = js.native
  /**
  		 * The number of messages to be displayed in the badge iOS or message count in the notification shade in Android.
  		 * For windows, it represents the value in the badge notification which could be a number or a status glyph.
  		 */
  var count: String = js.native
  /**
  		 * The path of the image file to be displayed in the notification.
  		 */
  var image: String = js.native
  /**
  		 * The text of the push message sent from the 3rd party service.
  		 */
  var message: String = js.native
  /**
  		 * The name of the sound file to be played upon receipt of the notification.
  		 */
  var sound: String = js.native
  /**
  		 * The optional title of the push message sent from the 3rd party service.
  		 */
  var title: js.UndefOr[String] = js.native
}

object NotificationEventResponse {
  @scala.inline
  def apply(
    additionalData: NotificationEventAdditionalData,
    count: String,
    image: String,
    message: String,
    sound: String
  ): NotificationEventResponse = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventResponse]
  }
  @scala.inline
  implicit class NotificationEventResponseOps[Self <: NotificationEventResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalData(value: NotificationEventAdditionalData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
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

