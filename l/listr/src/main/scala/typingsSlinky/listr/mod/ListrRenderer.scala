package typingsSlinky.listr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrRenderer extends js.Object {
  def end(err: js.Error): Unit = js.native
  def render(): Unit = js.native
}

object ListrRenderer {
  @scala.inline
  def apply(end: js.Error => Unit, render: () => Unit): ListrRenderer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[ListrRenderer]
  }
  @scala.inline
  implicit class ListrRendererOps[Self <: ListrRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

