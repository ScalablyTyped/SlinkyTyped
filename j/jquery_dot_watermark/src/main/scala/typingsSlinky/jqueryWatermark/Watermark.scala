package typingsSlinky.jqueryWatermark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watermark extends js.Object {
  var options: WatermarkOptions = js.native
  def hide(element: String): Unit = js.native
  def hideAll(): Unit = js.native
  def show(element: String): Unit = js.native
  def showAll(): Unit = js.native
}

object Watermark {
  @scala.inline
  def apply(
    hide: String => Unit,
    hideAll: () => Unit,
    options: WatermarkOptions,
    show: String => Unit,
    showAll: () => Unit
  ): Watermark = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), hideAll = js.Any.fromFunction0(hideAll), options = options.asInstanceOf[js.Any], show = js.Any.fromFunction1(show), showAll = js.Any.fromFunction0(showAll))
    __obj.asInstanceOf[Watermark]
  }
  @scala.inline
  implicit class WatermarkOps[Self <: Watermark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: WatermarkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

