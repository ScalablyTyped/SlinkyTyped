package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DoReloadExResult...
  */
@js.native
trait IDoReloadExResult extends js.Object {
  /**
    * Path to the script log file.
    */
  var qScriptLogFile: String = js.native
  /**
    * The operation is successful if qSuccess is set to True.
    */
  var qSuccess: Boolean = js.native
}

object IDoReloadExResult {
  @scala.inline
  def apply(qScriptLogFile: String, qSuccess: Boolean): IDoReloadExResult = {
    val __obj = js.Dynamic.literal(qScriptLogFile = qScriptLogFile.asInstanceOf[js.Any], qSuccess = qSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDoReloadExResult]
  }
  @scala.inline
  implicit class IDoReloadExResultOps[Self <: IDoReloadExResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQScriptLogFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qScriptLogFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSuccess")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

