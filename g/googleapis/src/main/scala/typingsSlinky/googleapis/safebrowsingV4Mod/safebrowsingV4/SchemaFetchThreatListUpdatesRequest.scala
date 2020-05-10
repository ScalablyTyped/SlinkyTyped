package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a Safe Browsing API update request. Clients can request updates
  * for multiple lists in a single request. NOTE: Field index 2 is unused.
  * NEXT: 5
  */
@js.native
trait SchemaFetchThreatListUpdatesRequest extends js.Object {
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The requested threat list updates.
    */
  var listUpdateRequests: js.UndefOr[js.Array[SchemaListUpdateRequest]] = js.native
}

object SchemaFetchThreatListUpdatesRequest {
  @scala.inline
  def apply(): SchemaFetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchThreatListUpdatesRequest]
  }
  @scala.inline
  implicit class SchemaFetchThreatListUpdatesRequestOps[Self <: SchemaFetchThreatListUpdatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: SchemaClientInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withListUpdateRequests(value: js.Array[SchemaListUpdateRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUpdateRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListUpdateRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUpdateRequests")(js.undefined)
        ret
    }
  }
  
}

