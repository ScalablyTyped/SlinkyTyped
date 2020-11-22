package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceChartProperties extends js.Object {
  
  /** Output only. The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.native
  
  /** ID of the data source that the chart is associated with. */
  var dataSourceId: js.UndefOr[String] = js.native
}
object DataSourceChartProperties {
  
  @scala.inline
  def apply(): DataSourceChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceChartProperties]
  }
  
  @scala.inline
  implicit class DataSourceChartPropertiesOps[Self <: DataSourceChartProperties] (val x: Self) extends AnyVal {
    
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
    def setDataExecutionStatus(value: DataExecutionStatus): Self = this.set("dataExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataExecutionStatus: Self = this.set("dataExecutionStatus", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = this.set("dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceId: Self = this.set("dataSourceId", js.undefined)
  }
}
