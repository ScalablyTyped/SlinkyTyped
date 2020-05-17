package typingsSlinky.gapiClientBigquery.anon

import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertId extends js.Object {
  /** [Optional] A unique ID for each row. BigQuery uses this property to detect duplicate insertion requests on a best-effort basis. */
  var insertId: js.UndefOr[String] = js.native
  /** [Required] A JSON object that contains a row of data. The object's properties and values must match the destination table's schema. */
  var json: js.UndefOr[JsonObject] = js.native
}

object InsertId {
  @scala.inline
  def apply(): InsertId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertId]
  }
  @scala.inline
  implicit class InsertIdOps[Self <: InsertId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertId")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: JsonObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
  }
  
}

