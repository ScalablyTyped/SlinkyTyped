package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreatedArtifactsResult extends js.Object {
  /**
    * List of created artifacts up to the maximum number of results specified in the request.
    */
  var CreatedArtifactList: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.CreatedArtifactList] = js.native
  /**
    * If there are more created artifacts than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListCreatedArtifactsResult {
  @scala.inline
  def apply(): ListCreatedArtifactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreatedArtifactsResult]
  }
  @scala.inline
  implicit class ListCreatedArtifactsResultOps[Self <: ListCreatedArtifactsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedArtifactList(value: CreatedArtifactList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedArtifactList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedArtifactList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedArtifactList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
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

