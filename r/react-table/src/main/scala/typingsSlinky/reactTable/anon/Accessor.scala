package typingsSlinky.reactTable.anon

import typingsSlinky.reactTable.mod.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accessor[D /* <: js.Object */] extends js.Object {
  var accessor: js.UndefOr[typingsSlinky.reactTable.mod.Accessor[D]] = js.native
}

object Accessor {
  @scala.inline
  def apply[D](): Accessor[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accessor[D]]
  }
  @scala.inline
  implicit class AccessorOps[Self[d] <: Accessor[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAccessor(value: (D, /* index */ Double, /* sub */ Data[D]) => CellValue[js.Any]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessor")(js.Any.fromFunction3(value))
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

