package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramSeries extends js.Object {
  
  /**
    * The color of the column representing this series in each bucket.
    * This field is optional.
    */
  var barColor: js.UndefOr[Color] = js.native
  
  /**
    * The color of the column representing this series in each bucket.
    * This field is optional.
    * If bar_color is also set, this field takes precedence.
    */
  var barColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The data for this histogram series. */
  var data: js.UndefOr[ChartData] = js.native
}
object HistogramSeries {
  
  @scala.inline
  def apply(): HistogramSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramSeries]
  }
  
  @scala.inline
  implicit class HistogramSeriesOps[Self <: HistogramSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBarColor(value: Color): Self = this.set("barColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarColor: Self = this.set("barColor", js.undefined)
    
    @scala.inline
    def setBarColorStyle(value: ColorStyle): Self = this.set("barColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarColorStyle: Self = this.set("barColorStyle", js.undefined)
    
    @scala.inline
    def setData(value: ChartData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
