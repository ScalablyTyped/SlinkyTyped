package typingsSlinky.ionic.snapshotMod

import typingsSlinky.ionic.anon.IdString
import typingsSlinky.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotClientDeps extends js.Object {
  val app: IdString = js.native
  val client: IClient = js.native
  val token: String = js.native
}

object SnapshotClientDeps {
  @scala.inline
  def apply(app: IdString, client: IClient, token: String): SnapshotClientDeps = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotClientDeps]
  }
  @scala.inline
  implicit class SnapshotClientDepsOps[Self <: SnapshotClientDeps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: IdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

