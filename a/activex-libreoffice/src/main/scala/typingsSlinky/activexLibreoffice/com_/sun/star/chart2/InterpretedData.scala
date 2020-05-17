package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.XLabeledDataSequence
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers tooling to interpret different data sources in a structural and chart-type-dependent way. */
@js.native
trait InterpretedData extends js.Object {
  var Categories: XLabeledDataSequence = js.native
  var Series: SafeArray[SafeArray[XDataSeries]] = js.native
}

object InterpretedData {
  @scala.inline
  def apply(Categories: XLabeledDataSequence, Series: SafeArray[SafeArray[XDataSeries]]): InterpretedData = {
    val __obj = js.Dynamic.literal(Categories = Categories.asInstanceOf[js.Any], Series = Series.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpretedData]
  }
  @scala.inline
  implicit class InterpretedDataOps[Self <: InterpretedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: XLabeledDataSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeries(value: SafeArray[SafeArray[XDataSeries]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Series")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

