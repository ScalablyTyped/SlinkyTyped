package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainRequest extends js.Object {
  /**
    * The domain ID.
    */
  var DomainId: typingsSlinky.awsSdk.sagemakerMod.DomainId = js.native
  /**
    * The retention policy for this domain, which specifies which resources will be retained after the Domain is deleted. By default, all resources are retained (not automatically deleted). 
    */
  var RetentionPolicy: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RetentionPolicy] = js.native
}

object DeleteDomainRequest {
  @scala.inline
  def apply(DomainId: DomainId): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
  @scala.inline
  implicit class DeleteDomainRequestOps[Self <: DeleteDomainRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainId(value: DomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionPolicy(value: RetentionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPolicy")(js.undefined)
        ret
    }
  }
  
}

