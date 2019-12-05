package typingsSlinky.ionic.libSshMod

import typingsSlinky.ionic.Anon_IdNumber
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.ResourceClientCreate
import typingsSlinky.ionic.definitionsMod.ResourceClientDelete
import typingsSlinky.ionic.definitionsMod.ResourceClientLoad
import typingsSlinky.ionic.definitionsMod.ResourceClientPaginate
import typingsSlinky.ionic.definitionsMod.SSHKey
import typingsSlinky.ionic.libHttpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/ssh", "SSHKeyClient")
@js.native
class SSHKeyClient protected ()
  extends ResourceClient
     with ResourceClientLoad[SSHKey]
     with ResourceClientDelete
     with ResourceClientCreate[SSHKey, SSHKeyCreateDetails]
     with ResourceClientPaginate[SSHKey] {
  def this(hasClientTokenUser: SSHKeyClientDeps) = this()
  var client: IClient = js.native
  var token: String = js.native
  var user: Anon_IdNumber = js.native
  /* CompleteClass */
  override def create(details: SSHKeyCreateDetails): js.Promise[SSHKey] = js.native
  def load(id: String): js.Promise[SSHKey] = js.native
}

