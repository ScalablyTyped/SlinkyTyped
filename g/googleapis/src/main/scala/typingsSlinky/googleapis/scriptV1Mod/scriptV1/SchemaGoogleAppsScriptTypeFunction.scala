package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a function in a script project.
  */
@js.native
trait SchemaGoogleAppsScriptTypeFunction extends js.Object {
  /**
    * The function name in the script project.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeFunction {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunction]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeFunctionOps[Self <: SchemaGoogleAppsScriptTypeFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

