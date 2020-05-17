package typingsSlinky.androiduix.android.text.style.TabStopSpan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Standard
  extends typingsSlinky.androiduix.android.text.style.TabStopSpan {
  var mTab: js.Any = js.native
}

object Standard {
  @scala.inline
  def apply(getTabStop: () => Double, mTab: js.Any): Standard = {
    val __obj = js.Dynamic.literal(getTabStop = js.Any.fromFunction0(getTabStop), mTab = mTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
  @scala.inline
  implicit class StandardOps[Self <: Standard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMTab(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTab")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

