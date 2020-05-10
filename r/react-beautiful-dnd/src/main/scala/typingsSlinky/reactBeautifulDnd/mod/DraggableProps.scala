package typingsSlinky.reactBeautifulDnd.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProps extends js.Object {
  var children: DraggableChildrenFn = js.native
  var disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.native
  var draggableId: DraggableId = js.native
  var index: Double = js.native
  var isDragDisabled: js.UndefOr[Boolean] = js.native
  var shouldRespectForcePress: js.UndefOr[Boolean] = js.native
}

object DraggableProps {
  @scala.inline
  def apply(
    children: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement,
    draggableId: DraggableId,
    index: Double
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), draggableId = draggableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
  @scala.inline
  implicit class DraggablePropsOps[Self <: DraggableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(
      value: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDraggableId(value: DraggableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableInteractiveElementBlocking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInteractiveElementBlocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableInteractiveElementBlocking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInteractiveElementBlocking")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDragDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDragDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRespectForcePress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRespectForcePress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRespectForcePress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRespectForcePress")(js.undefined)
        ret
    }
  }
  
}

