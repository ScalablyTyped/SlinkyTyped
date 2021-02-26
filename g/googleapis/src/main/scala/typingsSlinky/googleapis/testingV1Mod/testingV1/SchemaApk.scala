package typingsSlinky.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Android package file to install.
  */
@js.native
trait SchemaApk extends StObject {
  
  /**
    * The path to an APK to be installed on the device before the test begins.
    */
  var location: js.UndefOr[SchemaFileReference] = js.native
  
  /**
    * The java package for the APK to be installed. Value is determined by
    * examining the application&#39;s manifest.
    */
  var packageName: js.UndefOr[String] = js.native
}
object SchemaApk {
  
  @scala.inline
  def apply(): SchemaApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApk]
  }
  
  @scala.inline
  implicit class SchemaApkMutableBuilder[Self <: SchemaApk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: SchemaFileReference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
