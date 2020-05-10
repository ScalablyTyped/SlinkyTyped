package typingsSlinky.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the payload of an APNs message. Mainly consists of the `aps`
  * dictionary. But may also contain other arbitrary custom keys.
  */
@js.native
trait ApnsPayload
  extends /* customData */ StringDictionary[js.Object] {
  /**
    * The `aps` dictionary to be included in the message.
    */
  var aps: Aps = js.native
}

object ApnsPayload {
  @scala.inline
  def apply(aps: Aps): ApnsPayload = {
    val __obj = js.Dynamic.literal(aps = aps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApnsPayload]
  }
  @scala.inline
  implicit class ApnsPayloadOps[Self <: ApnsPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAps(value: Aps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

