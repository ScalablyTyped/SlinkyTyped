package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`join-table`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`left-inner-join`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`left-outer-join`
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinTableDataSource extends Object {
  
  /**
    * The type of join that will be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var joinType: `left-outer-join` | `left-inner-join` = js.native
  
  /**
    * The field name used for joining or matching records in the left table to records in the right table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var leftTableKey: String = js.native
  
  /**
    * The left table for joining to the right table source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var leftTableSource: DynamicMapLayer | DynamicDataLayer = js.native
  
  /**
    * The field name used for joining or matching records in the right table to records in the left table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var rightTableKey: String = js.native
  
  /**
    * The right table for joining to the left table source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var rightTableSource: DynamicMapLayer | DynamicDataLayer = js.native
  
  /**
    * This value is always `join-table` and is inferred when other join table properties of this object are set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var `type`: `join-table` = js.native
}
object JoinTableDataSource {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    joinType: `left-outer-join` | `left-inner-join`,
    leftTableKey: String,
    leftTableSource: DynamicMapLayer | DynamicDataLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    rightTableKey: String,
    rightTableSource: DynamicMapLayer | DynamicDataLayer,
    `type`: `join-table`
  ): JoinTableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), joinType = joinType.asInstanceOf[js.Any], leftTableKey = leftTableKey.asInstanceOf[js.Any], leftTableSource = leftTableSource.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rightTableKey = rightTableKey.asInstanceOf[js.Any], rightTableSource = rightTableSource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinTableDataSource]
  }
  
  @scala.inline
  implicit class JoinTableDataSourceOps[Self <: JoinTableDataSource] (val x: Self) extends AnyVal {
    
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
    def setJoinType(value: `left-outer-join` | `left-inner-join`): Self = this.set("joinType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftTableKey(value: String): Self = this.set("leftTableKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftTableSource(value: DynamicMapLayer | DynamicDataLayer): Self = this.set("leftTableSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTableKey(value: String): Self = this.set("rightTableKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTableSource(value: DynamicMapLayer | DynamicDataLayer): Self = this.set("rightTableSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `join-table`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
