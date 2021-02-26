package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRoutersPreviewResponse extends StObject {
  
  /**
    * Preview of given router.
    */
  var resource: js.UndefOr[SchemaRouter] = js.native
}
object SchemaRoutersPreviewResponse {
  
  @scala.inline
  def apply(): SchemaRoutersPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutersPreviewResponse]
  }
  
  @scala.inline
  implicit class SchemaRoutersPreviewResponseMutableBuilder[Self <: SchemaRoutersPreviewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: SchemaRouter): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
