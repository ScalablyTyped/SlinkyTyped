package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleSheetsOptions extends js.Object {
  
  /**
    * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if
    * you have header rows that should be skipped. When autodetect is on, behavior is the following: &#42; skipLeadingRows unspecified - Autodetect tries to
    * detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. &#42;
    * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. &#42; skipLeadingRows = N > 0 -
    * Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract
    * column names for the detected schema.
    */
  var skipLeadingRows: js.UndefOr[String] = js.native
}
object GoogleSheetsOptions {
  
  @scala.inline
  def apply(): GoogleSheetsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSheetsOptions]
  }
  
  @scala.inline
  implicit class GoogleSheetsOptionsOps[Self <: GoogleSheetsOptions] (val x: Self) extends AnyVal {
    
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
    def setSkipLeadingRows(value: String): Self = this.set("skipLeadingRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipLeadingRows: Self = this.set("skipLeadingRows", js.undefined)
  }
}
