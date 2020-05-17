package typingsSlinky.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends GridStackElement {
  @JSName("data")
  def data_gridstack(key: typingsSlinky.gridstack.gridstackStrings.gridstack): GridStack = js.native
  def gridstack(options: GridstackOptions): JQuery = js.native
}

object JQuery {
  @scala.inline
  def apply(
    data: typingsSlinky.gridstack.gridstackStrings.gridstack => GridStack,
    gridstack: GridstackOptions => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction1(data), gridstack = js.Any.fromFunction1(gridstack))
    __obj.asInstanceOf[JQuery]
  }
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: typingsSlinky.gridstack.gridstackStrings.gridstack => GridStack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGridstack(value: GridstackOptions => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridstack")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

