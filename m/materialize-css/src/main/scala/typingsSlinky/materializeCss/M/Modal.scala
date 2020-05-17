package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends Component[ModalOptions]
     with Openable {
  /**
    * ID of the modal element
    */
  var id: String = js.native
}

object Modal {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    id: String,
    isOpen: Boolean,
    open: () => Unit,
    options: ModalOptions
  ): Modal = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modal]
  }
  @scala.inline
  implicit class ModalOps[Self <: Modal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

