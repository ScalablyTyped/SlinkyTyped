package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListPerfSampleSeriesResponse extends js.Object {
  /**
    * The resulting PerfSampleSeries sorted by id
    */
  var perfSampleSeries: js.UndefOr[js.Array[SchemaPerfSampleSeries]] = js.native
}

object SchemaListPerfSampleSeriesResponse {
  @scala.inline
  def apply(): SchemaListPerfSampleSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPerfSampleSeriesResponse]
  }
  @scala.inline
  implicit class SchemaListPerfSampleSeriesResponseOps[Self <: SchemaListPerfSampleSeriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerfSampleSeries(value: js.Array[SchemaPerfSampleSeries]): Self = {
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

