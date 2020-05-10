package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetRepositoriesInput extends js.Object {
  /**
    * The names of the repositories to get information about.  The length constraint limit is for each string in the array. The array itself can be empty. 
    */
  var repositoryNames: RepositoryNameList = js.native
}

object BatchGetRepositoriesInput {
  @scala.inline
  def apply(repositoryNames: RepositoryNameList): BatchGetRepositoriesInput = {
    val __obj = js.Dynamic.literal(repositoryNames = repositoryNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRepositoriesInput]
  }
  @scala.inline
  implicit class BatchGetRepositoriesInputOps[Self <: BatchGetRepositoriesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryNames(value: RepositoryNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

