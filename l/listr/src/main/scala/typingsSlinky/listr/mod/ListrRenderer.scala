package typingsSlinky.listr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrRenderer extends js.Object {
  def end(err: js.Error): Unit
  def render(): Unit
}

object ListrRenderer {
  @scala.inline
  def apply(end: js.Error => Unit, render: () => Unit): ListrRenderer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[ListrRenderer]
  }
}

