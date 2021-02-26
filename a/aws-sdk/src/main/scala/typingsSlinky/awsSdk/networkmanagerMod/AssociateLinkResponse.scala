package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateLinkResponse extends StObject {
  
  /**
    * The link association.
    */
  var LinkAssociation: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.LinkAssociation] = js.native
}
object AssociateLinkResponse {
  
  @scala.inline
  def apply(): AssociateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateLinkResponse]
  }
  
  @scala.inline
  implicit class AssociateLinkResponseMutableBuilder[Self <: AssociateLinkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkAssociation(value: LinkAssociation): Self = StObject.set(x, "LinkAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkAssociationUndefined: Self = StObject.set(x, "LinkAssociation", js.undefined)
  }
}
