package typingsSlinky.numeric.anon

import typingsSlinky.numeric.mod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait E extends js.Object {
  var E: Tensor
  var lambda: Tensor
}

object E {
  @scala.inline
  def apply(E: Tensor, lambda: Tensor): E = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
}

