package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotification extends js.Object {
  /**
    * iOS Only
    * Signifies remote notification handling is complete
    */
  def finish(result: String): Unit = js.native
  /**
    * Gets the notification's main message from the `aps` object
    */
  def getAlert(): String | js.Object = js.native
  /**
    * Gets the badge count number from the `aps` object
    */
  def getBadgeCount(): Double = js.native
  /**
    * Gets the category string from the `aps` object
    */
  def getCategory(): String = js.native
  /**
    * Gets the content-available number from the `aps` object
    */
  def getContentAvailable(): Double = js.native
  /**
    * Gets the data object on the notif
    */
  def getData(): js.Object = js.native
  /**
    * An alias for `getAlert` to get the notification's main message string
    */
  def getMessage(): String | js.Object = js.native
  /**
    * Gets the sound string from the `aps` object
    */
  def getSound(): String = js.native
}

object PushNotification {
  @scala.inline
  def apply(
    finish: String => Unit,
    getAlert: () => String | js.Object,
    getBadgeCount: () => Double,
    getCategory: () => String,
    getContentAvailable: () => Double,
    getData: () => js.Object,
    getMessage: () => String | js.Object,
    getSound: () => String
  ): PushNotification = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction1(finish), getAlert = js.Any.fromFunction0(getAlert), getBadgeCount = js.Any.fromFunction0(getBadgeCount), getCategory = js.Any.fromFunction0(getCategory), getContentAvailable = js.Any.fromFunction0(getContentAvailable), getData = js.Any.fromFunction0(getData), getMessage = js.Any.fromFunction0(getMessage), getSound = js.Any.fromFunction0(getSound))
    __obj.asInstanceOf[PushNotification]
  }
  @scala.inline
  implicit class PushNotificationOps[Self <: PushNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinish(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAlert(value: () => String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBadgeCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBadgeCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCategory(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCategory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentAvailable(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentAvailable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetData(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMessage(value: () => String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSound(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSound")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

