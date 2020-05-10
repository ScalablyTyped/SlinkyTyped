package typingsSlinky.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneViewsRemoveResourcesRequest extends js.Object {
  /** The list of resources to be removed. */
  var resources: js.UndefOr[js.Array[String]] = js.native
}

object ZoneViewsRemoveResourcesRequest {
  @scala.inline
  def apply(): ZoneViewsRemoveResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneViewsRemoveResourcesRequest]
  }
  @scala.inline
  implicit class ZoneViewsRemoveResourcesRequestOps[Self <: ZoneViewsRemoveResourcesRequest] (val x: Self) extends AnyVal {
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

