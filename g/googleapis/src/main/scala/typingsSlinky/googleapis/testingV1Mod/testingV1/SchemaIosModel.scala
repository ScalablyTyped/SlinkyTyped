package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of an iOS device tests may be run on.
  */
@js.native
trait SchemaIosModel extends js.Object {
  /**
    * Device capabilities. Copied from
    * https://developer.apple.com/library/archive/documentation/DeviceInformation/Reference/iOSDeviceCompatibility/DeviceCompatibilityMatrix/DeviceCompatibilityMatrix.html
    */
  var deviceCapabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether this device is a phone, tablet, wearable, etc.
    */
  var formFactor: js.UndefOr[String] = js.native
  /**
    * The unique opaque id for this model. Use this for invoking the
    * TestExecutionService.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The human-readable name for this device model. Examples: &quot;iPhone
    * 4s&quot;, &quot;iPad Mini 2&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The set of iOS major software versions this device supports.
    */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaIosModel {
  @scala.inline
  def apply(): SchemaIosModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosModel]
  }
  @scala.inline
  implicit class SchemaIosModelOps[Self <: SchemaIosModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withFormFactor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedVersionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedVersionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedVersionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedVersionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

