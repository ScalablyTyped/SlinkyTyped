package typingsSlinky.reactMosaicComponent.mosaicMod

import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicState[T /* <: MosaicKey */] extends js.Object {
  var currentNode: MosaicNode[T] | Null = js.native
  var lastInitialValue: MosaicNode[T] | Null = js.native
  var mosaicId: String = js.native
}

object MosaicState {
  @scala.inline
  def apply[T](mosaicId: String): MosaicState[T] = {
    val __obj = js.Dynamic.literal(mosaicId = mosaicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicState[T]]
  }
  @scala.inline
  implicit class MosaicStateOps[Self[t] <: MosaicState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMosaicId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mosaicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentNode(value: MosaicNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentNodeNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNode")(null)
        ret
    }
    @scala.inline
    def withLastInitialValue(value: MosaicNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastInitialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastInitialValueNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastInitialValue")(null)
        ret
    }
  }
  
}

