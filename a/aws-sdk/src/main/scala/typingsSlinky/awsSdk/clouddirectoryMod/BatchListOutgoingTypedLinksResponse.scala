package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListOutgoingTypedLinksResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.native
}

object BatchListOutgoingTypedLinksResponse {
  @scala.inline
  def apply(): BatchListOutgoingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListOutgoingTypedLinksResponse]
  }
  @scala.inline
  implicit class BatchListOutgoingTypedLinksResponseOps[Self <: BatchListOutgoingTypedLinksResponse] (val x: Self) extends AnyVal {
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
    def withTypedLinkSpecifiers(value: TypedLinkSpecifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedLinkSpecifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypedLinkSpecifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedLinkSpecifiers")(js.undefined)
        ret
    }
  }
  
}

