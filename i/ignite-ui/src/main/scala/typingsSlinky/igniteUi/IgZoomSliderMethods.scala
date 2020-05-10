package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgZoomSliderMethods extends js.Object {
  /**
  	 * Destroys widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Flushes the gauge.
  	 */
  def flush(): Unit = js.native
  def notifySizeChanged(): Unit = js.native
}

object IgZoomSliderMethods {
  @scala.inline
  def apply(destroy: () => Unit, flush: () => Unit, notifySizeChanged: () => Unit): IgZoomSliderMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), notifySizeChanged = js.Any.fromFunction0(notifySizeChanged))
    __obj.asInstanceOf[IgZoomSliderMethods]
  }
  @scala.inline
  implicit class IgZoomSliderMethodsOps[Self <: IgZoomSliderMethods] (val x: Self) extends AnyVal {
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
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifySizeChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySizeChanged")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

