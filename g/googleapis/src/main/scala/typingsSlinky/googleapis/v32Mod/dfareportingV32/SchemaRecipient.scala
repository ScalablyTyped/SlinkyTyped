package typingsSlinky.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a recipient.
  */
@js.native
trait SchemaRecipient extends StObject {
  
  /**
    * The delivery type for the recipient.
    */
  var deliveryType: js.UndefOr[String] = js.native
  
  /**
    * The email address of the recipient.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The kind of resource this is, in this case dfareporting#recipient.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaRecipient {
  
  @scala.inline
  def apply(): SchemaRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecipient]
  }
  
  @scala.inline
  implicit class SchemaRecipientMutableBuilder[Self <: SchemaRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryType(value: String): Self = StObject.set(x, "deliveryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTypeUndefined: Self = StObject.set(x, "deliveryType", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
