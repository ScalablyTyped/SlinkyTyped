package typingsSlinky.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictxLength[TCollection] extends /* x */ NumberDictionary[TCollection] {
  var length: Double = js.native
}

object AnonDictxLength {
  @scala.inline
  def apply[TCollection](length: Double): AnonDictxLength[TCollection] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictxLength[TCollection]]
  }
  @scala.inline
  implicit class AnonDictxLengthOps[Self[tcollection] <: AnonDictxLength[tcollection], TCollection] (val x: Self[TCollection]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TCollection] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TCollection]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TCollection] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TCollection] with Other]
    @scala.inline
    def withLength(value: Double): Self[TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

