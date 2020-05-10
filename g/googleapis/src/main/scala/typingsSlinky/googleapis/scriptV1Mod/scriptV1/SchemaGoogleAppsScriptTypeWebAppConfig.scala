package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Web app entry point configuration.
  */
@js.native
trait SchemaGoogleAppsScriptTypeWebAppConfig extends js.Object {
  /**
    * Who has permission to run the web app.
    */
  var access: js.UndefOr[String] = js.native
  /**
    * Who to execute the web app as.
    */
  var executeAs: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeWebAppConfig {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeWebAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeWebAppConfig]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeWebAppConfigOps[Self <: SchemaGoogleAppsScriptTypeWebAppConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withExecuteAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecuteAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeAs")(js.undefined)
        ret
    }
  }
  
}

