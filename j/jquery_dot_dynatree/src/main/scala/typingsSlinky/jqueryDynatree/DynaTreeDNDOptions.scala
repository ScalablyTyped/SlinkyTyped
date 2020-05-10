package typingsSlinky.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynaTreeDNDOptions extends js.Object {
  var autoExpandMS: js.UndefOr[Double] = js.native
   // Callback(sourceNode)
  // Make tree nodes accept draggables
  var onDragEnter: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, Unit]] = js.native
   // Callback(targetNode, sourceNode, hitMode)
  var onDragLeave: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, Unit]] = js.native
   // Callback(targetNode, sourceNode)
  var onDragOver: js.UndefOr[
    js.Function3[/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String, Unit]
  ] = js.native
   // true: slide helper back to source if drop is rejected
  // Make tree nodes draggable:
  var onDragStart: js.UndefOr[js.Function1[/* sourceNode */ js.Any, Unit]] = js.native
   // Callback(sourceNode), return true, to enable dnd
  var onDragStop: js.UndefOr[js.Function1[/* sourceNode */ js.Any, Unit]] = js.native
    // Callback(targetNode, sourceNode, hitMode)
  var onDrop: js.UndefOr[
    js.Function3[/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String, Unit]
  ] = js.native
   // Expand nodes after n milliseconds of hovering.
  var preventVoidMoves: js.UndefOr[Boolean] = js.native
   // Prevent dropping nodes 'before self', etc.
  var revert: Boolean = js.native
}

object DynaTreeDNDOptions {
  @scala.inline
  def apply(revert: Boolean): DynaTreeDNDOptions = {
    val __obj = js.Dynamic.literal(revert = revert.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeDNDOptions]
  }
  @scala.inline
  implicit class DynaTreeDNDOptionsOps[Self <: DynaTreeDNDOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRevert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withOnDragEnter(value: (/* targetNode */ js.Any, /* sourceNode */ js.Any) => Unit): Self = {
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
    def withOnDragLeave(value: (/* targetNode */ js.Any, /* sourceNode */ js.Any) => Unit): Self = {
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
    def withOnDragOver(value: (/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* sourceNode */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStop(value: /* sourceNode */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: (/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
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
  }
  
}

