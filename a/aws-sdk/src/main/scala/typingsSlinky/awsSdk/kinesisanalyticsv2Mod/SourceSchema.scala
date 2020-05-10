package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSchema extends js.Object {
  /**
    * A list of RecordColumn objects. 
    */
  var RecordColumns: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RecordColumns = js.native
  /**
    * Specifies the encoding of the records in the streaming source. For example, UTF-8.
    */
  var RecordEncoding: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RecordEncoding] = js.native
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormat: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RecordFormat = js.native
}

object SourceSchema {
  @scala.inline
  def apply(RecordColumns: RecordColumns, RecordFormat: RecordFormat): SourceSchema = {
    val __obj = js.Dynamic.literal(RecordColumns = RecordColumns.asInstanceOf[js.Any], RecordFormat = RecordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSchema]
  }
  @scala.inline
  implicit class SourceSchemaOps[Self <: SourceSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordColumns(value: RecordColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordFormat(value: RecordFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordEncoding(value: RecordEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordEncoding")(js.undefined)
        ret
    }
  }
  
}

