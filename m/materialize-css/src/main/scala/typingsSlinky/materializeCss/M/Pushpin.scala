package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pushpin extends Component[PushpinOptions] {
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double = js.native
}

object Pushpin {
  @scala.inline
  def apply(destroy: () => Unit, el: Element, options: PushpinOptions, originalOffset: Double): Pushpin = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalOffset = originalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pushpin]
  }
  @scala.inline
  implicit class PushpinOps[Self <: Pushpin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

