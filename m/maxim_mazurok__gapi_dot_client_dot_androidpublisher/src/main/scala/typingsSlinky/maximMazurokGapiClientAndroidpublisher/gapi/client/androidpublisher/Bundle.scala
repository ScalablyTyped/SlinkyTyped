package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bundle extends StObject {
  
  /** A sha1 hash of the upload payload, encoded as a hex string and matching the output of the sha1sum command. */
  var sha1: js.UndefOr[String] = js.native
  
  /** A sha256 hash of the upload payload, encoded as a hex string and matching the output of the sha256sum command. */
  var sha256: js.UndefOr[String] = js.native
  
  /** The version code of the Android App Bundle, as specified in the Android App Bundle's base module APK manifest file. */
  var versionCode: js.UndefOr[Double] = js.native
}
object Bundle {
  
  @scala.inline
  def apply(): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bundle]
  }
  
  @scala.inline
  implicit class BundleMutableBuilder[Self <: Bundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    @scala.inline
    def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
