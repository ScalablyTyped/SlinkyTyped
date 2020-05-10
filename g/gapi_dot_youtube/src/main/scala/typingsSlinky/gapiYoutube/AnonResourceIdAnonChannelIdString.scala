package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResourceIdAnonChannelIdString extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource that the user subscribed to.
    */
  var resourceId: AnonChannelIdString = js.native
}

object AnonResourceIdAnonChannelIdString {
  @scala.inline
  def apply(resourceId: AnonChannelIdString): AnonResourceIdAnonChannelIdString = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResourceIdAnonChannelIdString]
  }
  @scala.inline
  implicit class AnonResourceIdAnonChannelIdStringOps[Self <: AnonResourceIdAnonChannelIdString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: AnonChannelIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

