package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableVersionsResponse extends js.Object {
  /**
    * A continuation token, if the list of available versions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of strings identifying available versions of the specified table.
    */
  var TableVersions: js.UndefOr[GetTableVersionsList] = js.native
}

object GetTableVersionsResponse {
  @scala.inline
  def apply(): GetTableVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableVersionsResponse]
  }
  @scala.inline
  implicit class GetTableVersionsResponseOps[Self <: GetTableVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withTableVersions(value: GetTableVersionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableVersions")(js.undefined)
        ret
    }
  }
  
}

