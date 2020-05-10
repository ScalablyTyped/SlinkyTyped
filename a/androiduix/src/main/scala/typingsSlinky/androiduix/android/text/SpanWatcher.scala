package typingsSlinky.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpanWatcher extends js.Object {
  def onSpanAdded(text: Spannable, what: js.Any, start: Double, end: Double): Unit = js.native
  def onSpanChanged(text: Spannable, what: js.Any, ostart: Double, oend: Double, nstart: Double, nend: Double): Unit = js.native
  def onSpanRemoved(text: Spannable, what: js.Any, start: Double, end: Double): Unit = js.native
}

object SpanWatcher {
  @scala.inline
  def apply(
    onSpanAdded: (Spannable, js.Any, Double, Double) => Unit,
    onSpanChanged: (Spannable, js.Any, Double, Double, Double, Double) => Unit,
    onSpanRemoved: (Spannable, js.Any, Double, Double) => Unit
  ): SpanWatcher = {
    val __obj = js.Dynamic.literal(onSpanAdded = js.Any.fromFunction4(onSpanAdded), onSpanChanged = js.Any.fromFunction6(onSpanChanged), onSpanRemoved = js.Any.fromFunction4(onSpanRemoved))
    __obj.asInstanceOf[SpanWatcher]
  }
  @scala.inline
  implicit class SpanWatcherOps[Self <: SpanWatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSpanAdded(value: (Spannable, js.Any, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpanAdded")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnSpanChanged(value: (Spannable, js.Any, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpanChanged")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withOnSpanRemoved(value: (Spannable, js.Any, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpanRemoved")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

