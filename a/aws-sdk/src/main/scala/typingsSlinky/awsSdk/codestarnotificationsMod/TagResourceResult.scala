package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceResult extends js.Object {
  /**
    * The list of tags associated with the resource.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.Tags] = js.native
}

object TagResourceResult {
  @scala.inline
  def apply(): TagResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourceResult]
  }
  @scala.inline
  implicit class TagResourceResultOps[Self <: TagResourceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

