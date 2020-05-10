package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityContentDetailsFavorite extends js.Object {
  /** The resourceId object contains information that identifies the resource that was marked as a favorite. */
  var resourceId: js.UndefOr[ResourceId] = js.native
}

object ActivityContentDetailsFavorite {
  @scala.inline
  def apply(): ActivityContentDetailsFavorite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsFavorite]
  }
  @scala.inline
  implicit class ActivityContentDetailsFavoriteOps[Self <: ActivityContentDetailsFavorite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
  }
  
}

