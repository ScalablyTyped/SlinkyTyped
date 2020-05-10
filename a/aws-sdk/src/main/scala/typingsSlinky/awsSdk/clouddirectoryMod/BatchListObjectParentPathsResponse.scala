package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListObjectParentPathsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Returns the path to the ObjectIdentifiers that are associated with the directory.
    */
  var PathToObjectIdentifiersList: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.PathToObjectIdentifiersList] = js.native
}

object BatchListObjectParentPathsResponse {
  @scala.inline
  def apply(): BatchListObjectParentPathsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectParentPathsResponse]
  }
  @scala.inline
  implicit class BatchListObjectParentPathsResponseOps[Self <: BatchListObjectParentPathsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPathToObjectIdentifiersList(value: PathToObjectIdentifiersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathToObjectIdentifiersList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathToObjectIdentifiersList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathToObjectIdentifiersList")(js.undefined)
        ret
    }
  }
  
}

