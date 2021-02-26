package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIndexRequest extends StObject {
  
  /**
    * The consistency level to execute the request at.
    */
  var ConsistencyLevel: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  
  /**
    * The ARN of the directory that the index exists in.
    */
  var DirectoryArn: Arn = js.native
  
  /**
    * The reference to the index to list.
    */
  var IndexReference: ObjectReference = js.native
  
  /**
    * The maximum number of objects in a single page to retrieve from the index during a request. For more information, see Amazon Cloud Directory Limits.
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
object ListIndexRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, IndexReference: ObjectReference): ListIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IndexReference = IndexReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexRequest]
  }
  
  @scala.inline
  implicit class ListIndexRequestMutableBuilder[Self <: ListIndexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistencyLevel(value: ConsistencyLevel): Self = StObject.set(x, "ConsistencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyLevelUndefined: Self = StObject.set(x, "ConsistencyLevel", js.undefined)
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
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
