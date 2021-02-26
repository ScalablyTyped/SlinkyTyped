package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceRecordSetsResponse extends StObject {
  
  /**
    * A flag that indicates whether more resource record sets remain to be listed. If your results were truncated, you can make a follow-up pagination request by using the NextRecordName element.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * The maximum number of records you requested.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    *  Resource record sets that have a routing policy other than simple: If results were truncated for a given DNS name and type, the value of SetIdentifier for the next resource record set that has the current DNS name and type. For information about routing policies, see Choosing a Routing Policy in the Amazon Route 53 Developer Guide.
    */
  var NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.native
  
  /**
    * If the results were truncated, the name of the next record in the list. This element is present only if IsTruncated is true. 
    */
  var NextRecordName: js.UndefOr[DNSName] = js.native
  
  /**
    * If the results were truncated, the type of the next record in the list. This element is present only if IsTruncated is true. 
    */
  var NextRecordType: js.UndefOr[RRType] = js.native
  
  /**
    * Information about multiple resource record sets.
    */
  var ResourceRecordSets: typingsSlinky.awsSdk.route53Mod.ResourceRecordSets = js.native
}
object ListResourceRecordSetsResponse {
  
  @scala.inline
  def apply(IsTruncated: PageTruncated, MaxItems: PageMaxItems, ResourceRecordSets: ResourceRecordSets): ListResourceRecordSetsResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], ResourceRecordSets = ResourceRecordSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceRecordSetsResponse]
  }
  
  @scala.inline
  implicit class ListResourceRecordSetsResponseMutableBuilder[Self <: ListResourceRecordSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRecordIdentifier(value: ResourceRecordSetIdentifier): Self = StObject.set(x, "NextRecordIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRecordIdentifierUndefined: Self = StObject.set(x, "NextRecordIdentifier", js.undefined)
    
    @scala.inline
    def setNextRecordName(value: DNSName): Self = StObject.set(x, "NextRecordName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRecordNameUndefined: Self = StObject.set(x, "NextRecordName", js.undefined)
    
    @scala.inline
    def setNextRecordType(value: RRType): Self = StObject.set(x, "NextRecordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRecordTypeUndefined: Self = StObject.set(x, "NextRecordType", js.undefined)
    
    @scala.inline
    def setResourceRecordSets(value: ResourceRecordSets): Self = StObject.set(x, "ResourceRecordSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecordSetsVarargs(value: ResourceRecordSet*): Self = StObject.set(x, "ResourceRecordSets", js.Array(value :_*))
  }
}
