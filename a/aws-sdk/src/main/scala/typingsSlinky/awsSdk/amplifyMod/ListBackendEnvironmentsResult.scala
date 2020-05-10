package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackendEnvironmentsResult extends js.Object {
  /**
    *  List of backend environments for an Amplify App. 
    */
  var backendEnvironments: BackendEnvironments = js.native
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBackendEnvironmentsResult {
  @scala.inline
  def apply(backendEnvironments: BackendEnvironments): ListBackendEnvironmentsResult = {
    val __obj = js.Dynamic.literal(backendEnvironments = backendEnvironments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackendEnvironmentsResult]
  }
  @scala.inline
  implicit class ListBackendEnvironmentsResultOps[Self <: ListBackendEnvironmentsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendEnvironments(value: BackendEnvironments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendEnvironments")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

