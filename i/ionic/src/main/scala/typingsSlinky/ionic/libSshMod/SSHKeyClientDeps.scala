package typingsSlinky.ionic.libSshMod

import typingsSlinky.ionic.anon.IdNumber
import typingsSlinky.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSHKeyClientDeps extends js.Object {
  val client: IClient
  val token: String
  val user: IdNumber
}

object SSHKeyClientDeps {
  @scala.inline
  def apply(client: IClient, token: String, user: IdNumber): SSHKeyClientDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHKeyClientDeps]
  }
}

