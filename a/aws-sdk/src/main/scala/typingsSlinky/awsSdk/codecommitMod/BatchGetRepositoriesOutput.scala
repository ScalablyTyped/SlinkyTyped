package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetRepositoriesOutput extends js.Object {
  /**
    * A list of repositories returned by the batch get repositories operation.
    */
  var repositories: js.UndefOr[RepositoryMetadataList] = js.native
  /**
    * Returns a list of repository names for which information could not be found.
    */
  var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList] = js.native
}

object BatchGetRepositoriesOutput {
  @scala.inline
  def apply(): BatchGetRepositoriesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetRepositoriesOutput]
  }
  @scala.inline
  implicit class BatchGetRepositoriesOutputOps[Self <: BatchGetRepositoriesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositories(value: RepositoryMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoriesNotFound(value: RepositoryNotFoundList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoriesNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoriesNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoriesNotFound")(js.undefined)
        ret
    }
  }
  
}

