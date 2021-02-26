package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListObjectAttributes extends StObject {
  
  /**
    * Used to filter the list of object attributes that are associated with a certain facet.
    */
  var FacetFilter: js.UndefOr[SchemaFacet] = js.native
  
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * Reference of the object whose attributes need to be listed.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
}
object BatchListObjectAttributes {
  
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchListObjectAttributes = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectAttributes]
  }
  
  @scala.inline
  implicit class BatchListObjectAttributesMutableBuilder[Self <: BatchListObjectAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacetFilter(value: SchemaFacet): Self = StObject.set(x, "FacetFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetFilterUndefined: Self = StObject.set(x, "FacetFilter", js.undefined)
    
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
