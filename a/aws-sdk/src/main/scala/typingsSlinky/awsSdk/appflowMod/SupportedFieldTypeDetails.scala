package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedFieldTypeDetails extends StObject {
  
  /**
    *  The initial supported version for fieldType. If this is later changed to a different version, v2 will be introduced. 
    */
  var v1: FieldTypeDetails = js.native
}
object SupportedFieldTypeDetails {
  
  @scala.inline
  def apply(v1: FieldTypeDetails): SupportedFieldTypeDetails = {
    val __obj = js.Dynamic.literal(v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFieldTypeDetails]
  }
  
  @scala.inline
  implicit class SupportedFieldTypeDetailsMutableBuilder[Self <: SupportedFieldTypeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setV1(value: FieldTypeDetails): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
  }
}
