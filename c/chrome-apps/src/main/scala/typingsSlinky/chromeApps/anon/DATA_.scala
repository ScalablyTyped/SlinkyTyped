package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.data_
import typingsSlinky.chromeApps.chromeAppsStrings.explicitFeedback
import typingsSlinky.chromeApps.chromeAppsStrings.feedback_
import typingsSlinky.chromeApps.chromeAppsStrings.notification_
import typingsSlinky.chromeApps.chromeAppsStrings.periodic_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DATA_ extends js.Object {
  var DATA: data_ = js.native
  var EXPLICIT_FEEDBACK: explicitFeedback = js.native
  var FEEDBACK: feedback_ = js.native
  var NOTIFICATION: notification_ = js.native
  var PERIODIC: periodic_ = js.native
}

object DATA_ {
  @scala.inline
  def apply(
    DATA: data_,
    EXPLICIT_FEEDBACK: explicitFeedback,
    FEEDBACK: feedback_,
    NOTIFICATION: notification_,
    PERIODIC: periodic_
  ): DATA_ = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], EXPLICIT_FEEDBACK = EXPLICIT_FEEDBACK.asInstanceOf[js.Any], FEEDBACK = FEEDBACK.asInstanceOf[js.Any], NOTIFICATION = NOTIFICATION.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DATA_]
  }
  @scala.inline
  implicit class DATA_Ops[Self <: DATA_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDATA(value: data_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXPLICIT_FEEDBACK(value: explicitFeedback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXPLICIT_FEEDBACK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFEEDBACK(value: feedback_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FEEDBACK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOTIFICATION(value: notification_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTIFICATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPERIODIC(value: periodic_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERIODIC")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

