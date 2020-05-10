package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of an Android device tests may be run on.
  */
@js.native
trait SchemaAndroidModel extends js.Object {
  /**
    * The company that this device is branded with. Example:
    * &quot;Google&quot;, &quot;Samsung&quot;.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * The name of the industrial design. This corresponds to
    * android.os.Build.DEVICE.
    */
  var codename: js.UndefOr[String] = js.native
  /**
    * Whether this device is virtual or physical.
    */
  var form: js.UndefOr[String] = js.native
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
    * True if and only if tests with this model are recorded by stitching
    * together screenshots. See use_low_spec_video_recording in device config.
    */
  var lowFpsVideoRecording: js.UndefOr[Boolean] = js.native
  /**
    * The manufacturer of this device.
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * The human-readable marketing name for this device model. Examples:
    * &quot;Nexus 5&quot;, &quot;Galaxy S5&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Screen density in DPI. This corresponds to ro.sf.lcd_density
    */
  var screenDensity: js.UndefOr[Double] = js.native
  /**
    * Screen size in the horizontal (X) dimension measured in pixels.
    */
  var screenX: js.UndefOr[Double] = js.native
  /**
    * Screen size in the vertical (Y) dimension measured in pixels.
    */
  var screenY: js.UndefOr[Double] = js.native
  /**
    * The list of supported ABIs for this device. This corresponds to either
    * android.os.Build.SUPPORTED_ABIS (for API level 21 and above) or
    * android.os.Build.CPU_ABI/CPU_ABI2. The most preferred ABI is the first
    * element in the list.  Elements are optionally prefixed by
    * &quot;version_id:&quot; (where version_id is the id of an
    * AndroidVersion), denoting an ABI that is supported only on a particular
    * version.
    */
  var supportedAbis: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of Android versions this device supports.
    */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAndroidModel {
  @scala.inline
  def apply(): SchemaAndroidModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidModel]
  }
  @scala.inline
  implicit class SchemaAndroidModelOps[Self <: SchemaAndroidModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(js.undefined)
        ret
    }
    @scala.inline
    def withCodename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codename")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
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
    def withLowFpsVideoRecording(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowFpsVideoRecording")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowFpsVideoRecording: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowFpsVideoRecording")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(js.undefined)
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
    def withScreenDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenDensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenDensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenDensity")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenX")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenY")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedAbis(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedAbis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedAbis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedAbis")(js.undefined)
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

