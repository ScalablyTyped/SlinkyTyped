package typingsSlinky.ionic.libAuthMod

import typingsSlinky.ionic.definitionsMod.ResourceClientLoad
import typingsSlinky.ionic.libHttpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/auth", "AuthConnectionClient")
@js.native
class AuthConnectionClient protected ()
  extends ResourceClient
     with ResourceClientLoad[AuthConnection] {
  def this(e: AuthClientDeps) = this()
  val e: AuthClientDeps = js.native
  def load(email: String): js.Promise[AuthConnection] = js.native
}

