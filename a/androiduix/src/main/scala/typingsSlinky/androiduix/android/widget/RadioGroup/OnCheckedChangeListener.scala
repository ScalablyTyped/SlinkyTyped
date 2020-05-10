package typingsSlinky.androiduix.android.widget.RadioGroup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCheckedChangeListener extends js.Object {
  def onCheckedChanged(group: typingsSlinky.androiduix.android.widget.RadioGroup, checkedId: String): Unit = js.native
}

object OnCheckedChangeListener {
  @scala.inline
  def apply(onCheckedChanged: (typingsSlinky.androiduix.android.widget.RadioGroup, String) => Unit): OnCheckedChangeListener = {
    val __obj = js.Dynamic.literal(onCheckedChanged = js.Any.fromFunction2(onCheckedChanged))
    __obj.asInstanceOf[OnCheckedChangeListener]
  }
  @scala.inline
  implicit class OnCheckedChangeListenerOps[Self <: OnCheckedChangeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCheckedChanged(value: (typingsSlinky.androiduix.android.widget.RadioGroup, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheckedChanged")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

