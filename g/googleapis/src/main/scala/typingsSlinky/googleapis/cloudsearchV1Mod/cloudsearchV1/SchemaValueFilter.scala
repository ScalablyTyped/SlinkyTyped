package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withOperatorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: SchemaValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

