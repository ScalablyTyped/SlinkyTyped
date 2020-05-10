package typingsSlinky.cassandraDriver.metadataMod.metadata

import typingsSlinky.cassandraDriver.AnonFrozen
import typingsSlinky.cassandraDriver.typesMod.types.dataTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeInfo extends js.Object {
  var code: dataTypes = js.native
  var info: String | DataTypeInfo | js.Array[DataTypeInfo] = js.native
  var options: AnonFrozen = js.native
}

object DataTypeInfo {
  @scala.inline
  def apply(code: dataTypes, info: String | DataTypeInfo | js.Array[DataTypeInfo], options: AnonFrozen): DataTypeInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeInfo]
  }
  @scala.inline
  implicit class DataTypeInfoOps[Self <: DataTypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: dataTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String | DataTypeInfo | js.Array[DataTypeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: AnonFrozen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

