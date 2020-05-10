package typingsSlinky.reactDraggableList.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateProps[I, C] extends js.Object {
  var anySelected: Double = js.native
  var commonProps: C = js.native
  var dragHandleProps: js.Object = js.native
  var item: I = js.native
  var itemSelected: Double = js.native
}

object TemplateProps {
  @scala.inline
  def apply[I, C](anySelected: Double, commonProps: C, dragHandleProps: js.Object, item: I, itemSelected: Double): TemplateProps[I, C] = {
    val __obj = js.Dynamic.literal(anySelected = anySelected.asInstanceOf[js.Any], commonProps = commonProps.asInstanceOf[js.Any], dragHandleProps = dragHandleProps.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateProps[I, C]]
  }
  @scala.inline
  implicit class TemplatePropsOps[Self[i, c] <: TemplateProps[i, c], I, C] (val x: Self[I, C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I, C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I, C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[I, C]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[I, C]) with Other]
    @scala.inline
    def withAnySelected(value: Double): Self[I, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anySelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonProps(value: C): Self[I, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragHandleProps(value: js.Object): Self[I, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: I): Self[I, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSelected(value: Double): Self[I, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

