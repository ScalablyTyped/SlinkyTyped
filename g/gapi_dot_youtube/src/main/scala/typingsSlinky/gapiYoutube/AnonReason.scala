package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReason extends js.Object {
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: String = js.native
  /**
    * The resourceId object contains information that identifies the recommended resource.
    */
  var resourceId: AnonChannelIdKind = js.native
  /**
    * The seedResourceId object contains information about the resource that caused the recommendation.
    */
  var seedResourceId: AnonKindPlaylistId = js.native
}

object AnonReason {
  @scala.inline
  def apply(reason: String, resourceId: AnonChannelIdKind, seedResourceId: AnonKindPlaylistId): AnonReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], seedResourceId = seedResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReason]
  }
  @scala.inline
  implicit class AnonReasonOps[Self <: AnonReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: AnonChannelIdKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeedResourceId(value: AnonKindPlaylistId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedResourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

