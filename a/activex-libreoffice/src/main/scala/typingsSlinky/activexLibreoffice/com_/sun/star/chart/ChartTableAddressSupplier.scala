package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a helper service for access to table Address to cell ranges of the container document of a chart.
  *
  * The cell addresses are in the format of the application that contains this chart.
  */
@js.native
trait ChartTableAddressSupplier extends js.Object {
  /**
    * contains the address to the cells containing the names of the categories.
    *
    * Note: Each value of a data series belongs exactly to one category.
    */
  var CategoriesRangeAddress: String = js.native
  /** contains the address to the main title. */
  var MainTitleAddress: String = js.native
  /**
    * contains the addresses to the elements of a series. This sequence should contain one element for each series in the chart.
    * @see ChartSeriesAddress
    */
  var SeriesAddresses: SafeArray[ChartSeriesAddress] = js.native
  /** contains the address to the sub title. */
  var SubTitleAddress: String = js.native
}

object ChartTableAddressSupplier {
  @scala.inline
  def apply(
    CategoriesRangeAddress: String,
    MainTitleAddress: String,
    SeriesAddresses: SafeArray[ChartSeriesAddress],
    SubTitleAddress: String
  ): ChartTableAddressSupplier = {
    val __obj = js.Dynamic.literal(CategoriesRangeAddress = CategoriesRangeAddress.asInstanceOf[js.Any], MainTitleAddress = MainTitleAddress.asInstanceOf[js.Any], SeriesAddresses = SeriesAddresses.asInstanceOf[js.Any], SubTitleAddress = SubTitleAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTableAddressSupplier]
  }
  @scala.inline
  implicit class ChartTableAddressSupplierOps[Self <: ChartTableAddressSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoriesRangeAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoriesRangeAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainTitleAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MainTitleAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesAddresses(value: SafeArray[ChartSeriesAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeriesAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubTitleAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubTitleAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

