package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCostCategoryDefinitionResponse extends StObject {
  
  var CostCategory: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.CostCategory] = js.native
}
object DescribeCostCategoryDefinitionResponse {
  
  @scala.inline
  def apply(): DescribeCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCostCategoryDefinitionResponse]
  }
  
  @scala.inline
  implicit class DescribeCostCategoryDefinitionResponseMutableBuilder[Self <: DescribeCostCategoryDefinitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostCategory(value: CostCategory): Self = StObject.set(x, "CostCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostCategoryUndefined: Self = StObject.set(x, "CostCategory", js.undefined)
  }
}
