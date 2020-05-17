package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRoutingExtension Class */
@js.native
trait FaxInboundRoutingExtension extends js.Object {
  /** Is extension built in debug environment */
  val Debug: Boolean = js.native
  @JSName("FAXCOMEXLib.FaxInboundRoutingExtension_typekey")
  var FAXCOMEXLibDotFaxInboundRoutingExtension_typekey: FaxInboundRoutingExtension = js.native
  /** Extension's friendly name */
  val FriendlyName: String = js.native
  /** Full path and file name of the extension DLL */
  val ImageName: String = js.native
  /** Last error code at load or initialization */
  val InitErrorCode: Double = js.native
  /** The major part of extension's build number */
  val MajorBuild: Double = js.native
  /** The major part of extension's version number */
  val MajorVersion: Double = js.native
  /** Array of methods exposed by extension */
  val Methods: SafeArray[String] = js.native
  /** The minor part of extension's build number */
  val MinorBuild: Double = js.native
  /** The minor part of extension's version number */
  val MinorVersion: Double = js.native
  /** Load and initialization status of the extension */
  val Status: FAX_PROVIDER_STATUS_ENUM = js.native
  /** Extension's unique name */
  val UniqueName: String = js.native
}

object FaxInboundRoutingExtension {
  @scala.inline
  def apply(
    Debug: Boolean,
    FAXCOMEXLibDotFaxInboundRoutingExtension_typekey: FaxInboundRoutingExtension,
    FriendlyName: String,
    ImageName: String,
    InitErrorCode: Double,
    MajorBuild: Double,
    MajorVersion: Double,
    Methods: SafeArray[String],
    MinorBuild: Double,
    MinorVersion: Double,
    Status: FAX_PROVIDER_STATUS_ENUM,
    UniqueName: String
  ): FaxInboundRoutingExtension = {
    val __obj = js.Dynamic.literal(Debug = Debug.asInstanceOf[js.Any], FriendlyName = FriendlyName.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], InitErrorCode = InitErrorCode.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], Methods = Methods.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UniqueName = UniqueName.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxInboundRoutingExtension_typekey")(FAXCOMEXLibDotFaxInboundRoutingExtension_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxInboundRoutingExtension]
  }
  @scala.inline
  implicit class FaxInboundRoutingExtensionOps[Self <: FaxInboundRoutingExtension] (val x: Self) extends AnyVal {
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
    def withFAXCOMEXLibDotFaxInboundRoutingExtension_typekey(value: FaxInboundRoutingExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxInboundRoutingExtension_typekey")(value.asInstanceOf[js.Any])
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
    def withMethods(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Methods")(value.asInstanceOf[js.Any])
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
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

