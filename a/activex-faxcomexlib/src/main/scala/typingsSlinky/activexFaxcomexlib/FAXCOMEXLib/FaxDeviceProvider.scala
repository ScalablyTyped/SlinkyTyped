package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDeviceProvider Class */
@js.native
trait FaxDeviceProvider extends js.Object {
  /** Is device provider built in debug environment */
  val Debug: Boolean = js.native
  /** Array of device IDs exposed by the provider */
  val DeviceIds: SafeArray[Double] = js.native
  @JSName("FAXCOMEXLib.FaxDeviceProvider_typekey")
  var FAXCOMEXLibDotFaxDeviceProvider_typekey: FaxDeviceProvider = js.native
  /** Provider's friendly name */
  val FriendlyName: String = js.native
  /** Full path and file name of the provider DLL */
  val ImageName: String = js.native
  /** Last error code at load or initialization */
  val InitErrorCode: Double = js.native
  /** The major part of the device provider's build number */
  val MajorBuild: Double = js.native
  /** The major part of the device provider's version number */
  val MajorVersion: Double = js.native
  /** The minor part of the device provider's build number */
  val MinorBuild: Double = js.native
  /** The minor part of the device provider's version number */
  val MinorVersion: Double = js.native
  /** Status of the device provider */
  val Status: FAX_PROVIDER_STATUS_ENUM = js.native
  /** TSP name used by the provider */
  val TapiProviderName: String = js.native
  /** Unique name of the provider */
  val UniqueName: String = js.native
}

object FaxDeviceProvider {
  @scala.inline
  def apply(
    Debug: Boolean,
    DeviceIds: SafeArray[Double],
    FAXCOMEXLibDotFaxDeviceProvider_typekey: FaxDeviceProvider,
    FriendlyName: String,
    ImageName: String,
    InitErrorCode: Double,
    MajorBuild: Double,
    MajorVersion: Double,
    MinorBuild: Double,
    MinorVersion: Double,
    Status: FAX_PROVIDER_STATUS_ENUM,
    TapiProviderName: String,
    UniqueName: String
  ): FaxDeviceProvider = {
    val __obj = js.Dynamic.literal(Debug = Debug.asInstanceOf[js.Any], DeviceIds = DeviceIds.asInstanceOf[js.Any], FriendlyName = FriendlyName.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], InitErrorCode = InitErrorCode.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TapiProviderName = TapiProviderName.asInstanceOf[js.Any], UniqueName = UniqueName.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxDeviceProvider_typekey")(FAXCOMEXLibDotFaxDeviceProvider_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxDeviceProvider]
  }
  @scala.inline
  implicit class FaxDeviceProviderOps[Self <: FaxDeviceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceIds(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxDeviceProvider_typekey(value: FaxDeviceProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxDeviceProvider_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FriendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: FAX_PROVIDER_STATUS_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTapiProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapiProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

