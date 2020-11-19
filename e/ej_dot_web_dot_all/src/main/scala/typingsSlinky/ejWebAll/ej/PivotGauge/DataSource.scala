package typingsSlinky.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends js.Object {
  
  /** In connection with an OLAP database, this property contains the database name as string to fetch the data from the given connection string.
    * @Default {â€œâ€}
    */
  var catalog: js.UndefOr[String] = js.native
  
  /** Lists out the items to bind in columns section.
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.native
  
  /** Contains the respective cube name from OLAP database as string type.
    * @Default {â€œâ€}
    */
  var cube: js.UndefOr[String] = js.native
  
  /** Provides the raw data source for the PivotGauge.
    * @Default {null}
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Lists out the items which supports filtering of values without displaying the members in UI in PivotGauge.
    * @Default {[]}
    */
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.native
  
  /** Set the provider name for PivotGauge to identify whether the provider is SSAS or Mondrian.
    * @Default {ssas}
    */
  var providerName: js.UndefOr[String] = js.native
  
  /** Lists out the items to bind in rows section.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[DataSourceRow]] = js.native
  
  /** To set the data source name to fetch data from that.
    * @Default {â€œâ€}
    */
  var sourceInfo: js.UndefOr[String] = js.native
  
  /** Lists out the items supports calculation in PivotGauge.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[DataSourceValue]] = js.native
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    
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
    def setCatalog(value: String): Self = this.set("catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalog: Self = this.set("catalog", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: DataSourceColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[DataSourceColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCube(value: String): Self = this.set("cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCube: Self = this.set("cube", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DataSourceFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[DataSourceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setProviderName(value: String): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: DataSourceRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[DataSourceRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSourceInfo(value: String): Self = this.set("sourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInfo: Self = this.set("sourceInfo", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: DataSourceValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[DataSourceValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
