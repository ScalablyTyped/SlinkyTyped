package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverInputSchemaResponse extends js.Object {
  /**
    * Schema inferred from the streaming source. It identifies the format of the data in the streaming source and how each data element maps to corresponding columns in the in-application stream that you can create.
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.native
  /**
    * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more than one row).
    */
  var ParsedInputRecords: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ParsedInputRecords] = js.native
  /**
    * Stream data that was modified by the processor specified in the InputProcessingConfiguration parameter.
    */
  var ProcessedInputRecords: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ProcessedInputRecords] = js.native
  /**
    * Raw stream data that was sampled to infer the schema.
    */
  var RawInputRecords: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.RawInputRecords] = js.native
}

object DiscoverInputSchemaResponse {
  @scala.inline
  def apply(): DiscoverInputSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverInputSchemaResponse]
  }
  @scala.inline
  implicit class DiscoverInputSchemaResponseOps[Self <: DiscoverInputSchemaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputSchema(value: SourceSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withParsedInputRecords(value: ParsedInputRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParsedInputRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsedInputRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParsedInputRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessedInputRecords(value: ProcessedInputRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessedInputRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessedInputRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessedInputRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withRawInputRecords(value: RawInputRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawInputRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawInputRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawInputRecords")(js.undefined)
        ret
    }
  }
  
}

