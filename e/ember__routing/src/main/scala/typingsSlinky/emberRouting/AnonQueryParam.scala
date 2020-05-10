package typingsSlinky.emberRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQueryParam extends js.Object {
  var queryParam: js.Object = js.native
}

object AnonQueryParam {
  @scala.inline
  def apply(queryParam: js.Object): AnonQueryParam = {
    val __obj = js.Dynamic.literal(queryParam = queryParam.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryParam]
  }
  @scala.inline
  implicit class AnonQueryParamOps[Self <: AnonQueryParam] (val x: Self) extends AnyVal {
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

