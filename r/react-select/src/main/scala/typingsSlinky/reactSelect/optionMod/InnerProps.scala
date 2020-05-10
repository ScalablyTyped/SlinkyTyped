package typingsSlinky.reactSelect.optionMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InnerProps extends js.Object {
  var id: String = js.native
  var key: String = js.native
  var onClick: MouseEventHandler[HTMLDivElement] = js.native
  var onMouseMove: MouseEventHandler[HTMLDivElement] = js.native
  var onMouseOver: MouseEventHandler[HTMLDivElement] = js.native
  var tabIndex: Double = js.native
}

object InnerProps {
  @scala.inline
  def apply(
    id: String,
    key: String,
    onClick: SyntheticMouseEvent[HTMLDivElement] => Unit,
    onMouseMove: SyntheticMouseEvent[HTMLDivElement] => Unit,
    onMouseOver: SyntheticMouseEvent[HTMLDivElement] => Unit,
    tabIndex: Double
  ): InnerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseOver = js.Any.fromFunction1(onMouseOver), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerProps]
  }
  @scala.inline
  implicit class InnerPropsOps[Self <: InnerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

