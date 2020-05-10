package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationDependenciesResponse extends js.Object {
  /**
    * An array of application summaries nested in the application.
    */
  var Dependencies: js.UndefOr[listOfApplicationDependencySummary] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListApplicationDependenciesResponse {
  @scala.inline
  def apply(): ListApplicationDependenciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationDependenciesResponse]
  }
  @scala.inline
  implicit class ListApplicationDependenciesResponseOps[Self <: ListApplicationDependenciesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: listOfApplicationDependencySummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

