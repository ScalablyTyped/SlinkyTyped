package typingsSlinky.androiduix.android.graphics.drawable.Drawable

import typingsSlinky.androiduix.java.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var drawableSizeChange: js.UndefOr[
    js.Function1[/* who */ typingsSlinky.androiduix.android.graphics.drawable.Drawable, Unit]
  ] = js.undefined
  def invalidateDrawable(who: typingsSlinky.androiduix.android.graphics.drawable.Drawable): Unit
  def scheduleDrawable(who: typingsSlinky.androiduix.android.graphics.drawable.Drawable, what: Runnable, when: Double): Unit
  def unscheduleDrawable(who: typingsSlinky.androiduix.android.graphics.drawable.Drawable, what: Runnable): Unit
}

object Callback {
  @scala.inline
  def apply(
    invalidateDrawable: typingsSlinky.androiduix.android.graphics.drawable.Drawable => Unit,
    scheduleDrawable: (typingsSlinky.androiduix.android.graphics.drawable.Drawable, Runnable, Double) => Unit,
    unscheduleDrawable: (typingsSlinky.androiduix.android.graphics.drawable.Drawable, Runnable) => Unit,
    drawableSizeChange: /* who */ typingsSlinky.androiduix.android.graphics.drawable.Drawable => Unit = null
  ): Callback = {
    val __obj = js.Dynamic.literal(invalidateDrawable = js.Any.fromFunction1(invalidateDrawable), scheduleDrawable = js.Any.fromFunction3(scheduleDrawable), unscheduleDrawable = js.Any.fromFunction2(unscheduleDrawable))
    if (drawableSizeChange != null) __obj.updateDynamic("drawableSizeChange")(js.Any.fromFunction1(drawableSizeChange))
    __obj.asInstanceOf[Callback]
  }
}

