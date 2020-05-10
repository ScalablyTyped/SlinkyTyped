package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source ranges for a chart.
  */
@js.native
trait SchemaChartSourceRange extends js.Object {
  /**
    * The ranges of data for a series or domain. Exactly one dimension must
    * have a length of 1, and all sources in the list must have the same
    * dimension with length 1. The domain (if it exists) &amp; all series must
    * have the same number of source ranges. If using more than one source
    * range, then the source range at a given offset must be in order and
    * contiguous across the domain and series.  For example, these are valid
    * configurations:      domain sources: A1:A5     series1 sources: B1:B5
    * series2 sources: D6:D10      domain sources: A1:A5, C10:C12     series1
    * sources: B1:B5, D10:D12     series2 sources: C1:C5, E10:E12
    */
  var sources: js.UndefOr[js.Array[SchemaGridRange]] = js.native
}

object SchemaChartSourceRange {
  @scala.inline
  def apply(): SchemaChartSourceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartSourceRange]
  }
  @scala.inline
  implicit class SchemaChartSourceRangeOps[Self <: SchemaChartSourceRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSources(value: js.Array[SchemaGridRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
  }
  
}

