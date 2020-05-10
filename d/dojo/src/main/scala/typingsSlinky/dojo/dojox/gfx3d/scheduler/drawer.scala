package typingsSlinky.dojo.dojox.gfx3d.scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/scheduler.drawer.html
  *
  *
  */
@js.native
trait drawer extends js.Object {
  /**
    *
    * @param todos
    * @param objects
    * @param viewport
    */
  def chart(todos: js.Any, objects: js.Any, viewport: js.Any): Unit = js.native
  /**
    *
    * @param todos
    * @param objects
    * @param viewport
    */
  def conservative(todos: js.Any, objects: js.Any, viewport: js.Any): Unit = js.native
}

object drawer {
  @scala.inline
  def apply(chart: (js.Any, js.Any, js.Any) => Unit, conservative: (js.Any, js.Any, js.Any) => Unit): drawer = {
    val __obj = js.Dynamic.literal(chart = js.Any.fromFunction3(chart), conservative = js.Any.fromFunction3(conservative))
    __obj.asInstanceOf[drawer]
  }
  @scala.inline
  implicit class drawerOps[Self <: drawer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withConservative(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conservative")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

