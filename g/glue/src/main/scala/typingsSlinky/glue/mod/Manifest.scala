package typingsSlinky.glue.mod

import typingsSlinky.glue.anon.Plugins
import typingsSlinky.hapi.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manifest extends js.Object {
  var register: js.UndefOr[Plugins] = js.native
  var server: ServerOptions = js.native
}

object Manifest {
  @scala.inline
  def apply(server: ServerOptions): Manifest = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServer(value: ServerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegister(value: Plugins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
  }
  
}

