package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePortfolioShareStatusOutput extends StObject {
  
  /**
    * Organization node identifier. It can be either account id, organizational unit id or organization id.
    */
  var OrganizationNodeValue: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.OrganizationNodeValue] = js.native
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: js.UndefOr[Id] = js.native
  
  /**
    * The token for the portfolio share operation. For example, share-6v24abcdefghi.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.native
  
  /**
    * Information about the portfolio share operation.
    */
  var ShareDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ShareDetails] = js.native
  
  /**
    * Status of the portfolio share operation.
    */
  var Status: js.UndefOr[ShareStatus] = js.native
}
object DescribePortfolioShareStatusOutput {
  
  @scala.inline
  def apply(): DescribePortfolioShareStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePortfolioShareStatusOutput]
  }
  
  @scala.inline
  implicit class DescribePortfolioShareStatusOutputMutableBuilder[Self <: DescribePortfolioShareStatusOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationNodeValue(value: OrganizationNodeValue): Self = StObject.set(x, "OrganizationNodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationNodeValueUndefined: Self = StObject.set(x, "OrganizationNodeValue", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioIdUndefined: Self = StObject.set(x, "PortfolioId", js.undefined)
    
    @scala.inline
    def setPortfolioShareToken(value: Id): Self = StObject.set(x, "PortfolioShareToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioShareTokenUndefined: Self = StObject.set(x, "PortfolioShareToken", js.undefined)
    
    @scala.inline
    def setShareDetails(value: ShareDetails): Self = StObject.set(x, "ShareDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareDetailsUndefined: Self = StObject.set(x, "ShareDetails", js.undefined)
    
    @scala.inline
    def setStatus(value: ShareStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
