package typingsSlinky.androiduix.android.widget.NumberPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnScrollListener extends js.Object {
  def onScrollStateChange(view: typingsSlinky.androiduix.android.widget.NumberPicker, scrollState: Double): Unit = js.native
}

object OnScrollListener {
  @scala.inline
  def apply(onScrollStateChange: (typingsSlinky.androiduix.android.widget.NumberPicker, Double) => Unit): OnScrollListener = {
    val __obj = js.Dynamic.literal(onScrollStateChange = js.Any.fromFunction2(onScrollStateChange))
    __obj.asInstanceOf[OnScrollListener]
  }
  @scala.inline
  implicit class OnScrollListenerOps[Self <: OnScrollListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnScrollStateChange(value: (typingsSlinky.androiduix.android.widget.NumberPicker, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStateChange")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

