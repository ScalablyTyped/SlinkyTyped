package typingsSlinky.reactMosaicComponent.mosaicMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import typingsSlinky.reactMosaicComponent.typesMod.ResizeOptions
import typingsSlinky.reactMosaicComponent.typesMod.TileRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicBaseProps[T /* <: MosaicKey */] extends js.Object {
  /**
    * Additional classes to affix to the root element
    * Default: 'mosaic-blueprint-theme'
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Called when a user initiates any change to the tree (removing, adding, moving, resizing, etc.)
    */
  var onChange: js.UndefOr[js.Function1[/* newNode */ MosaicNode[T] | Null, Unit]] = js.native
  /**
    * Called when a user completes a change (fires like above except for the interpolation during resizing)
    */
  var onRelease: js.UndefOr[js.Function1[/* newNode */ MosaicNode[T] | Null, Unit]] = js.native
  /**
    * Lookup function to convert `T` to a displayable `JSX.Element`
    */
  var renderTile: TileRenderer[T] = js.native
  /**
    * Options that control resizing
    * @see: [[ResizeOptions]]
    */
  var resize: js.UndefOr[ResizeOptions] = js.native
  /**
    * View to display when the current value is `null`
    * default: Simple NonIdealState view
    */
  var zeroStateView: js.UndefOr[ReactElement] = js.native
}

object MosaicBaseProps {
  @scala.inline
  def apply[T](renderTile: (T, /* path */ js.Array[MosaicBranch]) => ReactElement): MosaicBaseProps[T] = {
    val __obj = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile))
    __obj.asInstanceOf[MosaicBaseProps[T]]
  }
  @scala.inline
  implicit class MosaicBasePropsOps[Self[t] <: MosaicBaseProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRenderTile(value: (T, /* path */ js.Array[MosaicBranch]) => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTile")(js.Any.fromFunction2(value))
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
    def withOnChange(value: /* newNode */ MosaicNode[T] | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRelease(value: /* newNode */ MosaicNode[T] | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRelease: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: ResizeOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroStateView(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroStateView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroStateView: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroStateView")(js.undefined)
        ret
    }
  }
  
}

