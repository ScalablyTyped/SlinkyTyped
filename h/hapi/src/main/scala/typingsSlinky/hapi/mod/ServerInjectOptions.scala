package typingsSlinky.hapi.mod

import typingsSlinky.hapi.AnonArtifacts
import typingsSlinky.shot.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInjectOptions extends RequestOptions {
  /**
    * allows access to routes with config.isInternal set to true. Defaults to false.
    */
  var allowInternals: js.UndefOr[Boolean] = js.native
  /**
    * sets the initial value of request.app, defaults to {}.
    */
  var app: js.UndefOr[ApplicationState] = js.native
  /**
    * Authentication bypass options.
    */
  var auth: js.UndefOr[AnonArtifacts] = js.native
  /**
    * sets the initial value of request.plugins, defaults to {}.
    */
  var plugins: js.UndefOr[PluginsStates] = js.native
}

object ServerInjectOptions {
  @scala.inline
  def apply(url: String): ServerInjectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInjectOptions]
  }
  @scala.inline
  implicit class ServerInjectOptionsOps[Self <: ServerInjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInternals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInternals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInternals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInternals")(js.undefined)
        ret
    }
    @scala.inline
    def withApp(value: ApplicationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: AnonArtifacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: PluginsStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
  }
  
}

