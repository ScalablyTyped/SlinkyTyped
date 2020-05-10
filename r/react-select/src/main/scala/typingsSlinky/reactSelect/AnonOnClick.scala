package typingsSlinky.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnClick extends js.Object {
  def onClick(event: js.Any): Unit = js.native
  def onMouseDown(event: js.Any): Unit = js.native
  def onTouchEnd(event: js.Any): Unit = js.native
}

object AnonOnClick {
  @scala.inline
  def apply(onClick: js.Any => Unit, onMouseDown: js.Any => Unit, onTouchEnd: js.Any => Unit): AnonOnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchEnd = js.Any.fromFunction1(onTouchEnd))
    __obj.asInstanceOf[AnonOnClick]
  }
  @scala.inline
  implicit class AnonOnClickOps[Self <: AnonOnClick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseDown(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

