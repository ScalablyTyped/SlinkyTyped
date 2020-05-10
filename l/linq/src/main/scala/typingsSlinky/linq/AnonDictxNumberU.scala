package typingsSlinky.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictxNumberU[U] extends /* x */ NumberDictionary[U] {
  var length: Double = js.native
}

object AnonDictxNumberU {
  @scala.inline
  def apply[U](length: Double): AnonDictxNumberU[U] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictxNumberU[U]]
  }
  @scala.inline
  implicit class AnonDictxNumberUOps[Self[u] <: AnonDictxNumberU[u], U] (val x: Self[U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[U] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[U] with Other]
    @scala.inline
    def withLength(value: Double): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

