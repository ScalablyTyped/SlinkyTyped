package typingsSlinky.antd.useFilterMod

import typingsSlinky.antd.tableInterfaceMod.ColumnType
import typingsSlinky.antd.tableInterfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterState[RecordType] extends js.Object {
  var column: ColumnType[RecordType] = js.native
  var filteredKeys: js.UndefOr[js.Array[Key] | Null] = js.native
  var forceFiltered: js.UndefOr[Boolean] = js.native
  var key: Key = js.native
}

object FilterState {
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType], key: Key): FilterState[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterState[RecordType]]
  }
  @scala.inline
  implicit class FilterStateOps[Self[recordtype] <: FilterState[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withColumn(value: ColumnType[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Key): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteredKeys(value: js.Array[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredKeys: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredKeysNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredKeys")(null)
        ret
    }
    @scala.inline
    def withForceFiltered(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFiltered: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFiltered")(js.undefined)
        ret
    }
  }
  
}

