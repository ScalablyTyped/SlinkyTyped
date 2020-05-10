package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An API executable entry point.
  */
@js.native
trait SchemaGoogleAppsScriptTypeExecutionApiEntryPoint extends js.Object {
  /**
    * The entry point&#39;s configuration.
    */
  var entryPointConfig: js.UndefOr[SchemaGoogleAppsScriptTypeExecutionApiConfig] = js.native
}

object SchemaGoogleAppsScriptTypeExecutionApiEntryPoint {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeExecutionApiEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeExecutionApiEntryPoint]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeExecutionApiEntryPointOps[Self <: SchemaGoogleAppsScriptTypeExecutionApiEntryPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntryPointConfig(value: SchemaGoogleAppsScriptTypeExecutionApiConfig): Self = {
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
  }
  
}

