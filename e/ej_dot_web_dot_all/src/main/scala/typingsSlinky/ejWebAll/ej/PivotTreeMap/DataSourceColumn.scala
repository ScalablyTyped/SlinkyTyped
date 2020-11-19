package typingsSlinky.ejWebAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceColumn extends js.Object {
  
  /** Allows the user to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /** Applies filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceColumnsFilterItems] = js.native
  
  /** Allows the user to indicate whether the added item is a named set or not.
    * @Default {false}
    */
  var isNamedSets: js.UndefOr[Boolean] = js.native
}
object DataSourceColumn {
  
  @scala.inline
  def apply(): DataSourceColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceColumn]
  }
  
  @scala.inline
  implicit class DataSourceColumnOps[Self <: DataSourceColumn] (val x: Self) extends AnyVal {
    
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setFilterItems(value: DataSourceColumnsFilterItems): Self = this.set("filterItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterItems: Self = this.set("filterItems", js.undefined)
    
    @scala.inline
    def setIsNamedSets(value: Boolean): Self = this.set("isNamedSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNamedSets: Self = this.set("isNamedSets", js.undefined)
  }
}
