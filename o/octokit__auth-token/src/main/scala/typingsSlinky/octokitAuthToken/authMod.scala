package typingsSlinky.octokitAuthToken

import typingsSlinky.octokitAuthToken.typesMod.Authentication
import typingsSlinky.octokitAuthToken.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/auth-token/dist-types/auth", JSImport.Namespace)
@js.native
object authMod extends js.Object {
  
  def auth(token: Token): js.Promise[Authentication] = js.native
}
