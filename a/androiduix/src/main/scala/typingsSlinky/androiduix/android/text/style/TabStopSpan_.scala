package typingsSlinky.androiduix.android.text.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStopSpan_ extends ParagraphStyle {
  def getTabStop(): Double = js.native
}

object TabStopSpan_ {
  @scala.inline
  def apply(getTabStop: () => Double): TabStopSpan_ = {
    val __obj = js.Dynamic.literal(getTabStop = js.Any.fromFunction0(getTabStop))
    __obj.asInstanceOf[TabStopSpan_]
  }
  @scala.inline
  implicit class TabStopSpan_Ops[Self <: TabStopSpan_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTabStop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabStop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

