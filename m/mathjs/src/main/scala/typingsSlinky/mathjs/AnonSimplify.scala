package typingsSlinky.mathjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSimplify extends js.Object {
  var simplify: Boolean = js.native
}

object AnonSimplify {
  @scala.inline
  def apply(simplify: Boolean): AnonSimplify = {
    val __obj = js.Dynamic.literal(simplify = simplify.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSimplify]
  }
  @scala.inline
  implicit class AnonSimplifyOps[Self <: AnonSimplify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSimplify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplify")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

