package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration that defines how a deployment is accessed externally.
  */
@js.native
trait SchemaEntryPoint extends js.Object {
  /**
    * Add-on properties.
    */
  var addOn: js.UndefOr[SchemaGoogleAppsScriptTypeAddOnEntryPoint] = js.native
  /**
    * The type of the entry point.
    */
  var entryPointType: js.UndefOr[String] = js.native
  /**
    * An entry point specification for Apps Script API execution calls.
    */
  var executionApi: js.UndefOr[SchemaGoogleAppsScriptTypeExecutionApiEntryPoint] = js.native
  /**
    * An entry point specification for web apps.
    */
  var webApp: js.UndefOr[SchemaGoogleAppsScriptTypeWebAppEntryPoint] = js.native
}

object SchemaEntryPoint {
  @scala.inline
  def apply(): SchemaEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntryPoint]
  }
  @scala.inline
  implicit class SchemaEntryPointOps[Self <: SchemaEntryPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOn(value: SchemaGoogleAppsScriptTypeAddOnEntryPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOn")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryPointType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointType")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionApi(value: SchemaGoogleAppsScriptTypeExecutionApiEntryPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionApi")(js.undefined)
        ret
    }
    @scala.inline
    def withWebApp(value: SchemaGoogleAppsScriptTypeWebAppEntryPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApp")(js.undefined)
        ret
    }
  }
  
}

