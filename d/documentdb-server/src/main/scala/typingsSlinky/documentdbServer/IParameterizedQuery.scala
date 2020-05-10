package typingsSlinky.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Can be used as the query parameter in queryAttachments and queryDocuments. */
@js.native
trait IParameterizedQuery extends js.Object {
  /** Parameters */
  var parameters: js.Array[IQueryParam] = js.native
  /** SQL query string. */
  var query: String = js.native
}

object IParameterizedQuery {
  @scala.inline
  def apply(parameters: js.Array[IQueryParam], query: String): IParameterizedQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParameterizedQuery]
  }
  @scala.inline
  implicit class IParameterizedQueryOps[Self <: IParameterizedQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: js.Array[IQueryParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

