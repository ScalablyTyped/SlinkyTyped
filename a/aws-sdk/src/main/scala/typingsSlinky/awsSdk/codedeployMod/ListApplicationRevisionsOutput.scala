package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationRevisionsOutput extends js.Object {
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list application revisions call to return the next set of application revisions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of locations that contain the matching revisions.
    */
  var revisions: js.UndefOr[RevisionLocationList] = js.native
}

object ListApplicationRevisionsOutput {
  @scala.inline
  def apply(): ListApplicationRevisionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationRevisionsOutput]
  }
  @scala.inline
  implicit class ListApplicationRevisionsOutputOps[Self <: ListApplicationRevisionsOutput] (val x: Self) extends AnyVal {
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
    def withRevisions(value: RevisionLocationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisions")(js.undefined)
        ret
    }
  }
  
}

