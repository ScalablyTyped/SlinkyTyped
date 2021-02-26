package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsGenerateApprovalUrlResponse extends StObject {
  
  /**
    * A URL that can be rendered in an iframe to display the permissions (if any) of a product. This URL can be used to approve the product only once and only within 24 hours of being
    * generated, using the Products.approve call. If the product is currently unapproved and has no permissions, this URL will point to an empty page. If the product is currently
    * approved, a URL will only be generated if that product has added permissions since it was last approved, and the URL will only display those new permissions that have not yet been
    * accepted.
    */
  var url: js.UndefOr[String] = js.native
}
object ProductsGenerateApprovalUrlResponse {
  
  @scala.inline
  def apply(): ProductsGenerateApprovalUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductsGenerateApprovalUrlResponse]
  }
  
  @scala.inline
  implicit class ProductsGenerateApprovalUrlResponseMutableBuilder[Self <: ProductsGenerateApprovalUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
