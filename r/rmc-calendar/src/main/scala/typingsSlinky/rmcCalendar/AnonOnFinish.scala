package typingsSlinky.rmcCalendar

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnFinish extends js.Object {
  def onFinish(): Unit
  def onTouchCancel(): Unit
  def onTouchEnd(): Unit
  def onTouchMove(evt: SyntheticTouchEvent[HTMLDivElement]): Unit
  def onTouchStart(evt: SyntheticTouchEvent[HTMLDivElement]): Unit
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
}

