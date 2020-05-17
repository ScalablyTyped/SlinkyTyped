package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClientBigquery.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDataInsertAllResponse extends js.Object {
  /** An array of errors for rows that were not inserted. */
  var insertErrors: js.UndefOr[js.Array[Errors]] = js.native
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.native
}

object TableDataInsertAllResponse {
  @scala.inline
  def apply(): TableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllResponse]
  }
  @scala.inline
  implicit class TableDataInsertAllResponseOps[Self <: TableDataInsertAllResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertErrors(value: js.Array[Errors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertErrors")(js.undefined)
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
  }
  
}

