package typingsSlinky.jqueryWindow

import typingsSlinky.jqueryWindow.JQueryWindow.Window
import typingsSlinky.jqueryWindow.JQueryWindow.WindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Register with JQuery instance
@js.native
trait JQuery extends js.Object {
  def window(options: WindowOptions): Window = js.native
}

object JQuery {
  @scala.inline
  def apply(window: WindowOptions => Window): JQuery = {
    val __obj = js.Dynamic.literal(window = js.Any.fromFunction1(window))
    __obj.asInstanceOf[JQuery]
  }
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWindow(value: WindowOptions => Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

