package typingsSlinky.reactMosaicComponent.mosaicRootMod

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
trait MosaicRootProps[T /* <: MosaicKey */] extends js.Object {
  var renderTile: TileRenderer[T] = js.native
  var resize: js.UndefOr[ResizeOptions] = js.native
  var root: MosaicNode[T] = js.native
}

object MosaicRootProps {
  @scala.inline
  def apply[T](renderTile: (T, /* path */ js.Array[MosaicBranch]) => ReactElement, root: MosaicNode[T]): MosaicRootProps[T] = {
    val __obj = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile), root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicRootProps[T]]
  }
  @scala.inline
  implicit class MosaicRootPropsOps[Self[t] <: MosaicRootProps[t], T] (val x: Self[T]) extends AnyVal {
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
    def withRoot(value: MosaicNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
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
  }
  
}

