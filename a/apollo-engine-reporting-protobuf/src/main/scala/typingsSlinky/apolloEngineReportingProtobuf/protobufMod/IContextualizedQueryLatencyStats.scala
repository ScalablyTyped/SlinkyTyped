package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualizedQueryLatencyStats extends js.Object {
  /** ContextualizedQueryLatencyStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.native
  /** ContextualizedQueryLatencyStats queryLatencyStats */
  var queryLatencyStats: js.UndefOr[IQueryLatencyStats | Null] = js.native
}

object IContextualizedQueryLatencyStats {
  @scala.inline
  def apply(): IContextualizedQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedQueryLatencyStats]
  }
  @scala.inline
  implicit class IContextualizedQueryLatencyStatsOps[Self <: IContextualizedQueryLatencyStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: IStatsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(null)
        ret
    }
    @scala.inline
    def withQueryLatencyStats(value: IQueryLatencyStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryLatencyStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryLatencyStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryLatencyStats")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryLatencyStatsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryLatencyStats")(null)
        ret
    }
  }
  
}

