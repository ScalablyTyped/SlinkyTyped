package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleapis.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableDataInsertAllResponse extends js.Object {
  /**
    * An array of errors for rows that were not inserted.
    */
  var insertErrors: js.UndefOr[js.Array[AnonErrors]] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTableDataInsertAllResponse {
  @scala.inline
  def apply(): SchemaTableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableDataInsertAllResponse]
  }
  @scala.inline
  implicit class SchemaTableDataInsertAllResponseOps[Self <: SchemaTableDataInsertAllResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertErrors(value: js.Array[AnonErrors]): Self = {
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

