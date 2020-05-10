package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServersResponse extends js.Object {
  /**
    * The time when the server was last modified.
    */
  var lastModifiedOn: js.UndefOr[js.Date] = js.native
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The status of the server catalog.
    */
  var serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.native
  /**
    * Information about the servers.
    */
  var serverList: js.UndefOr[ServerList] = js.native
}

object GetServersResponse {
  @scala.inline
  def apply(): GetServersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServersResponse]
  }
  @scala.inline
  implicit class GetServersResponseOps[Self <: GetServersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModifiedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCatalogStatus(value: ServerCatalogStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCatalogStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCatalogStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCatalogStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withServerList(value: ServerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverList")(js.undefined)
        ret
    }
  }
  
}

