package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPortfolioAccessInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The ID of an organization node the portfolio is shared with. All children of this node with an inherited portfolio share will be returned.
    */
  var OrganizationParentId: js.UndefOr[Id] = js.native
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[PageSizeMax100] = js.native
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PageToken] = js.native
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
}
object ListPortfolioAccessInput {
  
  @scala.inline
  def apply(PortfolioId: Id): ListPortfolioAccessInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPortfolioAccessInput]
  }
  
  @scala.inline
  implicit class ListPortfolioAccessInputMutableBuilder[Self <: ListPortfolioAccessInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setOrganizationParentId(value: Id): Self = StObject.set(x, "OrganizationParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationParentIdUndefined: Self = StObject.set(x, "OrganizationParentId", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSizeMax100): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
  }
}
