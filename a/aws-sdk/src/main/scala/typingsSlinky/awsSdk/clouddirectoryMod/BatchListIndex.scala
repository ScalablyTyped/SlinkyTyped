package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListIndex extends StObject {
  
  /**
    * The reference to the index to list.
    */
  var IndexReference: ObjectReference = js.native
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * Specifies the ranges of indexed values that you want to query.
    */
  var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.native
}
object BatchListIndex {
  
  @scala.inline
  def apply(IndexReference: ObjectReference): BatchListIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListIndex]
  }
  
  @scala.inline
  implicit class BatchListIndexMutableBuilder[Self <: BatchListIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexReference(value: ObjectReference): Self = StObject.set(x, "IndexReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRangesOnIndexedValues(value: ObjectAttributeRangeList): Self = StObject.set(x, "RangesOnIndexedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesOnIndexedValuesUndefined: Self = StObject.set(x, "RangesOnIndexedValues", js.undefined)
    
    @scala.inline
    def setRangesOnIndexedValuesVarargs(value: ObjectAttributeRange*): Self = StObject.set(x, "RangesOnIndexedValues", js.Array(value :_*))
  }
}
