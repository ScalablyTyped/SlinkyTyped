package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingParameters extends js.Object {
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var CSVMappingParameters: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CSVMappingParameters] = js.native
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var JSONMappingParameters: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.JSONMappingParameters] = js.native
}

object MappingParameters {
  @scala.inline
  def apply(): MappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingParameters]
  }
  @scala.inline
  implicit class MappingParametersOps[Self <: MappingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCSVMappingParameters(value: CSVMappingParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSVMappingParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCSVMappingParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSVMappingParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withJSONMappingParameters(value: JSONMappingParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSONMappingParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSONMappingParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSONMappingParameters")(js.undefined)
        ret
    }
  }
  
}

