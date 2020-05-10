package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameterType extends js.Object {
  var arrayType: js.UndefOr[QueryParameterType] = js.native
  var structTypes: js.UndefOr[js.Array[QueryParameterTypeStructTypes]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object QueryParameterType {
  @scala.inline
  def apply(): QueryParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterType]
  }
  @scala.inline
  implicit class QueryParameterTypeOps[Self <: QueryParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayType(value: QueryParameterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayType")(js.undefined)
        ret
    }
    @scala.inline
    def withStructTypes(value: js.Array[QueryParameterTypeStructTypes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

