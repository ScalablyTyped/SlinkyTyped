package typingsSlinky.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListLogs.
  */
@js.native
trait SchemaListLogsResponse extends js.Object {
  /**
    * A list of log names. For example, &quot;projects/my-project/syslog&quot;
    * or
    * &quot;organizations/123/cloudresourcemanager.googleapis.com%2Factivity&quot;.
    */
  var logNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * If there might be more results than those appearing in this response,
    * then nextPageToken is included. To get the next set of results, call this
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListLogsResponse {
  @scala.inline
  def apply(): SchemaListLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLogsResponse]
  }
  @scala.inline
  implicit class SchemaListLogsResponseOps[Self <: SchemaListLogsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logNames")(js.undefined)
        ret
    }
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
  }
  
}

