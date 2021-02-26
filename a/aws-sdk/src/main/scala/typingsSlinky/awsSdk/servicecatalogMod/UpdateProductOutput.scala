package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProductOutput extends StObject {
  
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewDetail] = js.native
  
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}
object UpdateProductOutput {
  
  @scala.inline
  def apply(): UpdateProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProductOutput]
  }
  
  @scala.inline
  implicit class UpdateProductOutputMutableBuilder[Self <: UpdateProductOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductViewDetail(value: ProductViewDetail): Self = StObject.set(x, "ProductViewDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductViewDetailUndefined: Self = StObject.set(x, "ProductViewDetail", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
