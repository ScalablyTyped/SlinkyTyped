package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single iOS device.
  */
@js.native
trait SchemaIosDevice extends js.Object {
  /**
    * Required. The id of the iOS device to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var iosModelId: js.UndefOr[String] = js.native
  /**
    * Required. The id of the iOS major software version to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var iosVersionId: js.UndefOr[String] = js.native
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

object SchemaIosDevice {
  @scala.inline
  def apply(): SchemaIosDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosDevice]
  }
  @scala.inline
  implicit class SchemaIosDeviceOps[Self <: SchemaIosDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIosModelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosModelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosModelId")(js.undefined)
        ret
    }
    @scala.inline
    def withIosVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosVersionId")(js.undefined)
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

