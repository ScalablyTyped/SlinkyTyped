package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * E-commerce details associated with the user activity.
  */
@js.native
trait SchemaEcommerceData extends StObject {
  
  /**
    * Action associated with this e-commerce action.
    */
  var actionType: js.UndefOr[String] = js.native
  
  /**
    * The type of this e-commerce activity.
    */
  var ecommerceType: js.UndefOr[String] = js.native
  
  /**
    * Details of the products in this transaction.
    */
  var products: js.UndefOr[js.Array[SchemaProductData]] = js.native
  
  /**
    * Transaction details of this e-commerce action.
    */
  var transaction: js.UndefOr[SchemaTransactionData] = js.native
}
object SchemaEcommerceData {
  
  @scala.inline
  def apply(): SchemaEcommerceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEcommerceData]
  }
  
  @scala.inline
  implicit class SchemaEcommerceDataMutableBuilder[Self <: SchemaEcommerceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setEcommerceType(value: String): Self = StObject.set(x, "ecommerceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcommerceTypeUndefined: Self = StObject.set(x, "ecommerceType", js.undefined)
    
    @scala.inline
    def setProducts(value: js.Array[SchemaProductData]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: SchemaProductData*): Self = StObject.set(x, "products", js.Array(value :_*))
    
    @scala.inline
    def setTransaction(value: SchemaTransactionData): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
