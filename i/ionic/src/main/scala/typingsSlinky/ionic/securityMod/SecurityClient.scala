package typingsSlinky.ionic.securityMod

import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.ResourceClientLoad
import typingsSlinky.ionic.definitionsMod.SecurityProfile
import typingsSlinky.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/security", "SecurityClient")
@js.native
class SecurityClient protected ()
  extends ResourceClient
     with ResourceClientLoad[SecurityProfile] {
  def this(hasClientToken: SecurityClientDeps) = this()
  val client: IClient = js.native
  val token: String = js.native
  def load(tag: String): js.Promise[SecurityProfile] = js.native
}

