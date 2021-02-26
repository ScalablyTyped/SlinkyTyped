package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVolumesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    attachment.attach-time - The time stamp when the attachment initiated.    attachment.delete-on-termination - Whether the volume is deleted on instance termination.    attachment.device - The device name specified in the block device mapping (for example, /dev/sda1).    attachment.instance-id - The ID of the instance the volume is attached to.    attachment.status - The attachment state (attaching | attached | detaching).    availability-zone - The Availability Zone in which the volume was created.    create-time - The time stamp when the volume was created.    encrypted - Indicates whether the volume is encrypted (true | false)    multi-attach-enabled - Indicates whether the volume is enabled for Multi-Attach (true | false)    fast-restored - Indicates whether the volume was created from a snapshot that is enabled for fast snapshot restore (true | false).    size - The size of the volume, in GiB.    snapshot-id - The snapshot from which the volume was created.    status - The state of the volume (creating | available | in-use | deleting | deleted | error).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    volume-id - The volume ID.    volume-type - The Amazon EBS volume type. This can be gp2 for General Purpose SSD, io1 or io2 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1 for Cold HDD, or standard for Magnetic volumes.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of volume results returned by DescribeVolumes in paginated output. When this parameter is used, DescribeVolumes only returns MaxResults results in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another DescribeVolumes request with the returned NextToken value. This value can be between 5 and 500; if MaxResults is given a value larger than 500, only 500 results are returned. If this parameter is not used, then DescribeVolumes returns all results. You cannot specify this parameter and the volume IDs parameter in the same request.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The NextToken value returned from a previous paginated DescribeVolumes request where MaxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the NextToken value. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The volume IDs.
    */
  var VolumeIds: js.UndefOr[VolumeIdStringList] = js.native
}
object DescribeVolumesRequest {
  
  @scala.inline
  def apply(): DescribeVolumesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesRequest]
  }
  
  @scala.inline
  implicit class DescribeVolumesRequestMutableBuilder[Self <: DescribeVolumesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVolumeIds(value: VolumeIdStringList): Self = StObject.set(x, "VolumeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdsUndefined: Self = StObject.set(x, "VolumeIds", js.undefined)
    
    @scala.inline
    def setVolumeIdsVarargs(value: VolumeId*): Self = StObject.set(x, "VolumeIds", js.Array(value :_*))
  }
}
