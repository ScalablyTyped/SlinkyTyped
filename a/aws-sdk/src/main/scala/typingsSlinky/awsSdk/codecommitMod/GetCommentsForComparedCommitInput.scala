package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentsForComparedCommitInput extends js.Object {
  /**
    * To establish the directionality of the comparison, the full commit ID of the after commit.
    */
  var afterCommitId: CommitId = js.native
  /**
    * To establish the directionality of the comparison, the full commit ID of the before commit.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * A non-zero, non-negative integer used to limit the number of returned results. The default is 100 comments, but you can configure up to 500.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * An enumeration token that when provided in a request, returns the next batch of the results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the repository where you want to compare commits.
    */
  var repositoryName: RepositoryName = js.native
}

object GetCommentsForComparedCommitInput {
  @scala.inline
  def apply(afterCommitId: CommitId, repositoryName: RepositoryName): GetCommentsForComparedCommitInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForComparedCommitInput]
  }
  @scala.inline
  implicit class GetCommentsForComparedCommitInputOps[Self <: GetCommentsForComparedCommitInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCommitId(value: CommitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeCommitId(value: CommitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommitId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
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

