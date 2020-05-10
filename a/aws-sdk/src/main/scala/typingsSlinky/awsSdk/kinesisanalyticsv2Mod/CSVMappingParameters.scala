package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVMappingParameters extends js.Object {
  /**
    * The column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
    */
  var RecordColumnDelimiter: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RecordColumnDelimiter = js.native
  /**
    * The row delimiter. For example, in a CSV format, '\n' is the typical row delimiter.
    */
  var RecordRowDelimiter: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RecordRowDelimiter = js.native
}

object CSVMappingParameters {
  @scala.inline
  def apply(RecordColumnDelimiter: RecordColumnDelimiter, RecordRowDelimiter: RecordRowDelimiter): CSVMappingParameters = {
    val __obj = js.Dynamic.literal(RecordColumnDelimiter = RecordColumnDelimiter.asInstanceOf[js.Any], RecordRowDelimiter = RecordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVMappingParameters]
  }
  @scala.inline
  implicit class CSVMappingParametersOps[Self <: CSVMappingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordColumnDelimiter(value: RecordColumnDelimiter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordColumnDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordRowDelimiter(value: RecordRowDelimiter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordRowDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

