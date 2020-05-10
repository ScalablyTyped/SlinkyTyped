package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartBarColumnAnnotations extends ChartAnnotations {
  var alwaysOutside: js.UndefOr[Boolean] = js.native
}

object ChartBarColumnAnnotations {
  @scala.inline
  def apply(): ChartBarColumnAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBarColumnAnnotations]
  }
  @scala.inline
  implicit class ChartBarColumnAnnotationsOps[Self <: ChartBarColumnAnnotations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOutside")(js.undefined)
        ret
    }
  }
  
}

