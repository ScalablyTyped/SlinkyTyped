package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectParentsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Returns a list of parent reference and LinkName Tuples.
    */
  var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.native
  /**
    * The parent structure, which is a map with key as the ObjectIdentifier and LinkName as the value.
    */
  var Parents: js.UndefOr[ObjectIdentifierToLinkNameMap] = js.native
}

object ListObjectParentsResponse {
  @scala.inline
  def apply(): ListObjectParentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectParentsResponse]
  }
  @scala.inline
  implicit class ListObjectParentsResponseOps[Self <: ListObjectParentsResponse] (val x: Self) extends AnyVal {
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
    def withParentLinks(value: ObjectIdentifierAndLinkNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withParents(value: ObjectIdentifierToLinkNameMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parents")(js.undefined)
        ret
    }
  }
  
}

