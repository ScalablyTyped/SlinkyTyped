package typingsSlinky.nodeRedRuntime.mod

import typingsSlinky.nodeRedRuntime.nodeRedRuntimeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeRedRuntime.mod.UsernamePermissions
  - typingsSlinky.nodeRedRuntime.mod.AnonymousPermissions
*/
trait User extends StObject
object User {
  
  @scala.inline
  def AnonymousPermissions(anonymous: `true`, permissions: Permission | js.Array[Permission]): typingsSlinky.nodeRedRuntime.mod.AnonymousPermissions = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeRedRuntime.mod.AnonymousPermissions]
  }
  
  @scala.inline
  def UsernamePermissions(permissions: Permission | js.Array[Permission], username: String): typingsSlinky.nodeRedRuntime.mod.UsernamePermissions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeRedRuntime.mod.UsernamePermissions]
  }
}
