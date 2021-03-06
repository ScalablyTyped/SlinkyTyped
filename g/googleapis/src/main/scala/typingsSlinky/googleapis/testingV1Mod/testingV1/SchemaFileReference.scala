package typingsSlinky.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a file, used for user inputs.
  */
@js.native
trait SchemaFileReference extends StObject {
  
  /**
    * A path to a file in Google Cloud Storage. Example:
    * gs://build-app-1414623860166/app-debug-unaligned.apk
    */
  var gcsPath: js.UndefOr[String] = js.native
}
object SchemaFileReference {
  
  @scala.inline
  def apply(): SchemaFileReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileReference]
  }
  
  @scala.inline
  implicit class SchemaFileReferenceMutableBuilder[Self <: SchemaFileReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
  }
}
