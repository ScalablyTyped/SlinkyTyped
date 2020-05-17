package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.ArraySpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Splice[T]
  extends ArraySpec[T, js.Any] {
  @JSName("$splice")
  var $splice: js.Array[(js.Tuple2[Double, js.UndefOr[Double]]) | (Array[Double | T])] = js.native
}

object Splice {
  @scala.inline
  def apply[T]($splice: js.Array[(js.Tuple2[Double, js.UndefOr[Double]]) | (Array[Double | T])]): Splice[T] = {
    val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Splice[T]]
  }
  @scala.inline
  implicit class SpliceOps[Self[t] <: Splice[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$splice(value: js.Array[(js.Tuple2[Double, js.UndefOr[Double]]) | (Array[Double | T])]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$splice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

