package typingsSlinky.awsSdkClientS3Node.typesCsvinputMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.IGNORE
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NONE
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.USE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVInput extends js.Object {
  /**
    * <p>Specifies that CSV field values may contain quoted record delimiters and such records should be allowed. Default value is FALSE. Setting this value to TRUE may lower performance.</p>
    */
  var AllowQuotedRecordDelimiter: js.UndefOr[Boolean] = js.native
  /**
    * <p>Single character used to indicate a row should be ignored when present at the start of a row.</p>
    */
  var Comments: js.UndefOr[String] = js.native
  /**
    * <p>Value used to separate individual fields in a record.</p>
    */
  var FieldDelimiter: js.UndefOr[String] = js.native
  /**
    * <p>Describes the first line of input. Valid values: None, Ignore, Use.</p>
    */
  var FileHeaderInfo: js.UndefOr[USE | IGNORE | NONE | String] = js.native
  /**
    * <p>Value used for escaping where the field delimiter is part of the value.</p>
    */
  var QuoteCharacter: js.UndefOr[String] = js.native
  /**
    * <p>Single character used for escaping the quote character inside an already escaped value.</p>
    */
  var QuoteEscapeCharacter: js.UndefOr[String] = js.native
  /**
    * <p>Value used to separate individual records.</p>
    */
  var RecordDelimiter: js.UndefOr[String] = js.native
}

object CSVInput {
  @scala.inline
  def apply(): CSVInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVInput]
  }
  @scala.inline
  implicit class CSVInputOps[Self <: CSVInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowQuotedRecordDelimiter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowQuotedRecordDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowQuotedRecordDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowQuotedRecordDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comments")(js.undefined)
        ret
    }
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
    def withFileHeaderInfo(value: USE | IGNORE | NONE | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileHeaderInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileHeaderInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileHeaderInfo")(js.undefined)
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

