package typingsSlinky.androiduix.android.graphics.drawable.Drawable

import typingsSlinky.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  var drawableSizeChange: js.UndefOr[
    js.Function1[/* who */ typingsSlinky.androiduix.android.graphics.drawable.Drawable, Unit]
  ] = js.native
  def invalidateDrawable(who: typingsSlinky.androiduix.android.graphics.drawable.Drawable): Unit = js.native
  def scheduleDrawable(who: typingsSlinky.androiduix.android.graphics.drawable.Drawable, what: Runnable, when: Double): Unit = js.native
  def unscheduleDrawable(who: typingsSlinky.androiduix.android.graphics.drawable.Drawable, what: Runnable): Unit = js.native
}

object Callback {
  @scala.inline
  def apply(
    invalidateDrawable: typingsSlinky.androiduix.android.graphics.drawable.Drawable => Unit,
    scheduleDrawable: (typingsSlinky.androiduix.android.graphics.drawable.Drawable, Runnable, Double) => Unit,
    unscheduleDrawable: (typingsSlinky.androiduix.android.graphics.drawable.Drawable, Runnable) => Unit
  ): Callback = {
    val __obj = js.Dynamic.literal(invalidateDrawable = js.Any.fromFunction1(invalidateDrawable), scheduleDrawable = js.Any.fromFunction3(scheduleDrawable), unscheduleDrawable = js.Any.fromFunction2(unscheduleDrawable))
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidateDrawable(value: typingsSlinky.androiduix.android.graphics.drawable.Drawable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateDrawable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScheduleDrawable(value: (typingsSlinky.androiduix.android.graphics.drawable.Drawable, Runnable, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleDrawable")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUnscheduleDrawable(value: (typingsSlinky.androiduix.android.graphics.drawable.Drawable, Runnable) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unscheduleDrawable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrawableSizeChange(value: /* who */ typingsSlinky.androiduix.android.graphics.drawable.Drawable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawableSizeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawableSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawableSizeChange")(js.undefined)
        ret
    }
  }
  
}

