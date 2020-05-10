package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResourceIdAnonKindPlaylistId extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource associated with a bulletin post.
    */
  var resourceId: AnonKindPlaylistId = js.native
}

object AnonResourceIdAnonKindPlaylistId {
  @scala.inline
  def apply(resourceId: AnonKindPlaylistId): AnonResourceIdAnonKindPlaylistId = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResourceIdAnonKindPlaylistId]
  }
  @scala.inline
  implicit class AnonResourceIdAnonKindPlaylistIdOps[Self <: AnonResourceIdAnonKindPlaylistId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: AnonKindPlaylistId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

