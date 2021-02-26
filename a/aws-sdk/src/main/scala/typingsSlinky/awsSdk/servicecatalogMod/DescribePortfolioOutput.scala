package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePortfolioOutput extends StObject {
  
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Budgets] = js.native
  
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PortfolioDetail] = js.native
  
  /**
    * Information about the TagOptions associated with the portfolio.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.native
  
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}
object DescribePortfolioOutput {
  
  @scala.inline
  def apply(): DescribePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePortfolioOutput]
  }
  
  @scala.inline
  implicit class DescribePortfolioOutputMutableBuilder[Self <: DescribePortfolioOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    @scala.inline
    def setBudgetsVarargs(value: BudgetDetail*): Self = StObject.set(x, "Budgets", js.Array(value :_*))
    
    @scala.inline
    def setPortfolioDetail(value: PortfolioDetail): Self = StObject.set(x, "PortfolioDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioDetailUndefined: Self = StObject.set(x, "PortfolioDetail", js.undefined)
    
    @scala.inline
    def setTagOptions(value: TagOptionDetails): Self = StObject.set(x, "TagOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagOptionsUndefined: Self = StObject.set(x, "TagOptions", js.undefined)
    
    @scala.inline
    def setTagOptionsVarargs(value: TagOptionDetail*): Self = StObject.set(x, "TagOptions", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
