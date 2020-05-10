package typingsSlinky.jqueryFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jqueryFancytree.Fancytree.FancytreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragAndDrop5
  extends /* extension */ StringDictionary[js.Any] {
  /**
    * Expand nodes after n milliseconds of hovering.
    */
  var autoExpandMS: js.UndefOr[Double] = js.native
  var dragDrag: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  /**
    * Events (drag drop)
    */
  var dragDrop: js.UndefOr[js.Function2[/* node */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  var dragEnd: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  /**
    * Callback(targetNode, data), return true, to enable dnd drop
    */
  var dragEnter: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  /**
    * Callback(targetNode, data), return false to prevent autoExpand
    */
  var dragExpand: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  var dragLeave: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  /**
    * Events (drag over)
    */
  var dragOver: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  /**
    * Callback(sourceNode, data), return true, to enable dnd drag
    */
  var dragStart: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  /**
    * Additional offset for drop-marker with hitMode = "before"/"after"
    */
  var dropMarkerInsertOffsetX: js.UndefOr[Double] = js.native
  /**
    * Absolute position offset for .fancytree-drop-marker
    */
  var dropMarkerOffsetX: js.UndefOr[Double] = js.native
  /**
    * true: Drag multiple (i.e. selected) nodes.
    */
  var multiSource: js.UndefOr[Boolean] = js.native
  /**
    * Prevent dropping nodes from different Fancytrees
    */
  var preventForeignNodes: js.UndefOr[Boolean] = js.native
  /**
    * Prevent dropping items other than Fancytree nodes
    */
  var preventNonNodes: js.UndefOr[Boolean] = js.native
  /**
    * Prevent dropping nodes on own descendants
    */
  var preventRecursiveMoves: js.UndefOr[Boolean] = js.native
  /**
    * Prevent dropping nodes 'before self', etc.
    */
  var preventVoidMoves: js.UndefOr[Boolean] = js.native
  /**
    * Enable auto-scrolling while dragging
    */
  var scroll: js.UndefOr[Boolean] = js.native
  /**
    * Active top/bottom margin in pixel
    */
  var scrollSensitivity: js.UndefOr[Double] = js.native
  /**
    * Pixel per event
    */
  var scrollSpeed: js.UndefOr[Double] = js.native
  /**
    * Allow dragging of nodes to different IE windows, default: false
    */
  var setTextTypeJson: js.UndefOr[Boolean] = js.native
}

object DragAndDrop5 {
  @scala.inline
  def apply(): DragAndDrop5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndDrop5]
  }
  @scala.inline
  implicit class DragAndDrop5Ops[Self <: DragAndDrop5] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoExpandMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpandMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandMS")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDrag(value: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDrop(value: (/* node */ FancytreeNode, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnd(value: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnter(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withDragExpand(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withDragLeave(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withDragOver(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDropMarkerInsertOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropMarkerInsertOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropMarkerInsertOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropMarkerInsertOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withDropMarkerOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropMarkerOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropMarkerOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropMarkerOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSource")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventForeignNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventForeignNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventForeignNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventForeignNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventNonNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventNonNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventNonNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventNonNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventRecursiveMoves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventRecursiveMoves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventRecursiveMoves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventRecursiveMoves")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventVoidMoves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventVoidMoves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventVoidMoves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventVoidMoves")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTextTypeJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextTypeJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetTextTypeJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextTypeJson")(js.undefined)
        ret
    }
  }
  
}

