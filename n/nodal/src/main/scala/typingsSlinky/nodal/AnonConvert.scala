package typingsSlinky.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConvert extends js.Object {
  var convert: js.Function = js.native
}

object AnonConvert {
  @scala.inline
  def apply(convert: js.Function): AnonConvert = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConvert]
  }
  @scala.inline
  implicit class AnonConvertOps[Self <: AnonConvert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

