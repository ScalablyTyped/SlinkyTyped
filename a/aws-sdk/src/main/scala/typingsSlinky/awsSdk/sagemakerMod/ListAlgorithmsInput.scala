package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAlgorithmsInput extends js.Object {
  
  /**
    * A filter that returns only algorithms created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  
  /**
    * A filter that returns only algorithms created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  
  /**
    * The maximum number of algorithms to return in the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  
  /**
    * A string in the algorithm name. This filter returns only algorithms whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NameContains] = js.native
  
  /**
    * If the response to a previous ListAlgorithms request was truncated, the response includes a NextToken. To retrieve the next set of algorithms, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * The parameter by which to sort the results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[AlgorithmSortBy] = js.native
  
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortOrder] = js.native
}
object ListAlgorithmsInput {
  
  @scala.inline
  def apply(): ListAlgorithmsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlgorithmsInput]
  }
  
  @scala.inline
  implicit class ListAlgorithmsInputOps[Self <: ListAlgorithmsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTimeAfter(value: js.Date): Self = this.set("CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: js.Date): Self = this.set("CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: NameContains): Self = this.set("NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameContains: Self = this.set("NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: AlgorithmSortBy): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
}
