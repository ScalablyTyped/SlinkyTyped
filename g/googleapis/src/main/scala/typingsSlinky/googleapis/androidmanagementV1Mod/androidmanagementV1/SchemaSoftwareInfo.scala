package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about device software.
  */
@js.native
trait SchemaSoftwareInfo extends StObject {
  
  /**
    * Android build ID string meant for displaying to the user. For example,
    * shamu-userdebug 6.0.1 MOB30I 2756745 dev-keys.
    */
  var androidBuildNumber: js.UndefOr[String] = js.native
  
  /**
    * Build time.
    */
  var androidBuildTime: js.UndefOr[String] = js.native
  
  /**
    * The Android Device Policy app version code.
    */
  var androidDevicePolicyVersionCode: js.UndefOr[Double] = js.native
  
  /**
    * The Android Device Policy app version as displayed to the user.
    */
  var androidDevicePolicyVersionName: js.UndefOr[String] = js.native
  
  /**
    * The user-visible Android version string. For example, 6.0.1.
    */
  var androidVersion: js.UndefOr[String] = js.native
  
  /**
    * The system bootloader version number, e.g. 0.6.7.
    */
  var bootloaderVersion: js.UndefOr[String] = js.native
  
  /**
    * SHA-256 hash of android.content.pm.Signature
    * (https://developer.android.com/reference/android/content/pm/Signature.html)
    * associated with the system package, which can be used to verify that the
    * system build hasn&#39;t been modified.
    */
  var deviceBuildSignature: js.UndefOr[String] = js.native
  
  /**
    * Kernel version, for example, 2.6.32.9-g103d848.
    */
  var deviceKernelVersion: js.UndefOr[String] = js.native
  
  /**
    * An IETF BCP 47 language code for the primary locale on the device.
    */
  var primaryLanguageCode: js.UndefOr[String] = js.native
  
  /**
    * Security patch level, e.g. 2016-05-01.
    */
  var securityPatchLevel: js.UndefOr[String] = js.native
}
object SchemaSoftwareInfo {
  
  @scala.inline
  def apply(): SchemaSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareInfo]
  }
  
  @scala.inline
  implicit class SchemaSoftwareInfoMutableBuilder[Self <: SchemaSoftwareInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidBuildNumber(value: String): Self = StObject.set(x, "androidBuildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidBuildNumberUndefined: Self = StObject.set(x, "androidBuildNumber", js.undefined)
    
    @scala.inline
    def setAndroidBuildTime(value: String): Self = StObject.set(x, "androidBuildTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidBuildTimeUndefined: Self = StObject.set(x, "androidBuildTime", js.undefined)
    
    @scala.inline
    def setAndroidDevicePolicyVersionCode(value: Double): Self = StObject.set(x, "androidDevicePolicyVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDevicePolicyVersionCodeUndefined: Self = StObject.set(x, "androidDevicePolicyVersionCode", js.undefined)
    
    @scala.inline
    def setAndroidDevicePolicyVersionName(value: String): Self = StObject.set(x, "androidDevicePolicyVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDevicePolicyVersionNameUndefined: Self = StObject.set(x, "androidDevicePolicyVersionName", js.undefined)
    
    @scala.inline
    def setAndroidVersion(value: String): Self = StObject.set(x, "androidVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidVersionUndefined: Self = StObject.set(x, "androidVersion", js.undefined)
    
    @scala.inline
    def setBootloaderVersion(value: String): Self = StObject.set(x, "bootloaderVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootloaderVersionUndefined: Self = StObject.set(x, "bootloaderVersion", js.undefined)
    
    @scala.inline
    def setDeviceBuildSignature(value: String): Self = StObject.set(x, "deviceBuildSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceBuildSignatureUndefined: Self = StObject.set(x, "deviceBuildSignature", js.undefined)
    
    @scala.inline
    def setDeviceKernelVersion(value: String): Self = StObject.set(x, "deviceKernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceKernelVersionUndefined: Self = StObject.set(x, "deviceKernelVersion", js.undefined)
    
    @scala.inline
    def setPrimaryLanguageCode(value: String): Self = StObject.set(x, "primaryLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryLanguageCodeUndefined: Self = StObject.set(x, "primaryLanguageCode", js.undefined)
    
    @scala.inline
    def setSecurityPatchLevel(value: String): Self = StObject.set(x, "securityPatchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPatchLevelUndefined: Self = StObject.set(x, "securityPatchLevel", js.undefined)
  }
}
