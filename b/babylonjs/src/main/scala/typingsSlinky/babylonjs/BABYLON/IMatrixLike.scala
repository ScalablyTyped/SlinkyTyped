package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatrixLike extends js.Object {
  var updateFlag: int = js.native
  def toArray(): DeepImmutable[js.typedarray.Float32Array] = js.native
}

object IMatrixLike {
  @scala.inline
  def apply(toArray: () => DeepImmutable[js.typedarray.Float32Array], updateFlag: int): IMatrixLike = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray), updateFlag = updateFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatrixLike]
  }
  @scala.inline
  implicit class IMatrixLikeOps[Self <: IMatrixLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToArray(value: () => DeepImmutable[js.typedarray.Float32Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateFlag(value: int): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFlag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

