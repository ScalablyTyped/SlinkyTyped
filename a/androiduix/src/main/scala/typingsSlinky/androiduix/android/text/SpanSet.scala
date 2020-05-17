package typingsSlinky.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpanSet[E] extends js.Object {
  var classType: js.Any = js.native
  var numberOfSpans: Double = js.native
  var spanEnds: js.Array[Double] = js.native
  var spanFlags: js.Array[Double] = js.native
  var spanStarts: js.Array[Double] = js.native
  var spans: js.Array[E] = js.native
  def getNextTransition(start: Double, limit: Double): Double = js.native
  def hasSpansIntersecting(start: Double, end: Double): Boolean = js.native
  def init(spanned: Spanned, start: Double, limit: Double): Unit = js.native
  def recycle(): Unit = js.native
}

object SpanSet {
  @scala.inline
  def apply[E](
    classType: js.Any,
    getNextTransition: (Double, Double) => Double,
    hasSpansIntersecting: (Double, Double) => Boolean,
    init: (Spanned, Double, Double) => Unit,
    numberOfSpans: Double,
    recycle: () => Unit,
    spanEnds: js.Array[Double],
    spanFlags: js.Array[Double],
    spanStarts: js.Array[Double],
    spans: js.Array[E]
  ): SpanSet[E] = {
    val __obj = js.Dynamic.literal(classType = classType.asInstanceOf[js.Any], getNextTransition = js.Any.fromFunction2(getNextTransition), hasSpansIntersecting = js.Any.fromFunction2(hasSpansIntersecting), init = js.Any.fromFunction3(init), numberOfSpans = numberOfSpans.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle), spanEnds = spanEnds.asInstanceOf[js.Any], spanFlags = spanFlags.asInstanceOf[js.Any], spanStarts = spanStarts.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanSet[E]]
  }
  @scala.inline
  implicit class SpanSetOps[Self[e] <: SpanSet[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withClassType(value: js.Any): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNextTransition(value: (Double, Double) => Double): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextTransition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasSpansIntersecting(value: (Double, Double) => Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSpansIntersecting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInit(value: (Spanned, Double, Double) => Unit): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNumberOfSpans(value: Double): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSpans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecycle(value: () => Unit): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpanEnds(value: js.Array[Double]): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanEnds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpanFlags(value: js.Array[Double]): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpanStarts(value: js.Array[Double]): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanStarts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpans(value: js.Array[E]): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spans")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

