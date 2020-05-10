package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesTreemapDataOptions extends js.Object {
  /**
    * (Highcharts) Use this option to build a tree structure. The value should
    * be the id of the point which is the parent. If no points has a matching
    * id, or this option is undefined, then the parent will be set to the root.
    */
  var parent: js.UndefOr[String] = js.native
}

object SeriesTreemapDataOptions {
  @scala.inline
  def apply(): SeriesTreemapDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesTreemapDataOptions]
  }
  @scala.inline
  implicit class SeriesTreemapDataOptionsOps[Self <: SeriesTreemapDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

