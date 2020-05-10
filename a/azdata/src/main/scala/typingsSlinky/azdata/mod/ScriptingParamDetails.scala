package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptingParamDetails extends js.Object {
  var filePath: String = js.native
  var scriptCompatibilityOption: String = js.native
  var targetDatabaseEngineEdition: String = js.native
  var targetDatabaseEngineType: String = js.native
}

object ScriptingParamDetails {
  @scala.inline
  def apply(
    filePath: String,
    scriptCompatibilityOption: String,
    targetDatabaseEngineEdition: String,
    targetDatabaseEngineType: String
  ): ScriptingParamDetails = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], scriptCompatibilityOption = scriptCompatibilityOption.asInstanceOf[js.Any], targetDatabaseEngineEdition = targetDatabaseEngineEdition.asInstanceOf[js.Any], targetDatabaseEngineType = targetDatabaseEngineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingParamDetails]
  }
  @scala.inline
  implicit class ScriptingParamDetailsOps[Self <: ScriptingParamDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptCompatibilityOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptCompatibilityOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetDatabaseEngineEdition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDatabaseEngineEdition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetDatabaseEngineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDatabaseEngineType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

