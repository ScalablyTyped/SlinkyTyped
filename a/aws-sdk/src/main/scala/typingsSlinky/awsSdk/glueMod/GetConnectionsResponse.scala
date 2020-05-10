package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionsResponse extends js.Object {
  /**
    * A list of requested connection definitions.
    */
  var ConnectionList: js.UndefOr[typingsSlinky.awsSdk.glueMod.ConnectionList] = js.native
  /**
    * A continuation token, if the list of connections returned does not include the last of the filtered connections.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetConnectionsResponse {
  @scala.inline
  def apply(): GetConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsResponse]
  }
  @scala.inline
  implicit class GetConnectionsResponseOps[Self <: GetConnectionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionList(value: ConnectionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionList")(js.undefined)
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

