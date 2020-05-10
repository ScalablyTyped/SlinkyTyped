package typingsSlinky.ngTable.resultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataRowGroup[T] extends js.Object {
  @JSName("$hideRows")
  var $hideRows: Boolean = js.native
  var data: js.Array[T] = js.native
  var value: String = js.native
}

object IDataRowGroup {
  @scala.inline
  def apply[T]($hideRows: Boolean, data: js.Array[T], value: String): IDataRowGroup[T] = {
    val __obj = js.Dynamic.literal($hideRows = $hideRows.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataRowGroup[T]]
  }
  @scala.inline
  implicit class IDataRowGroupOps[Self[t] <: IDataRowGroup[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$hideRows(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$hideRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

