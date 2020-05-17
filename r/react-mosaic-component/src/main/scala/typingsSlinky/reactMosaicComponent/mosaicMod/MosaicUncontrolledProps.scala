package typingsSlinky.reactMosaicComponent.mosaicMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicUncontrolledProps[T /* <: MosaicKey */]
  extends MosaicBaseProps[T]
     with MosaicProps[T] {
  /**
    * The initial tree to render, can be modified by the user
    */
  var initialValue: MosaicNode[T] | Null = js.native
}

object MosaicUncontrolledProps {
  @scala.inline
  def apply[T](renderTile: (T, /* path */ js.Array[MosaicBranch]) => ReactElement): MosaicUncontrolledProps[T] = {
    val __obj = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile))
    __obj.asInstanceOf[MosaicUncontrolledProps[T]]
  }
  @scala.inline
  implicit class MosaicUncontrolledPropsOps[Self[t] <: MosaicUncontrolledProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withInitialValue(value: MosaicNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialValueNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(null)
        ret
    }
  }
  
}

