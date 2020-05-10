package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import typingsSlinky.googleAppsScript.googleAppsScriptStrings.BETWEEN
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.CONTAINS
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.EQUALS
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.EXCLUDE
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.INCLUDE
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.IN_LIST
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.IS_NULL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionsFilters extends js.Object {
  /** The name of the field to be filtered */
  var fieldName: String = js.native
  /** The operator to apply. */
  var operator: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator = js.native
  /** Whether data matching this filter should be included or excluded from the getData() response. */
  var `type`: INCLUDE | EXCLUDE = js.native
  /** An array of values to use for the operator. */
  var values: js.Array[String] = js.native
}

object DimensionsFilters {
  @scala.inline
  def apply(
    fieldName: String,
    operator: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator,
    `type`: INCLUDE | EXCLUDE,
    values: js.Array[String]
  ): DimensionsFilters = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionsFilters]
  }
  @scala.inline
  implicit class DimensionsFiltersOps[Self <: DimensionsFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: INCLUDE | EXCLUDE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

