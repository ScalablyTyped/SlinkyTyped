package typingsSlinky.awsSdkClientGlacierNode.typesCsvoutputMod

import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ALWAYS
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ASNEEDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVOutput extends js.Object {
  /**
    * <p>A value used to separate individual fields from each other within a record.</p>
    */
  var FieldDelimiter: js.UndefOr[String] = js.native
  /**
    * <p>A value used as an escape character where the field delimiter is part of the value.</p>
    */
  var QuoteCharacter: js.UndefOr[String] = js.native
  /**
    * <p>A single character used for escaping the quotation-mark character inside an already escaped value.</p>
    */
  var QuoteEscapeCharacter: js.UndefOr[String] = js.native
  /**
    * <p>A value that indicates whether all output fields should be contained within quotation marks.</p>
    */
  var QuoteFields: js.UndefOr[ALWAYS | ASNEEDED | String] = js.native
  /**
    * <p>A value used to separate individual records from each other.</p>
    */
  var RecordDelimiter: js.UndefOr[String] = js.native
}

object CSVOutput {
  @scala.inline
  def apply(): CSVOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVOutput]
  }
  @scala.inline
  implicit class CSVOutputOps[Self <: CSVOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuoteCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuoteCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteEscapeCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuoteEscapeCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteEscapeCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuoteEscapeCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteFields(value: ALWAYS | ASNEEDED | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuoteFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuoteFields")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordDelimiter")(js.undefined)
        ret
    }
  }
  
}

