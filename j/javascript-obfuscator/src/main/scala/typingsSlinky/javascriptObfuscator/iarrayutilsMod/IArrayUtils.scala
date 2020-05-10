package typingsSlinky.javascriptObfuscator.iarrayutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IArrayUtils extends js.Object {
  /**
    * @param length
    * @return {number[]}
    */
  def createWithRange(length: Double): js.Array[Double] = js.native
  /**
    * @param array
    * @param times
    * @returns {T[]}
    */
  def rotate[T](array: js.Array[T], times: Double): js.Array[T] = js.native
  /**
    * @param array
    * @return {T[]}
    */
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
}

object IArrayUtils {
  @scala.inline
  def apply(
    createWithRange: Double => js.Array[Double],
    rotate: (js.Array[js.Any], Double) => js.Array[js.Any],
    shuffle: js.Array[js.Any] => js.Array[js.Any]
  ): IArrayUtils = {
    val __obj = js.Dynamic.literal(createWithRange = js.Any.fromFunction1(createWithRange), rotate = js.Any.fromFunction2(rotate), shuffle = js.Any.fromFunction1(shuffle))
    __obj.asInstanceOf[IArrayUtils]
  }
  @scala.inline
  implicit class IArrayUtilsOps[Self <: IArrayUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateWithRange(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotate(value: (js.Array[js.Any], Double) => js.Array[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShuffle(value: js.Array[js.Any] => js.Array[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

