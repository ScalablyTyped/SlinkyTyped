package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  var accelerometer: Accelerometer = js.native
  var camera: Camera = js.native
  var capture: Capture = js.native
  var compass: Compass = js.native
  var connection: Connection = js.native
  var contacts: Contacts = js.native
  var device: Device = js.native
  var globalization: Globalization = js.native
  var notification: PhonegapNotification = js.native
  var splashscreen: Splashscreen = js.native
}

object Navigator {
  @scala.inline
  def apply(
    accelerometer: Accelerometer,
    camera: Camera,
    capture: Capture,
    compass: Compass,
    connection: Connection,
    contacts: Contacts,
    device: Device,
    globalization: Globalization,
    notification: PhonegapNotification,
    splashscreen: Splashscreen
  ): Navigator = {
    val __obj = js.Dynamic.literal(accelerometer = accelerometer.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], compass = compass.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], contacts = contacts.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], globalization = globalization.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], splashscreen = splashscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerometer(value: Accelerometer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerometer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCamera(value: Camera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapture(value: Capture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompass(value: Compass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContacts(value: Contacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalization(value: Globalization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: PhonegapNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplashscreen(value: Splashscreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splashscreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

