package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiHapi.anon.Vhost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRegisterOptions extends js.Object {
  /**
    * if true, subsequent registrations of the same plugin are skipped without error. Cannot be used with plugin options. Defaults to false. If not set to true, an error will be thrown the second
    * time a plugin is registered on the server.
    */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * modifiers applied to each route added by the plugin:
    */
  var routes: js.UndefOr[Vhost] = js.native
}

object ServerRegisterOptions {
  @scala.inline
  def apply(): ServerRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerRegisterOptions]
  }
  @scala.inline
  implicit class ServerRegisterOptionsOps[Self <: ServerRegisterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: Vhost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
  }
  
}

