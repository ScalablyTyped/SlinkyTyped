package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListSessions.
  */
@js.native
trait SchemaListSessionsResponse extends js.Object {
  /**
    * `next_page_token` can be sent in a subsequent ListSessions call to fetch
    * more of the matching sessions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of requested sessions.
    */
  var sessions: js.UndefOr[js.Array[SchemaSession]] = js.native
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
    def withSessions(value: js.Array[SchemaSession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessions")(js.undefined)
        ret
    }
  }
  
}

