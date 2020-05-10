package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListExecutionsResponse extends js.Object {
  /**
    * Executions.  Always set.
    */
  var executions: js.UndefOr[js.Array[SchemaExecution]] = js.native
  /**
    * A continuation token to resume the query at the next item.  Will only be
    * set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListExecutionsResponse {
  @scala.inline
  def apply(): SchemaListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListExecutionsResponse]
  }
  @scala.inline
  implicit class SchemaListExecutionsResponseOps[Self <: SchemaListExecutionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutions(value: js.Array[SchemaExecution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executions")(js.undefined)
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

