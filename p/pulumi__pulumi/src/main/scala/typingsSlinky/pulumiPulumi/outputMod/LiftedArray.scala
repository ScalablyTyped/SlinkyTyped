package typingsSlinky.pulumiPulumi.outputMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiftedArray[T] extends /* n */ NumberDictionary[Output_[T]] {
  /**
    * Gets the length of the array. This is a number one higher than the highest element defined
    * in an array.
    */
  val length: Output_[Double] = js.native
}

object LiftedArray {
  @scala.inline
  def apply[T](length: Output_[Double]): LiftedArray[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftedArray[T]]
  }
  @scala.inline
  implicit class LiftedArrayOps[Self[t] <: LiftedArray[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withLength(value: Output_[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

