package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainAssociationResult extends js.Object {
  var domainAssociation: DomainAssociation = js.native
}

object DeleteDomainAssociationResult {
  @scala.inline
  def apply(domainAssociation: DomainAssociation): DeleteDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainAssociationResult]
  }
  @scala.inline
  implicit class DeleteDomainAssociationResultOps[Self <: DeleteDomainAssociationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainAssociation(value: DomainAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainAssociation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

