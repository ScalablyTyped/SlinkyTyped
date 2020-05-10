package typingsSlinky.reactGridLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  /**
    * Height in grid units.
    */
  var h: Double = js.native
  /**
    * A string corresponding to the component key.
    * Uses the index of components instead if not provided.
    */
  var i: String = js.native
  /**
    * If false, will not be draggable. Overrides `static`.
    */
  var isDraggable: js.UndefOr[Boolean] = js.native
  /**
    * If false, will not be resizable. Overrides `static`.
    */
  var isResizable: js.UndefOr[Boolean] = js.native
  /**
    * Maximum height in grid units.
    */
  var maxH: js.UndefOr[Double] = js.native
  /**
    * Maximum width in grid units.
    */
  var maxW: js.UndefOr[Double] = js.native
  /**
    * Minimum height in grid units.
    */
  var minH: js.UndefOr[Double] = js.native
  /**
    * Minimum width in grid units.
    */
  var minW: js.UndefOr[Double] = js.native
  /**
    * set by DragEvents (onDragStart, onDrag, onDragStop) and ResizeEvents (onResizeStart, onResize, onResizeStop)
    */
  var moved: js.UndefOr[Boolean] = js.native
  /**
    * If true, equal to `isDraggable: false` and `isResizable: false`.
    */
  var static: js.UndefOr[Boolean] = js.native
  /**
    * Width in grid units.
    */
  var w: Double = js.native
  /**
    * X position in grid units.
    */
  var x: Double = js.native
  /**
    * Y position in grid units.
    */
  var y: Double = js.native
}

object Layout {
  @scala.inline
  def apply(h: Double, i: String, w: Double, x: Double, y: Double): Layout = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
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
    def withIsDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxH")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxW")(js.undefined)
        ret
    }
    @scala.inline
    def withMinH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minH")(js.undefined)
        ret
    }
    @scala.inline
    def withMinW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minW")(js.undefined)
        ret
    }
    @scala.inline
    def withMoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
  }
  
}

