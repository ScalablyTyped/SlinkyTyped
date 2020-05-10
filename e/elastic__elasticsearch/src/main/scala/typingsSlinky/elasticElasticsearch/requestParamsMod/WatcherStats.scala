package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatcherStats extends Generic {
  var emit_stacktraces: js.UndefOr[Boolean] = js.native
  var metric: js.UndefOr[String | js.Array[String]] = js.native
}

object WatcherStats {
  @scala.inline
  def apply(): WatcherStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherStats]
  }
  @scala.inline
  implicit class WatcherStatsOps[Self <: WatcherStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit_stacktraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit_stacktraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmit_stacktraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit_stacktraces")(js.undefined)
        ret
    }
    @scala.inline
    def withMetric(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(js.undefined)
        ret
    }
  }
  
}

