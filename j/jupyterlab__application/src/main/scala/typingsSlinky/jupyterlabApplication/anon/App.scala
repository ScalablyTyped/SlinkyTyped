package typingsSlinky.jupyterlabApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  val app: String = js.native
  val base: String = js.native
  val hubHost: js.UndefOr[String] = js.native
  val hubPrefix: js.UndefOr[String] = js.native
  val hubServerName: js.UndefOr[String] = js.native
  val hubUser: js.UndefOr[String] = js.native
  val notFound: js.UndefOr[String] = js.native
  val settings: String = js.native
  val static: String = js.native
  val themes: String = js.native
  val tree: String = js.native
  val workspaces: String = js.native
}

object App {
  @scala.inline
  def apply(
    app: String,
    base: String,
    settings: String,
    static: String,
    themes: String,
    tree: String,
    workspaces: String
  ): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaces(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHubHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHubHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubHost")(js.undefined)
        ret
    }
    @scala.inline
    def withHubPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHubPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withHubServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHubServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubServerName")(js.undefined)
        ret
    }
    @scala.inline
    def withHubUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHubUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubUser")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(js.undefined)
        ret
    }
  }
  
}

