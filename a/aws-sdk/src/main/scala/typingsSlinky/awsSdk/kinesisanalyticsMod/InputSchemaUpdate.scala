package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSchemaUpdate extends js.Object {
  /**
    * A list of RecordColumn objects. Each object describes the mapping of the streaming source element to the corresponding column in the in-application stream. 
    */
  var RecordColumnUpdates: js.UndefOr[RecordColumns] = js.native
  /**
    * Specifies the encoding of the records in the streaming source. For example, UTF-8.
    */
  var RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.native
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormatUpdate: js.UndefOr[RecordFormat] = js.native
}

object InputSchemaUpdate {
  @scala.inline
  def apply(): InputSchemaUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSchemaUpdate]
  }
  @scala.inline
  implicit class InputSchemaUpdateOps[Self <: InputSchemaUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordColumnUpdates(value: RecordColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordColumnUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordColumnUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordColumnUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordEncodingUpdate(value: RecordEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordEncodingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordEncodingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordEncodingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordFormatUpdate(value: RecordFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordFormatUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordFormatUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordFormatUpdate")(js.undefined)
        ret
    }
  }
  
}

