package typingsSlinky.reactMosaicComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-mosaic-component.react-mosaic-component/lib/MosaicWindow.InternalMosaicWindowProps<any> | react-mosaic-component.react-mosaic-component/lib/MosaicWindow.InternalMosaicWindowProps<string | number>, 'title' | 'path' | 'className' | 'draggable' | 'onDragEnd' | 'onDragStart' | 'createNode' | 'connectDropTarget' | 'isOver' | 'draggedMosaicId' | 'toolbarControls' | 'additionalControls' | 'additionalControlButtonText' | 'renderPreview' | 'renderToolbar'> */
@js.native
trait PickInternalMosaicWindowP extends js.Object {
  var additionalControlButtonText: js.UndefOr[js.Any] = js.native
  var additionalControls: js.UndefOr[js.Any] = js.native
  var className: js.UndefOr[js.Any] = js.native
  var connectDropTarget: js.UndefOr[js.Any] = js.native
  var createNode: js.UndefOr[js.Any] = js.native
  var draggable: js.UndefOr[js.Any] = js.native
  var draggedMosaicId: js.UndefOr[js.Any] = js.native
  var isOver: js.UndefOr[js.Any] = js.native
  var onDragEnd: js.UndefOr[js.Any] = js.native
  var onDragStart: js.UndefOr[js.Any] = js.native
  var path: js.UndefOr[js.Any] = js.native
  var renderPreview: js.UndefOr[js.Any] = js.native
  var renderToolbar: js.UndefOr[js.Any] = js.native
  var title: js.UndefOr[js.Any] = js.native
  var toolbarControls: js.UndefOr[js.Any] = js.native
}

object PickInternalMosaicWindowP {
  @scala.inline
  def apply(): PickInternalMosaicWindowP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickInternalMosaicWindowP]
  }
  @scala.inline
  implicit class PickInternalMosaicWindowPOps[Self <: PickInternalMosaicWindowP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalControlButtonText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControlButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalControlButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControlButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalControls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControls")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectDropTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDropTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggedMosaicId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedMosaicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggedMosaicId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedMosaicId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPreview(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToolbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarControls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarControls")(js.undefined)
        ret
    }
  }
  
}

