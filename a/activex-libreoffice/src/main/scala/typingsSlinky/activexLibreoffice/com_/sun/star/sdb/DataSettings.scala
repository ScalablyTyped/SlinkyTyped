package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the {@link com.sun.star.sdbcx.Table} with additional display information, sorting and filtering criteria. */
@js.native
trait DataSettings extends js.Object {
  /** indicates whether the filter should be applied or not, default is `FALSE` . */
  var ApplyFilter: Boolean = js.native
  /** additional filter for the data object. */
  var Filter: String = js.native
  /** specifies the font attributes for data displaying. */
  var FontDescriptor: typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  /** additional group by for the data object. */
  var GroupBy: String = js.native
  /** additional having clause for the data object. */
  var HavingClause: String = js.native
  /** is an additional sort order definition. */
  var Order: String = js.native
  /** specifies the height of a data row. */
  var RowHeight: Double = js.native
  /** specifies the text color (RGB) for displaying text. */
  var TextColor: Color = js.native
}

object DataSettings {
  @scala.inline
  def apply(
    ApplyFilter: Boolean,
    Filter: String,
    FontDescriptor: FontDescriptor,
    GroupBy: String,
    HavingClause: String,
    Order: String,
    RowHeight: Double,
    TextColor: Color
  ): DataSettings = {
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSettings]
  }
  @scala.inline
  implicit class DataSettingsOps[Self <: DataSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontDescriptor(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHavingClause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HavingClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

