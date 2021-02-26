package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInAppProductListing extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SchemaInAppProductListing {
  
  @scala.inline
  def apply(): SchemaInAppProductListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInAppProductListing]
  }
  
  @scala.inline
  implicit class SchemaInAppProductListingMutableBuilder[Self <: SchemaInAppProductListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
