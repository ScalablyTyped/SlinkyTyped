package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResult extends js.Object {
  /**
    * A list of tags.
    */
  var TagList: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TagList] = js.native
}

object ListTagsForResourceResult {
  @scala.inline
  def apply(): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
  @scala.inline
  implicit class ListTagsForResourceResultOps[Self <: ListTagsForResourceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagList(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(js.undefined)
        ret
    }
  }
  
}

