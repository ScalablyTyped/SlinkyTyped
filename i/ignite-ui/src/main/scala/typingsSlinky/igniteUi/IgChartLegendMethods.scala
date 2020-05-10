package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgChartLegendMethods extends js.Object {
  def destroy(): Unit = js.native
  def getLegend(): Unit = js.native
  /**
  	 * Returns the ID of the parent div element bounding the ruler and the tooltip container
  	 */
  def id(): String = js.native
}

object IgChartLegendMethods {
  @scala.inline
  def apply(destroy: () => Unit, getLegend: () => Unit, id: () => String): IgChartLegendMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getLegend = js.Any.fromFunction0(getLegend), id = js.Any.fromFunction0(id))
    __obj.asInstanceOf[IgChartLegendMethods]
  }
  @scala.inline
  implicit class IgChartLegendMethodsOps[Self <: IgChartLegendMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLegend(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

