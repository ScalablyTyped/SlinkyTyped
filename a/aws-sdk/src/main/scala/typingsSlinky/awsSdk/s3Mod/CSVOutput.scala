package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVOutput extends js.Object {
  /**
    * The value used to separate individual fields in a record. You can specify an arbitrary delimiter.
    */
  var FieldDelimiter: js.UndefOr[typingsSlinky.awsSdk.s3Mod.FieldDelimiter] = js.native
  /**
    * A single character used for escaping when the field delimiter is part of the value. For example, if the value is a, b, Amazon S3 wraps this field value in quotation marks, as follows: " a , b ".
    */
  var QuoteCharacter: js.UndefOr[typingsSlinky.awsSdk.s3Mod.QuoteCharacter] = js.native
  /**
    * The single character used for escaping the quote character inside an already escaped value.
    */
  var QuoteEscapeCharacter: js.UndefOr[typingsSlinky.awsSdk.s3Mod.QuoteEscapeCharacter] = js.native
  /**
    * Indicates whether to use quotation marks around output fields.     ALWAYS: Always use quotation marks for output fields.    ASNEEDED: Use quotation marks for output fields when needed.  
    */
  var QuoteFields: js.UndefOr[typingsSlinky.awsSdk.s3Mod.QuoteFields] = js.native
  /**
    * A single character used to separate individual records in the output. Instead of the default value, you can specify an arbitrary delimiter.
    */
  var RecordDelimiter: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RecordDelimiter] = js.native
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
    def withFieldDelimiter(value: FieldDelimiter): Self = {
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
    def withQuoteCharacter(value: QuoteCharacter): Self = {
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
    def withQuoteEscapeCharacter(value: QuoteEscapeCharacter): Self = {
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
    def withQuoteFields(value: QuoteFields): Self = {
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
    def withRecordDelimiter(value: RecordDelimiter): Self = {
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

