package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FileDataFormat...
  */
@js.native
trait IFileDataFormat extends js.Object {
  /**
    * Character set used in the file.
    */
  var qCodePage: Double = js.native
  /**
    * String that marks the beginning of the comment line.
    * Example: # or //
    * The engine ignores the commented lines during the data load.
    * This property is only used for delimited files.
    */
  var qComment: String = js.native
  /**
    * Information about the delimiter.
    * This property is used for delimited files.
    */
  var qDelimiter: IDelimiterInfo = js.native
  /**
    * Positions of the field breaks in the table.
    * This property is used for fixed record data files.
    */
  var qFixedWidthDelimiters: String = js.native
  /**
    * Size of the header.
    * Example: If the header size is 2, the first two rows in the file are considered as header and not as data.
    * The header can contain the field names.
    */
  var qHeaderSize: Double = js.native
  /**
    * Is set to true, the end-of-file character is not taken into account during reload.
    * This property is used for delimited files and fixed record data files.
    */
  var qIgnoreEOF: Boolean = js.native
  /**
    * One of:
    *
    * - embedded labels (field names are present in the file)
    * - no labels
    * - explicit labels (for DIFfiles)
    */
  var qLabel: String = js.native
  /**
    * One of:
    *
    * - None (no quotes)
    * - MSQ (Modern Style Quoting)
    * - Standard (quotes " " or ' ' can be used, but only if they
    * are the first and last non blank characters of a field value.)
    * This property is used for delimited files.
    */
  var qQuote: String = js.native
  /**
    * Record length.
    * Each record (row of data) contains a number of columns with a fixed field size.
    * This property is used for fixed record data files.
    */
  var qRecordSize: Double = js.native
  /**
    * Number of spaces that one tab character represents in the table file.
    * This property is used for fixed record data files.
    */
  var qTabSize: Double = js.native
  /**
    * Type of the file.
    */
  var qType: FileDataFormatType = js.native
}

object IFileDataFormat {
  @scala.inline
  def apply(
    qCodePage: Double,
    qComment: String,
    qDelimiter: IDelimiterInfo,
    qFixedWidthDelimiters: String,
    qHeaderSize: Double,
    qIgnoreEOF: Boolean,
    qLabel: String,
    qQuote: String,
    qRecordSize: Double,
    qTabSize: Double,
    qType: FileDataFormatType
  ): IFileDataFormat = {
    val __obj = js.Dynamic.literal(qCodePage = qCodePage.asInstanceOf[js.Any], qComment = qComment.asInstanceOf[js.Any], qDelimiter = qDelimiter.asInstanceOf[js.Any], qFixedWidthDelimiters = qFixedWidthDelimiters.asInstanceOf[js.Any], qHeaderSize = qHeaderSize.asInstanceOf[js.Any], qIgnoreEOF = qIgnoreEOF.asInstanceOf[js.Any], qLabel = qLabel.asInstanceOf[js.Any], qQuote = qQuote.asInstanceOf[js.Any], qRecordSize = qRecordSize.asInstanceOf[js.Any], qTabSize = qTabSize.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDataFormat]
  }
  @scala.inline
  implicit class IFileDataFormatOps[Self <: IFileDataFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQCodePage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCodePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDelimiter(value: IDelimiterInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFixedWidthDelimiters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFixedWidthDelimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHeaderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHeaderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIgnoreEOF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIgnoreEOF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qQuote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRecordSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRecordSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQType(value: FileDataFormatType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

