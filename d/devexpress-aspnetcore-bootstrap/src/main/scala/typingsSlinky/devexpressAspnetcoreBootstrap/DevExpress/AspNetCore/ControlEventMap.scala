package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlEventMap extends js.Object {
  var init: EventArgs = js.native
}

object ControlEventMap {
  @scala.inline
  def apply(init: EventArgs): ControlEventMap = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlEventMap]
  }
  @scala.inline
  implicit class ControlEventMapOps[Self <: ControlEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

