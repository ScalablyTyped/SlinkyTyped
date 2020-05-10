package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListSessionsResponse extends js.Object {
  /**
    * If includeDeleted is set to true in the request, this list will contain
    * sessions deleted with original end times that are within the startTime
    * and endTime frame.
    */
  var deletedSession: js.UndefOr[js.Array[SchemaSession]] = js.native
  /**
    * Flag to indicate server has more data to transfer
    */
  var hasMoreData: js.UndefOr[Boolean] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Sessions with an end time that is between startTime and endTime of the
    * request.
    */
  var session: js.UndefOr[js.Array[SchemaSession]] = js.native
}

object SchemaListSessionsResponse {
  @scala.inline
  def apply(): SchemaListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSessionsResponse]
  }
  @scala.inline
  implicit class SchemaListSessionsResponseOps[Self <: SchemaListSessionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedSession(value: js.Array[SchemaSession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedSession")(js.undefined)
        ret
    }
    @scala.inline
    def withHasMoreData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMoreData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreData")(js.undefined)
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
    @scala.inline
    def withSession(value: js.Array[SchemaSession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

