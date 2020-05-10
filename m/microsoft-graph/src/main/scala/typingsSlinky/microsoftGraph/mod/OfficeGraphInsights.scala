package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfficeGraphInsights extends Entity {
  var shared: js.UndefOr[js.Array[SharedInsight]] = js.native
  var trending: js.UndefOr[js.Array[Trending]] = js.native
  var used: js.UndefOr[js.Array[UsedInsight]] = js.native
}

object OfficeGraphInsights {
  @scala.inline
  def apply(): OfficeGraphInsights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfficeGraphInsights]
  }
  @scala.inline
  implicit class OfficeGraphInsightsOps[Self <: OfficeGraphInsights] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShared(value: js.Array[SharedInsight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withTrending(value: js.Array[Trending]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trending")(js.undefined)
        ret
    }
    @scala.inline
    def withUsed(value: js.Array[UsedInsight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(js.undefined)
        ret
    }
  }
  
}

