package typingsSlinky.antd.anon

import typingsSlinky.antd.tableInterfaceMod.CompareFn
import typingsSlinky.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compare[RecordType] extends js.Object {
  var compare: CompareFn[RecordType] = js.native
  /** Config multiple sorter order priority */
  var multiple: Double = js.native
}

object Compare {
  @scala.inline
  def apply[RecordType](
    compare: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double,
    multiple: Double
  ): Compare[RecordType] = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction3(compare), multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare[RecordType]]
  }
  @scala.inline
  implicit class CompareOps[Self[recordtype] <: Compare[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withCompare(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMultiple(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

