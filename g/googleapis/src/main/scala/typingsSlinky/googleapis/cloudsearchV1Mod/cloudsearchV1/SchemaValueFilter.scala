package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaValueFilter extends js.Object {
  
  /**
    * The `operator_name` applied to the query, such as *price_greater_than*.
    * The filter can work against both types of filters defined in the schema
    * for your data source: &lt;br/&gt;&lt;br/&gt; 1. `operator_name`, where
    * the query filters results by the property that matches the value.
    * &lt;br/&gt; 2. `greater_than_operator_name` or `less_than_operator_name`
    * in your schema. The query filters the results for the property values
    * that are greater than or less than  the supplied value in the query.
    */
  var operatorName: js.UndefOr[String] = js.native
  
  /**
    * The value to be compared with.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}
object SchemaValueFilter {
  
  @scala.inline
  def apply(): SchemaValueFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueFilter]
  }
  
  @scala.inline
  implicit class SchemaValueFilterOps[Self <: SchemaValueFilter] (val x: Self) extends AnyVal {
    
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
    def setOperatorName(value: String): Self = this.set("operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorName: Self = this.set("operatorName", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
