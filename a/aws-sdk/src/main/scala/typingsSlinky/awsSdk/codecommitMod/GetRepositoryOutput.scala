package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryOutput extends js.Object {
  /**
    * Information about the repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.native
}

object GetRepositoryOutput {
  @scala.inline
  def apply(): GetRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryOutput]
  }
  @scala.inline
  implicit class GetRepositoryOutputOps[Self <: GetRepositoryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryMetadata(value: RepositoryMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryMetadata")(js.undefined)
        ret
    }
  }
  
}

