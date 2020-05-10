package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateRepositoryResponse extends js.Object {
  /**
    * Information about the repository association.
    */
  var RepositoryAssociation: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.RepositoryAssociation] = js.native
}

object AssociateRepositoryResponse {
  @scala.inline
  def apply(): AssociateRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateRepositoryResponse]
  }
  @scala.inline
  implicit class AssociateRepositoryResponseOps[Self <: AssociateRepositoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryAssociation(value: RepositoryAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepositoryAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepositoryAssociation")(js.undefined)
        ret
    }
  }
  
}

