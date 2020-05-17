package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toast extends ComponentBase[ToastOptions] {
  /**
    * Describes the current pan state of the Toast.
    */
  var panning: Boolean = js.native
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  var timeRemaining: Double = js.native
  /**
    * remove a specific toast
    */
  def dismiss(): Unit = js.native
}

object Toast {
  @scala.inline
  def apply(dismiss: () => Unit, el: Element, options: ToastOptions, panning: Boolean, timeRemaining: Double): Toast = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], timeRemaining = timeRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toast]
  }
  @scala.inline
  implicit class ToastOps[Self <: Toast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPanning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRemaining")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

