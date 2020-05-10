package typingsSlinky.babylonjs.smartArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISmartArrayLike[T] extends js.Object {
  /**
    * The data of the array.
    */
  var data: js.Array[T] = js.native
  /**
    * The active length of the array.
    */
  var length: Double = js.native
}

object ISmartArrayLike {
  @scala.inline
  def apply[T](data: js.Array[T], length: Double): ISmartArrayLike[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmartArrayLike[T]]
  }
  @scala.inline
  implicit class ISmartArrayLikeOps[Self[t] <: ISmartArrayLike[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

