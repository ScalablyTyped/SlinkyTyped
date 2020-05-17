package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClientBigquery.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameterType extends js.Object {
  /** [Optional] The type of the array's elements, if this is an array. */
  var arrayType: js.UndefOr[QueryParameterType] = js.native
  /** [Optional] The types of the fields of this struct, in order, if this is a struct. */
  var structTypes: js.UndefOr[js.Array[Description]] = js.native
  /** [Required] The top level type of this field. */
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
    def withStructTypes(value: js.Array[Description]): Self = {
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

