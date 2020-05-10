package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * The branch of the repository where the pull request changes are merged. Also known as the destination branch.
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.native
  /**
    * The name of the repository that contains the pull request.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
    */
  var sourceReference: ReferenceName = js.native
}

object Target {
  @scala.inline
  def apply(repositoryName: RepositoryName, sourceReference: ReferenceName): Target = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], sourceReference = sourceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
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
    def withSourceReference(value: ReferenceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationReference(value: ReferenceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationReference")(js.undefined)
        ret
    }
  }
  
}

