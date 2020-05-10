package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypedLinkFacetNamesResponse extends js.Object {
  /**
    * The names of typed link facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[TypedLinkNameList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object ListTypedLinkFacetNamesResponse {
  @scala.inline
  def apply(): ListTypedLinkFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypedLinkFacetNamesResponse]
  }
  @scala.inline
  implicit class ListTypedLinkFacetNamesResponseOps[Self <: ListTypedLinkFacetNamesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacetNames(value: TypedLinkNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetNames")(js.undefined)
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

