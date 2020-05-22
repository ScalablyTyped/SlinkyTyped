package typingsSlinky.qlik.mod

import typingsSlinky.qlik.anon.QIsNum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var qContent: QIsNum
}

object Variable {
  @scala.inline
  def apply(qContent: QIsNum): Variable = {
    val __obj = js.Dynamic.literal(qContent = qContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

