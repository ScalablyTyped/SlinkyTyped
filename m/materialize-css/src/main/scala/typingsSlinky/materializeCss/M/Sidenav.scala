package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sidenav
  extends Component[SidenavOptions]
     with Openable {
  /**
    * Describes if Sidenav is being dragged
    */
  var isDragged: Boolean = js.native
  /**
    * Describes if sidenav is fixed
    */
  var isFixed: Boolean = js.native
}

object Sidenav {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    isDragged: Boolean,
    isFixed: Boolean,
    isOpen: Boolean,
    open: () => Unit,
    options: SidenavOptions
  ): Sidenav = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sidenav]
  }
  @scala.inline
  implicit class SidenavOps[Self <: Sidenav] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDragged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

