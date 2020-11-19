package typingsSlinky.openfin.identityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.identityMod.NativeIdOptional
  - typingsSlinky.openfin.identityMod.UuidOptional
*/
trait ExternalWindowIdentity extends js.Object
object ExternalWindowIdentity {
  
  @scala.inline
  def NativeIdOptional(uuid: String): ExternalWindowIdentity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWindowIdentity]
  }
  
  @scala.inline
  def UuidOptional(nativeId: String): ExternalWindowIdentity = {
    val __obj = js.Dynamic.literal(nativeId = nativeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWindowIdentity]
  }
}
