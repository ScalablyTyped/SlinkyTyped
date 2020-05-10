package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDifferencesInput extends js.Object {
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var MaxResults: js.UndefOr[Limit] = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codecommitMod.NextToken] = js.native
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
    */
  var afterCommitSpecifier: CommitName = js.native
  /**
    * The file path in which to check differences. Limits the results to this path. Can also be used to specify the changed name of a directory or folder, if it has changed. If not specified, differences are shown for all paths.
    */
  var afterPath: js.UndefOr[Path] = js.native
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, the full commit ID). Optional. If not specified, all changes before the afterCommitSpecifier value are shown. If you do not use beforeCommitSpecifier in your request, consider limiting the results with maxResults.
    */
  var beforeCommitSpecifier: js.UndefOr[CommitName] = js.native
  /**
    * The file path in which to check for differences. Limits the results to this path. Can also be used to specify the previous name of a directory or folder. If beforePath and afterPath are not specified, differences are shown for all paths.
    */
  var beforePath: js.UndefOr[Path] = js.native
  /**
    * The name of the repository where you want to get differences.
    */
  var repositoryName: RepositoryName = js.native
}

object GetDifferencesInput {
  @scala.inline
  def apply(afterCommitSpecifier: CommitName, repositoryName: RepositoryName): GetDifferencesInput = {
    val __obj = js.Dynamic.literal(afterCommitSpecifier = afterCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDifferencesInput]
  }
  @scala.inline
  implicit class GetDifferencesInputOps[Self <: GetDifferencesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCommitSpecifier(value: CommitName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCommitSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    @scala.inline
    def withAfterPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPath")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCommitSpecifier(value: CommitName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommitSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeCommitSpecifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommitSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePath")(js.undefined)
        ret
    }
  }
  
}

