package typingsSlinky.awesomplete.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replace extends js.Object {
  def replace(arg0: js.RegExp, arg1: String): Unit
}

object Replace {
  @scala.inline
  def apply(replace: (js.RegExp, String) => Unit): Replace = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[Replace]
  }
}

