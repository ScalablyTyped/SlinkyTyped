package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRepositoryDescriptionInput extends js.Object {
  /**
    * The new comment or description for the specified repository. Repository descriptions are limited to 1,000 characters.
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.native
  /**
    * The name of the repository to set or change the comment or description for.
    */
  var repositoryName: RepositoryName = js.native
}

object UpdateRepositoryDescriptionInput {
  @scala.inline
  def apply(repositoryName: RepositoryName): UpdateRepositoryDescriptionInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRepositoryDescriptionInput]
  }
  @scala.inline
  implicit class UpdateRepositoryDescriptionInputOps[Self <: UpdateRepositoryDescriptionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryDescription(value: RepositoryDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryDescription")(js.undefined)
        ret
    }
  }
  
}

