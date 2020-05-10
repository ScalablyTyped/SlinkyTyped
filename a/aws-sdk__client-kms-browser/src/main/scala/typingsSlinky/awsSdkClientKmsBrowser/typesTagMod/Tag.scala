package typingsSlinky.awsSdkClientKmsBrowser.typesTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * <p>The key of the tag.</p>
    */
  var TagKey: String = js.native
  /**
    * <p>The value of the tag.</p>
    */
  var TagValue: String = js.native
}

object Tag {
  @scala.inline
  def apply(TagKey: String, TagValue: String): Tag = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValue = TagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

