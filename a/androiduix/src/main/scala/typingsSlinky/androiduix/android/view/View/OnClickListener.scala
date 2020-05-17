package typingsSlinky.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnClickListener extends js.Object {
  def onClick(v: typingsSlinky.androiduix.android.view.View): Unit = js.native
}

object OnClickListener {
  @scala.inline
  def apply(onClick: typingsSlinky.androiduix.android.view.View => Unit): OnClickListener = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[OnClickListener]
  }
  @scala.inline
  implicit class OnClickListenerOps[Self <: OnClickListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: typingsSlinky.androiduix.android.view.View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

