package typingsSlinky.reactOnclickoutside.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleClickOutside[T] extends js.Object {
  var handleClickOutside: MouseEventHandler[T]
}

object HandleClickOutside {
  @scala.inline
  def apply[T](handleClickOutside: SyntheticMouseEvent[T] => Unit): HandleClickOutside[T] = {
    val __obj = js.Dynamic.literal(handleClickOutside = js.Any.fromFunction1(handleClickOutside))
    __obj.asInstanceOf[HandleClickOutside[T]]
  }
}

