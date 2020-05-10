package typingsSlinky.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpress extends js.Object {
  def express(): js.Any = js.native
}

object AnonExpress {
  @scala.inline
  def apply(express: () => js.Any): AnonExpress = {
    val __obj = js.Dynamic.literal(express = js.Any.fromFunction0(express))
    __obj.asInstanceOf[AnonExpress]
  }
  @scala.inline
  implicit class AnonExpressOps[Self <: AnonExpress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpress(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("express")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

