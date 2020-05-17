package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceId extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource that was marked as a favorite.
    */
  var resourceId: Kind = js.native
}

object ResourceId {
  @scala.inline
  def apply(resourceId: Kind): ResourceId = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceId]
  }
  @scala.inline
  implicit class ResourceIdOps[Self <: ResourceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: Kind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

