package typingsSlinky.leafletDraw.mod.Localization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draw extends js.Object {
  var handlers: DrawHandlers = js.native
  var toolbar: DrawToolbar = js.native
}

object Draw {
  @scala.inline
  def apply(handlers: DrawHandlers, toolbar: DrawToolbar): Draw = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draw]
  }
  @scala.inline
  implicit class DrawOps[Self <: Draw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlers(value: DrawHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: DrawToolbar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

