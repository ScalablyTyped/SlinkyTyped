package typingsSlinky.jasmineNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consolidate extends js.Object {
  var consolidate: Boolean = js.native
  var report: Boolean = js.native
  var savePath: String = js.native
  var useDotNotation: Boolean = js.native
}

object Consolidate {
  @scala.inline
  def apply(consolidate: Boolean, report: Boolean, savePath: String, useDotNotation: Boolean): Consolidate = {
    val __obj = js.Dynamic.literal(consolidate = consolidate.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], savePath = savePath.asInstanceOf[js.Any], useDotNotation = useDotNotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consolidate]
  }
  @scala.inline
  implicit class ConsolidateOps[Self <: Consolidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsolidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseDotNotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDotNotation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

