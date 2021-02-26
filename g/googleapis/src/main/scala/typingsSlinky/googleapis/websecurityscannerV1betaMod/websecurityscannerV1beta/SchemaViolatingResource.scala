package typingsSlinky.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information regarding any resource causing the vulnerability such as
  * JavaScript sources, image, audio files, etc.
  */
@js.native
trait SchemaViolatingResource extends StObject {
  
  /**
    * The MIME type of this resource.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * URL of this violating resource.
    */
  var resourceUrl: js.UndefOr[String] = js.native
}
object SchemaViolatingResource {
  
  @scala.inline
  def apply(): SchemaViolatingResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViolatingResource]
  }
  
  @scala.inline
  implicit class SchemaViolatingResourceMutableBuilder[Self <: SchemaViolatingResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
  }
}
