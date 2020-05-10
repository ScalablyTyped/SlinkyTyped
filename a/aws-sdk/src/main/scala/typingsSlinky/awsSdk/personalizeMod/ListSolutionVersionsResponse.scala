package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSolutionVersionsResponse extends js.Object {
  /**
    * A token for getting the next set of solution versions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of solution versions describing the version properties.
    */
  var solutionVersions: js.UndefOr[SolutionVersions] = js.native
}

object ListSolutionVersionsResponse {
  @scala.inline
  def apply(): ListSolutionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolutionVersionsResponse]
  }
  @scala.inline
  implicit class ListSolutionVersionsResponseOps[Self <: ListSolutionVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionVersions(value: SolutionVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersions")(js.undefined)
        ret
    }
  }
  
}

