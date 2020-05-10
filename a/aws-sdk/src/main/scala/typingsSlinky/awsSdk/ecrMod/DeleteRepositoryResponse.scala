package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryResponse extends js.Object {
  /**
    * The repository that was deleted.
    */
  var repository: js.UndefOr[Repository] = js.native
}

object DeleteRepositoryResponse {
  @scala.inline
  def apply(): DeleteRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryResponse]
  }
  @scala.inline
  implicit class DeleteRepositoryResponseOps[Self <: DeleteRepositoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepository(value: Repository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(js.undefined)
        ret
    }
  }
  
}

