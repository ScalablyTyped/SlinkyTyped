package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchThreatListUpdatesResponse extends js.Object {
  /** The list updates requested by the clients. */
  var listUpdateResponses: js.UndefOr[js.Array[ListUpdateResponse]] = js.native
  /**
    * The minimum duration the client must wait before issuing any update
    * request. If this field is not set clients may update as soon as they want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.native
}

object FetchThreatListUpdatesResponse {
  @scala.inline
  def apply(): FetchThreatListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchThreatListUpdatesResponse]
  }
  @scala.inline
  implicit class FetchThreatListUpdatesResponseOps[Self <: FetchThreatListUpdatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListUpdateResponses(value: js.Array[ListUpdateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUpdateResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListUpdateResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUpdateResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumWaitDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWaitDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumWaitDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWaitDuration")(js.undefined)
        ret
    }
  }
  
}

