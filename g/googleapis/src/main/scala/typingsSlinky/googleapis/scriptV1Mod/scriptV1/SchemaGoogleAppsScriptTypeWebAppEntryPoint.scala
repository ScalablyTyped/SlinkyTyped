package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A web application entry point.
  */
@js.native
trait SchemaGoogleAppsScriptTypeWebAppEntryPoint extends js.Object {
  /**
    * The entry point&#39;s configuration.
    */
  var entryPointConfig: js.UndefOr[SchemaGoogleAppsScriptTypeWebAppConfig] = js.native
  /**
    * The URL for the web application.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeWebAppEntryPoint {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeWebAppEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeWebAppEntryPoint]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeWebAppEntryPointOps[Self <: SchemaGoogleAppsScriptTypeWebAppEntryPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntryPointConfig(value: SchemaGoogleAppsScriptTypeWebAppConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPointConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

