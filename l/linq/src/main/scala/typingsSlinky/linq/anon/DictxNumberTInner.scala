package typingsSlinky.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictxNumberTInner[TInner] extends /* x */ NumberDictionary[TInner] {
  var length: Double = js.native
}

object DictxNumberTInner {
  @scala.inline
  def apply[TInner](length: Double): DictxNumberTInner[TInner] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictxNumberTInner[TInner]]
  }
  @scala.inline
  implicit class DictxNumberTInnerOps[Self[tinner] <: DictxNumberTInner[tinner], TInner] (val x: Self[TInner]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TInner] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TInner]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TInner] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TInner] with Other]
    @scala.inline
    def withLength(value: Double): Self[TInner] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

