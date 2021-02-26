package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a helper service for access to table Address to cell ranges of the container document of a chart.
  *
  * The cell addresses are in the format of the application that contains this chart.
  */
@js.native
trait ChartTableAddressSupplier extends StObject {
  
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
  implicit class ChartTableAddressSupplierMutableBuilder[Self <: ChartTableAddressSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoriesRangeAddress(value: String): Self = StObject.set(x, "CategoriesRangeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTitleAddress(value: String): Self = StObject.set(x, "MainTitleAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesAddresses(value: SafeArray[ChartSeriesAddress]): Self = StObject.set(x, "SeriesAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleAddress(value: String): Self = StObject.set(x, "SubTitleAddress", value.asInstanceOf[js.Any])
  }
}
