package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.realm.Realm.Sync.PermissionConditionUserId
  - typingsSlinky.realm.Realm.Sync.PermissionConditionMetadata
*/
trait PermissionCondition extends js.Object

object PermissionCondition {
  @scala.inline
  implicit def apply(value: PermissionConditionMetadata): PermissionCondition = value.asInstanceOf[PermissionCondition]
  @scala.inline
  implicit def apply(value: PermissionConditionUserId): PermissionCondition = value.asInstanceOf[PermissionCondition]
}

