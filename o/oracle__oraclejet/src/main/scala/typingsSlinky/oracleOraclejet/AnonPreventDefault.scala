package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreventDefault extends js.Object {
  var preventDefault: Boolean = js.native
}

object AnonPreventDefault {
  @scala.inline
  def apply(preventDefault: Boolean): AnonPreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreventDefault]
  }
  @scala.inline
  implicit class AnonPreventDefaultOps[Self <: AnonPreventDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

