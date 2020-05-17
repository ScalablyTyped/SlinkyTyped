package typingsSlinky.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictxNumberU[U] extends /* x */ NumberDictionary[U] {
  var length: Double = js.native
}

object DictxNumberU {
  @scala.inline
  def apply[U](length: Double): DictxNumberU[U] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictxNumberU[U]]
  }
  @scala.inline
  implicit class DictxNumberUOps[Self[u] <: DictxNumberU[u], U] (val x: Self[U]) extends AnyVal {
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

