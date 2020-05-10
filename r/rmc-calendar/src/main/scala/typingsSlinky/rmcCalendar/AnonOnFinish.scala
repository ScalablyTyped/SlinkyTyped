package typingsSlinky.rmcCalendar

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnFinish extends js.Object {
  def onFinish(): Unit = js.native
  def onTouchCancel(): Unit = js.native
  def onTouchEnd(): Unit = js.native
  def onTouchMove(evt: SyntheticTouchEvent[HTMLDivElement]): Unit = js.native
  def onTouchStart(evt: SyntheticTouchEvent[HTMLDivElement]): Unit = js.native
}

object AnonOnFinish {
  @scala.inline
  def apply(
    onFinish: () => Unit,
    onTouchCancel: () => Unit,
    onTouchEnd: () => Unit,
    onTouchMove: SyntheticTouchEvent[HTMLDivElement] => Unit,
    onTouchStart: SyntheticTouchEvent[HTMLDivElement] => Unit
  ): AnonOnFinish = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), onTouchCancel = js.Any.fromFunction0(onTouchCancel), onTouchEnd = js.Any.fromFunction0(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
    __obj.asInstanceOf[AnonOnFinish]
  }
  @scala.inline
  implicit class AnonOnFinishOps[Self <: AnonOnFinish] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFinish(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

