package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProductsResponse extends js.Object {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of products. */
  var products: js.UndefOr[js.Array[Product]] = js.native
}
object ListProductsResponse {
  
  @scala.inline
  def apply(): ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductsResponse]
  }
  
  @scala.inline
  implicit class ListProductsResponseOps[Self <: ListProductsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: Product*): Self = this.set("products", js.Array(value :_*))
    
    @scala.inline
    def setProducts(value: js.Array[Product]): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
  }
}
