package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClientBigquery.anon.InsertId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDataInsertAllRequest extends js.Object {
  /**
    * [Optional] Accept rows that contain values that do not match the schema. The unknown values are ignored. Default is false, which treats unknown values
    * as errors.
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.native
  /** The rows to insert. */
  var rows: js.UndefOr[js.Array[InsertId]] = js.native
  /**
    * [Optional] Insert all valid rows of a request, even if invalid rows exist. The default value is false, which causes the entire request to fail if any
    * invalid rows exist.
    */
  var skipInvalidRows: js.UndefOr[Boolean] = js.native
  /**
    * [Experimental] If specified, treats the destination table as a base template, and inserts the rows into an instance table named
    * "{destination}{templateSuffix}". BigQuery will manage creation of the instance table, using the schema of the base template table. See
    * https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables for considerations when working with templates tables.
    */
  var templateSuffix: js.UndefOr[String] = js.native
}

object TableDataInsertAllRequest {
  @scala.inline
  def apply(): TableDataInsertAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllRequest]
  }
  @scala.inline
  implicit class TableDataInsertAllRequestOps[Self <: TableDataInsertAllRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreUnknownValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknownValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnknownValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknownValues")(js.undefined)
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
    def withRows(value: js.Array[InsertId]): Self = {
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
    def withSkipInvalidRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInvalidRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipInvalidRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInvalidRows")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateSuffix")(js.undefined)
        ret
    }
  }
  
}

