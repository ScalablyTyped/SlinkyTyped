package typingsSlinky.antd.useSelectionMod

import typingsSlinky.antd.tableInterfaceMod.ExpandType
import typingsSlinky.antd.tableInterfaceMod.Key
import typingsSlinky.antd.tableInterfaceMod.TableLocale
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSelectionConfig[RecordType] extends js.Object {
  var childrenColumnName: String = js.native
  var data: js.Array[RecordType] = js.native
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  var expandType: ExpandType = js.native
  var getRowKey: GetRowKey[RecordType] = js.native
  var locale: TableLocale = js.native
  var pageData: js.Array[RecordType] = js.native
  var prefixCls: String = js.native
  def getRecordByKey(key: Key): RecordType = js.native
}

object UseSelectionConfig {
  @scala.inline
  def apply[RecordType](
    childrenColumnName: String,
    data: js.Array[RecordType],
    getRecordByKey: Key => RecordType,
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => typingsSlinky.rcTable.interfaceMod.Key,
    locale: TableLocale,
    pageData: js.Array[RecordType],
    prefixCls: String
  ): UseSelectionConfig[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getRecordByKey = js.Any.fromFunction1(getRecordByKey), getRowKey = js.Any.fromFunction2(getRowKey), locale = locale.asInstanceOf[js.Any], pageData = pageData.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectionConfig[RecordType]]
  }
  @scala.inline
  implicit class UseSelectionConfigOps[Self[recordtype] <: UseSelectionConfig[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withChildrenColumnName(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRecordByKey(value: Key => RecordType): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordByKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => typingsSlinky.rcTable.interfaceMod.Key): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLocale(value: TableLocale): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageData(value: js.Array[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandIconColumnIndex(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandIconColumnIndex: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandType(value: ExpandType): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandTypeNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandType")(null)
        ret
    }
  }
  
}

