package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateLinkResponse extends StObject {
  
  /**
    * Information about the link association.
    */
  var LinkAssociation: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.LinkAssociation] = js.native
}
object DisassociateLinkResponse {
  
  @scala.inline
  def apply(): DisassociateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateLinkResponse]
  }
  
  @scala.inline
  implicit class DisassociateLinkResponseMutableBuilder[Self <: DisassociateLinkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkAssociation(value: LinkAssociation): Self = StObject.set(x, "LinkAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkAssociationUndefined: Self = StObject.set(x, "LinkAssociation", js.undefined)
  }
}
