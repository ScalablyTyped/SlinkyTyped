package typingsSlinky.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneViewsAddResourcesRequest extends js.Object {
  /** The list of resources to be added. */
  var resources: js.UndefOr[js.Array[String]] = js.native
}

object ZoneViewsAddResourcesRequest {
  @scala.inline
  def apply(): ZoneViewsAddResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneViewsAddResourcesRequest]
  }
  @scala.inline
  implicit class ZoneViewsAddResourcesRequestOps[Self <: ZoneViewsAddResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
  }
  
}

