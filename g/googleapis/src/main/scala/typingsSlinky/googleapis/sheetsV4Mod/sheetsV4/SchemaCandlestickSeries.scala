package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The series of a CandlestickData.
  */
@js.native
trait SchemaCandlestickSeries extends js.Object {
  
  /**
    * The data of the CandlestickSeries.
    */
  var data: js.UndefOr[SchemaChartData] = js.native
}
object SchemaCandlestickSeries {
  
  @scala.inline
  def apply(): SchemaCandlestickSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandlestickSeries]
  }
  
  @scala.inline
  implicit class SchemaCandlestickSeriesOps[Self <: SchemaCandlestickSeries] (val x: Self) extends AnyVal {
    
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
    def setData(value: SchemaChartData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
