package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for associating a deal and a creative.
  */
@js.native
trait SchemaAddDealAssociationRequest extends StObject {
  
  /**
    * The association between a creative and a deal that should be added.
    */
  var association: js.UndefOr[SchemaCreativeDealAssociation] = js.native
}
object SchemaAddDealAssociationRequest {
  
  @scala.inline
  def apply(): SchemaAddDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddDealAssociationRequest]
  }
  
  @scala.inline
  implicit class SchemaAddDealAssociationRequestMutableBuilder[Self <: SchemaAddDealAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: SchemaCreativeDealAssociation): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
  }
}
