package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdChannelIdKind extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource associated with the comment.
    */
  var resourceId: ChannelIdKind = js.native
}

object ResourceIdChannelIdKind {
  @scala.inline
  def apply(resourceId: ChannelIdKind): ResourceIdChannelIdKind = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdChannelIdKind]
  }
  @scala.inline
  implicit class ResourceIdChannelIdKindOps[Self <: ResourceIdChannelIdKind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ChannelIdKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

