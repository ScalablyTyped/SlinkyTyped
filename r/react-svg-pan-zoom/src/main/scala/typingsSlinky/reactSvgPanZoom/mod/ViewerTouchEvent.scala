package typingsSlinky.reactSvgPanZoom.mod

import org.scalajs.dom.raw.SVGSVGElement
import slinky.web.SyntheticTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewerTouchEvent[T] extends js.Object {
  var SVGViewer: SVGSVGElement = js.native
  var changedPoints: js.Array[Point] = js.native
  var originalEvent: SyntheticTouchEvent[T] = js.native
  var points: js.Array[Point] = js.native
  var scaleFactor: Double = js.native
  var translationX: Double = js.native
  var translationY: Double = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object ViewerTouchEvent {
  @scala.inline
  def apply[T](
    SVGViewer: SVGSVGElement,
    changedPoints: js.Array[Point],
    originalEvent: SyntheticTouchEvent[T],
    points: js.Array[Point],
    preventDefault: () => Unit,
    scaleFactor: Double,
    stopPropagation: () => Unit,
    translationX: Double,
    translationY: Double
  ): ViewerTouchEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], changedPoints = changedPoints.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerTouchEvent[T]]
  }
  @scala.inline
  implicit class ViewerTouchEventOps[Self[t] <: ViewerTouchEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSVGViewer(value: SVGSVGElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGViewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedPoints(value: js.Array[Point]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalEvent(value: SyntheticTouchEvent[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Point]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTranslationX(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslationY(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

