package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMLTransformsResponse extends js.Object {
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The identifiers of all the machine learning transforms in the account, or the machine learning transforms with the specified tags.
    */
  var TransformIds: TransformIdList = js.native
}

object ListMLTransformsResponse {
  @scala.inline
  def apply(TransformIds: TransformIdList): ListMLTransformsResponse = {
    val __obj = js.Dynamic.literal(TransformIds = TransformIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMLTransformsResponse]
  }
  @scala.inline
  implicit class ListMLTransformsResponseOps[Self <: ListMLTransformsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformIds(value: TransformIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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

