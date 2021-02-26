package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListObjectParents extends StObject {
  
  var MaxResults: js.UndefOr[NumberResults] = js.native
  
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
}
object BatchListObjectParents {
  
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchListObjectParents = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectParents]
  }
  
  @scala.inline
  implicit class BatchListObjectParentsMutableBuilder[Self <: BatchListObjectParents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
