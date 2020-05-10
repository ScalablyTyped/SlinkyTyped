package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidDevice extends js.Object {
  /**
    * The id of the Android device to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidModelId: js.UndefOr[String] = js.native
  /**
    * The id of the Android OS version to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidVersionId: js.UndefOr[String] = js.native
  /**
    * The locale the test device used for testing.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * How the device is oriented during the test.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var orientation: js.UndefOr[String] = js.native
}

object AndroidDevice {
  @scala.inline
  def apply(): AndroidDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDevice]
  }
  @scala.inline
  implicit class AndroidDeviceOps[Self <: AndroidDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidModelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidModelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidModelId")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
  }
  
}

