package typingsSlinky.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableClasses extends js.Object {
  var `ui-draggable`: js.UndefOr[String] = js.native
  var `ui-draggable-disabled`: js.UndefOr[String] = js.native
  var `ui-draggable-dragging`: js.UndefOr[String] = js.native
  var `ui-draggable-handle`: js.UndefOr[String] = js.native
}

object DraggableClasses {
  @scala.inline
  def apply(): DraggableClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableClasses]
  }
  @scala.inline
  implicit class DraggableClassesOps[Self <: DraggableClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withUi-draggable`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-draggable`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-draggable")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-draggable-disabled`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-draggable-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-draggable-disabled`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-draggable-disabled")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-draggable-dragging`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-draggable-dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-draggable-dragging`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-draggable-dragging")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-draggable-handle`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-draggable-handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-draggable-handle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-draggable-handle")(js.undefined)
        ret
    }
  }
  
}

