package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameterValue extends js.Object {
  var arrayValues: js.UndefOr[js.Array[QueryParameterValue]] = js.native
  var structValues: js.UndefOr[js.Object] = js.native
  var value: js.UndefOr[String] = js.native
}

object QueryParameterValue {
  @scala.inline
  def apply(): QueryParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterValue]
  }
  @scala.inline
  implicit class QueryParameterValueOps[Self <: QueryParameterValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayValues(value: js.Array[QueryParameterValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(js.undefined)
        ret
    }
    @scala.inline
    def withStructValues(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structValues")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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

