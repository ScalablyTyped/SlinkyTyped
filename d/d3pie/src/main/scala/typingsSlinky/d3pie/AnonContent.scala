package typingsSlinky.d3pie

import typingsSlinky.d3pie.d3pieStrings.`label-asc`
import typingsSlinky.d3pie.d3pieStrings.`label-desc`
import typingsSlinky.d3pie.d3pieStrings.`value-asc`
import typingsSlinky.d3pie.d3pieStrings.`value-desc`
import typingsSlinky.d3pie.d3pieStrings.none
import typingsSlinky.d3pie.d3pieStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContent extends js.Object {
  var content: js.Array[AnonLabel] = js.native
  var smallSegmentGrouping: js.UndefOr[AnonColor] = js.native
  var sortOrder: js.UndefOr[none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc`] = js.native
}

object AnonContent {
  @scala.inline
  def apply(content: js.Array[AnonLabel]): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
  @scala.inline
  implicit class AnonContentOps[Self <: AnonContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: js.Array[AnonLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallSegmentGrouping(value: AnonColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallSegmentGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallSegmentGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallSegmentGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
  }
  
}

