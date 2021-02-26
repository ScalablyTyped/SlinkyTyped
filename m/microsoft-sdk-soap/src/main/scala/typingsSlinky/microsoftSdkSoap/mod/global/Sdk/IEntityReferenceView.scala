package typingsSlinky.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntityReferenceView extends StObject {
  
  var Id: java.lang.String = js.native
  
  var Name: java.lang.String = js.native
  
  var Type: java.lang.String = js.native
}
object IEntityReferenceView {
  
  @scala.inline
  def apply(Id: java.lang.String, Name: java.lang.String, Type: java.lang.String): IEntityReferenceView = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityReferenceView]
  }
  
  @scala.inline
  implicit class IEntityReferenceViewMutableBuilder[Self <: IEntityReferenceView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
