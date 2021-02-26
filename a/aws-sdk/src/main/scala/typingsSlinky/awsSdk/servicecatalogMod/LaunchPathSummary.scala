package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchPathSummary extends StObject {
  
  /**
    * The constraints on the portfolio-product relationship.
    */
  var ConstraintSummaries: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ConstraintSummaries] = js.native
  
  /**
    * The identifier of the product path.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Id] = js.native
  
  /**
    * The name of the portfolio to which the user was assigned.
    */
  var Name: js.UndefOr[PortfolioName] = js.native
  
  /**
    * The tags associated with this product path.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}
object LaunchPathSummary {
  
  @scala.inline
  def apply(): LaunchPathSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPathSummary]
  }
  
  @scala.inline
  implicit class LaunchPathSummaryMutableBuilder[Self <: LaunchPathSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraintSummaries(value: ConstraintSummaries): Self = StObject.set(x, "ConstraintSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintSummariesUndefined: Self = StObject.set(x, "ConstraintSummaries", js.undefined)
    
    @scala.inline
    def setConstraintSummariesVarargs(value: ConstraintSummary*): Self = StObject.set(x, "ConstraintSummaries", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: PortfolioName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
