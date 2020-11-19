package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.realm.Realm.Sync.PermissionConditionUserId
  - typingsSlinky.realm.Realm.Sync.PermissionConditionMetadata
*/
trait PermissionCondition extends js.Object
object PermissionCondition {
  
  @scala.inline
  def PermissionConditionUserId(userId: String): PermissionCondition = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionCondition]
  }
  
  @scala.inline
  def PermissionConditionMetadata(metadataKey: String, metadataValue: String): PermissionCondition = {
    val __obj = js.Dynamic.literal(metadataKey = metadataKey.asInstanceOf[js.Any], metadataValue = metadataValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionCondition]
  }
}
