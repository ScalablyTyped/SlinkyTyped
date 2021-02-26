package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContributorInsightsInput extends StObject {
  
  /**
    * Maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[ListContributorInsightsLimit] = js.native
  
  /**
    * A token to for the desired page, if there is one.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableName] = js.native
}
object ListContributorInsightsInput {
  
  @scala.inline
  def apply(): ListContributorInsightsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContributorInsightsInput]
  }
  
  @scala.inline
  implicit class ListContributorInsightsInputMutableBuilder[Self <: ListContributorInsightsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListContributorInsightsLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
