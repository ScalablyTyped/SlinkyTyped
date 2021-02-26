package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApkManifest extends StObject {
  
  /** User-readable name for the application. */
  var applicationLabel: js.UndefOr[String] = js.native
  
  var intentFilters: js.UndefOr[js.Array[IntentFilter]] = js.native
  
  /** Maximum API level on which the application is designed to run. */
  var maxSdkVersion: js.UndefOr[Double] = js.native
  
  /** Minimum API level required for the application to run. */
  var minSdkVersion: js.UndefOr[Double] = js.native
  
  /** Full Java-style package name for this application, e.g. "com.example.foo". */
  var packageName: js.UndefOr[String] = js.native
  
  /** Specifies the API Level on which the application is designed to run. */
  var targetSdkVersion: js.UndefOr[Double] = js.native
}
object ApkManifest {
  
  @scala.inline
  def apply(): ApkManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApkManifest]
  }
  
  @scala.inline
  implicit class ApkManifestMutableBuilder[Self <: ApkManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationLabel(value: String): Self = StObject.set(x, "applicationLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationLabelUndefined: Self = StObject.set(x, "applicationLabel", js.undefined)
    
    @scala.inline
    def setIntentFilters(value: js.Array[IntentFilter]): Self = StObject.set(x, "intentFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentFiltersUndefined: Self = StObject.set(x, "intentFilters", js.undefined)
    
    @scala.inline
    def setIntentFiltersVarargs(value: IntentFilter*): Self = StObject.set(x, "intentFilters", js.Array(value :_*))
    
    @scala.inline
    def setMaxSdkVersion(value: Double): Self = StObject.set(x, "maxSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSdkVersionUndefined: Self = StObject.set(x, "maxSdkVersion", js.undefined)
    
    @scala.inline
    def setMinSdkVersion(value: Double): Self = StObject.set(x, "minSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSdkVersionUndefined: Self = StObject.set(x, "minSdkVersion", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setTargetSdkVersion(value: Double): Self = StObject.set(x, "targetSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSdkVersionUndefined: Self = StObject.set(x, "targetSdkVersion", js.undefined)
  }
}
