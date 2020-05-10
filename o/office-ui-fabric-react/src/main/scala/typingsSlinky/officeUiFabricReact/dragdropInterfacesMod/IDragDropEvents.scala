package typingsSlinky.officeUiFabricReact.dragdropInterfacesMod

import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDropEvents extends js.Object {
  /**
    * Whether or not drag action is allowed.
    */
  var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.native
  /**
    * Whether drag operation is allowed on groups
    */
  var canDragGroups: js.UndefOr[Boolean] = js.native
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
    * On drag end event callback.
    */
  var onDragEnd: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.native
  /**
    * On drag enter region event callback.
    * Returned string is the css classes that will be added to the entering element.
    */
  var onDragEnter: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], String]
  ] = js.native
  /**
    * On drag leave region event callback.
    */
  var onDragLeave: js.UndefOr[
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
}

object IDragDropEvents {
  @scala.inline
  def apply(): IDragDropEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDropEvents]
  }
  @scala.inline
  implicit class IDragDropEventsOps[Self <: IDragDropEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCanDragGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDragGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDragGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDragGroups")(js.undefined)
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
    def withOnDragEnter(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
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

