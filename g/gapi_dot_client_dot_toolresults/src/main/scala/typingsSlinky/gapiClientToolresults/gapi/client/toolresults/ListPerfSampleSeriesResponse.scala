package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPerfSampleSeriesResponse extends js.Object {
  /** The resulting PerfSampleSeries sorted by id */
  var perfSampleSeries: js.UndefOr[js.Array[PerfSampleSeries]] = js.native
}

object ListPerfSampleSeriesResponse {
  @scala.inline
  def apply(): ListPerfSampleSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPerfSampleSeriesResponse]
  }
  @scala.inline
  implicit class ListPerfSampleSeriesResponseOps[Self <: ListPerfSampleSeriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerfSampleSeries(value: js.Array[PerfSampleSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSampleSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfSampleSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSampleSeries")(js.undefined)
        ret
    }
  }
  
}

