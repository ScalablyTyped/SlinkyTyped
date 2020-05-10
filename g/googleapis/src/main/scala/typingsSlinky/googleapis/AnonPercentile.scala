package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPercentile extends js.Object {
  var category: js.UndefOr[String] = js.native
  var distributions: js.UndefOr[js.Array[AnonMax]] = js.native
  var percentile: js.UndefOr[Double] = js.native
}

object AnonPercentile {
  @scala.inline
  def apply(): AnonPercentile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPercentile]
  }
  @scala.inline
  implicit class AnonPercentileOps[Self <: AnonPercentile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributions(value: js.Array[AnonMax]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributions")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentile")(js.undefined)
        ret
    }
  }
  
}

