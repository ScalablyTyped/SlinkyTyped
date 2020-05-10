package typingsSlinky.reactDragtastic

import typingsSlinky.reactDragtastic.mod.Accepts
import typingsSlinky.reactDragtastic.mod.Id
import typingsSlinky.reactDragtastic.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-dragtastic.react-dragtastic.State & {  isOverAccepted  :boolean} */
@js.native
trait StateisOverAcceptedboolea extends js.Object {
  /** The id of the currently dragging element. */
  var currentlyDraggingId: js.UndefOr[Id] = js.native
  /** The accepts property of the <Droppable/> currently being hovered. */
  var currentlyHoveredDroppableAccepts: js.UndefOr[Accepts] = js.native
  /** The id of the <Droppable/> currently being hovered. */
  var currentlyHoveredDroppableId: js.UndefOr[Id] = js.native
  /** Data from the data property of the <Draggable/> which is currently active. null if not dragging. */
  var data: js.Any = js.native
  /** A boolean representing whether the user is currently dragging. */
  var isDragging: Boolean = js.native
  /** A boolean representing whether the user is currently hovering a <Droppable/> that accepts the type of the currently active <Draggable/> */
  var isOverAccepted: Boolean = js.native
  /** The user's initial horizontal position on the page when they started dragging. */
  var startingX: Double = js.native
  /** The user's initial vertical position on the page when they started dragging. */
  var startingY: Double = js.native
  /** The type of the component being currently dragged. null if not dragging. */
  var `type`: js.UndefOr[Type] = js.native
  /** The user's current horizontal position on the page. */
  var x: Double = js.native
  /** The user's current vertical position on the page. */
  var y: Double = js.native
}

object StateisOverAcceptedboolea {
  @scala.inline
  def apply(
    data: js.Any,
    isDragging: Boolean,
    isOverAccepted: Boolean,
    startingX: Double,
    startingY: Double,
    x: Double,
    y: Double
  ): StateisOverAcceptedboolea = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isOverAccepted = isOverAccepted.asInstanceOf[js.Any], startingX = startingX.asInstanceOf[js.Any], startingY = startingY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateisOverAcceptedboolea]
  }
  @scala.inline
  implicit class StateisOverAcceptedbooleaOps[Self <: StateisOverAcceptedboolea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOverAccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverAccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentlyDraggingId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyDraggingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentlyDraggingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyDraggingId")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentlyHoveredDroppableAccepts(value: Accepts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyHoveredDroppableAccepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentlyHoveredDroppableAccepts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyHoveredDroppableAccepts")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentlyHoveredDroppableId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyHoveredDroppableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentlyHoveredDroppableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyHoveredDroppableId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
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

