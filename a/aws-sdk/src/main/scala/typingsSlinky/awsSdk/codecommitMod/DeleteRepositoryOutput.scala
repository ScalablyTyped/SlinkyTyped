package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryOutput extends js.Object {
  /**
    * The ID of the repository that was deleted.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.native
}

object DeleteRepositoryOutput {
  @scala.inline
  def apply(): DeleteRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryOutput]
  }
  @scala.inline
  implicit class DeleteRepositoryOutputOps[Self <: DeleteRepositoryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryId(value: RepositoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(js.undefined)
        ret
    }
  }
  
}

