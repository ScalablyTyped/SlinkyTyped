package typingsSlinky.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictxNumberTInner[TInner] extends /* x */ NumberDictionary[TInner] {
  var length: Double = js.native
}

object AnonDictxNumberTInner {
  @scala.inline
  def apply[TInner](length: Double): AnonDictxNumberTInner[TInner] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictxNumberTInner[TInner]]
  }
  @scala.inline
  implicit class AnonDictxNumberTInnerOps[Self[tinner] <: AnonDictxNumberTInner[tinner], TInner] (val x: Self[TInner]) extends AnyVal {
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

