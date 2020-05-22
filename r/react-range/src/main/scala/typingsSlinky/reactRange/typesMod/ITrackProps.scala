package typingsSlinky.reactRange.typesMod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrackProps extends js.Object {
  var ref: ReactRef[_]
  var style: CSSProperties
  def onMouseDown(e: SyntheticMouseEvent[Element]): Unit
  def onTouchStart(e: SyntheticTouchEvent[Element]): Unit
}

object ITrackProps {
  @scala.inline
  def apply(
    onMouseDown: SyntheticMouseEvent[Element] => Unit,
    onTouchStart: SyntheticTouchEvent[Element] => Unit,
    ref: ReactRef[_],
    style: CSSProperties
  ): ITrackProps = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrackProps]
  }
}

