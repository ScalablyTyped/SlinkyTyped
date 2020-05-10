package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFilter extends js.Object {
  /**
    * The tag key.
    */
  var tagKey: js.UndefOr[TagKey] = js.native
  /**
    * The tag values.
    */
  var tagValues: js.UndefOr[TagValueList] = js.native
}

object TagFilter {
  @scala.inline
  def apply(): TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagFilter]
  }
  @scala.inline
  implicit class TagFilterOps[Self <: TagFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagKey(value: TagKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTagValues(value: TagValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagValues")(js.undefined)
        ret
    }
  }
  
}

