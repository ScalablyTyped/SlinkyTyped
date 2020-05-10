package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineIndexFieldResponse extends js.Object {
  var IndexField: IndexFieldStatus = js.native
}

object DefineIndexFieldResponse {
  @scala.inline
  def apply(IndexField: IndexFieldStatus): DefineIndexFieldResponse = {
    val __obj = js.Dynamic.literal(IndexField = IndexField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineIndexFieldResponse]
  }
  @scala.inline
  implicit class DefineIndexFieldResponseOps[Self <: DefineIndexFieldResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexField(value: IndexFieldStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

