package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstanceConfigsResponse extends js.Object {
  /** The list of requested instance configurations. */
  var instanceConfigs: js.UndefOr[js.Array[InstanceConfig]] = js.native
  /**
    * `next_page_token` can be sent in a subsequent
    * ListInstanceConfigs call to
    * fetch more of the matching instance configurations.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListInstanceConfigsResponse {
  @scala.inline
  def apply(): ListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceConfigsResponse]
  }
  @scala.inline
  implicit class ListInstanceConfigsResponseOps[Self <: ListInstanceConfigsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceConfigs(value: js.Array[InstanceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceConfigs")(js.undefined)
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

