package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPollItemsRequest extends js.Object {
  /**
    * Name of connector making this call. &lt;br /&gt;Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.native
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  /**
    * Maximum number of items to return. &lt;br /&gt;The maximum and the
    * default value is 1000
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Queue name to fetch items from.  If unspecified, PollItems will fetch
    * from &#39;default&#39; queue. The maximum length is 100 characters.
    */
  var queue: js.UndefOr[String] = js.native
  /**
    * Limit the items polled to the ones with these statuses.
    */
  var statusCodes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPollItemsRequest {
  @scala.inline
  def apply(): SchemaPollItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollItemsRequest]
  }
  @scala.inline
  implicit class SchemaPollItemsRequestOps[Self <: SchemaPollItemsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDebugOptions(value: SchemaDebugOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(js.undefined)
        ret
    }
  }
  
}

