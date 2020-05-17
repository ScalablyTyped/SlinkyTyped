package typingsSlinky.d3pie.anon

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
trait Content extends js.Object {
  var content: js.Array[Label] = js.native
  var smallSegmentGrouping: js.UndefOr[Color] = js.native
  var sortOrder: js.UndefOr[none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc`] = js.native
}

object Content {
  @scala.inline
  def apply(content: js.Array[Label]): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: js.Array[Label]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallSegmentGrouping(value: Color): Self = {
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

