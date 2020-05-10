package typingsSlinky.phonegapPluginPush.PhonegapPluginPush

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * TODO: document all possible properties (I only got the android ones)
	 *
	 * Loosened up with a dictionary notation, but all non-defined properties need to use (map['prop']) notation
	 *
	 * Ideally the developer would overload (merged declaration) this or create a new interface that would extend this one
	 * so that he could specify any custom code without having to use array notation (map['prop']) for all of them.
	 */
@js.native
trait NotificationEventAdditionalData
  extends /* name */ StringDictionary[js.Any] {
  /**
  		 * Will be true if the application is started by clicking on the push notification, false if the app is already started. (Android/iOS only)
  		 */
  var coldstart: js.UndefOr[Boolean] = js.native
  var collapse_key: js.UndefOr[String] = js.native
  /**
  		 * Whether the notification was received while the app was in the foreground
  		 */
  var foreground: js.UndefOr[Boolean] = js.native
  var from: js.UndefOr[String] = js.native
  var notId: js.UndefOr[String] = js.native
}

object NotificationEventAdditionalData {
  @scala.inline
  def apply(): NotificationEventAdditionalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationEventAdditionalData]
  }
  @scala.inline
  implicit class NotificationEventAdditionalDataOps[Self <: NotificationEventAdditionalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColdstart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coldstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColdstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coldstart")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapse_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse_key")(js.undefined)
        ret
    }
    @scala.inline
    def withForeground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withNotId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notId")(js.undefined)
        ret
    }
  }
  
}

