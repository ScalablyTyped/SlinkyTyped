package typingsSlinky.babylonjs.mathLikeMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import typingsSlinky.babylonjs.typesMod.int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixLike extends js.Object {
  var updateFlag: int
  def toArray(): DeepImmutable[js.typedarray.Float32Array]
}

object IMatrixLike {
  @scala.inline
  def apply(toArray: () => DeepImmutable[js.typedarray.Float32Array], updateFlag: int): IMatrixLike = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray), updateFlag = updateFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatrixLike]
  }
}

