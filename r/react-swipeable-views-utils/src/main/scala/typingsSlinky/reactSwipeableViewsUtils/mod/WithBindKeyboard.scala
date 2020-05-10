package typingsSlinky.reactSwipeableViewsUtils.mod

import typingsSlinky.reactSwipeableViews.mod.OnChangeIndexCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithBindKeyboard extends js.Object {
  var index: Double = js.native
  var onChangeIndex: OnChangeIndexCallback = js.native
}

object WithBindKeyboard {
  @scala.inline
  def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit): WithBindKeyboard = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
    __obj.asInstanceOf[WithBindKeyboard]
  }
  @scala.inline
  implicit class WithBindKeyboardOps[Self <: WithBindKeyboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeIndex")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

