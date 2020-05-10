package typingsSlinky.expressVersionRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetVersionByQueryParamOptions extends js.Object {
  var removeQueryParam: Boolean = js.native
}

object SetVersionByQueryParamOptions {
  @scala.inline
  def apply(removeQueryParam: Boolean): SetVersionByQueryParamOptions = {
    val __obj = js.Dynamic.literal(removeQueryParam = removeQueryParam.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVersionByQueryParamOptions]
  }
  @scala.inline
  implicit class SetVersionByQueryParamOptionsOps[Self <: SetVersionByQueryParamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveQueryParam(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeQueryParam")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

