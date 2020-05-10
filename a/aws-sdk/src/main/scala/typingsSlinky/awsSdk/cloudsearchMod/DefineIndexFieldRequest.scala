package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineIndexFieldRequest extends js.Object {
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * The index field and field options you want to configure. 
    */
  var IndexField: typingsSlinky.awsSdk.cloudsearchMod.IndexField = js.native
}

object DefineIndexFieldRequest {
  @scala.inline
  def apply(DomainName: DomainName, IndexField: IndexField): DefineIndexFieldRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], IndexField = IndexField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineIndexFieldRequest]
  }
  @scala.inline
  implicit class DefineIndexFieldRequestOps[Self <: DefineIndexFieldRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexField(value: IndexField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

