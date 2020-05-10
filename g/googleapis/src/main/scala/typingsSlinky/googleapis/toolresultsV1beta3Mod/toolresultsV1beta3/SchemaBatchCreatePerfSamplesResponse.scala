package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBatchCreatePerfSamplesResponse extends js.Object {
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.native
}

object SchemaBatchCreatePerfSamplesResponse {
  @scala.inline
  def apply(): SchemaBatchCreatePerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreatePerfSamplesResponse]
  }
  @scala.inline
  implicit class SchemaBatchCreatePerfSamplesResponseOps[Self <: SchemaBatchCreatePerfSamplesResponse] (val x: Self) extends AnyVal {
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

