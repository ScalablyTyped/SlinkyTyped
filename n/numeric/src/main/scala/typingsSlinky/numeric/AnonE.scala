package typingsSlinky.numeric

import typingsSlinky.numeric.mod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonE extends js.Object {
  var E: Tensor = js.native
  var lambda: Tensor = js.native
}

object AnonE {
  @scala.inline
  def apply(E: Tensor, lambda: Tensor): AnonE = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonE]
  }
  @scala.inline
  implicit class AnonEOps[Self <: AnonE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE(value: Tensor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLambda(value: Tensor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

