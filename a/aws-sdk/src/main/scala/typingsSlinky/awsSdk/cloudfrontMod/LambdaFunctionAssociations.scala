package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaFunctionAssociations extends StObject {
  
  /**
    *  Optional: A complex type that contains LambdaFunctionAssociation items for this cache behavior. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[LambdaFunctionAssociationList] = js.native
  
  /**
    * The number of Lambda function associations for this cache behavior.
    */
  var Quantity: integer = js.native
}
object LambdaFunctionAssociations {
  
  @scala.inline
  def apply(Quantity: integer): LambdaFunctionAssociations = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionAssociations]
  }
  
  @scala.inline
  implicit class LambdaFunctionAssociationsMutableBuilder[Self <: LambdaFunctionAssociations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: LambdaFunctionAssociationList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: LambdaFunctionAssociation*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
