package typingsSlinky.reactTable

import typingsSlinky.reactTable.mod.Accessor
import typingsSlinky.reactTable.mod.CellValue
import typingsSlinky.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1[D /* <: js.Object */] extends js.Object {
  var accessor: js.UndefOr[Accessor[D] | IdType[D]] = js.native
}

object Anon1 {
  @scala.inline
  def apply[D](): Anon1[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon1[D]]
  }
  @scala.inline
  implicit class Anon1Ops[Self[d] <: Anon1[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAccessorFunction3(value: (D, /* index */ Double, /* sub */ AnonData[D]) => CellValue[js.Any]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAccessor(value: Accessor[D] | IdType[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessor: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessor")(js.undefined)
        ret
    }
  }
  
}

