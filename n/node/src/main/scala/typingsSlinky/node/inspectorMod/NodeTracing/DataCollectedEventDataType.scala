package typingsSlinky.node.inspectorMod.NodeTracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCollectedEventDataType extends js.Object {
  var value: js.Array[js.Object]
}

object DataCollectedEventDataType {
  @scala.inline
  def apply(value: js.Array[js.Object]): DataCollectedEventDataType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCollectedEventDataType]
  }
  @scala.inline
  implicit class DataCollectedEventDataTypeOps[Self <: DataCollectedEventDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: js.Array[js.Object]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

