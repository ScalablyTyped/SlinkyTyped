package typingsSlinky.reactMosaicComponent.mosaicWindowMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactMosaicComponent.reactMosaicComponentStrings.drop
import typingsSlinky.reactMosaicComponent.reactMosaicComponentStrings.reset_
import typingsSlinky.reactMosaicComponent.typesMod.CreateNode
import typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicWindowProps[T /* <: MosaicKey */] extends js.Object {
  var additionalControlButtonText: js.UndefOr[String] = js.native
  var additionalControls: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var createNode: js.UndefOr[CreateNode[T]] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* type */ drop | reset_, Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
  var path: js.Array[MosaicBranch] = js.native
  var renderPreview: js.UndefOr[js.Function1[/* props */ MosaicWindowProps[T], ReactElement]] = js.native
  var renderToolbar: js.UndefOr[
    (js.Function2[/* props */ MosaicWindowProps[T], /* draggable */ js.UndefOr[Boolean], ReactElement]) | Null
  ] = js.native
  var title: String = js.native
  var toolbarControls: js.UndefOr[TagMod[Any]] = js.native
}

object MosaicWindowProps {
  @scala.inline
  def apply[T](path: js.Array[MosaicBranch], title: String): MosaicWindowProps[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicWindowProps[T]]
  }
  @scala.inline
  implicit class MosaicWindowPropsOps[Self[t] <: MosaicWindowProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPath(value: js.Array[MosaicBranch]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalControlButtonText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControlButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalControlButtonText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControlButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalControlsReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalControls(value: TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalControls: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControls")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateNode(value: /* repeated */ js.Any => js.Promise[MosaicNode[T]] | MosaicNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateNode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* type */ drop | reset_ => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPreview(value: /* props */ MosaicWindowProps[T] => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderPreview: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToolbar(value: (/* props */ MosaicWindowProps[T], /* draggable */ js.UndefOr[Boolean]) => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToolbar")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderToolbar: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToolbarNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToolbar")(null)
        ret
    }
    @scala.inline
    def withToolbarControlsReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbarControls(value: TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarControls: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarControls")(js.undefined)
        ret
    }
  }
  
}

