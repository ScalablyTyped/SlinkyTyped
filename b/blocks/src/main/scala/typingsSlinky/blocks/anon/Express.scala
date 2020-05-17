package typingsSlinky.blocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Express extends js.Object {
  def express(): js.Any = js.native
}

object Express {
  @scala.inline
  def apply(express: () => js.Any): Express = {
    val __obj = js.Dynamic.literal(express = js.Any.fromFunction0(express))
    __obj.asInstanceOf[Express]
  }
  @scala.inline
  implicit class ExpressOps[Self <: Express] (val x: Self) extends AnyVal {
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

