package typingsSlinky.emberRouting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParam extends js.Object {
  var queryParam: js.Object = js.native
}

object QueryParam {
  @scala.inline
  def apply(queryParam: js.Object): QueryParam = {
    val __obj = js.Dynamic.literal(queryParam = queryParam.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParam]
  }
  @scala.inline
  implicit class QueryParamOps[Self <: QueryParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryParam(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParam")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

