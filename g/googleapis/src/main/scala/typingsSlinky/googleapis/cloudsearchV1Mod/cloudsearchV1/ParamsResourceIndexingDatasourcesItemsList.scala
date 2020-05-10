package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceIndexingDatasourcesItemsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * When set to true, the indexing system only populates the following
    * fields: name, version, metadata.hash, structured_data.hash, content.hash.
    * <br />If this value is false, then all the fields are populated in Item.
    */
  var brief: js.UndefOr[Boolean] = js.native
  /**
    * Name of connector making this call. <br />Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.native
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.native
  /**
    * Name of the Data Source to list Items.  Format: datasources/{source_id}
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Maximum number of items to fetch in a request. The max value is 1000 when
    * brief is true.  The max value is 10 if brief is false. <br />The default
    * value is 10
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceIndexingDatasourcesItemsList {
  @scala.inline
  def apply(): ParamsResourceIndexingDatasourcesItemsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesItemsList]
  }
  @scala.inline
  implicit class ParamsResourceIndexingDatasourcesItemsListOps[Self <: ParamsResourceIndexingDatasourcesItemsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withBrief(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brief")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrief: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brief")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorName")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugOptionsDotenableDebugging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions.enableDebugging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugOptionsDotenableDebugging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions.enableDebugging")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

