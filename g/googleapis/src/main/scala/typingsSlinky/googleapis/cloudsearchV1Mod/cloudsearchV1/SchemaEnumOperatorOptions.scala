package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to provide a search operator for enum properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched. For example, if you provide no operator
  * for a *priority* enum property with possible values *p0* and *p1*, a query
  * that contains the term *p0* will return items that have *p0* as the value
  * of the *priority* property, as well as any items that contain the string
  * *p0* in other fields. If you provide an operator name for the enum, such as
  * *priority*, then search users can use that operator to refine results to
  * only items that have *p0* as this property&#39;s value, with the query
  * *priority:p0*.
  */
@js.native
trait SchemaEnumOperatorOptions extends js.Object {
  
  /**
    * Indicates the operator name required in the query in order to isolate the
    * enum property. For example, if operatorName is *priority* and the
    * property&#39;s name is *priorityVal*, then queries like
    * *priority:&amp;lt;value&amp;gt;* will show results only where the value
    * of the property named *priorityVal* matches *&amp;lt;value&amp;gt;*. By
    * contrast, a search that uses the same *&amp;lt;value&amp;gt;* without an
    * operator will return all items where *&amp;lt;value&amp;gt;* matches the
    * value of any String properties or text within the content field for the
    * item. The operator name can only contain lowercase letters (a-z). The
    * maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}
object SchemaEnumOperatorOptions {
  
  @scala.inline
  def apply(): SchemaEnumOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumOperatorOptions]
  }
  
  @scala.inline
  implicit class SchemaEnumOperatorOptionsOps[Self <: SchemaEnumOperatorOptions] (val x: Self) extends AnyVal {
    
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
  }
}
