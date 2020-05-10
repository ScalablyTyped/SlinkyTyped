package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListIncomingTypedLinksResponse extends js.Object {
  /**
    * Returns one or more typed link specifiers as output.
    */
  var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object BatchListIncomingTypedLinksResponse {
  @scala.inline
  def apply(): BatchListIncomingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListIncomingTypedLinksResponse]
  }
  @scala.inline
  implicit class BatchListIncomingTypedLinksResponseOps[Self <: BatchListIncomingTypedLinksResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkSpecifiers(value: TypedLinkSpecifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkSpecifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkSpecifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkSpecifiers")(js.undefined)
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
  }
  
}

