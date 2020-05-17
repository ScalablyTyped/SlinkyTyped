package typingsSlinky.reactMosaicComponent.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactDnd.connectorsMod.ConnectDragPreview
import typingsSlinky.reactDnd.connectorsMod.ConnectDragSource
import typingsSlinky.reactDnd.connectorsMod.ConnectDropTarget
import typingsSlinky.reactDnd.connectorsMod.ConnectableElement
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import typingsSlinky.reactDnd.optionsMod.DragSourceOptions
import typingsSlinky.reactMosaicComponent.mosaicWindowMod.MosaicWindowProps
import typingsSlinky.reactMosaicComponent.reactMosaicComponentStrings.drop
import typingsSlinky.reactMosaicComponent.reactMosaicComponentStrings.reset_
import typingsSlinky.reactMosaicComponent.typesMod.CreateNode
import typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-mosaic-component.react-mosaic-component/lib/MosaicWindow.InternalMosaicWindowProps<any>> */
@js.native
trait PartialInternalMosaicWind extends js.Object {
  var additionalControlButtonText: js.UndefOr[String] = js.native
  var additionalControls: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var connectDragPreview: js.UndefOr[ConnectDragPreview] = js.native
  var connectDragSource: js.UndefOr[ConnectDragSource] = js.native
  var connectDropTarget: js.UndefOr[ConnectDropTarget] = js.native
  var createNode: js.UndefOr[CreateNode[_]] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var draggedMosaicId: js.UndefOr[String] = js.native
  var isOver: js.UndefOr[Boolean] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* type */ drop | reset_, Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
  var path: js.UndefOr[js.Array[MosaicBranch]] = js.native
  var renderPreview: js.UndefOr[js.Function1[/* props */ MosaicWindowProps[_], ReactElement]] = js.native
  var renderToolbar: js.UndefOr[
    js.Function2[/* props */ MosaicWindowProps[_], /* draggable */ js.UndefOr[Boolean], ReactElement]
  ] = js.native
  var title: js.UndefOr[String] = js.native
  var toolbarControls: js.UndefOr[TagMod[Any]] = js.native
}

object PartialInternalMosaicWind {
  @scala.inline
  def apply(): PartialInternalMosaicWind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInternalMosaicWind]
  }
  @scala.inline
  implicit class PartialInternalMosaicWindOps[Self <: PartialInternalMosaicWind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalControlButtonText(value: String): Self = {
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
    def withAdditionalControlsReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalControls(value: TagMod[Any]): Self = {
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
    def withClassName(value: String): Self = {
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
    def withConnectDragPreview(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDragPreview")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConnectDragPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDragPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectDragSource(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDragSource")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConnectDragSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDragSource")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectDropTarget(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDropTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConnectDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDropTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateNode(value: /* repeated */ js.Any => js.Promise[MosaicNode[_]] | MosaicNode[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
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
    def withDraggedMosaicId(value: String): Self = {
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
    def withIsOver(value: Boolean): Self = {
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
    def withOnDragEnd(value: /* type */ drop | reset_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: js.Array[MosaicBranch]): Self = {
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
    def withRenderPreview(value: /* props */ MosaicWindowProps[_] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToolbar(value: (/* props */ MosaicWindowProps[_], /* draggable */ js.UndefOr[Boolean]) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToolbar")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    def withToolbarControlsReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbarControls(value: TagMod[Any]): Self = {
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

