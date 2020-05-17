package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collapsible extends Component[CollapsibleOptions] {
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  def close(n: Double): Unit = js.native
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  def open(n: Double): Unit = js.native
}

object Collapsible {
  @scala.inline
  def apply(
    close: Double => Unit,
    destroy: () => Unit,
    el: Element,
    open: Double => Unit,
    options: CollapsibleOptions
  ): Collapsible = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], open = js.Any.fromFunction1(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapsible]
  }
  @scala.inline
  implicit class CollapsibleOps[Self <: Collapsible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

