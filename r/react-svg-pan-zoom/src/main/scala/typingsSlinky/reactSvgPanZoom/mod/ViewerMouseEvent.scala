package typingsSlinky.reactSvgPanZoom.mod

import org.scalajs.dom.raw.SVGSVGElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewerMouseEvent[T] extends js.Object {
  var SVGViewer: SVGSVGElement = js.native
  var originalEvent: SyntheticMouseEvent[T] = js.native
  var point: Point = js.native
  var scaleFactor: Double = js.native
  var translationX: Double = js.native
  var translationY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object ViewerMouseEvent {
  @scala.inline
  def apply[T](
    SVGViewer: SVGSVGElement,
    originalEvent: SyntheticMouseEvent[T],
    point: Point,
    preventDefault: () => Unit,
    scaleFactor: Double,
    stopPropagation: () => Unit,
    translationX: Double,
    translationY: Double,
    x: Double,
    y: Double
  ): ViewerMouseEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerMouseEvent[T]]
  }
  @scala.inline
  implicit class ViewerMouseEventOps[Self[t] <: ViewerMouseEvent[t], T] (val x: Self[T]) extends AnyVal {
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
    def withOriginalEvent(value: SyntheticMouseEvent[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Point): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withX(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

