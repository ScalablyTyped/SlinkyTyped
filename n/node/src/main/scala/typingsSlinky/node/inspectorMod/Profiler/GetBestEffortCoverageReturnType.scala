package typingsSlinky.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBestEffortCoverageReturnType extends js.Object {
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage] = js.native
}

object GetBestEffortCoverageReturnType {
  @scala.inline
  def apply(result: js.Array[ScriptCoverage]): GetBestEffortCoverageReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBestEffortCoverageReturnType]
  }
  @scala.inline
  implicit class GetBestEffortCoverageReturnTypeOps[Self <: GetBestEffortCoverageReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: js.Array[ScriptCoverage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

