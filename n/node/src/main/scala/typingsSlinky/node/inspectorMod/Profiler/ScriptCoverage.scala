package typingsSlinky.node.inspectorMod.Profiler

import typingsSlinky.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coverage data for a JavaScript script.
  */
@js.native
trait ScriptCoverage extends js.Object {
  /**
    * Functions contained in the script that has coverage data.
    */
  var functions: js.Array[FunctionCoverage] = js.native
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId = js.native
  /**
    * JavaScript script name or url.
    */
  var url: String = js.native
}

object ScriptCoverage {
  @scala.inline
  def apply(functions: js.Array[FunctionCoverage], scriptId: ScriptId, url: String): ScriptCoverage = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptCoverage]
  }
  @scala.inline
  implicit class ScriptCoverageOps[Self <: ScriptCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctions(value: js.Array[FunctionCoverage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptId(value: ScriptId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

