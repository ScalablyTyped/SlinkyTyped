package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExecutionsResponse extends js.Object {
  /**
    * Executions.
    *
    * Always set.
    */
  var executions: js.UndefOr[js.Array[Execution]] = js.native
  /**
    * A continuation token to resume the query at the next item.
    *
    * Will only be set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListExecutionsResponse {
  @scala.inline
  def apply(): ListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExecutionsResponse]
  }
  @scala.inline
  implicit class ListExecutionsResponseOps[Self <: ListExecutionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutions(value: js.Array[Execution]): Self = {
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

