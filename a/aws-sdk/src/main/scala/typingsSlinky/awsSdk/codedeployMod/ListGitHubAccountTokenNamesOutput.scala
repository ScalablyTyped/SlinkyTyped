package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGitHubAccountTokenNamesOutput extends js.Object {
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent ListGitHubAccountTokenNames call to return the next set of names in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of names of connections to GitHub accounts.
    */
  var tokenNameList: js.UndefOr[GitHubAccountTokenNameList] = js.native
}

object ListGitHubAccountTokenNamesOutput {
  @scala.inline
  def apply(): ListGitHubAccountTokenNamesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGitHubAccountTokenNamesOutput]
  }
  @scala.inline
  implicit class ListGitHubAccountTokenNamesOutputOps[Self <: ListGitHubAccountTokenNamesOutput] (val x: Self) extends AnyVal {
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
    def withTokenNameList(value: GitHubAccountTokenNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenNameList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenNameList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenNameList")(js.undefined)
        ret
    }
  }
  
}

