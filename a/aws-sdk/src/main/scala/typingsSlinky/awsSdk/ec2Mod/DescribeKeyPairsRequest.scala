package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeKeyPairsRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    key-pair-id - The ID of the key pair.    fingerprint - The fingerprint of the key pair.    key-name - The name of the key pair.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The key pair names. Default: Describes all your key pairs.
    */
  var KeyNames: js.UndefOr[KeyNameStringList] = js.native
  
  /**
    * The IDs of the key pairs.
    */
  var KeyPairIds: js.UndefOr[KeyPairIdStringList] = js.native
}
object DescribeKeyPairsRequest {
  
  @scala.inline
  def apply(): DescribeKeyPairsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyPairsRequest]
  }
  
  @scala.inline
  implicit class DescribeKeyPairsRequestOps[Self <: DescribeKeyPairsRequest] (val x: Self) extends AnyVal {
    
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
    def setKeyNamesVarargs(value: KeyPairName*): Self = this.set("KeyNames", js.Array(value :_*))
    
    @scala.inline
    def setKeyNames(value: KeyNameStringList): Self = this.set("KeyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyNames: Self = this.set("KeyNames", js.undefined)
    
    @scala.inline
    def setKeyPairIdsVarargs(value: KeyPairId*): Self = this.set("KeyPairIds", js.Array(value :_*))
    
    @scala.inline
    def setKeyPairIds(value: KeyPairIdStringList): Self = this.set("KeyPairIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPairIds: Self = this.set("KeyPairIds", js.undefined)
  }
}
