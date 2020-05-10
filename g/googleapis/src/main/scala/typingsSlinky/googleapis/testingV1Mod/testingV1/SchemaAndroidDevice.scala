package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Android device.
  */
@js.native
trait SchemaAndroidDevice extends js.Object {
  /**
    * Required. The id of the Android device to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidModelId: js.UndefOr[String] = js.native
  /**
    * Required. The id of the Android OS version to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidVersionId: js.UndefOr[String] = js.native
  /**
    * Required. The locale the test device used for testing. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Required. How the device is oriented during the test. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var orientation: js.UndefOr[String] = js.native
}

object SchemaAndroidDevice {
  @scala.inline
  def apply(): SchemaAndroidDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDevice]
  }
  @scala.inline
  implicit class SchemaAndroidDeviceOps[Self <: SchemaAndroidDevice] (val x: Self) extends AnyVal {
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

