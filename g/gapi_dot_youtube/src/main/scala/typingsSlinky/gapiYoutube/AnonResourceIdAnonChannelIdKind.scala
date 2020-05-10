package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResourceIdAnonChannelIdKind extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource associated with the comment.
    */
  var resourceId: AnonChannelIdKind = js.native
}

object AnonResourceIdAnonChannelIdKind {
  @scala.inline
  def apply(resourceId: AnonChannelIdKind): AnonResourceIdAnonChannelIdKind = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResourceIdAnonChannelIdKind]
  }
  @scala.inline
  implicit class AnonResourceIdAnonChannelIdKindOps[Self <: AnonResourceIdAnonChannelIdKind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: AnonChannelIdKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

