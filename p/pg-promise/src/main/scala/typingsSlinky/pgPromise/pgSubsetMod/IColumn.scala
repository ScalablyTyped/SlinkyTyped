package typingsSlinky.pgPromise.pgSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumn extends js.Object {
  var columnID: Double = js.native
  var dataTypeID: Double = js.native
  var dataTypeModifier: Double = js.native
  var dataTypeSize: Double = js.native
  var format: String = js.native
  var name: String = js.native
  var oid: Double = js.native
  // NOTE: properties below are not available within Native Bindings:
  var tableID: Double = js.native
}

object IColumn {
  @scala.inline
  def apply(
    columnID: Double,
    dataTypeID: Double,
    dataTypeModifier: Double,
    dataTypeSize: Double,
    format: String,
    name: String,
    oid: Double,
    tableID: Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(columnID = columnID.asInstanceOf[js.Any], dataTypeID = dataTypeID.asInstanceOf[js.Any], dataTypeModifier = dataTypeModifier.asInstanceOf[js.Any], dataTypeSize = dataTypeSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], tableID = tableID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  @scala.inline
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTypeID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTypeModifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTypeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

