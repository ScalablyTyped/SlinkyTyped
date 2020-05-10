package typingsSlinky.istanbulLibInstrument.mod

import typingsSlinky.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisitorOptions extends js.Object {
  var coverageVariable: String = js.native
  var inputSourceMap: RawSourceMap = js.native
}

object VisitorOptions {
  @scala.inline
  def apply(coverageVariable: String, inputSourceMap: RawSourceMap): VisitorOptions = {
    val __obj = js.Dynamic.literal(coverageVariable = coverageVariable.asInstanceOf[js.Any], inputSourceMap = inputSourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitorOptions]
  }
  @scala.inline
  implicit class VisitorOptionsOps[Self <: VisitorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputSourceMap(value: RawSourceMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSourceMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

