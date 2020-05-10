package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameter extends js.Object {
  var name: js.UndefOr[String] = js.native
  var parameterType: js.UndefOr[QueryParameterType] = js.native
  var parameterValue: js.UndefOr[QueryParameterValue] = js.native
}

object QueryParameter {
  @scala.inline
  def apply(): QueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameter]
  }
  @scala.inline
  implicit class QueryParameterOps[Self <: QueryParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterType(value: QueryParameterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterType")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterValue(value: QueryParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterValue")(js.undefined)
        ret
    }
  }
  
}

