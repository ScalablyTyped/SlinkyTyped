package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.ec2Mod.Boolean
import typingsSlinky.awsSdk.ec2Mod.Filter
import typingsSlinky.awsSdk.ec2Mod.FilterList
import typingsSlinky.awsSdk.ec2Mod.Integer
import typingsSlinky.awsSdk.ec2Mod.OwnerStringList
import typingsSlinky.awsSdk.ec2Mod.RestorableByStringList
import typingsSlinky.awsSdk.ec2Mod.SnapshotId
import typingsSlinky.awsSdk.ec2Mod.SnapshotIdStringList
import typingsSlinky.awsSdk.ec2Mod.String
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeSnapshotsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeSnapshotsRequestw extends js.Object {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    description - A description of the snapshot.    encrypted - Indicates whether the snapshot is encrypted (true | false)    owner-alias - The owner alias, from an Amazon-maintained list (amazon). This is not the user-configured AWS account alias set using the IAM console. We recommend that you use the related parameter instead of this filter.    owner-id - The AWS account ID of the owner. We recommend that you use the related parameter instead of this filter.    progress - The progress of the snapshot, as a percentage (for example, 80%).    snapshot-id - The snapshot ID.    start-time - The time stamp when the snapshot was initiated.    status - The status of the snapshot (pending | completed | error).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    volume-id - The ID of the volume the snapshot is for.    volume-size - The size of the volume, in GiB.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of snapshot results returned by DescribeSnapshots in paginated output. When this parameter is used, DescribeSnapshots only returns MaxResults results in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another DescribeSnapshots request with the returned NextToken value. This value can be between 5 and 1000; if MaxResults is given a value larger than 1000, only 1000 results are returned. If this parameter is not used, then DescribeSnapshots returns all results. You cannot specify this parameter and the snapshot IDs parameter in the same request.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The NextToken value returned from a previous paginated DescribeSnapshots request where MaxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the NextToken value. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Scopes the results to snapshots with the specified owners. You can specify a combination of AWS account IDs, self, and amazon.
    */
  var OwnerIds: js.UndefOr[OwnerStringList] = js.native
  
  /**
    * The IDs of the AWS accounts that can create volumes from the snapshot.
    */
  var RestorableByUserIds: js.UndefOr[RestorableByStringList] = js.native
  
  /**
    * The snapshot IDs. Default: Describes the snapshots for which you have create volume permissions.
    */
  var SnapshotIds: js.UndefOr[SnapshotIdStringList] = js.native
}
object DescribeSnapshotsRequestw {
  
  @scala.inline
  def apply(): DescribeSnapshotsRequestw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsRequestw]
  }
  
  @scala.inline
  implicit class DescribeSnapshotsRequestwOps[Self <: DescribeSnapshotsRequestw] (val x: Self) extends AnyVal {
    
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
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOwnerIdsVarargs(value: String*): Self = this.set("OwnerIds", js.Array(value :_*))
    
    @scala.inline
    def setOwnerIds(value: OwnerStringList): Self = this.set("OwnerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerIds: Self = this.set("OwnerIds", js.undefined)
    
    @scala.inline
    def setRestorableByUserIdsVarargs(value: String*): Self = this.set("RestorableByUserIds", js.Array(value :_*))
    
    @scala.inline
    def setRestorableByUserIds(value: RestorableByStringList): Self = this.set("RestorableByUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestorableByUserIds: Self = this.set("RestorableByUserIds", js.undefined)
    
    @scala.inline
    def setSnapshotIdsVarargs(value: SnapshotId*): Self = this.set("SnapshotIds", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotIds(value: SnapshotIdStringList): Self = this.set("SnapshotIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotIds: Self = this.set("SnapshotIds", js.undefined)
  }
}
