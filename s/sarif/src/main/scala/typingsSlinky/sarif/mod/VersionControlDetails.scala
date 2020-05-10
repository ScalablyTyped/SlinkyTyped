package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionControlDetails extends js.Object {
  /**
    * A Coordinated Universal Time (UTC) date and time that can be used to synchronize an enlistment to the state of
    * the repository at that time.
    */
  var asOfTimeUtc: js.UndefOr[String] = js.native
  /**
    * The name of a branch containing the revision.
    */
  var branch: js.UndefOr[String] = js.native
  /**
    * The location in the local file system to which the root of the repository was mapped at the time of the
    * analysis.
    */
  var mappedTo: js.UndefOr[ArtifactLocation] = js.native
  /**
    * Key/value pairs that provide additional information about the version control details.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The absolute URI of the repository.
    */
  var repositoryUri: String = js.native
  /**
    * A string that uniquely and permanently identifies the revision within the repository.
    */
  var revisionId: js.UndefOr[String] = js.native
  /**
    * A tag that has been applied to the revision.
    */
  var revisionTag: js.UndefOr[String] = js.native
}

object VersionControlDetails {
  @scala.inline
  def apply(repositoryUri: String): VersionControlDetails = {
    val __obj = js.Dynamic.literal(repositoryUri = repositoryUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionControlDetails]
  }
  @scala.inline
  implicit class VersionControlDetailsOps[Self <: VersionControlDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsOfTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asOfTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsOfTimeUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asOfTimeUtc")(js.undefined)
        ret
    }
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(js.undefined)
        ret
    }
    @scala.inline
    def withMappedTo(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMappedTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappedTo")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionTag")(js.undefined)
        ret
    }
  }
  
}

