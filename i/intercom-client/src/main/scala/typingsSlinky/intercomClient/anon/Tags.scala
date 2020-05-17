package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.intercomClientStrings.tagDotlist
import typingsSlinky.intercomClient.userMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tags extends js.Object {
  var tags: js.Array[Tag] = js.native
  var `type`: tagDotlist = js.native
}

object Tags {
  @scala.inline
  def apply(tags: js.Array[Tag], `type`: tagDotlist): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  @scala.inline
  implicit class TagsOps[Self <: Tags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: js.Array[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: tagDotlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

