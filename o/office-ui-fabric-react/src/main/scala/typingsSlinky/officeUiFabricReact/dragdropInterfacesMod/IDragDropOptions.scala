package typingsSlinky.officeUiFabricReact.dragdropInterfacesMod

import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.officeUiFabricReact.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDropOptions extends js.Object {
  /**
    * Whether or not drag action is allowed.
    */
  var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.native
  /**
    * Whether or not drop action is allowed.
    */
  var canDrop: js.UndefOr[
    js.Function2[
      /* dropContext */ js.UndefOr[IDragDropContext], 
      /* dragContext */ js.UndefOr[IDragDropContext], 
      Boolean
    ]
  ] = js.native
  /**
    * Context associated with drag and drop event.
    */
  var context: IDragDropContext = js.native
  /**
    * Map of event name to callback function to subscribe to.
    */
  var eventMap: js.UndefOr[js.Array[AnonCallback]] = js.native
  /**
    * Unique key to associate with instance.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * On drag end event callback.
    */
  var onDragEnd: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.native
  /**
    * On drag over element(s) event callback.
    */
  var onDragOver: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.native
  /**
    * On drag start event callback.
    */
  var onDragStart: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* itemIndex */ js.UndefOr[Double], 
      /* selectedItems */ js.UndefOr[js.Array[_]], 
      /* event */ js.UndefOr[MouseEvent], 
      Unit
    ]
  ] = js.native
  /**
    * On drop event callback.
    */
  var onDrop: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.native
  /**
    * Selection index on drag and drop event.
    */
  var selectionIndex: Double = js.native
  /**
    * Callback on drop state update.
    */
  def updateDropState(isDropping: Boolean, event: DragEvent): Unit = js.native
}

object IDragDropOptions {
  @scala.inline
  def apply(context: IDragDropContext, selectionIndex: Double, updateDropState: (Boolean, DragEvent) => Unit): IDragDropOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any], updateDropState = js.Any.fromFunction2(updateDropState))
    __obj.asInstanceOf[IDragDropOptions]
  }
  @scala.inline
  implicit class IDragDropOptionsOps[Self <: IDragDropOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: IDragDropContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDropState(value: (Boolean, DragEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDropState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCanDrag(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withCanDrop(
      value: (/* dropContext */ js.UndefOr[IDragDropContext], /* dragContext */ js.UndefOr[IDragDropContext]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCanDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withEventMap(value: js.Array[AnonCallback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMap")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(
      value: (/* item */ js.UndefOr[js.Any], /* itemIndex */ js.UndefOr[Double], /* selectedItems */ js.UndefOr[js.Array[_]], /* event */ js.UndefOr[MouseEvent]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
  }
  
}

