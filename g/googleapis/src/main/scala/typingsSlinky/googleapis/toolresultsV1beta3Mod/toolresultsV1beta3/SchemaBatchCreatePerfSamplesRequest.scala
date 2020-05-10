package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request must provide up to a maximum of 5000 samples to be created; a
  * larger sample size will cause an INVALID_ARGUMENT error
  */
@js.native
trait SchemaBatchCreatePerfSamplesRequest extends js.Object {
  /**
    * The set of PerfSamples to create should not include existing timestamps
    */
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.native
}

object SchemaBatchCreatePerfSamplesRequest {
  @scala.inline
  def apply(): SchemaBatchCreatePerfSamplesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreatePerfSamplesRequest]
  }
  @scala.inline
  implicit class SchemaBatchCreatePerfSamplesRequestOps[Self <: SchemaBatchCreatePerfSamplesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerfSamples(value: js.Array[SchemaPerfSample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSamples")(js.undefined)
        ret
    }
  }
  
}

