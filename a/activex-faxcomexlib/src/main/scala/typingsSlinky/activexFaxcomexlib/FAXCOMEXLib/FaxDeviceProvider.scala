package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDeviceProvider Class */
@js.native
trait FaxDeviceProvider extends StObject {
  
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
  implicit class FaxDeviceProviderMutableBuilder[Self <: FaxDeviceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "Debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIds(value: SafeArray[Double]): Self = StObject.set(x, "DeviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxDeviceProvider_typekey(value: FaxDeviceProvider): Self = StObject.set(x, "FAXCOMEXLib.FaxDeviceProvider_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "FriendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageName(value: String): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitErrorCode(value: Double): Self = StObject.set(x, "InitErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorBuild(value: Double): Self = StObject.set(x, "MajorBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersion(value: Double): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorBuild(value: Double): Self = StObject.set(x, "MinorBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersion(value: Double): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: FAX_PROVIDER_STATUS_ENUM): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapiProviderName(value: String): Self = StObject.set(x, "TapiProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "UniqueName", value.asInstanceOf[js.Any])
  }
}
