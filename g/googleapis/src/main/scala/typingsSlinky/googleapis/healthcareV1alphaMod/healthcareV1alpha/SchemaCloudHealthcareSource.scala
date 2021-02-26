package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Healthcare API resource.
  */
@js.native
trait SchemaCloudHealthcareSource extends StObject {
  
  /**
    * Full path of a Cloud Healthcare API resource.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaCloudHealthcareSource {
  
  @scala.inline
  def apply(): SchemaCloudHealthcareSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudHealthcareSource]
  }
  
  @scala.inline
  implicit class SchemaCloudHealthcareSourceMutableBuilder[Self <: SchemaCloudHealthcareSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
