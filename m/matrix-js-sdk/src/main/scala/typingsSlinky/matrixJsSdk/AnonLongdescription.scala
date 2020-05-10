package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLongdescription extends js.Object {
  // <optional> Name of the group
  var avatar_url: String = js.native
  // <optional> A short description of the room
  var long_description: String = js.native
  var name: String = js.native
  // <optional> MXC avatar URL
  var short_description: String = js.native
}

object AnonLongdescription {
  @scala.inline
  def apply(avatar_url: String, long_description: String, name: String, short_description: String): AnonLongdescription = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], long_description = long_description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_description = short_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLongdescription]
  }
  @scala.inline
  implicit class AnonLongdescriptionOps[Self <: AnonLongdescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLong_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_description")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

