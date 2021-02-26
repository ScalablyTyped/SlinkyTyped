package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedPrefixList extends StObject {
  
  /**
    * The IP address version.
    */
  var AddressFamily: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of entries for the prefix list.
    */
  var MaxEntries: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the owner of the prefix list.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the prefix list.
    */
  var PrefixListArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: js.UndefOr[PrefixListResourceId] = js.native
  
  /**
    * The name of the prefix list.
    */
  var PrefixListName: js.UndefOr[String] = js.native
  
  /**
    * The state of the prefix list.
    */
  var State: js.UndefOr[PrefixListState] = js.native
  
  /**
    * The state message.
    */
  var StateMessage: js.UndefOr[String] = js.native
  
  /**
    * The tags for the prefix list.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The version of the prefix list.
    */
  var Version: js.UndefOr[Long] = js.native
}
object ManagedPrefixList {
  
  @scala.inline
  def apply(): ManagedPrefixList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPrefixList]
  }
  
  @scala.inline
  implicit class ManagedPrefixListMutableBuilder[Self <: ManagedPrefixList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressFamily(value: String): Self = StObject.set(x, "AddressFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressFamilyUndefined: Self = StObject.set(x, "AddressFamily", js.undefined)
    
    @scala.inline
    def setMaxEntries(value: Integer): Self = StObject.set(x, "MaxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEntriesUndefined: Self = StObject.set(x, "MaxEntries", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setPrefixListArn(value: ResourceArn): Self = StObject.set(x, "PrefixListArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListArnUndefined: Self = StObject.set(x, "PrefixListArn", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    @scala.inline
    def setPrefixListName(value: String): Self = StObject.set(x, "PrefixListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListNameUndefined: Self = StObject.set(x, "PrefixListName", js.undefined)
    
    @scala.inline
    def setState(value: PrefixListState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMessage(value: String): Self = StObject.set(x, "StateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMessageUndefined: Self = StObject.set(x, "StateMessage", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Long): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
