package typingsSlinky.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coverage data for a JavaScript function.
  */
@js.native
trait FunctionCoverage extends js.Object {
  /**
    * JavaScript function name.
    */
  var functionName: String = js.native
  /**
    * Whether coverage data for this function has block granularity.
    */
  var isBlockCoverage: Boolean = js.native
  /**
    * Source ranges inside the function with coverage data.
    */
  var ranges: js.Array[CoverageRange] = js.native
}

object FunctionCoverage {
  @scala.inline
  def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[CoverageRange]): FunctionCoverage = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCoverage]
  }
  @scala.inline
  implicit class FunctionCoverageOps[Self <: FunctionCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlockCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlockCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRanges(value: js.Array[CoverageRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

