package typingsSlinky.kosCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParam extends js.Object {
  var param: js.Any = js.native
}

object AnonParam {
  @scala.inline
  def apply(param: js.Any): AnonParam = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParam]
  }
  @scala.inline
  implicit class AnonParamOps[Self <: AnonParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParam(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

