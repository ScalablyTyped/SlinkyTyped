package typingsSlinky.emberRouting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParams extends js.Object {
  var queryParams: js.Object = js.native
}

object QueryParams {
  @scala.inline
  def apply(queryParams: js.Object): QueryParams = {
    val __obj = js.Dynamic.literal(queryParams = queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParams]
  }
  @scala.inline
  implicit class QueryParamsOps[Self <: QueryParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

