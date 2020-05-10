package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The data included in a domain or series.
  */
@js.native
trait SchemaChartData extends js.Object {
  /**
    * The source ranges of the data.
    */
  var sourceRange: js.UndefOr[SchemaChartSourceRange] = js.native
}

object SchemaChartData {
  @scala.inline
  def apply(): SchemaChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartData]
  }
  @scala.inline
  implicit class SchemaChartDataOps[Self <: SchemaChartData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceRange(value: SchemaChartSourceRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRange")(js.undefined)
        ret
    }
  }
  
}

