package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tagging extends js.Object {
  /**
    * A collection for a set of tags
    */
  var TagSet: typingsSlinky.awsSdk.s3Mod.TagSet = js.native
}

object Tagging {
  @scala.inline
  def apply(TagSet: TagSet): Tagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tagging]
  }
  @scala.inline
  implicit class TaggingOps[Self <: Tagging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagSet(value: TagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

