package typingsSlinky.astTypes.astTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fork extends js.Object {
  def use[T](plugin: Plugin[T]): T = js.native
}

object Fork {
  @scala.inline
  def apply(use: Plugin[js.Any] => js.Any): Fork = {
    val __obj = js.Dynamic.literal(use = js.Any.fromFunction1(use))
    __obj.asInstanceOf[Fork]
  }
  @scala.inline
  implicit class ForkOps[Self <: Fork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUse(value: Plugin[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

