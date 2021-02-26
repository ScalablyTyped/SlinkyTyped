package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProductsResponse extends StObject {
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
  
  /**
    * A list of products, including details for each product.
    */
  var Products: ProductsList = js.native
}
object DescribeProductsResponse {
  
  @scala.inline
  def apply(Products: ProductsList): DescribeProductsResponse = {
    val __obj = js.Dynamic.literal(Products = Products.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProductsResponse]
  }
  
  @scala.inline
  implicit class DescribeProductsResponseMutableBuilder[Self <: DescribeProductsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProducts(value: ProductsList): Self = StObject.set(x, "Products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsVarargs(value: Product*): Self = StObject.set(x, "Products", js.Array(value :_*))
  }
}
