package typingsSlinky.reactBeautifulDnd.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableProps extends js.Object {
  var direction: js.UndefOr[Direction] = js.native
  var droppableId: DroppableId = js.native
  var getContainerForClone: js.UndefOr[js.Function0[ReactElement]] = js.native
  var ignoreContainerClipping: js.UndefOr[Boolean] = js.native
  var isCombineEnabled: js.UndefOr[Boolean] = js.native
  var isDropDisabled: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[DroppableMode] = js.native
  var renderClone: js.UndefOr[DraggableChildrenFn] = js.native
  var `type`: js.UndefOr[TypeId] = js.native
  def children(provided: DroppableProvided, snapshot: DroppableStateSnapshot): ReactElement = js.native
}

object DroppableProps {
  @scala.inline
  def apply(children: (DroppableProvided, DroppableStateSnapshot) => ReactElement, droppableId: DroppableId): DroppableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), droppableId = droppableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableProps]
  }
  @scala.inline
  implicit class DroppablePropsOps[Self <: DroppableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: (DroppableProvided, DroppableStateSnapshot) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDroppableId(value: DroppableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: Direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContainerForClone(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainerForClone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetContainerForClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainerForClone")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreContainerClipping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreContainerClipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreContainerClipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreContainerClipping")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCombineEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCombineEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCombineEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCombineEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDropDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDropDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: DroppableMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderClone(
      value: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderClone")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderClone")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

