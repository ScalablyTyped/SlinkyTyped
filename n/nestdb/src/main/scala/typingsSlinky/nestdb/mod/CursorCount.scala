package typingsSlinky.nestdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorCount extends js.Object {
  def exec(callback: js.Function2[/* err */ js.Error, /* count */ Double, Unit]): Unit
}

object CursorCount {
  @scala.inline
  def apply(exec: js.Function2[/* err */ js.Error, /* count */ Double, Unit] => Unit): CursorCount = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
    __obj.asInstanceOf[CursorCount]
  }
}

