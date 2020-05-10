package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSuggesterRequest extends js.Object {
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * Specifies the name of the suggester you want to delete.
    */
  var SuggesterName: StandardName = js.native
}

object DeleteSuggesterRequest {
  @scala.inline
  def apply(DomainName: DomainName, SuggesterName: StandardName): DeleteSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], SuggesterName = SuggesterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuggesterRequest]
  }
  @scala.inline
  implicit class DeleteSuggesterRequestOps[Self <: DeleteSuggesterRequest] (val x: Self) extends AnyVal {
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
    def withSuggesterName(value: StandardName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggesterName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

