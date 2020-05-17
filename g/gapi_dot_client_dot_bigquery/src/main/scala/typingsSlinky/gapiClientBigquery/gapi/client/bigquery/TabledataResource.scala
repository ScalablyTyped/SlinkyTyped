package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBigquery.anon.Oauthtoken
import typingsSlinky.gapiClientBigquery.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabledataResource extends js.Object {
  /** Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role. */
  def insertAll(request: Oauthtoken): Request[TableDataInsertAllResponse] = js.native
  /** Retrieves table data from a specified set of rows. Requires the READER dataset role. */
  def list(request: PageToken): Request[TableDataList] = js.native
}

object TabledataResource {
  @scala.inline
  def apply(
    insertAll: Oauthtoken => Request[TableDataInsertAllResponse],
    list: PageToken => Request[TableDataList]
  ): TabledataResource = {
    val __obj = js.Dynamic.literal(insertAll = js.Any.fromFunction1(insertAll), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TabledataResource]
  }
  @scala.inline
  implicit class TabledataResourceOps[Self <: TabledataResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertAll(value: Oauthtoken => Request[TableDataInsertAllResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: PageToken => Request[TableDataList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

