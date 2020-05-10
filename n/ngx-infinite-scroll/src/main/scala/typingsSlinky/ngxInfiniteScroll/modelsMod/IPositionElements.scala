package typingsSlinky.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositionElements extends js.Object {
  var axis: js.Any = js.native
  var windowElement: ContainerRef = js.native
}

object IPositionElements {
  @scala.inline
  def apply(axis: js.Any, windowElement: ContainerRef): IPositionElements = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], windowElement = windowElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionElements]
  }
  @scala.inline
  implicit class IPositionElementsOps[Self <: IPositionElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowElement(value: ContainerRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

