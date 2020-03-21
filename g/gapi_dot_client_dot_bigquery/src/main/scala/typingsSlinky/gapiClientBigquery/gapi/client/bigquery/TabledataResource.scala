package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBigquery.AnonOauthtoken
import typingsSlinky.gapiClientBigquery.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabledataResource extends js.Object {
  /** Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role. */
  def insertAll(request: AnonOauthtoken): Request_[TableDataInsertAllResponse]
  /** Retrieves table data from a specified set of rows. Requires the READER dataset role. */
  def list(request: AnonPageToken): Request_[TableDataList]
}

object TabledataResource {
  @scala.inline
  def apply(
    insertAll: AnonOauthtoken => Request_[TableDataInsertAllResponse],
    list: AnonPageToken => Request_[TableDataList]
  ): TabledataResource = {
    val __obj = js.Dynamic.literal(insertAll = js.Any.fromFunction1(insertAll), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TabledataResource]
  }
}

