package typingsSlinky.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailsResponse extends js.Object {
  /** List of Avails that match the request criteria. */
  var avails: js.UndefOr[js.Array[Avail]] = js.native
  /** See _List methods rules_ for info about this field. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[Double] = js.native
}

object ListAvailsResponse {
  @scala.inline
  def apply(): ListAvailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailsResponse]
  }
  @scala.inline
  implicit class ListAvailsResponseOps[Self <: ListAvailsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvails(value: js.Array[Avail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avails")(js.undefined)
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
    def withTotalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(js.undefined)
        ret
    }
  }
  
}

