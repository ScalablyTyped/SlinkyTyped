package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.officeUiFabricReact.draggableZoneDraggableZoneMod.MouseTouchEvent
import typingsSlinky.officeUiFabricReact.officeUiFabricReactBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: String = js.native
  var style: js.Any = js.native
  def onMouseDown(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`] = js.native
  def onMouseUp(event: MouseTouchEvent[HTMLElement]): scala.Unit = js.native
  def onTouchEnd(event: MouseTouchEvent[HTMLElement]): scala.Unit = js.native
  def onTouchStart(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`] = js.native
}

object ClassName {
  @scala.inline
  def apply(
    className: String,
    onMouseDown: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`],
    onMouseUp: MouseTouchEvent[HTMLElement] => scala.Unit,
    onTouchEnd: MouseTouchEvent[HTMLElement] => scala.Unit,
    onTouchStart: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`],
    style: js.Any
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMouseDown(value: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseUp(value: MouseTouchEvent[HTMLElement] => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: MouseTouchEvent[HTMLElement] => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTouchStart(value: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

