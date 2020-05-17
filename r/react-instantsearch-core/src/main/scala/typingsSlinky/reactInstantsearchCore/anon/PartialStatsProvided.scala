package typingsSlinky.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StatsProvided> */
@js.native
trait PartialStatsProvided extends js.Object {
  var nbHits: js.UndefOr[Double] = js.native
  var processingTimeMS: js.UndefOr[Double] = js.native
}

object PartialStatsProvided {
  @scala.inline
  def apply(): PartialStatsProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatsProvided]
  }
  @scala.inline
  implicit class PartialStatsProvidedOps[Self <: PartialStatsProvided] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNbHits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNbHits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbHits")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingTimeMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingTimeMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingTimeMS")(js.undefined)
        ret
    }
  }
  
}

