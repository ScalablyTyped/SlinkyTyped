package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.devextremeStrings.A
import typingsSlinky.devextreme.devextremeStrings.B
import typingsSlinky.devextreme.devextremeStrings.C
import typingsSlinky.devextreme.devextremeStrings.android
import typingsSlinky.devextreme.devextremeStrings.desktop
import typingsSlinky.devextreme.devextremeStrings.generic
import typingsSlinky.devextreme.devextremeStrings.ios
import typingsSlinky.devextreme.devextremeStrings.phone
import typingsSlinky.devextreme.devextremeStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /** Indicates whether or not the device platform is Android. */
  var android: js.UndefOr[Boolean] = js.native
  /** Specifies the type of the device on which the application is running. */
  var deviceType: js.UndefOr[phone | tablet | desktop] = js.native
  /** Indicates whether or not the device platform is generic, which means that the application will look and behave according to a generic "light" or "dark" theme. */
  var generic: js.UndefOr[Boolean] = js.native
  /** Specifies a performance grade of the current device. */
  var grade: js.UndefOr[A | B | C] = js.native
  /** Indicates whether or not the device platform is iOS. */
  var ios: js.UndefOr[Boolean] = js.native
  /** Indicates whether or not the device type is 'phone'. */
  var phone: js.UndefOr[Boolean] = js.native
  /** Specifies the platform of the device on which the application is running. */
  var platform: js.UndefOr[android | ios | generic] = js.native
  /** Indicates whether or not the device type is 'tablet'. */
  var tablet: js.UndefOr[Boolean] = js.native
  /** Specifies an array with the major and minor versions of the device platform. */
  var version: js.UndefOr[js.Array[Double]] = js.native
}

object Device {
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceType(value: phone | tablet | desktop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(js.undefined)
        ret
    }
    @scala.inline
    def withGrade(value: A | B | C): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grade")(js.undefined)
        ret
    }
    @scala.inline
    def withIos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: android | ios | generic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withTablet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

