package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResponseStats extends js.Object {
  // query time in milliseconds
  var elapsed_time_ms: js.UndefOr[Double] = js.native
  // rows scanned as part of query execution
  var rows_scanned: js.UndefOr[Double] = js.native
}

object QueryResponseStats {
  @scala.inline
  def apply(): QueryResponseStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponseStats]
  }
  @scala.inline
  implicit class QueryResponseStatsOps[Self <: QueryResponseStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElapsed_time_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed_time_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsed_time_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed_time_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withRows_scanned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows_scanned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows_scanned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows_scanned")(js.undefined)
        ret
    }
  }
  
}

