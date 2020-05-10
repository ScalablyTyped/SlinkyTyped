package typingsSlinky.istanbulReports

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined istanbul-reports.istanbul-reports.Options & {  maxCols  :number} */
@js.native
trait OptionsmaxColsnumber extends js.Object {
  var file: String = js.native
  var maxCols: Double = js.native
}

object OptionsmaxColsnumber {
  @scala.inline
  def apply(file: String, maxCols: Double): OptionsmaxColsnumber = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], maxCols = maxCols.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsmaxColsnumber]
  }
  @scala.inline
  implicit class OptionsmaxColsnumberOps[Self <: OptionsmaxColsnumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

