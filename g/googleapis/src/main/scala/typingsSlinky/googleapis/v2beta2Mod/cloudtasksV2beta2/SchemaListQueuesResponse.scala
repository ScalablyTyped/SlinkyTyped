package typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListQueues.
  */
@js.native
trait SchemaListQueuesResponse extends js.Object {
  /**
    * A token to retrieve next page of results.  To return the next page of
    * results, call ListQueues with this value as the page_token.  If the
    * next_page_token is empty, there are no more results.  The page token is
    * valid for only 2 hours.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of queues.
    */
  var queues: js.UndefOr[js.Array[SchemaQueue]] = js.native
}

object SchemaListQueuesResponse {
  @scala.inline
  def apply(): SchemaListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListQueuesResponse]
  }
  @scala.inline
  implicit class SchemaListQueuesResponseOps[Self <: SchemaListQueuesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withQueues(value: js.Array[SchemaQueue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(js.undefined)
        ret
    }
  }
  
}

