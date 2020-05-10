package typingsSlinky.androiduix.android.graphics.drawable.Drawable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstantState extends js.Object {
  def newDrawable(): typingsSlinky.androiduix.android.graphics.drawable.Drawable = js.native
}

object ConstantState {
  @scala.inline
  def apply(newDrawable: () => typingsSlinky.androiduix.android.graphics.drawable.Drawable): ConstantState = {
    val __obj = js.Dynamic.literal(newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[ConstantState]
  }
  @scala.inline
  implicit class ConstantStateOps[Self <: ConstantState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewDrawable(value: () => typingsSlinky.androiduix.android.graphics.drawable.Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDrawable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

