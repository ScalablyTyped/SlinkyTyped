package typingsSlinky.jupyterlabApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSettings extends js.Object {
  val appSettings: String = js.native
  val schemas: String = js.native
  val serverRoot: String = js.native
  val static: String = js.native
  val templates: String = js.native
  val themes: String = js.native
  val userSettings: String = js.native
  val workspaces: String = js.native
}

object AppSettings {
  @scala.inline
  def apply(
    appSettings: String,
    schemas: String,
    serverRoot: String,
    static: String,
    templates: String,
    themes: String,
    userSettings: String,
    workspaces: String
  ): AppSettings = {
    val __obj = js.Dynamic.literal(appSettings = appSettings.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], serverRoot = serverRoot.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSettings]
  }
  @scala.inline
  implicit class AppSettingsOps[Self <: AppSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemas(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaces(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

