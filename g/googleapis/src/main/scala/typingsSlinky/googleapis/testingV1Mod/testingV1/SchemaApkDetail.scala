package typingsSlinky.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Android application details based on application manifest and apk archive
  * contents.
  */
@js.native
trait SchemaApkDetail extends StObject {
  
  var apkManifest: js.UndefOr[SchemaApkManifest] = js.native
}
object SchemaApkDetail {
  
  @scala.inline
  def apply(): SchemaApkDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkDetail]
  }
  
  @scala.inline
  implicit class SchemaApkDetailMutableBuilder[Self <: SchemaApkDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApkManifest(value: SchemaApkManifest): Self = StObject.set(x, "apkManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApkManifestUndefined: Self = StObject.set(x, "apkManifest", js.undefined)
  }
}
