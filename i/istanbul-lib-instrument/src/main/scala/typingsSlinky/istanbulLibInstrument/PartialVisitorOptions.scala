package typingsSlinky.istanbulLibInstrument

import typingsSlinky.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-instrument.istanbul-lib-instrument.VisitorOptions> */
@js.native
trait PartialVisitorOptions extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.native
  var inputSourceMap: js.UndefOr[RawSourceMap] = js.native
}

object PartialVisitorOptions {
  @scala.inline
  def apply(): PartialVisitorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVisitorOptions]
  }
  @scala.inline
  implicit class PartialVisitorOptionsOps[Self <: PartialVisitorOptions] (val x: Self) extends AnyVal {
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
    def withoutCoverageVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSourceMap(value: RawSourceMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSourceMap")(js.undefined)
        ret
    }
  }
  
}

