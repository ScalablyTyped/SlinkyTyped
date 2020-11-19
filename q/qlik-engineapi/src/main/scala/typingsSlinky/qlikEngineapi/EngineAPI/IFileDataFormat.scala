package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQCodePage(value: Double): Self = this.set("qCodePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQComment(value: String): Self = this.set("qComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDelimiter(value: IDelimiterInfo): Self = this.set("qDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFixedWidthDelimiters(value: String): Self = this.set("qFixedWidthDelimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQHeaderSize(value: Double): Self = this.set("qHeaderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIgnoreEOF(value: Boolean): Self = this.set("qIgnoreEOF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLabel(value: String): Self = this.set("qLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQQuote(value: String): Self = this.set("qQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRecordSize(value: Double): Self = this.set("qRecordSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTabSize(value: Double): Self = this.set("qTabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: FileDataFormatType): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
}
