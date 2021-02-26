package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListOutgoingTypedLinks extends StObject {
  
  /**
    * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range.
    */
  var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.native
  
  /**
    * Filters are interpreted in the order of the attributes defined on the typed link facet, not the order they are supplied to any API calls.
    */
  var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.native
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * The reference that identifies the object whose attributes will be listed.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
}
object BatchListOutgoingTypedLinks {
  
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchListOutgoingTypedLinks = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListOutgoingTypedLinks]
  }
  
  @scala.inline
  implicit class BatchListOutgoingTypedLinksMutableBuilder[Self <: BatchListOutgoingTypedLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterAttributeRanges(value: TypedLinkAttributeRangeList): Self = StObject.set(x, "FilterAttributeRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterAttributeRangesUndefined: Self = StObject.set(x, "FilterAttributeRanges", js.undefined)
    
    @scala.inline
    def setFilterAttributeRangesVarargs(value: TypedLinkAttributeRange*): Self = StObject.set(x, "FilterAttributeRanges", js.Array(value :_*))
    
    @scala.inline
    def setFilterTypedLink(value: TypedLinkSchemaAndFacetName): Self = StObject.set(x, "FilterTypedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypedLinkUndefined: Self = StObject.set(x, "FilterTypedLink", js.undefined)
    
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
