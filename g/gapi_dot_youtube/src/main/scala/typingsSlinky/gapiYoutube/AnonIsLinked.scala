package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsLinked extends js.Object {
  /**
    * Indicates whether the channel data identifies a user that is already linked to either a YouTube username or a Google+ account. A user that has one of these links already has a public YouTube identity, which is a prerequisite for several actions, such as uploading videos.
    */
  var isLinked: Boolean = js.native
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: String = js.native
}

object AnonIsLinked {
  @scala.inline
  def apply(isLinked: Boolean, privacyStatus: String): AnonIsLinked = {
    val __obj = js.Dynamic.literal(isLinked = isLinked.asInstanceOf[js.Any], privacyStatus = privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsLinked]
  }
  @scala.inline
  implicit class AnonIsLinkedOps[Self <: AnonIsLinked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLinked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivacyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

