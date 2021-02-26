package typingsSlinky.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifier for a Photo.
  */
@js.native
trait SchemaPhotoId extends StObject {
  
  /**
    * Required. A unique identifier for a photo.
    */
  var id: js.UndefOr[String] = js.native
}
object SchemaPhotoId {
  
  @scala.inline
  def apply(): SchemaPhotoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhotoId]
  }
  
  @scala.inline
  implicit class SchemaPhotoIdMutableBuilder[Self <: SchemaPhotoId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
