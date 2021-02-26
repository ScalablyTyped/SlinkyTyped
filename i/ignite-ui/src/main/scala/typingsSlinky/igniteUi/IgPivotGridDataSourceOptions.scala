package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotGridDataSourceOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
    */
  var columns: js.UndefOr[String] = js.native
  
  /**
    * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
    */
  var filters: js.UndefOr[String] = js.native
  
  /**
    * Settings for creating an instance of $.ig.OlapFlatDataSource.
    */
  var flatDataOptions: js.UndefOr[IgPivotGridDataSourceOptionsFlatDataOptions] = js.native
  
  /**
    * A list of measure names separated by comma (,). These will be the measures of the data source.
    */
  var measures: js.UndefOr[String] = js.native
  
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
    */
  var rows: js.UndefOr[String] = js.native
  
  /**
    * Settings for creating an instance of $.ig.OlapXmlaDataSource.
    */
  var xmlaOptions: js.UndefOr[IgPivotGridDataSourceOptionsXmlaOptions] = js.native
}
object IgPivotGridDataSourceOptions {
  
  @scala.inline
  def apply(): IgPivotGridDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptions]
  }
  
  @scala.inline
  implicit class IgPivotGridDataSourceOptionsMutableBuilder[Self <: IgPivotGridDataSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFlatDataOptions(value: IgPivotGridDataSourceOptionsFlatDataOptions): Self = StObject.set(x, "flatDataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatDataOptionsUndefined: Self = StObject.set(x, "flatDataOptions", js.undefined)
    
    @scala.inline
    def setMeasures(value: String): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    @scala.inline
    def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setXmlaOptions(value: IgPivotGridDataSourceOptionsXmlaOptions): Self = StObject.set(x, "xmlaOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlaOptionsUndefined: Self = StObject.set(x, "xmlaOptions", js.undefined)
  }
}
