package typingsSlinky.qlikEngineapi.anon

import typingsSlinky.qlikEngineapi.EngineAPI.IDataField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QFields extends js.Object {
  var qFields: js.Array[IDataField] = js.native
  var qFormatSpec: String = js.native
}

object QFields {
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: String): QFields = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFields]
  }
  @scala.inline
  implicit class QFieldsOps[Self <: QFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFields(value: js.Array[IDataField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFormatSpec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFormatSpec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

