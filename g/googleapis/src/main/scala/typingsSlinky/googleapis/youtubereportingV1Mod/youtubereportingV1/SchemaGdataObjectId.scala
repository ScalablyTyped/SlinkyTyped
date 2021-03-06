package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataObjectId extends StObject {
  
  /**
    * gdata
    */
  var bucketName: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var generation: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var objectName: js.UndefOr[String] = js.native
}
object SchemaGdataObjectId {
  
  @scala.inline
  def apply(): SchemaGdataObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataObjectId]
  }
  
  @scala.inline
  implicit class SchemaGdataObjectIdMutableBuilder[Self <: SchemaGdataObjectId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
  }
}
