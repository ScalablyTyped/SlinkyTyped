package typingsSlinky.reactMosaicComponent.mosaicZeroStateMod

import typingsSlinky.reactMosaicComponent.typesMod.CreateNode
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicZeroStateProps[T /* <: MosaicKey */] extends js.Object {
  var createNode: js.UndefOr[CreateNode[T]] = js.native
}

object MosaicZeroStateProps {
  @scala.inline
  def apply[T](): MosaicZeroStateProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MosaicZeroStateProps[T]]
  }
  @scala.inline
  implicit class MosaicZeroStatePropsOps[Self[t] <: MosaicZeroStateProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
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
  }
  
}

