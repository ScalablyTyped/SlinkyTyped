package typingsSlinky.restIo

import typingsSlinky.restIo.anon.CreatedAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rest-io/lib/src/authentication", JSImport.Namespace)
@js.native
object authenticationMod extends js.Object {
  
  def createAuthToken(userId: String): js.Any = js.native
  
  def decryptAuthToken(authToken: String): CreatedAt = js.native
  
  def encryptPassword(password: String): js.Any = js.native
}
