package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapTarget extends Component[TapTargetOptions] {
  /**
    * If the tap target is open
    */
  var isOpen: Boolean = js.native
  /**
    * Close Tap Target
    */
  def close(): Unit = js.native
  /**
    * Open Tap Target
    */
  def open(): Unit = js.native
}

object TapTarget {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    isOpen: Boolean,
    open: () => Unit,
    options: TapTargetOptions
  ): TapTarget = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapTarget]
  }
  @scala.inline
  implicit class TapTargetOps[Self <: TapTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

