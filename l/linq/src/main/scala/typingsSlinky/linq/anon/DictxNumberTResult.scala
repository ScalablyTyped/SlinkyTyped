package typingsSlinky.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictxNumberTResult[TResult] extends /* x */ NumberDictionary[TResult] {
  var length: Double = js.native
}

object DictxNumberTResult {
  @scala.inline
  def apply[TResult](length: Double): DictxNumberTResult[TResult] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictxNumberTResult[TResult]]
  }
  @scala.inline
  implicit class DictxNumberTResultOps[Self[tresult] <: DictxNumberTResult[tresult], TResult] (val x: Self[TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResult] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResult] with Other]
    @scala.inline
    def withLength(value: Double): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

