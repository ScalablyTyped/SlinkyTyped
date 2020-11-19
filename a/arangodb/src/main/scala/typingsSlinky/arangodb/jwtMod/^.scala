package typingsSlinky.arangodb.jwtMod

import typingsSlinky.arangodb.Foxx.SessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@arangodb/foxx/sessions/storages/jwt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(options: String): SessionStorage = js.native
  def apply(options: SafeJwtStorageOptions): SessionStorage = js.native
  def apply(options: UnsafeJwtStorageOptions): SessionStorage = js.native
}
