package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONMappingParameters extends js.Object {
  /**
    * Path to the top-level parent that contains the records.
    */
  var RecordRowPath: typingsSlinky.awsSdk.kinesisanalyticsMod.RecordRowPath = js.native
}

object JSONMappingParameters {
  @scala.inline
  def apply(RecordRowPath: RecordRowPath): JSONMappingParameters = {
    val __obj = js.Dynamic.literal(RecordRowPath = RecordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONMappingParameters]
  }
  @scala.inline
  implicit class JSONMappingParametersOps[Self <: JSONMappingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordRowPath(value: RecordRowPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordRowPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

