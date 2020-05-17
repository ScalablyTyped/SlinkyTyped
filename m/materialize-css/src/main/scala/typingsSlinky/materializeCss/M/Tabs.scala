package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tabs extends Component[TabsOptions] {
  /**
    * The index of tab that is currently shown
    */
  var index: Double = js.native
  /**
    * Show tab content that corresponds to the tab with the id
    * @param tabId The id of the tab that you want to switch to
    */
  def select(tabId: String): Unit = js.native
  /**
    * Recalculate tab indicator position. This is useful when the indicator position is not correct
    */
  def updateTabIndicator(): Unit = js.native
}

object Tabs {
  @scala.inline
  def apply(
    destroy: () => Unit,
    el: Element,
    index: Double,
    options: TabsOptions,
    select: String => Unit,
    updateTabIndicator: () => Unit
  ): Tabs = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), updateTabIndicator = js.Any.fromFunction0(updateTabIndicator))
    __obj.asInstanceOf[Tabs]
  }
  @scala.inline
  implicit class TabsOps[Self <: Tabs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateTabIndicator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTabIndicator")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

