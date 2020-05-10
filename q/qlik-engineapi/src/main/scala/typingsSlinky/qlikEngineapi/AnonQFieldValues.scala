package typingsSlinky.qlikEngineapi

import typingsSlinky.qlikEngineapi.EngineAPI.IFieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQFieldValues extends js.Object {
  var qFieldValues: js.Array[IFieldValue] = js.native
}

object AnonQFieldValues {
  @scala.inline
  def apply(qFieldValues: js.Array[IFieldValue]): AnonQFieldValues = {
    val __obj = js.Dynamic.literal(qFieldValues = qFieldValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQFieldValues]
  }
  @scala.inline
  implicit class AnonQFieldValuesOps[Self <: AnonQFieldValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFieldValues(value: js.Array[IFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

