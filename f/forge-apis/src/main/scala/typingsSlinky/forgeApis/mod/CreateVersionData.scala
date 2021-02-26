package typingsSlinky.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVersionData extends StObject {
  
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.native
  
  var relationships: js.UndefOr[CreateVersionDataRelationships] = js.native
  
  var `type`: String = js.native
}
object CreateVersionData {
  
  @scala.inline
  def apply(`type`: String): CreateVersionData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVersionData]
  }
  
  @scala.inline
  implicit class CreateVersionDataMutableBuilder[Self <: CreateVersionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: CreateStorageDataAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: CreateVersionDataRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
