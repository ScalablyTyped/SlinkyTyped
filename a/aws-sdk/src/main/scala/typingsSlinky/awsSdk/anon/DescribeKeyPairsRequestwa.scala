package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.ec2Mod.Boolean
import typingsSlinky.awsSdk.ec2Mod.Filter
import typingsSlinky.awsSdk.ec2Mod.FilterList
import typingsSlinky.awsSdk.ec2Mod.KeyNameStringList
import typingsSlinky.awsSdk.ec2Mod.KeyPairId
import typingsSlinky.awsSdk.ec2Mod.KeyPairIdStringList
import typingsSlinky.awsSdk.ec2Mod.KeyPairName
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeKeyPairsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeKeyPairsRequestwa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
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
object DescribeKeyPairsRequestwa {
  
  @scala.inline
  def apply(): DescribeKeyPairsRequestwa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyPairsRequestwa]
  }
  
  @scala.inline
  implicit class DescribeKeyPairsRequestwaMutableBuilder[Self <: DescribeKeyPairsRequestwa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
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
    def setKeyNames(value: KeyNameStringList): Self = StObject.set(x, "KeyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNamesUndefined: Self = StObject.set(x, "KeyNames", js.undefined)
    
    @scala.inline
    def setKeyNamesVarargs(value: KeyPairName*): Self = StObject.set(x, "KeyNames", js.Array(value :_*))
    
    @scala.inline
    def setKeyPairIds(value: KeyPairIdStringList): Self = StObject.set(x, "KeyPairIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairIdsUndefined: Self = StObject.set(x, "KeyPairIds", js.undefined)
    
    @scala.inline
    def setKeyPairIdsVarargs(value: KeyPairId*): Self = StObject.set(x, "KeyPairIds", js.Array(value :_*))
  }
}
