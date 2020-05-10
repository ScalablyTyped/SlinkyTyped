package typingsSlinky.ionic.libSshMod

import typingsSlinky.ionic.AnonIdNumber
import typingsSlinky.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSHKeyClientDeps extends js.Object {
  val client: IClient = js.native
  val token: String = js.native
  val user: AnonIdNumber = js.native
}

object SSHKeyClientDeps {
  @scala.inline
  def apply(client: IClient, token: String, user: AnonIdNumber): SSHKeyClientDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHKeyClientDeps]
  }
  @scala.inline
  implicit class SSHKeyClientDepsOps[Self <: SSHKeyClientDeps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: IClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: AnonIdNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

