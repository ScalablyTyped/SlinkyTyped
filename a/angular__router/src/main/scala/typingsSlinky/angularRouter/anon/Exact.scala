package typingsSlinky.angularRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exact extends js.Object {
  var exact: Boolean = js.native
}

object Exact {
  @scala.inline
  def apply(exact: Boolean): Exact = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exact]
  }
  @scala.inline
  implicit class ExactOps[Self <: Exact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

