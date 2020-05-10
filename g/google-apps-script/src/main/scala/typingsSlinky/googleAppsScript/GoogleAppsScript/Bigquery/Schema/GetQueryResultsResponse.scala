package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsResponse extends js.Object {
  var cacheHit: js.UndefOr[Boolean] = js.native
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.native
  var etag: js.UndefOr[String] = js.native
  var jobComplete: js.UndefOr[Boolean] = js.native
  var jobReference: js.UndefOr[JobReference] = js.native
  var kind: js.UndefOr[String] = js.native
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  var pageToken: js.UndefOr[String] = js.native
  var rows: js.UndefOr[js.Array[TableRow]] = js.native
  var schema: js.UndefOr[TableSchema] = js.native
  var totalBytesProcessed: js.UndefOr[String] = js.native
  var totalRows: js.UndefOr[String] = js.native
}

object GetQueryResultsResponse {
  @scala.inline
  def apply(): GetQueryResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryResultsResponse]
  }
  @scala.inline
  implicit class GetQueryResultsResponseOps[Self <: GetQueryResultsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHit")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[ErrorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withJobComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withJobReference(value: JobReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobReference")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNumDmlAffectedRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDmlAffectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumDmlAffectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDmlAffectedRows")(js.undefined)
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
    @scala.inline
    def withRows(value: js.Array[TableRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: TableSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesProcessed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRows")(js.undefined)
        ret
    }
  }
  
}

